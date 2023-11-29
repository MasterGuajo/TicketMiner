/**
 * This is our CSVReader class where we will be able to read and store our cvs files 
 * and store them as Hashmaps 
 * 
 * @author Isabella Garcia
 * @author Maria Fernanda Zuany
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

import java.io.File;
import java.io.FileNotFoundException;
import java.util.HashMap;
import java.util.Scanner;

public class CSVReader {

    /**
     * Default Constructor
     * 
     * @author Jorge Garcia
     * @author Jazmin Huerta
     * @since October 22nd, 2023
     */
    public CSVReader(){}

    /**
     * storeEvents method
     * Method that reads a csv file creates a hashmap to store the event data
     * 
     * @author Jazmin Huerta
     * @author Jorge Garcia
     * @since October 22nd, 2023
     * 
     * @param filename
     * @return Event Hashmap
    */
    public HashMap<Integer, Event> storeEvents(String fileName){
        HashMap<Integer, Event> data = new HashMap<Integer,Event>();

        int eventId;
        boolean parseComplete = false;
        Scanner scanner = new Scanner(System.in);

        while(!parseComplete){
            try{
                File file = new File(fileName);
                Scanner reader = new Scanner(file);

                String line = reader.nextLine();
                String [] col = line.split(",", -1);
                int [] orderCol = eventFileOrganizer(col);

                reader.useDelimiter(",");

                VenueFactory venueF = new VenueFactory();
                EventFactory eventF = new EventFactory();

                while(reader.hasNextLine()){
                    line = reader.nextLine();
                    col = line.split(",", -1);

                    if(!col[orderCol[0]].equals("")){

                        eventId = Integer.parseInt(col[orderCol[0]]);

                        Venue tempVenue = venueF.createVenue(col[orderCol[10]], Double.parseDouble(col[orderCol[11]]), col[orderCol[12]], Integer.parseInt(col[orderCol[13]]), Double.parseDouble(col[orderCol[14]]), Integer.parseInt(col[orderCol[15]]), Integer.parseInt(col[orderCol[16]]),Integer.parseInt(col[orderCol[17]]), Integer.parseInt(col[orderCol[18]]), Integer.parseInt(col[orderCol[19]]), Integer.parseInt(col[orderCol[20]]),col[orderCol[21]], col[orderCol[22]]);
                        Event tempEvent = eventF.createEvent(Integer.parseInt(col[orderCol[0]]), col[orderCol[1]],col[orderCol[2]],col[orderCol[3]], col[orderCol[4]], Double.parseDouble(col[orderCol[5]]), Double.parseDouble(col[orderCol[6]]), Double.parseDouble(col[orderCol[7]]),Double.parseDouble(col[orderCol[8]]),Double.parseDouble(col[orderCol[9]]), tempVenue, 0.0,0.0,0.0);      

                        data.put(eventId, tempEvent);
                    }
                }

                reader.close();
                parseComplete = true;

            } catch(FileNotFoundException e) {
                System.out.println(e.getMessage());
                System.out.println("Please enter the new filename as we couldn't find the current one:");
                System.out.print("Filename:"); 
                fileName = scanner.nextLine();
            }
        }
        return data;   
    }


    public HashMap<String, Integer> storeEventsByName(String fileName){
        HashMap<String, Integer> data = new HashMap<String, Integer>();

        boolean parseComplete = false;
        Scanner scanner = new Scanner(System.in);

        while(!parseComplete){
            try{
                File file = new File(fileName);
                Scanner reader = new Scanner(file);

                String line = reader.nextLine();
                String [] col = line.split(",", -1);
                int [] orderCol = eventFileOrganizer(col);

                reader.useDelimiter(",");

                while(reader.hasNextLine()){
                    line = reader.nextLine();
                    col = line.split(",", -1);

                    if(!col[orderCol[0]].equals("")){

                        int eventId = Integer.parseInt(col[orderCol[0]]);
                        String eventName = col[orderCol[2]];

                       
                        data.put(eventName.toLowerCase(), eventId);
                    }
                }

                reader.close();
                parseComplete = true;

            } catch(FileNotFoundException e) {
                System.out.println(e.getMessage());
                System.out.println("Please enter the new filename as we couldn't find the current one:");
                System.out.print("Filename:"); 
                fileName = scanner.nextLine();
            }
        }
        return data;   
    }

    /**
     * storeCustomerByName
     * 
     * @author Jazmin Huerta
     * @author Isabella Garcia
     * @author Maria F. Zuany
     * @author Jorge Garcia
     * @since November 18th, 2023
     * 
     * @param fileName
     * @return
     */
    public HashMap<String, Integer> storeCustomerByName(String fileName){
        HashMap<String, Integer> data = new HashMap<String, Integer>();

        boolean parseComplete = false;
        Scanner scanner = new Scanner(System.in);

        while(!parseComplete){
            try{
                File file = new File(fileName);
                Scanner reader = new Scanner(file);

                String line = reader.nextLine();
                String [] col = line.split(",", -1);
                int [] orderCol = customerFileOrganizer(col);

                reader.useDelimiter(",");

                while(reader.hasNextLine()){
                    line = reader.nextLine();
                    col = line.split(",", -1);

                    if(!col[orderCol[0]].equals("")){

                        int customerId = Integer.parseInt(col[orderCol[0]]);
                        String customerName = col[orderCol[1]]+" "+col[orderCol[2]];

                       
                        data.put(customerName.toLowerCase(), customerId);
                    }
                }

                reader.close();
                parseComplete = true;

            } catch(FileNotFoundException e) {
                System.out.println(e.getMessage());
                System.out.println("Please enter the new filename as we couldn't find the current one:");
                System.out.print("Filename:"); 
                fileName = scanner.nextLine();
            }
        }
        return data;   
    }

    /**
     * storeCustomer method
     * Method that reads a csv file creates a hashmap to store the customer data
     * 
     * @author Jazmin Huerta
     * @author Jorge Garcia
     * @since October 22nd, 2023
     * 
     * @param filename
     * @return Customer Hashmap
    */
    public HashMap<Integer, Customer> storeCustomerID(String fileName){

        HashMap<Integer, Customer> data = new HashMap<Integer,Customer>();
        boolean parseComplete = false;
        Scanner scanner = new Scanner(System.in);

        while(!parseComplete){
            try{
                File file = new File(fileName);
                Scanner reader = new Scanner(file);
                
                String line = reader.nextLine();
                String [] col = line.split(",", -1);
                int [] orderCol = customerFileOrganizer(col);

                reader.useDelimiter(",");

                while(reader.hasNextLine()){
                    line = reader.nextLine();
                    col = line.split(",", -1);

                    if(!col[0].equals("")){
                        
                        Customer customer = new Customer(Integer.parseInt(col[orderCol[0]]), col[orderCol[1]],col[orderCol[2]],Double.parseDouble(col[orderCol[3]]),Integer.parseInt(col[orderCol[4]]) , Boolean.parseBoolean(col[orderCol[5]].toLowerCase()), col[orderCol[6]],col[orderCol[7]]);
                        data.put(Integer.parseInt(col[orderCol[0]]), customer);
                    }
                }
                reader.close();
                parseComplete = true;

            } catch(FileNotFoundException e) {
                System.out.println(e.getMessage());
                System.out.println("Please enter the new filename as we couldn't find the current one:");
                System.out.print("Filename:"); 
                fileName = scanner.nextLine();
            }
        }
        return data;
    }

    /**
     * eventFileOrganizer method
     * Takes in header of CSV and return an organized array that shows us the position of each title
     * 
     * @author Jorge Garcia
     * @author Jazmin Huerta
     * @since October 22nd, 2023
     * 
     * @param fileTitles
     * @return int []
     */
    public int[] eventFileOrganizer(String[] fileTitles){
        int[] fileOrder = new int[fileTitles.length];

         for (int i = 0; i < fileTitles.length; i++){
            if(fileTitles[i].equals("Event ID")){
                fileOrder[0] = i;

            } else if (fileTitles[i].equals("Event Type")){
                fileOrder[1] = i;

            } else if (fileTitles[i].equals("Name")){
                fileOrder[2] = i;

            } else if (fileTitles[i].equals("Date")){
                fileOrder[3] = i;

            } else if (fileTitles[i].equals("Time")){
                fileOrder[4] = i;

            } else if (fileTitles[i].equals("VIP Price")){
                fileOrder[5] = i;
                
            } else if (fileTitles[i].equals("Gold Price")){
                fileOrder[6] = i;

            } else if (fileTitles[i].equals("Silver Price")){
                fileOrder[7] = i;

            } else if (fileTitles[i].equals("Bronze Price")){
                fileOrder[8] = i;

            } else if (fileTitles[i].equals("General Admission Price")){
                fileOrder[9] = i;

            } else if (fileTitles[i].equals("Venue Name")){
                fileOrder[10] = i;

            } else if (fileTitles[i].equals("Pct Seats Unavailable")){
                fileOrder[11] = i;

            } else if (fileTitles[i].equals("Venue Type")){
                fileOrder[12] = i;

            } else if (fileTitles[i].equals("Capacity")){
                fileOrder[13] = i;

            } else if (fileTitles[i].equals("Cost")){
                fileOrder[14] = i;

            } else if (fileTitles[i].equals("VIP Pct")){
                fileOrder[15] = i;

            } else if (fileTitles[i].equals("Gold Pct")){
                fileOrder[16] = i;

            } else if (fileTitles[i].equals("Silver Pct")){
                fileOrder[17] = i;

            } else if (fileTitles[i].equals("Bronze Pct")){
                fileOrder[18] = i;

            } else if (fileTitles[i].equals("General Admission Pct")){
                fileOrder[19] = i;

            } else if (fileTitles[i].equals("Reserved Extra Pct")){
                fileOrder[20] = i;

            } else if (fileTitles[i].equals("Fireworks")){
                fileOrder[21] = i;

            } else if (fileTitles[i].equals("Fireworks Cost")){
                fileOrder[22] = i;
            } 
        }
        return fileOrder;
    }


    /**
     * customerFileOrganizer method
     * Takes in header of CSV and return an organized array that shows us the position of each title
     * 
     * @author Jorge Garcia
     * @since October 22nd, 2023
     * 
     * @param fileTitles
     * @return int []
     */

    public int[] customerFileOrganizer(String[] fileTitles){
        int[] fileOrder = new int[fileTitles.length];
        for (int i = 0; i < fileTitles.length; i++){

            if(fileTitles[i].equals("ID")){
                fileOrder[0] = i;

            } else if (fileTitles[i].equals("First Name")){
                fileOrder[1] = i;

            } else if (fileTitles[i].equals("Last Name")){
                fileOrder[2] = i;

            } else if (fileTitles[i].equals("Money Available")){
                fileOrder[3] = i;

            } else if (fileTitles[i].equals("Tickets Purchased")){
                fileOrder[4] = i;

            } else if (fileTitles[i].equals("TicketMiner Membership")){
                fileOrder[5] = i;
                
            } else if (fileTitles[i].equals("Username")){
                fileOrder[6] = i;

            } else if (fileTitles[i].equals("Password")){
                fileOrder[7] = i;
            }
        }
        return fileOrder;
    
    }
    
}