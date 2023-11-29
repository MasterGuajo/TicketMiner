/**
 * writer class
 * Creates and writes information into files
 * 
 * @author Isabella Garcia
 * @author Fernanda Zuany
 * @author Jorge Garcia
 * @author Jazmin Huerta
 * @since November 16th, 2023
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

import java.io.FileWriter;
import java.io.IOException;
import java.util.HashMap;
import java.util.Map;

public class Writer {
    
    private static Writer instance;

    /**
     * Default constructor - private
     * 
     * @author Jorge Garcia
     * @author Jazmin Huerta
     * @since November 6th, 2023
     */
    private Writer(){

    }

    /**
     * Synchronized constrcutor 
     * Creates new instance if one is not already found
     * 
     * @author Jorge Garcia
     * @author Jazmin Huerta
     * @since November 6th, 2023
     * 
     */
    public static synchronized Writer getInstance(){
        if(instance == null){
            instance = new Writer();
        } 
        return instance;
    }

    /**
     * logAction method
     * Takes in actions and logs them into according file
     * 
     * @author Jorge Garcia
     * @author Jazmin Huerta
     * @since November 6th, 2023
     * 
     * @param data
     * @param fileName
     */
    public void logAction(String data, String fileName){
        try{
            FileWriter fileWriter = new FileWriter(fileName);

            if (data == null){
                fileWriter.write("No actions to Log");
            } else {
                fileWriter.write(data);
            }
           

            fileWriter.close();
        } catch (IOException e){
            System.out.println(e.getMessage());
        }
    }

    /**
     * createCustomerCSV method
     * Creates CSV file with updated customer info
     * 
     * @author Jorge Garcia
     * @author Jazmin Huerta
     * @since November 6th, 2023
     * 
     * @param customerMap
     */
    public void createCustomerCSV(HashMap<Integer, Customer> customerMap){
        try{
            FileWriter customerWriter = new FileWriter("CustomerListPA5New.txt");
            Customer currCustomer = new Customer();
            customerWriter.write("ID,First Name,Last Name,Money Available,Concerts Purchased,TicketMiner Membership,Username,Password,Invoice List,Savings\n");

            //We use Map Entry to loop over all keys and values in our dictionary
            for (Map.Entry<Integer, Customer> entry : customerMap.entrySet()){
                currCustomer = entry.getValue();
                String dataWritten = currCustomer.getId() + "," + currCustomer.getFirstName() + "," + currCustomer.getLastName() + "," +
                                    currCustomer.getBalance() + "," + currCustomer.getConcertsPurchased() + "," + currCustomer.isMember() + "," + 
                                    currCustomer.getUsername() + "," + currCustomer.getPassword() + ","+ currCustomer.getListInvoice()+ currCustomer.getSavings()+ "\n";
            
                customerWriter.write(dataWritten);
            }
            customerWriter.close();
            
        } catch (IOException e){
            System.out.println(e.getMessage());
        }
    }


    /**
     * createEventCSV method
     * Creates CSV file with updated event info
     * 
     * @author Jorge Garcia
     * @author Jazmin Huerta
     * @since November 6th, 2023
     * 
     * @param eventMap
     */
    public void createEventCSV(HashMap<Integer, Event> eventMap){
        try{
            FileWriter eventWriter = new FileWriter("EventListPA5New.txt");
            eventWriter.write("Event ID,Event Type,Name,Date,Time,VIP Price,Gold Price,Silver Price,Bronze Price,General Admission Price,Venue Name,Pct Seats Unavailable,Venue Type,Capacity,Cost,VIP Pct,Gold Pct,Silver Pct,Bronze Pct,General Admission Pct,Reserved Extra Pct,Fireworks Planned,Fireworks Cost, VIP Seats Sold, Gold Seats Sold, Silver Seats Sold, Bronze Seats Sold, General Admission Seats Sold, Total VIP Revenue, Total Gold Revenue, Total Silver Revenue, Total Bronze Revenue, Total General Admission Revenue, Tax money collected, Discounts given \n");

            for (Map.Entry<Integer, Event> entry : eventMap.entrySet()){
                int eventId = entry.getKey();
                String dataWritten = eventMap.get(eventId).getEventId() + "," + eventMap.get(eventId).getEventType() + "," + eventMap.get(eventId).getName() + "," +
                                    eventMap.get(eventId).getDate() + "," + eventMap.get(eventId).getTime() + "," + eventMap.get(eventId).getVipPrice() + "," + 
                                    eventMap.get(eventId).getGoldPrice() + "," + eventMap.get(eventId).getSilverPrice() + "," + eventMap.get(eventId).getBronzePrice() + "," + 
                                    eventMap.get(eventId).getGeneralAdmissionPrice() + "," + eventMap.get(eventId).getVenue().getVenueName() + "," + eventMap.get(eventId).getVenue().getSeatsUnavailablePct() + "," + 
                                    eventMap.get(eventId).getVenue().getVenueType() + "," + eventMap.get(eventId).getVenue().getCapacity() + "," + eventMap.get(eventId).getVenue().getCost() + "," + 
                                    eventMap.get(eventId).getVenue().getVipPct() + "," + eventMap.get(eventId).getVenue().getGoldPct() + "," + eventMap.get(eventId).getVenue().getSilverPct() + "," + 
                                    eventMap.get(eventId).getVenue().getBronzePct() + "," + eventMap.get(eventId).getVenue().getGeneralPct() + "," + eventMap.get(eventId).getVenue().getReservedPct() + "," + 
                                    eventMap.get(eventId).getVenue().hasFireworks() + "," + eventMap.get(eventId).getVenue().getCostFireworks() +
                                    eventMap.get(eventId).getVenue().getVipSeatsAvailableSold() + "," + eventMap.get(eventId).getVenue().getGoldSeatsAvailableSold() + "," + eventMap.get(eventId).getVenue().getSilverSeatsAvailableSold() + "," + 
                                    eventMap.get(eventId).getVenue().getBronzeSeatsAvailableSold() + "," + eventMap.get(eventId).getVenue().getGeneralAdmissionSeatsAvailableSold() + "," + (eventMap.get(eventId).getVenue().getVipSeatsAvailableSold() * eventMap.get(eventId).getVipPrice()) + "," + 
                                    (eventMap.get(eventId).getVenue().getGoldSeatsAvailableSold() * eventMap.get(eventId).getGoldPrice()) + "," + (eventMap.get(eventId).getVenue().getSilverSeatsAvailableSold() * eventMap.get(eventId).getSilverPrice()) + "," + 
                                    (eventMap.get(eventId).getVenue().getBronzeSeatsAvailableSold() * eventMap.get(eventId).getBronzePrice()) + (eventMap.get(eventId).getVenue().getGeneralAdmissionSeatsAvailableSold() * eventMap.get(eventId).getGeneralAdmissionPrice()) + "," + 
                                    eventMap.get(eventId).getTaxMoney() + "," + eventMap.get(eventId).getDiscounts() + "\n";
                eventWriter.write(dataWritten);
            }
            eventWriter.close();
            
        } catch (IOException e){
            System.out.println(e.getMessage());
        }
    }
}