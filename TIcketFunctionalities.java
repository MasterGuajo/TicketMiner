/**
 * This is our TicketFunctionalities class has all the methods that involve the purchasing of tickets
 * such as, calculating the fees, seeing if there are tickets available, processing the purchase,
 * creating an invoice, calculating the fees and autobuyer functionality
 * 
 * @author Jorge Garcia
 * @author Jazmin Huerta
 * @author Isabella Garcia
 * @author Maria Fernanda Zuany
 * @since November 26th, 2023
 * Instructor: Daniel Mejia
 * Final Deliverable
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

public class TIcketFunctionalities {
        
    /**
     * buyTickets method
     * Shows user ticket prices, amount available and promptly asks them how many they want to buy.
     * 
     * @author Jorge Garcia
     * @author Jazmin Huerta
     * @author Maria Fernanda Zuany
     * @author Isabella Garcia
     * @since November 6th, 2023
     * 
     * @param currCustomer
     * @param eventID
     * @param eventMap
     * @param loggedActions
     */
    static void buyTickets(Customer currCustomer, int eventID, HashMap<Integer, Event> eventMap, Logs loggedActions){

        Scanner userInput = new Scanner(System.in);
        int amountOfTickets;
        int typeOfTicket;

        boolean buyingTickets = true;
        boolean validTicketChoice = false;
        
        //Shows event prices and seats available
        eventMap.get(eventID).printTicketPrices();
        eventMap.get(eventID).getVenue().printSeatsAvailable();
        
        // We use a while loop so that the user stays logged in if they make a mistake, while also giving them the opportunity to go back
        while(buyingTickets){

            // We use previously bought tickets in order to show the user how many more they can buy, while also not allowing them to obtain more
            try {
                if(eventMap.get(eventID).getName().contains("CANCELLED")){
                    System.out.println("We are sorry, you cannot purchase tickets for this event because it has been cancelled");
                    buyingTickets = false;
                }
                else{
                    System.out.println();
                    System.out.println("How many would you like to buy? (We have a limit to a max of 6 tickets)\nEnter '9' if you would like to go back");
                    
                    System.out.print("Amount of Tickets: ");
                    amountOfTickets = Integer.parseInt(userInput.nextLine());

                    if (amountOfTickets >= 1 && amountOfTickets <= 6){

                        validTicketChoice = false;
                        while(!validTicketChoice){
                            
                            try {
                                System.out.println();
                                System.out.println("What type of ticket would you like to buy? (Type in the number you would like)\n1) VIP\n2) Gold\n3) Silver\n4) Bronze\n5) General Admission\n" + //
                                        "Enter '9' if you would like to go back");

                                System.out.print("Type of Tickets: ");
                                typeOfTicket = Integer.parseInt(userInput.nextLine());

                                if(typeOfTicket >= 1 && typeOfTicket <= 5){

                                    // We call ticketsAvailable so that it uses the event to determine if there are enough tickets to purchase
                                    if(ticketsAvailable(eventMap, eventID, amountOfTickets, typeOfTicket)){

                                        // If they succesfully obtain their tickets, we return how many tickets were bough in order to obtain our main
                                        if(processPayment(eventMap, currCustomer, eventID, amountOfTickets, typeOfTicket, loggedActions, false)){
                                            validTicketChoice = true;
                                            buyingTickets = false;

                                            return;
                                        } else{
                                            validTicketChoice = false;
                                            buyingTickets = true;
                                            return;
                                        }                              
                                    } 

                                } else if (typeOfTicket == 9){
                                    validTicketChoice = true;

                                } else {
                                    System.out.println("Please enter one of the specified numbers");
                                    System.out.println();
                                }
                            

                            } catch (NumberFormatException e){
                                System.out.println("Oops! Please enter a valid number between 1 and 5.");
                                System.out.println();
                            }
                        }

                    } else if (amountOfTickets == 9){
                        buyingTickets = false;
                        
                    } else {
                        System.out.println("Sorry, we can only sell you from 1 to 6 tickets on each purchase");
                        System.out.println();
                    }
                }

            } catch (NumberFormatException e){
                System.out.println("Oops! Please enter a valid number between 1 and 6.");
                System.out.println();
            }
        }
        return;
    }

    /**
     * ticketsAvailable method
     * Checks if there are tickets avaiable for the user selected ones. Returns true if found
     * 
     * @author Jorge Garcia
     * @author Jazmin Huerta
     * @author Maria Fernanda Zuany
     * @author Isabella Garcia
     * @since November 6th, 2023
     * 
     * @param eventMap
     * @param eventID
     * @param amountOfTickets
     * @param typeOfTicket
     * @return true
     */
    static boolean ticketsAvailable(HashMap<Integer, Event> eventMap, int eventID, int amountOfTickets, int typeOfTicket){

        // this array is created so that we can dynamically obtain the seats from any category without mulitple if's
        double[] amountOfSeats = {      eventMap.get(eventID).getVenue().getVipSeatsAvailable(), eventMap.get(eventID).getVenue().getGoldSeatsAvailable(), 
                                        eventMap.get(eventID).getVenue().getSilverSeatsAvailable(), eventMap.get(eventID).getVenue().getBronzeSeatsAvailable(),
                                        eventMap.get(eventID).getVenue().getGeneralAdmissionSeatsAvailable()};

        if (amountOfSeats[typeOfTicket - 1] >= amountOfTickets){
            System.out.println("Great! We found you some tickets!");
            System.out.println();
            return true;
        }
        System.out.println("Sorry, there doesn't seem to be any more tickets available from that section or the event might have been cancelled!");
        System.out.println();
        return false;
    }

    /**
     * processPayment method
     * Takes in all information about tickets that are going to be bought and verify that they can be purchased without complications
     * Once purchased, they update all information
     * 
     * @author Jorge Garcia
     * @author Jazmin Huerta
     * @since October 22nd, 2023
     * @author Maria Fernanda Zuany
     * @author Isabella Garcia
     * @since November 6th, 2023
     * 
     * @param eventMap
     * @param currCustomer
     * @param eventID
     * @param amountOfTickets
     * @param typeOfTicket
     * @param loggedActions
     * @return boolean
     */
    static boolean processPayment(HashMap<Integer, Event> eventMap, Customer currCustomer, int eventID, int amountOfTickets, int typeOfTicket, Logs loggedActions, boolean isAutoBuyer){

        Scanner userInput = new Scanner(System.in);
        String userChoice;
        double costOfTickets = 0;
        double pricePerTicket = 0;
        String ticketType = "";

        int availableSeats;
        int seatsSold;
        
        if(typeOfTicket == 1){
            costOfTickets = eventMap.get(eventID).getVipPrice();
            pricePerTicket = eventMap.get(eventID).getVipPrice();
            ticketType = "VIP";

        } else if (typeOfTicket == 2) {
            costOfTickets = eventMap.get(eventID).getGoldPrice();
            pricePerTicket = eventMap.get(eventID).getGoldPrice();
            ticketType = "Gold";

        } else if (typeOfTicket == 3) {
            costOfTickets = eventMap.get(eventID).getSilverPrice();
            pricePerTicket = eventMap.get(eventID).getSilverPrice();
            ticketType = "Silver";

        } else if (typeOfTicket == 4) {
            costOfTickets = eventMap.get(eventID).getBronzePrice();
            pricePerTicket = eventMap.get(eventID).getBronzePrice();
            ticketType = "Bronze";

        } else if (typeOfTicket == 5) {
            costOfTickets = eventMap.get(eventID).getGeneralAdmissionPrice();
            pricePerTicket = eventMap.get(eventID).getGeneralAdmissionPrice();
            ticketType = "General Admission";
        }
        
        double [] fees = eventFees(costOfTickets, amountOfTickets, currCustomer);

        if (isAutoBuyer) {
            userChoice = "Y";

        } else {
            System.out.printf("Your current total will be $%.2f\n",fees[0]);
            System.out.print("Would you like to continue to purchase? (Y / N): ");
            userChoice = userInput.nextLine().trim();
        }

        if(userChoice.equalsIgnoreCase("Y")){

            //If they do, we check that they have enough balance
            if(currCustomer.getBalance() >= costOfTickets){

                eventMap.get(eventID).getVenue().updateSeats(ticketType,amountOfTickets);

                currCustomer.updateBalance(-fees[0]);
                currCustomer.setConcertsPurchased(currCustomer.getConcertsPurchased() + 1);
                createInvoiceList(currCustomer, eventMap, eventID, ticketType , pricePerTicket, amountOfTickets);
                
                loggedActions.setData(currCustomer.getUsername() + " bought " + amountOfTickets + " " + ticketType + " tickets for " + eventMap.get(eventID).getName());
                loggedActions.setData("Deducted $" + fees[0] + " from " + currCustomer.getUsername() + "'s account");

                if (!isAutoBuyer){
                    System.out.printf("Succesfully bought tickets!\nNew balance of $%.2f\n", currCustomer.getBalance());
                }

                return true;

            } else if (!isAutoBuyer){
                System.out.println("Sorry, you don't have enough funds");
            }

        } else {
            System.out.println("Going back to main menu. . .");
            System.out.println();
            return false;
        }

        return false;
    }

    /**
     * createInvoiceList method
     * This method creates an invoice for the current transaction and it adds this invoice to the array list where we are storing 
     * all the invoices both in the event class and the customer class, this allows us to keep track of the 
     * invoices created for each event and the transactions that each customer has performed 
     * 
     * @author Jazmin Huerta
     * @author Jorge Garcia
     * @author Maria Fernanda Zuany
     * @author Isabella Garcia
     * @since November 6th, 2023
     * 
     * @param currCust
     * @param eData
     * @param eventId
     * @param ticketTypePrice
     * @param ticketQuantity
     */
    public static void createInvoiceList(Customer currCustomer, HashMap<Integer, Event> eventMap, int eventId, String ticketType ,double typePrice, int ticketQuantity){
        
        ConfirmationNumberGenerator confirmationGenerator = ConfirmationNumberGenerator.getInstance();//singleton for generate confirm number
        String confirmation1 = confirmationGenerator.generateConfirmationNumber();
        
        Invoice custInvoice = new Invoice(currCustomer,eventId,eventMap.get(eventId).getName(),ticketType,typePrice, ticketQuantity, confirmation1, eventFees(typePrice, ticketQuantity,  currCustomer));

        //add the created invoice to the its corresponding event array list
        eventMap.get(eventId).getEventListInvoice().add(custInvoice);
       
        //add the created invoice to the invoice list of the customer
        currCustomer.getListInvoice().add(custInvoice);

        //update collected tax money  and discounts per event
        eventMap.get(eventId).setTaxMoney(eventMap.get(eventId).getTaxMoney()+custInvoice.getCalcTax());
        eventMap.get(eventId).setDiscounts(eventMap.get(eventId).getDiscounts()+custInvoice.getMemberDiscount());
        eventMap.get(eventId).setCharityFee(eventMap.get(eventId).getCharityFee() + custInvoice.getCharityFee());
        eventMap.get(eventId).setServiceFee(eventMap.get(eventId).getServiceFee() + custInvoice.getServiceFee());
        eventMap.get(eventId).setConvenienceFee(eventMap.get(eventId).getConvenienceFee() + custInvoice.getConvenienceFee());
    }

     /**
     * autoBuyer
     * Iterates through CSV and gets information for purchase
     * 
     * @author Jorge Garcia
     * @author Jazmin Huerta
     * @author Maria Fernanda Zuany
     * @author Isabella Garcia
     * @since November 6th, 2023
     * 
     * @param eventMap
     * @param customerMap
     * @param fileName
     * @param loggedActions
     */
    public static void autoBuyer(HashMap<Integer, Event> eventMap, HashMap<Integer, Customer> customerMap, String fileName, Logs loggedActions){

        Scanner scanner = new Scanner(System.in);
        boolean parseComplete = false;

        int succesfulAutoBuy = 0;
        int failedAutoBuy = 0;

        boolean customerFound;
        

        while(!parseComplete){

            try {

                File file = new File(fileName);
                Scanner reader = new Scanner(file);
                reader.nextLine();

                Customer currCustomer = new Customer();

                reader.useDelimiter(",");
    
                while(reader.hasNextLine()){
                    String line = reader.nextLine();
                    String [] col = line.split(",", -1);
                    customerFound = false;
                    
                    //We use Map Entry to loop over all keys and values in our dictionary
                    for (Map.Entry<Integer, Customer> entry : customerMap.entrySet()){
                        currCustomer = entry.getValue();

                        if(currCustomer.getFirstName().equalsIgnoreCase(col[0]) && currCustomer.getLastName().equalsIgnoreCase(col[1])){
                            customerFound = true;
                            break;
                        }
                    }

                    //If found, we assign type of ticket
                    if (customerFound){
                        int typeOfTicket;

                        if (col[6].equals("VIP")){
                            typeOfTicket = 1;
                        } else if (col[6].equals("Gold")){
                            typeOfTicket = 2;
                        } else if (col[6].equals("Silver")){
                            typeOfTicket = 3;
                        } else if (col[6].equals("Bronze")){
                            typeOfTicket = 4;
                        } else {
                            typeOfTicket = 5;
                        }

                        //Update variables accordingly
                        if(processPayment(eventMap, currCustomer, Integer.parseInt(col[3]), Integer.parseInt(col[5]), typeOfTicket, loggedActions, true)){
                            succesfulAutoBuy++;
                        } else {
                            failedAutoBuy++;
                        }
                    }   
                }
                parseComplete = true;
                System.out.println("Total succesful AutoBuys: " + succesfulAutoBuy);
                System.out.println("Total failed AutoBuys: " + failedAutoBuy);

            }  catch(FileNotFoundException e) {
                System.out.println(e.getMessage());
                System.out.println("Please enter the new filename as we couldn't find the current one:");
                System.out.print("Filename:");
                fileName = scanner.nextLine();
            }
        }   
    }

     /**
     * Method eventFees helps us to calculate the grand total of a purchase
     * @author Maria Fernanda Zuany
     * @author Jorge Garcia
     * @author Isabella Garcia
     * @author Jazmin Huerta
     * @since 11/16/2023
     * @param ticketPrice
     * @param ticketCountIn
     * @return array of doubles with the fees, total and member discount
     */
    public static double [] eventFees(double ticketPrice, int ticketCountIn, Customer currCustomer){
        double convenienceFee = 2.50;
        double charityFee = (ticketPrice * 0.0075) * ticketCountIn;
        double serviceFee = (ticketPrice * 0.005) * ticketCountIn;
        double subtotal = (ticketPrice * ticketCountIn)+ convenienceFee + charityFee + serviceFee;
        double memberDisc = 0.0;
        
        if (currCustomer.isMember()){
            memberDisc = subtotal * 0.1;
            subtotal = subtotal-memberDisc;
        }

        double tax = subtotal * 0.0825;
        double total = subtotal+tax;
        double [] fees = {total,tax,memberDisc,charityFee,serviceFee,convenienceFee, subtotal};
        
        return fees;
    }
}
