/**
 * This is our class Concert. 
 * We super all the info to its parent class which is event, as we don't have any special attributes for each event yet
 * 
 * @author Jazmin Huerta
 * @author Jorge Garcia
 * @author Isabella Garcia
 * @author Maria Fernanda Zuany
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

public class Concert extends Event {
    
    
    /**
     * Constructor
     * Supers all info into parent class
     * 
     * @author Jorge Garcia
     * @author Jazmin Huerta
     * @author Isabella Garcia
     * @author Maria Fernanda Zuany
     * 
     * @param eventId
     * @param eventType
     * @param name
     * @param date
     * @param time
     * @param generalAdmissionPrice
     * @param venue
     */
    public Concert(int eventId, String eventType, String name, String date, String time, double generalAdmissionPrice, Venue venue){
        super(eventId, eventType, name, date, time, generalAdmissionPrice, venue,0,0,0);
    }

    /**
     * 
     * Constructor
     * Supers all info to parent class
     * 
     * @author Jorge Garcia
     * @author Jazmin Huerta
     * @author Isabella Garcia
     * @author Maria Fernanda Zuany
     * 
     * @since October 22nd, 2023
     * 
     * @param eventId
     * @param eventType
     * @param name
     * @param date
     * @param time
     * @param vipPrice
     * @param goldPrice
     * @param silverPrice
     * @param bronzePrice
     * @param generalAdmissionPrice
     * @param venue
     */
    public Concert(int eventId, String eventType, String name, String date, String time, double vipPrice, double goldPrice, double silverPrice, double bronzePrice, double generalAdmissionPrice, Venue venue, double convenienceFee, double serviceFee, double charityFee){
        super(eventId, eventType, name, date, time, vipPrice, goldPrice, silverPrice, bronzePrice, generalAdmissionPrice, venue);
    }   

}
