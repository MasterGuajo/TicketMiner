/**
 * RunTicket class
 * 
 * @author Isabella Garcia
 * @author Maria Fernanda Zuany
 * @author Jorge Garcia
 * @author Jazmin Huerta
 * @since November 26th, 2023
 * Instructor: Daniel Mejia
 * Final Deliverrable 
 * 
 *  This work is to be done in teams of 4 people. It is not permitted to share,
    reproduce, or alter any part of this assignment for any purpose. Students are not
    permitted from sharing code, uploading this assignment online in any form,
    viewing, receiving, or modifying code written from anyone else. This assignment
    is part of an academic course at The University of Texas at El Paso and a grade
    will be assigned for the work produced individually by the student.
 */
import java.io.File;
import java.io.FileNotFoundException;
import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class RunTicket {

    /**
     * createSixSummary
     * Creates the electronic summary for 6 of the specified customers
     * 
     * @author Jazmin Huerta
     * @param customerMap
     */
    public static void createEightSummary(HashMap< Integer,Customer> customerMap){
        customerMap.get(38).createInvoiceSummary();
        customerMap.get(37).createInvoiceSummary();
        customerMap.get(56).createInvoiceSummary();
        customerMap.get(57).createInvoiceSummary();
        customerMap.get(64).createInvoiceSummary();
        customerMap.get(98).createInvoiceSummary();
        customerMap.get(15).createInvoiceSummary();
        customerMap.get(1).createInvoiceSummary();

    }

    public static void main(String[] args){

        //menu
        Menu menu = new Menu();

        //File reader
        CSVReader reader = new CSVReader();

        //dictionaries
        HashMap<Integer, Customer> customerMap = reader.storeCustomerID("CustomerListPA5.csv");
        HashMap<String, Integer> customerMapByName = reader.storeCustomerByName("CustomerListPA5.csv");
        HashMap<Integer, Event> eventMap = reader.storeEvents("EventListPA5.csv");
        HashMap<String, Integer> eventMapByName = reader.storeEventsByName("EventListPA5.csv");


        //These variables will help us keep the user logged in, track their choices and total amount of tickets bought
        Scanner userInput = new Scanner(System.in);
        String userChoice;

        boolean loggedIn = true;
        boolean isAdmin;
        boolean isCustomer;

        Customer currCustomer = new Customer();
        Writer logger = Writer.getInstance();
        Logs loggedActions = new Logs();
        
        while(loggedIn){
            menu.mainMenu();
            userChoice = userInput.nextLine().trim();

            if (userChoice.equals("1") || userChoice.equalsIgnoreCase("customer")){
                currCustomer = CustomerFunctionalities.userLogIn(customerMap);
                isAdmin = false;

                if (currCustomer.getId() == 0){
                    isCustomer = false;
                } else {
                    isCustomer = true;
                }

            } else if (userChoice.equals("2") || userChoice.equalsIgnoreCase("administrator")) {
                isAdmin = true;
                isCustomer = false;

            } else if (userChoice.equalsIgnoreCase("EXIT")) {
                loggedIn = false;
                isAdmin = false;
                isCustomer = false;

            } else {
                System.out.println("Sorry, we didn't understand your input. Let's again!");
                System.out.println("");
                isAdmin = false;
                isCustomer = false;
            }
            
            int eventID = 0;
            int customerID=0;

            //If they decide to log into admin, we give them a special menu that allows them to browse event info.
            while(isAdmin){
                System.out.println();
                menu.adminMenu();
                System.out.print(">> ");
                userChoice = userInput.nextLine().trim();

                // If they choose to go back, we set our variable accordingly and close our writer
                if(userChoice.equalsIgnoreCase("back")){
                    isAdmin = false;
                    
                } else {

                    if (userChoice.equals("1")){
                        System.out.println();
                        System.out.print("Please enter event ID or Name: ");
                        userChoice = userInput.nextLine().trim();

                        eventID = EventFunctionalities.eventExistsID(userChoice, eventMap, eventMapByName);
                        if(eventID >= 1){

                            menu.printInfoEvent(eventMap, eventID);
                            //eventMap.get(Integer.parseInt(userChoice)).printAllEventInfo();
                            
                            loggedActions.setData("Event " + eventMap.get(eventID).getEventId() + " was searched by Admin");

                            System.out.println("Would you like to change something from the event? (Y / Anything else)");
                            userChoice = userInput.nextLine().trim();

                            if (userChoice.equalsIgnoreCase("Y")){
                                EventFunctionalities.eventChange(eventID, eventMap, eventMapByName, userChoice, userInput, loggedActions);
                                
                            } 
                        }

                    } else if (userChoice.equals("2")){
                        menu.autobuyerMenu();
                        System.out.print(">>");
                        userChoice = userInput.nextLine().trim();

                        if(userChoice.equals("1")){
                            TIcketFunctionalities.autoBuyer(eventMap, customerMap, "AutoPurchase100.csv", loggedActions);

                        } else if (userChoice.equals("2")) {
                            TIcketFunctionalities.autoBuyer(eventMap, customerMap, "AutoPurchase1K.csv", loggedActions);

                        } else if (userChoice.equals("3")) {
                            TIcketFunctionalities.autoBuyer(eventMap, customerMap, "AutoPurchase500K.csv", loggedActions);

                        } else if (userChoice.equals("4")) {
                            TIcketFunctionalities.autoBuyer(eventMap, customerMap, "AutoPurchase1M.csv", loggedActions);
                        
                        }else if (userChoice.equals("5")) {
                                TIcketFunctionalities.autoBuyer(eventMap, customerMap, "AutoPurchase5M.csv", loggedActions);
    
                        }else {
                           System.out.println("Sorry, that's not a valid choice");
                        }

                    
                    } else if (userChoice.equals("3")){
                        EventFunctionalities.createNewEvent(eventMap,eventMapByName,loggedActions);

                    } else if (userChoice.equals("4")){

                        System.out.println();
                        System.out.println("Please enter the ID or name of the event you would like to cancel: (or back to return to the menu)");
                        System.out.print(">>");
                        userChoice = userInput.nextLine().trim();

                        if(!userChoice.equalsIgnoreCase("back")){
                            eventID = EventFunctionalities.eventExistsID(userChoice, eventMap, eventMapByName);

                            if(eventID >= 1){
                                
                                menu.printInfoEvent(eventMap, eventID);
                                EventFunctionalities.cancelEventAdmin(eventID, eventMap, userChoice, userInput, loggedActions);
                            }
                            
                        }
    

                    } else if(userChoice.equals("5")){
                        System.out.println("Please enter the name or the ID of the customer you would like to create the Invoice Summary for:");
                        System.out.print(">>");
                        userChoice = userInput.nextLine().trim();

                        if(!userChoice.equalsIgnoreCase("back")){
                            customerID = CustomerFunctionalities.customerExistsID(userChoice, customerMap, customerMapByName);

                            if(customerID >= 1){
                                currCustomer= customerMap.get(customerID);
                                currCustomer.createInvoiceSummary();
                                loggedActions.setData("Invoice summary for " + currCustomer.getUsername() + " was computed by Admin");
                            }
                            
                        }

                    } else if(userChoice.equals("6")){
                        menu.proceedsMenu();
                        System.out.print(">>");
                        userChoice = userInput.nextLine().trim();

                        if(!userChoice.equalsIgnoreCase("back")){
                            
                            if(userChoice.equals("1")){
                                System.out.println();
                                System.out.print("Please enter event ID or Name: ");
                                System.out.print(">>");
                                userChoice = userInput.nextLine().trim();

                                eventID = EventFunctionalities.eventExistsID(userChoice, eventMap, eventMapByName);

                                if(eventID >= 1){
                                    eventMap.get(eventID).eventProceeds();
                                    
                                    loggedActions.setData("Event Proceeds for Event " + eventMap.get(eventID).getEventId() + " was computed by Admin");
                                }

                            } else if(userChoice.equals("2")){
                                EventFunctionalities.allEventProceeds(eventMap);

                            } else {
                                System.out.println("Please enter a valid input");
                            }
                        }
                    } else {
                        System.out.println("Please enter a valid input");
                    }
                }
            }

            eventID = 0;
            // Otherwise, we send them to our customer menu
            while(isCustomer){
                
                System.out.println();
                menu.customerMenu();
                userChoice = userInput.nextLine().trim();
                System.out.println();

                if (userChoice.equals("1")) {
                    System.out.print("Event ID or Name: ");
                    userChoice = userInput.nextLine().trim();

                    eventID = EventFunctionalities.eventExistsID(userChoice, eventMap, eventMapByName);

                    if(eventID >= 1){
                        
                        //We update ticketsbought if they purchased any tickets with our methods above
                        TIcketFunctionalities.buyTickets(currCustomer,eventID, eventMap, loggedActions);
                    }
                    
                } else if (userChoice.equals("2")) {
                    
                    System.out.println("Here are you current purchases:");
                    currCustomer.printInvoices();

                    System.out.println();
                    System.out.println("Please enter the name of the event you would like to cancel (we will not refund fees or tax money): Or 'BACK' to return");
                    userChoice = userInput.nextLine().trim();

                    if (!userChoice.equalsIgnoreCase("back")){
                        Invoice eventToCancel = currCustomer.traverseInvoices(userChoice);

                        if (eventToCancel != null){
                            EventFunctionalities.cancelEventCustomer(currCustomer, eventMap, eventToCancel, loggedActions);
                        } else {
                            System.out.println("Sorry, you don't seem to have any purchases for that event or it has already been cancelled");
                        }
                    }

                } else if (userChoice.equalsIgnoreCase("back")){
                        isCustomer = false;
                        currCustomer.printInvoices();

                } else {
                    System.out.println("Please enter a valid input");
                }
            }
        }

        logger.logAction(loggedActions.getData(), "loggedActions.txt");
        loggedActions.clearData();

        logger.createCustomerCSV(customerMap);
        logger.createEventCSV(eventMap);

        createEightSummary(customerMap);
    } 
}