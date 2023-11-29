/**
 * Class to test if the methods for checking the correct format of date and time are working
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

import org.junit.Assert;
import org.junit.Test;

public class RunTicketTestDate{
    @Test
    public void testDate(){
        Assert.assertEquals(false, EventFunctionalities.isDateValid("11:11"));
        Assert.assertEquals(false, EventFunctionalities.isDateValid("11/11"));
        Assert.assertEquals(false, EventFunctionalities.isDateValid("-11/-11/-2023"));
        Assert.assertEquals(false, EventFunctionalities.isDateValid("11/11//2023"));
        Assert.assertEquals(true, EventFunctionalities.isDateValid("11/06/2023"));
        Assert.assertEquals(false, EventFunctionalities.isDateValid("1/-20/2023"));
        
    }
    
}
