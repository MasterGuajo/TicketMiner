/**
 * Class to test if the methods for checking correct format of date and time are working
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

public class RunTicketTestTime{
    @Test
    
    public void testTime(){
        Assert.assertEquals(false, EventFunctionalities.isTimeValid("11/2023/25"));
        Assert.assertEquals(false, EventFunctionalities.isTimeValid("11/20"));
        Assert.assertEquals(false, EventFunctionalities.isTimeValid("11:111"));
        Assert.assertEquals(false, EventFunctionalities.isTimeValid("-12:-12"));
        Assert.assertEquals(false, EventFunctionalities.isTimeValid("-1:-10"));
        Assert.assertEquals(false, EventFunctionalities.isTimeValid("45:45"));
        Assert.assertEquals(false, EventFunctionalities.isTimeValid("1:61"));
        Assert.assertEquals(false, EventFunctionalities.isTimeValid("13:59"));
        Assert.assertEquals(true, EventFunctionalities.isTimeValid("12:59"));
        Assert.assertEquals(true, EventFunctionalities.isTimeValid("06:00"));
        Assert.assertEquals(false, EventFunctionalities.isTimeValid("6:00"));
        
    }
}
