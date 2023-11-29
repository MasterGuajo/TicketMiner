/**
 * This is our class VenueFactory. 
 * It takes in a string and creates the corresponding venue object.
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

 public class VenueFactory {
     
    /**
     * Default Constructor
     * 
     * @author Isabella Garcia
     * @author Maria Fernanda Zuany
     * @author Jazmin Huerta
     * @author Jorge Garcia
     * @since November 5th, 2023
     */
    public VenueFactory(){

    }

    /**
     * createVenue method
     * Creates a child of event depending on the venue type parameter and returns it
     * 
     * @author Isabella Garcia
     * @author Maria Fernanda Zuany
     * @author Jazmin Huerta
     * @author Jorge Garcia
     * @since November 5th, 2023
     * 
     * @param venueName
     * @param seatsUnavailablePct
     * @param venueType
     * @param capacity
     * @param cost
     * @param vipPct
     * @param goldPct
     * @param silverPct
     * @param bronzePct
     * @param generalAdmissionPct
     * @param reservedPct
     * @param hasFireworks
     * @param costFireworks
     * @return
     */
    public Venue createVenue(String venueName, double seatsUnavailablePct, String venueType, int capacity, double cost, int vipPct,
    int goldPct, int silverPct, int bronzePct, int generalPct, int reservedPct, String hasFireworks, String costFireworks){

        if(venueType.equalsIgnoreCase("Stadium")){
            return new Stadium(venueName, seatsUnavailablePct, venueType, capacity, cost, vipPct, goldPct, silverPct, bronzePct, generalPct, reservedPct, hasFireworks, costFireworks);

        } else if (venueType.equalsIgnoreCase("Open Air")){
            return new OpenAir(venueName, seatsUnavailablePct, venueType, capacity, cost, vipPct, goldPct, silverPct, bronzePct, generalPct, reservedPct, hasFireworks, costFireworks);

        } else if (venueType.equalsIgnoreCase("Auditorium")){
            return new Auditorium(venueName, seatsUnavailablePct, venueType, capacity, cost, vipPct, goldPct, silverPct, bronzePct, generalPct, reservedPct, hasFireworks, costFireworks);

        }  else if (venueType.equalsIgnoreCase("Arena")){
            return new Arena(venueName, seatsUnavailablePct, venueType, capacity, cost, vipPct, goldPct, silverPct, bronzePct, generalPct, reservedPct, hasFireworks, costFireworks);

        }  else {
            return null;
        }
    }

     /**
     * createVenue method
     * Creates a child of event depending on the venue type parameter and returns it
     * 
     * @author Isabella Garcia
     * @author Maria Fernanda Zuany
     * @author Jazmin Huerta
     * @author Jorge Garcia
     * @since November 5th, 2023
     * 
     * @param venueName
     * @param seatsUnavailablePct
     * @param venueType
     * @param capacity
     * @param cost
     * @return
     */
    public Venue createVenue(String venueName, String venueType, int capacity, double cost){

        if(venueType.equalsIgnoreCase("Stadium")){
            return new Stadium(venueName, venueType, capacity, cost);

        } else if (venueType.equalsIgnoreCase("Open Air")){
            return new OpenAir(venueName, venueType, capacity, cost);

        } else if (venueType.equalsIgnoreCase("Auditorium")){
            return new Auditorium(venueName, venueType, capacity, cost);

        }  else if (venueType.equalsIgnoreCase("Arena")){
            return new Arena(venueName, venueType, capacity, cost);

        }  else {
            return null;
        }
    }
}