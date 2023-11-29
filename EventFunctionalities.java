/**
 * This is our EventFunctionalities class that has all the methods involving the 
 * creation, cancellation of an event and the changes that can be made to it, as well as 
 * calculating the fees related to the event 
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

import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class EventFunctionalities {
    
    /**
     * eventChange method
     * Asks admin if they would like to change information about any event and proceeds to make changes
     * 
     * @author Jorge Garcia
     * @author Jazmin Huerta
     * @author Maria Fernanda Zuany
     * @author Isabella Garcia
     * @since November 6th, 2023
     * 
     * @param eventID
     * @param eventMap
     * @param userChoice
     * @param userInput
     * @param loggedActions
     */

    public static void eventChange(int eventID, HashMap<Integer, Event> eventMap, HashMap<String, Integer> eventMapByName, String userChoice, Scanner userInput, Logs loggedActions){
        Menu menu = new Menu();
        String replacingValue;

        boolean wantsToModify = true;
        boolean validChoice = false;

        while(wantsToModify){

            menu.eventChangeMenu();

            userChoice = userInput.nextLine().trim();

            // If they choose 1, they're going to change the ID the event
            
            // In these if's we:
            // 1) Ask the user for their input on their desired change
            // 2) Change it from the sport object using their setter
            // 3) Add the change to our txt 
            // 4) Show them the new info

            switch(userChoice){
                
                case "1":
                    System.out.println("Please enter the new name for the event: ");
                    replacingValue = userInput.nextLine();
                    String oldName = eventMap.get(eventID).getName();
                    //Removes entry by key name in hashmapName
                    eventMapByName.remove(eventMap.get(eventID).getName().toLowerCase());
                    eventMapByName.put(replacingValue.toLowerCase(),  eventMap.get(eventID).getEventId());

                    for(int i = 0; i < eventMap.get(eventID).getEventListInvoice().size(); i++){

                        eventMap.get(eventID).getEventListInvoice().get(i).setEventName(replacingValue);

                        for(int j = 0; j < eventMap.get(eventID).getEventListInvoice().get(i).getCustomer().getListInvoice().size(); j++){

                            if (eventMap.get(eventID).getEventListInvoice().get(i).getCustomer().getListInvoice().get(j).getEventName().equals(oldName)) {
                                eventMap.get(eventID).getEventListInvoice().get(i).getCustomer().getListInvoice().get(j).setEventName(replacingValue);
                            }
                        }
                    }

                    //update the other map
                    eventMap.get(eventID).setName(replacingValue);

                    loggedActions.setData("Event number " + eventID + " changed name to " + replacingValue);

                    System.out.println("--- Here's the new information of that event: ~--~- ");
                    eventMap.get(eventID).printGeneralEventInfo();
                break;
            

                case "2":
                    System.out.println("Please enter the new date for the event: ");
                    replacingValue = userInput.nextLine();
                    eventMap.get(eventID).setDate(replacingValue);

                    loggedActions.setData("Event number " + eventID + " changed date to " + replacingValue);

                    System.out.println("~-~-~- Here's the new information of that event: ~-~-~- ");
                    eventMap.get(eventID).printGeneralEventInfo();
                break;

                case "3":
                    System.out.println("Please enter the new time for the event");
                    replacingValue = userInput.nextLine();
                    eventMap.get(eventID).setTime(replacingValue);

                    loggedActions.setData("Event number " + eventID + " changed time to " + replacingValue);

                    System.out.println("~-~-~- Here's the new information of that event: ~-~-~- ");
                    eventMap.get(eventID).printGeneralEventInfo();
                break;

                case "4":
                    System.out.println("Please enter the new VIP ticket price for the event");
                    replacingValue = userInput.nextLine();

                    try {
                        eventMap.get(eventID).setVipPrice(Double.parseDouble(replacingValue));

                        loggedActions.setData("Event number " + eventID + " changed VIP Ticket Price to " + replacingValue);

                        System.out.println("~-~-~- Here's the new information of that event: ~-~-~- ");
                        eventMap.get(eventID).printGeneralEventInfo();
                    }
                    catch (NumberFormatException e){
                        System.out.println("Sorry, we only accept doubles or integers when changing price");
                    }
                break;

                case "5":
                    System.out.println("Please enter the new Gold ticket price for the event");
                    replacingValue = userInput.nextLine();
                    
                    try {
                        eventMap.get(eventID).setGoldPrice(Double.parseDouble(replacingValue));
                        
                        loggedActions.setData("Event number " + eventID + " changed Gold Ticket Price to " + replacingValue);

                        System.out.println("~-~-~- Here's the new information of that event: ~-~-~- ");
                        eventMap.get(eventID).printGeneralEventInfo();
                    }
                    catch (NumberFormatException e){
                        System.out.println("Sorry, we only accept doubles or integers when changing price");
                    }
                break;

                case "6":
                    System.out.println("Please enter the new Silver ticket price for the event");
                    replacingValue = userInput.nextLine();
                    
                    try {
                        eventMap.get(eventID).setSilverPrice(Double.parseDouble(replacingValue));

                        loggedActions.setData("Event number " + eventID + " changed Silver Ticket Price to " + replacingValue);

                        System.out.println("~-~-~- Here's the new information of that event: ~-~-~- ");
                        eventMap.get(eventID).printGeneralEventInfo();
                    }
                    catch (NumberFormatException e){
                        System.out.println("Sorry, we only accept doubles or integers when changing price");
                    }
                break;

                case "7":
                    System.out.println("Please enter the new Bronze ticket price for the event");
                    replacingValue = userInput.nextLine();
                    

                    try {
                        eventMap.get(eventID).setBronzePrice(Double.parseDouble(replacingValue));

                        loggedActions.setData("Event number " + eventID + " changed Bronze Ticket Price to " + replacingValue);

                        System.out.println("~-~-~- Here's the new information of that event: ~-~-~- ");
                        eventMap.get(eventID).printGeneralEventInfo();
                    }
                    catch (NumberFormatException e){
                        System.out.println("Sorry, we only accept doubles or integers when changing price");
                    }
                break;

                case "8":
                    System.out.println("Please enter the new General Admission ticket price for the event");
                    replacingValue = userInput.nextLine();
                    
                    try {
                        eventMap.get(eventID).setGeneralAdmissionPrice(Double.parseDouble(replacingValue));

                        loggedActions.setData("Event number " + eventID + " changed General Admission Ticket Price to " + replacingValue);

                        System.out.println("~-~-~- Here's the new information of that event: ~-~-~- ");
                        eventMap.get(eventID).printGeneralEventInfo();
                    }
                    catch (NumberFormatException e){
                        System.out.println("Sorry, we only accept doubles or integers when changing price");
                    }
                break;

                case "EXIT":
                    System.out.println("Going back. . .");
                    wantsToModify = false;
                    validChoice = true;
                break;
                
                default:
                    System.out.println("Didn't understand that input");
                break;
            }

            validChoice = false;
            while (!validChoice){
                System.out.println("Is there something else you'd like to edit? (Y / N)");

                userChoice = userInput.nextLine().trim();

                if (userChoice.equalsIgnoreCase("N")){
                    wantsToModify = false;
                    validChoice = true;
                } else if (userChoice.equalsIgnoreCase("Y")){

                    System.out.println("Great! Let's keep on editing");
                    validChoice = true;

                } else {
                    System.out.println("Sorry, didn't understand your input");
                }
            }
        }
    }

    /**
     * createNewEvent method
     * This method prompts the admin questions so that they can create a new event that will be added to the list of events.
     * 
     * @author Maria Fernanda Zuany
     * @author Jorge Garcia
     * @since November 6,2023
     * @param eventMap
     * @param loggedActions
     */
    public static void createNewEvent(HashMap<Integer, Event> eventMap, HashMap<String, Integer> eventMapByName, Logs loggedActions) {
        Scanner input = new Scanner(System.in);

        System.out.println("Do you want to create an event (YES/NO)?");
        boolean validOption = true;

        while (validOption){
            String createEvent = input.nextLine();
            System.out.println("-------------------------------------------");

            if (createEvent.equalsIgnoreCase("YES")){
                //create unique ID (Largest ID++)
                System.out.println("Please enter the name of the new event:");
                String newEventName = input.nextLine();
                System.out.println("-------------------------------------------");

                System.out.println("Please enter the date (MM/DD/YYYY):");
                String newEventDate = "";
                while (true) {
                    newEventDate = input.nextLine();

                    if (isDateValid(newEventDate)) {
                        System.out.println("Valid date format: " + newEventDate);
                        break;
                    } else {
                        System.out.println("Invalid date format. Please enter the date in MM/DD/YYYY format:");
                    }
                }
                System.out.println("-------------------------------------------");


                System.out.println("Please enter the event time (XX:XX):");
                String newEventTime = "";
                boolean validTime = true;
                while (validTime) {
                    newEventTime = input.nextLine();

                    if (isTimeValid(newEventTime)) {
                        System.out.println("AM or PM? ");
                        boolean amPm = true;
                        while (amPm){
                            String amOrPm = input.nextLine();
                            if(amOrPm.equalsIgnoreCase("AM")||amOrPm.equalsIgnoreCase("PM")){
                                System.out.println("Valid date format: " + newEventTime + amOrPm);
                                amPm = false;
                                validTime = false;
                            }else{
                                System.out.println("Enter AM or PM");
                            }
                        }
                    } else {
                        System.out.println("Invalid date format. Please enter the date in XX:XX format:");
                    }
                }
                System.out.println("-------------------------------------------");

                boolean correctFormatVenue = true;
                String newEventVenue = "";
                String venueName = "";
                String eventType = "";
                String venueType = "";
                int capacity = 0;
                double newGeneralAP = 0.0;

                Menu menu = new Menu();
                VenueFactory venueF = new VenueFactory();
                EventFactory eventF = new EventFactory();
                FindEventId eventIDGenerator = FindEventId.getInstance();
                int eventId = 0;

                while (correctFormatVenue){
                    menu.venueMenu();
                    System.out.print(">>");
                    newEventVenue = input.nextLine();

                    boolean validPrice = false;
                    boolean validVenue = false;

                    while (!validVenue) {
                        validVenue = true;

                        if (newEventVenue.equalsIgnoreCase("Sun Bowl Stadium")|| newEventVenue.equalsIgnoreCase("1")){

                            venueName = "Sun Bowl Stadium";
                            venueType = "Stadium";
                            capacity = 58000;

                            System.out.println("It is a Sport or a Concert?: ");
                            String eventTypeChoice = input.nextLine();

                            if(eventTypeChoice.equalsIgnoreCase("Sport")){
                                eventType = "Sport";

                            } else if(eventTypeChoice.equalsIgnoreCase("Concert")){
                                eventType = "Concert";
                                
                            } else {
                                System.out.println("Please enter either Sport/Concert");
                                validVenue = false;
                            }   
                
                        } else if (newEventVenue.equalsIgnoreCase("Don Haskins Center")|| newEventVenue.equalsIgnoreCase("2")){

                            venueName = "Don Haskins Center";
                            venueType = "Arena";
                            capacity = 12800;

                            System.out.println("It is a Sport,Concert or Festival?: ");
                            String eventTypeChoice = input.nextLine();
                            
                            if(eventTypeChoice.equalsIgnoreCase("Sport")){
                                eventType = "Sport";

                            } else if(eventTypeChoice.equalsIgnoreCase("Concert")){
                                eventType = "Concert";

                            } else if(eventTypeChoice.equalsIgnoreCase("Festival")){
                                eventType = "Festival";

                            } else {
                                System.out.println("Please enter either Sport, Concert or Festival: ");
                                validVenue = false;
                            }

                        } else if (newEventVenue.equalsIgnoreCase("Magoffin Auditorium")|| newEventVenue.equalsIgnoreCase("3")){
                            venueName = "Magoffin Auditorium";
                            venueType = "Auditorium";
                            eventType = "Concert";
                            capacity = 1152;

                        } else if (newEventVenue.equalsIgnoreCase("San Jacinto Plaza")|| newEventVenue.equalsIgnoreCase("4")){
                            venueName = "San Jacinto Plaza";
                            venueType = "Open Air";
                            eventType = "Festival";
                            capacity = 5000;

                        } else if (newEventVenue.equalsIgnoreCase("Centennial Plaza")|| newEventVenue.equalsIgnoreCase("5")){
                            venueName = "Centennial Plaza";
                            venueType = "Open Air";
                            eventType = "Festival";
                            capacity = 5000;

                        } else {
                            System.out.println("Please enter the venue in a correct format");
                            System.out.println("-------------------------------------------");
                            newEventVenue = input.nextLine();
                            validVenue = false;
                        }                
                    }

                    while(!validPrice){
                        System.out.println("Please enter the General Admission Price (Max of $4000): ");
                       
                        try {
                            newGeneralAP = input.nextDouble();
                            input.nextLine();
                            if (newGeneralAP <= 4000 && newGeneralAP >=1){
                                validPrice = true;
                            } else {
                                System.out.println("Please enter a price that is greater than $1 and lower than $4000");
                            }

                        } catch (NumberFormatException e) {
                            System.out.println("Sorry, please enter a valid number");
                        }
                    }

                    System.out.println("Current price: " + newGeneralAP);

                    eventId = eventIDGenerator.generateEventID();
                    Venue tempVenue = venueF.createVenue(venueName,venueType,capacity,0.0);
                    Event tempEvent = eventF.createEvent(eventId,eventType,newEventName,newEventDate,newEventTime,newGeneralAP,tempVenue);

                    tempEvent.getGeneralAdmissionPrice();

                    eventMapByName.put(newEventName.toLowerCase(), eventId);
                    eventMap.put(eventId,tempEvent);

                    correctFormatVenue = false;
                    validVenue = true;
                }

                System.out.println("Event created sucessfully :)");
                loggedActions.setData("New Event Created - ID: "+ eventId + ", Name: " + newEventName + ", Date: " + newEventDate +  ", Time: " + newEventTime  + ", Venue: " + newEventVenue);
                validOption = false;
                
            } else if (createEvent.equalsIgnoreCase("NO")){
                System.out.println("Event not created :(");
                validOption = false;
            } else{
                System.out.println("Please enter a valid option (YES/NO)");
            }
        }
    }

    
    /**
     * isDateValid 
     * Checks that the current input for date matches the format expected
     * 
     * @author Maria Fernanda Zuany
     * @param newDate
     * @return true/false if the entered Date is in a valid format
     */
    public static boolean isDateValid(String newDate){
        String regex = "^(0[1-9]|0[1-9]\\d*)/\\d{2}/\\d{4}$";
        Pattern pattern = Pattern.compile(regex);
        Matcher matcher = pattern.matcher(newDate);
        return matcher.find();
    }

    /**
     * isTimeValid 
     * Checks that the current input for time matches the format expected
     * 
     * @author Maria Fernanda Zuany
     * @param newTime
     * @return true/false if the entered time is in a valid format
     */
    public static boolean isTimeValid(String newTime){
        String regex = "^(0[1-9]|1[0-2]):[0-5][0-9]$";
        Pattern pattern = Pattern.compile(regex);
        Matcher matcher = pattern.matcher(newTime);
        return matcher.find();
    }

     /**
     * cancelEventAdmin method
     * Cancels event by changing the event's name and adding " CANCELLED " afterwards, then it makes all of the event's tickets 0,
     * that way it will not allow the customer to buy tickets, since our code checks the available tickets before allowing the customer
     * to purchase.
     * @author Isabella Garcia
     * @author Jorge Garcia
     * @author Jazmin Huerta
     * @since 11/26/23
     * 
    */
    public static void cancelEventAdmin(int eventID, HashMap<Integer, Event> eventMap, String userChoice, Scanner userInput, Logs loggedActions){

        //We check that the event hasn't already been cancelled
        if(eventMap.get(eventID).getName().contains("CANCELLED")){
            System.out.println("This event is already cancelled");
            return;
        }

        eventMap.get(eventID).cancelEvent();

        //Traverse all our invoices to return money accordingly
        for(int i = 0; i < eventMap.get(eventID).getEventListInvoice().size(); i++){

            //If it doesn't say cancelled, we proceed to return the money
            if(!eventMap.get(eventID).getEventListInvoice().get(i).getEventName().contains("CANCELLED")){
                
                double refund = eventMap.get(eventID).getEventListInvoice().get(i).getTotal();
                eventMap.get(eventID).getEventListInvoice().get(i).getCustomer().updateBalance(refund);

                //We update the customers invoices so that they can no longer refund it themselves.
                 for(int j = 0; j < eventMap.get(eventID).getEventListInvoice().get(i).getCustomer().getListInvoice().size(); j++){

                    if (eventMap.get(eventID).getEventListInvoice().get(i).getCustomer().getListInvoice().get(j).getEventName().equals(eventMap.get(eventID).getEventListInvoice().get(i).getEventName())) {
                        eventMap.get(eventID).getEventListInvoice().get(i).getCustomer().getListInvoice().get(j).cancelInvoiceAdmin();
                    }
                }
                loggedActions.setData("Refunded $" + refund + " to " + eventMap.get(eventID).getEventListInvoice().get(i).getCustomer().getUsername());
            }
        }

        loggedActions.setData("Event number " + eventID + " has been CANCELLED ");
        loggedActions.setData("Event " + eventMap.get(eventID).getName() + "'s seats have all been CANCELLED");
        System.out.println("");
        System.out.println("This event has been cancelled.");
        System.out.println("~-~-~- Here's the new information of that event: ~-~-~- ");
        eventMap.get(eventID).printGeneralEventInfo();
    }

    
    /**
     * cancelEventCustomer
     * Refunds money from selected tickets and updates invoices for both the event and customer to say Cancelled
     * 
     * @author Jorge Garcia
     * @author Jazmin Huerta 
     * @since 11/26/2023
     * @param currCustomer
     * @param eventMap
     * @param eventToCancel
     * @param loggedActions
     */
    public static void cancelEventCustomer(Customer currCustomer, HashMap<Integer, Event> eventMap, Invoice eventToCancel, Logs loggedActions){

        if(eventToCancel.getEventName().contains("CANCELLED")){
            System.out.println("Those tickets have already been refunded");
            return;
        }

        //Updates customers balance
        currCustomer.updateBalance((eventToCancel.getTicketCount() * eventToCancel.getPricePerTicket())-eventToCancel.getMemberDiscount());
        currCustomer.setConcertsPurchased(currCustomer.getConcertsPurchased() - 1);

        int eventID = eventToCancel.getEventId();

        //Sets tickets back to normal
        eventMap.get(eventID).getVenue().updateSeats(eventToCancel.getTicketType(),-eventToCancel.getTicketCount());
        
        //sustract the current member discounts from the collected member discounts
        eventMap.get(eventID).setDiscounts(eventMap.get(eventID).getDiscounts()-eventToCancel.getMemberDiscount());

        //Updates event invoices if they match with the event name and customer username
        for(int i = 0; i < eventMap.get(eventID).getEventListInvoice().size(); i++){

            //We traverse the invoices of that event, and cancel them so that they appear for both sides
            if (currCustomer.getUsername().equals(eventMap.get(eventID).getEventListInvoice().get(i).getCustomer().getUsername())) {
                eventMap.get(eventID).getEventListInvoice().get(i).cancelInvoiceCustomer();
            }
        }

        loggedActions.setData(currCustomer.getUsername() + " refunded " +  eventToCancel.getTicketCount() + " " +  eventToCancel.getTicketType() +" tickets for " + eventMap.get(eventID).getName());
        loggedActions.setData("Added $" + ((eventToCancel.getTicketCount() * eventToCancel.getPricePerTicket())-eventToCancel.getMemberDiscount()) + " to " + currCustomer.getUsername() + "'s account");

        System.out.println();
        System.out.printf("Succesfully refunded tickets!\nNew balance of $%.2f\n", currCustomer.getBalance());
    }

    /**
     * eventExistsID
     * Check if the entered event exists
     * 
     * @author Maria Fernanda Zuany
     * @author Isabella Garcia
     * @author Jazmin Huerta
     * @author Jorge Garcia
     * @since November 6th, 2023
     * 
     * @param eventId
     * @param eventMap
     * @param event
     * @return true/false if the event exists
     */
    public static int eventExistsID(String eventKey, HashMap<Integer, Event> eventMap, HashMap<String,Integer> eventMapByName) {
        int currEventID;
        eventKey = eventKey.toLowerCase();
        
        if (eventKey.equals("EXIT")) {
            return 0;
        } else {

            if(eventMapByName.containsKey(eventKey)){
                return eventMapByName.get(eventKey.toLowerCase());
            }

            try {
                currEventID = Integer.parseInt(eventKey);
                if (eventMap.containsKey(currEventID)) {
                    return currEventID;
                } else {
                    System.out.println("Event not found, please try again");
                    return 0;
                }
            } catch (NumberFormatException e) {
                System.out.println("Please enter a valid ID or name (ID's are made up of numbers)");
                return 0;
            }
        }
    }

    /**
     * totalService
     * Collects all the service fees for all events
     * 
     * @author Isabella Garcia
     * @param eventMap
     * @return totalServiceFees
     */
    public static double totalService(HashMap<Integer, Event> eventMap) {

        double totalServiceFees = 0.0;
    
        for (Map.Entry<Integer, Event> entry : eventMap.entrySet()) {
            int currentEventID = entry.getKey();
            int eventID = entry.getKey();
            if (eventMap.get(currentEventID).getEventId() == eventID) {
                totalServiceFees += eventMap.get(currentEventID).getServiceFee();
            }
        }
    
        return totalServiceFees;
    }

    /**
     * totalConvenience
     * Collects all the convenience fees for all events
     * 
     * @author Isabella Garcia
     * @param eventMap
     * @return totalConvenienceFees
     */
    public static double totalConvenience(HashMap<Integer, Event> eventMap) {
        double totalConvenienceFees = 0.0;

        for (Map.Entry<Integer, Event> entry : eventMap.entrySet()){
            int eventID = entry.getKey();
            if(eventMap.get(eventID).getEventId() == eventID){
                totalConvenienceFees += eventMap.get(eventID).getConvenienceFee();
            }
        }

        return totalConvenienceFees;
    }
    
    /**
     * Calculates the total fee event proceeds
     * 
     * @author Isabella Garcia
     * @since 11/18/2023
     * @return total fees
     */
    public static double allEventFees(HashMap<Integer, Event> eventMap){
        return totalConvenience(eventMap) + totalService(eventMap);
    }

    /**
     * @author Isabella Garcia
     * @author Jazmin Huerta
     * @since 11/12/2023
     *  Admin way to display  event proceeds for all events
     */
    public static void allEventProceeds(HashMap<Integer, Event> eventMap) {
        System.out.format(
                        "+---------------------------------------------------------------------------------------------------------------+%n");
        System.out.println("                                            ALL EVENT PROCEEDS                                                      ");
        System.out.format(
                        "+---------------+---------------+----------+-----------+----------+------------+--------------+-----------------+%n");
        System.out.printf(
                        "  +Total Service Fees: $%.2f\n" , totalService(eventMap) );
        System.out.format(
                        "+---------------------------------------------------------------------------------------------------------------+%n");
        System.out.printf(
                        "  +Total Convinience Fees: $%.2f\n" , totalConvenience(eventMap));
        System.out.format(
                        "+---------------------------------------------------------------------------------------------------------------+%n");
        System.out.printf(
                        "  +Total Fees: $%.2f\n" , allEventFees(eventMap));
        System.out.format(
                        "+---------------------------------------------------------------------------------------------------------------+%n");
    }
}
