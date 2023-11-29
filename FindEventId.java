/**
 * Class to find the next Event Id when creating an event
 *
 * @author Maria Fernanda Zuany
 * @author Jorge Garcia
 * @author Jazmin Huerta
 * @author Isabella Garcia
 * @since November 16th, 2023
 * Instructor: Daniel Mejia
 * Final Deliverable
 * 
 * This work is to be done in teams of 4 people. It is not permitted to share,
    reproduce, or alter any part of this assignment for any purpose. Students are not
    permitted from sharing code, uploading this assignment online in any form,
    viewing, receiving, or modifying code written from anyone else. This assignment
    is part of an academic course at The University of Texas at El Paso and a grade
    will be assigned for the work produced individually by the student.
 */

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;

public class FindEventId {

    private static FindEventId instance;

    private int newEventId;

    public FindEventId(){

        this.newEventId = largestEventId();
    }

    public static synchronized FindEventId getInstance(){
        if(instance == null){// con que lo tengo que comparar
            instance = new FindEventId();
        }
        return instance;
    }


    private static int largestEventId(){
        int eventIdMax = 0;

        try (BufferedReader br = new BufferedReader(new FileReader("EventListPA5.csv"))) {
            String line;
            br.readLine();
            
            while ((line = br.readLine()) != null) {

                String[] columns = line.split(",");
                int eventID = Integer.parseInt(columns[11]); 

                // Update maxEventID if the current Event ID is larger
                eventIdMax = Math.max(eventIdMax, eventID);
            }
        } catch (IOException | NumberFormatException e) {
            e.printStackTrace();
        }
        return eventIdMax;
    }

    /**
     * Method to increment by one number the event Id
     * @author Maria Fernanda Zuany
     * @author Jorge Garcia
     * @author Jazmin Huerta
     * @author Isabella Garcia
     * @since 11/06/2023
     * PA4
     */
    public synchronized int generateEventID() {
        // Increment the largest Event ID and return it
        return ++newEventId;
    }
}
