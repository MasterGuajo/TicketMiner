/**
 * This is our class EventFactory. 
 * It takes in a string and creates the corresponding event object.
 * 
 * @author Isabella Garcia
 * @author Maria Fernanda Zuany
 * @author Jazmin Huerta
 * @author Jorge Garcia
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

 public class EventFactory {
    
    /**
     * Default constructor
     * 
     * @author Jorge Garcia
     * @author Jazmin Huerta
     * @author Maria Fernanda Zuany
     * @author Isabella Garcia
     */
    public EventFactory(){

    }

    /**
     * createEvent method
     * Creates a child of event depending on the event type parameter and returns it
     * 
     * @author Isabella Garcia
     * @author Maria Fernanda Zuany
     * @author Jazmin Huerta
     * @author Jorge Garcia
     * @since November 5th, 2023
     * Instructor: Daniel Mejia
     * Programming Assignment 4
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
     * @return Event 
     */
    public Event createEvent(int eventId, String eventType, String name, String date, String time, double vipPrice, double goldPrice, double silverPrice, double bronzePrice, double generalAdmissionPrice, Venue venue, double convenienceFee, double serviceFee, double charityFee){
        if(eventType.equalsIgnoreCase("Sport")){
            return new Sport(eventId, eventType, name, date, time, vipPrice, goldPrice, silverPrice, bronzePrice, generalAdmissionPrice, venue, convenienceFee, serviceFee, charityFee);

        } else if (eventType.equalsIgnoreCase("Festival")){
            return new Festival(eventId, eventType, name, date, time, vipPrice, goldPrice, silverPrice, bronzePrice, generalAdmissionPrice, venue, convenienceFee, serviceFee, charityFee);
            
        } else if (eventType.equalsIgnoreCase("Concert")){
            return new Concert(eventId, eventType, name, date, time, vipPrice, goldPrice, silverPrice, bronzePrice, generalAdmissionPrice, venue, convenienceFee, serviceFee, charityFee);
        
        } else {
            return null;
        }
    }

    /**
     * createEvent method
     * Creates a child of event depending on the event type parameter and returns it
     * 
     * @author Isabella Garcia
     * @author Maria Fernanda Zuany
     * @author Jazmin Huerta
     * @author Jorge Garcia
     * @since November 5th, 2023
     * Instructor: Daniel Mejia
     * Programming Assignment 4
     * 
     * @param eventId
     * @param eventType
     * @param name
     * @param date
     * @param time
     * @param generalAdmissionPrice
     * @param venue
     * @return Event 
     */
    public Event createEvent(int eventId, String eventType, String name, String date, String time, double generalAdmissionPrice, Venue venue){
        if(eventType.equalsIgnoreCase("Sport")){
            return new Sport(eventId, eventType, name, date, time, generalAdmissionPrice, venue);

        } else if (eventType.equalsIgnoreCase("Festival")){
            return new Festival(eventId, eventType, name, date, time, generalAdmissionPrice, venue);
            
        } else if (eventType.equalsIgnoreCase("Concert")){
            return new Concert(eventId, eventType, name, date, time, generalAdmissionPrice, venue);
        
        } else {
            return null;
        }
    }
}