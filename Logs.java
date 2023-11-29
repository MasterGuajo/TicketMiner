/**
 * Log class
 * Tracks information that is going to be logged
 * 
 * @author Isabella Garcia
 * @author Maria Fernanda Zuany
 * @author Jorge Garcia
 * @author Jazmin Huerta
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


public class Logs {
    
    //Attributes
    private String data;

    /**
     * Default Constructor
     * 
     * @author Jorge Garcia
     * @author Jazmin Huerta
     * @author Isabella Garcia
     * @author Maria Fernanda Zuany
     * @since November 6th, 2023
     */
    public Logs(){

    }

    /**
     * Constructor
     * 
     * @author Jorge Garcia
     * @author Jazmin Huerta
     * @author Isabella Garcia
     * @author Maria Fernanda Zuany
     * @since November 6th, 2023
     */
    public Logs(String data){
        this.data = data;
    }

    /**
     * @author Jorge Garcia
     * @author Jazmin Huerta
     * @author Isabella Garcia
     * @author Maria Fernanda Zuany
     * @since November 6th, 2023
     * @param dataIn
     */
    public void setData(String dataIn){
        if(this.data == null){
            this.data = dataIn + "\n";
        } else {
            this.data = this.data + dataIn + "\n";
        }
        
    }

    /**
     * @author Jorge Garcia
     * @author Jazmin Huerta
     * @author Isabella Garcia
     * @author Maria Fernanda Zuany
     * @since November 6th, 2023
     * @return data
     */
    public String getData(){
        return this.data;
    }

    /**
     * clearData method
     * Resets data
     * @author Jorge Garcia
     * @author Jazmin Huerta
     * @author Isabella Garcia
     * @author Maria Fernanda Zuany
     * @since November 6th, 2023
     */
    public void clearData(){
        this.data = "";
    }
}
