/**
 * Stadium calls a super from its parent venue
 *
 * @author Maria Fernanda Zuany
 * @author Isabella Garcia
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
public class Stadium extends Venue{
    /**
     * Default Constructor
     * @author Jorge Garcia
     * @author Jazmin Huerta
     * @author Isabella Garcia
     * @author Maria Fernanda Zuany
     * @since 11/06/2023
     */
    public Stadium() {
    }

    /**
     * @author Jorge Garcia
     * @author Jazmin Huerta
     * @author Isabella Garcia
     * @author Maria Fernanda Zuany
     * @since 11/06/2023
     * @param venueName
     * @param venueType
     * @param capacity
     * @param cost
     */
    public Stadium(String venueName, String venueType, int capacity, double cost) {
        super(venueName, venueType, capacity, cost);
    }

    /**
     * @author Jorge Garcia
     * @author Jazmin Huerta
     * @author Isabella Garcia
     * @author Maria Fernanda Zuany
     * @since 11/06/2023
     * @param venueName
     * @param seatsUnavailablePct
     * @param venueType
     * @param capacity
     * @param cost
     * @param vipPct
     * @param goldPct
     * @param silverPct
     * @param bronzePct
     * @param generalPct
     * @param reservedPct
     * @param fireworks
     * @param fireworksCost
     */
    public Stadium(String venueName, double seatsUnavailablePct, String venueType, int capacity, double cost, int vipPct, int goldPct, int silverPct,
    int bronzePct, int generalPct, int reservedPct, String fireworks, String fireworksCost){
        super(venueName, seatsUnavailablePct, venueType, capacity, cost, vipPct, goldPct, silverPct, bronzePct, generalPct, reservedPct, fireworks, fireworksCost);
    }
    
}
