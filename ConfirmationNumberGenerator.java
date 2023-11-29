/**
 * This is our class Confirmation Number Generator. 
 * The purpose of this singleton is to create a unique confirmation number every purchase.
 * 
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

public class ConfirmationNumberGenerator {
    private static ConfirmationNumberGenerator instance;
    private int counter;

    private ConfirmationNumberGenerator() {
        counter = 0; // Initialize the counter
    }

    public static ConfirmationNumberGenerator getInstance() {
        if (instance == null) {
            instance = new ConfirmationNumberGenerator();
        }
        return instance;
    }

    public String generateConfirmationNumber() {
        counter++;
        return String.format("CONF-%04d", counter);
    }
}
