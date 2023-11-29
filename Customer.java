/**
 * This is our class CUSTOMER
 * Here we save all info that a customer has on their profile. This class receives the invoice class
 * 
 * @author Jazmin Huerta
 * @author Jorge Garcia
 * @author Maria Fernanda Zuany
 * @author Isabella Garcia
 * @since November 26th, 2023
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
import java.io.BufferedWriter;
import java.io.FileWriter;
import java.io.IOException;
import java.util.ArrayList;

public class Customer{
    
    //Attributes
    private int id;
    private String firstName;
    private String lastName;
    private Double balance;
    private int concertsPurchased;
    private boolean membership;
    private String username;
    private String password;
    private ArrayList<Invoice> listInvoice;
    private double savings;
  
    /**
     * Default Constructor
     * 
     * @author Jazmin Huerta
     * @author Jorge Garcia
     * @author Maria Fernanda Zuany
     * @author Isabella Garcia
     * @since October 22nd, 2023
     */
    public Customer() {
    }

    /**
     * Constructor
     * 
     * @author Jazmin Huerta
     * @author Jorge Garcia
     * @author Maria Fernanda Zuany
     * @author Isabella Garcia
     * @since October 22nd, 2023
     * 
     * @param id
     * @param firstName
     * @param lastName
     * @param balance
     * @param concertsPurchased
     * @param membership
     * @param username
     * @param password
     */
    public Customer(int id, String firstName, String lastName, Double balance, int concertsPurchased,
            boolean membership, String username, String password) {
        this.id = id;
        this.firstName = firstName;
        this.lastName = lastName;
        this.balance = balance;
        this.concertsPurchased = concertsPurchased;
        this.membership = membership;
        this.username = username;
        this.password = password;
        this.listInvoice = new ArrayList<Invoice>();
    }

    //Setters ------------------------------

    /**
     * @author Jazmin Huerta
     * @author Jorge Garcia
     * @author Maria Fernanda Zuany
     * @author Isabella Garcia
     * @since October 22nd, 2023
     * @param savings
     */
    public void setSavings(double savings) {
        this.savings = savings;
    }

    /**
     * @author Jazmin Huerta
     * @author Jorge Garcia
     * @author Maria Fernanda Zuany
     * @author Isabella Garcia
     * @since October 22nd, 2023
     * @param listInvoice
     */
    public void setListInvoice(ArrayList<Invoice> listInvoice) {
        this.listInvoice = listInvoice;
    }

    /**
     * @author Jazmin Huerta
     * @author Jorge Garcia
     * @author Maria Fernanda Zuany
     * @author Isabella Garcia
     * @since October 22nd, 2023
     * @param idIn
     */
    public void setId(int idIn) {
        this.id = idIn;
    }

    /**
     * @author Jazmin Huerta
     * @author Jorge Garcia
     * @author Maria Fernanda Zuany
     * @author Isabella Garcia
     * @since October 22nd, 2023
     * @param firstNameIn
     */
    public void setFirstName(String firstNameIn) {
        this.firstName = firstNameIn;
    }

    /**
     * @author Jazmin Huerta
     * @author Jorge Garcia
     * @author Maria Fernanda Zuany
     * @author Isabella Garcia
     * @since October 22nd, 2023
     * @param lastNameIn
     */
    public void setLastName(String lastNameIn) {
        this.lastName = lastNameIn;
    }

    /**
     * @author Jazmin Huerta
     * @author Jorge Garcia
     * @author Maria Fernanda Zuany
     * @author Isabella Garcia
     * @since October 22nd, 2023
     * @param balanceIn
     */
    public void setBalance(Double balanceIn) {
        this.balance = balanceIn;
    }

    /**
     * @author Jazmin Huerta
     * @author Jorge Garcia
     * @author Maria Fernanda Zuany
     * @author Isabella Garcia
     * @since October 22nd, 2023
     * @param concertsPurchasedIn
     */
    public void setConcertsPurchased(int concertsPurchasedIn) {
        this.concertsPurchased = concertsPurchasedIn;
    }

    /**
     * @author Jazmin Huerta
     * @author Jorge Garcia
     * @author Maria Fernanda Zuany
     * @author Isabella Garcia
     * @since October 22nd, 2023
     * @param membershipIn
     */
    public void setMembership(boolean membershipIn) {
        this.membership = membershipIn;
    }

    /**
     * @author Jazmin Huerta
     * @author Jorge Garcia
     * @author Maria Fernanda Zuany
     * @author Isabella Garcia
     * @since October 22nd, 2023
     * @param usernameIn
     */
    public void setUsername(String usernameIn) {
        this.username = usernameIn;
    }

    /**
     * @author Jazmin Huerta
     * @author Jorge Garcia
     * @author Maria Fernanda Zuany
     * @author Isabella Garcia
     * @since October 22nd, 2023
     * @param passwordIn
     */
    public void setPassword(String passwordIn) {
        this.password = passwordIn;
    }

    //Getters -----------------------

    /**
     * @author Jazmin Huerta
     * @author Jorge Garcia
     * @author Maria Fernanda Zuany
     * @author Isabella Garcia
     * @since October 22nd, 2023
     * @return id
     */
    public int getId() {
        return id;
    }

    /**
     * @author Jazmin Huerta
     * @author Jorge Garcia
     * @author Maria Fernanda Zuany
     * @author Isabella Garcia
     * @since October 22nd, 2023
     * @return firstName
     */
    public String getFirstName() {
        return firstName;
    }

    /**
     * @author Jazmin Huerta
     * @author Jorge Garcia
     * @author Maria Fernanda Zuany
     * @author Isabella Garcia
     * @since October 22nd, 2023
     * @return lastName
     */
    public String getLastName() {
        return lastName;
    }

    /**
     * @author Jazmin Huerta
     * @author Jorge Garcia
     * @author Maria Fernanda Zuany
     * @author Isabella Garcia
     * @since October 22nd, 2023
     * @return balance
     */
    public Double getBalance() {
        return balance;
    }

    /**
     * @author Jazmin Huerta
     * @author Jorge Garcia
     * @author Maria Fernanda Zuany
     * @author Isabella Garcia
     * @since October 22nd, 2023
     * @return concertsPurchased
     */
    public int getConcertsPurchased() {
        return concertsPurchased;
    }

    /**
     * @author Jazmin Huerta
     * @author Jorge Garcia
     * @author Maria Fernanda Zuany
     * @author Isabella Garcia
     * @since October 22nd, 2023
     * @return memebrship
     */
    public boolean isMember() {
        return membership;
    }

    /**
     * @author Jazmin Huerta
     * @author Jorge Garcia
     * @author Maria Fernanda Zuany
     * @author Isabella Garcia
     * @since October 22nd, 2023
     * @return username
     */
    public String getUsername() {
        return username;
    }

    /**
     * @author Jazmin Huerta
     * @author Jorge Garcia
     * @author Maria Fernanda Zuany
     * @author Isabella Garcia
     * @since October 22nd, 2023
     * @return password
     */
    public String getPassword() {
        return password;
    }

    /**
     * @author Jazmin Huerta
     * @author Jorge Garcia
     * @author Maria Fernanda Zuany
     * @author Isabella Garcia
     * @since October 22nd, 2023
     * @return savings
     */
    public double getSavings() {
        return savings;
    }

    /**
     * @author Jazmin Huerta
     * @author Jorge Garcia
     * @author Maria Fernanda Zuany
     * @author Isabella Garcia
     * @since October 22nd, 2023
     * @return listInvoice
     */
    public ArrayList<Invoice> getListInvoice() {
        return listInvoice;
    }

    /**
     * printInvoices method
     * Parses through array and prints all invoices
     * 
     * @author Jazmin Huerta
     * @author Jorge Garcia
     * @since October 22nd, 2023
     */
    public void printInvoices(){
        for(int i = 0; i < this.listInvoice.size(); i++){
            this.listInvoice.get(i).printInvoice();
        }
    }
    /**
     * @author Jorge Garcia
     * @since 11/13/2023
     * @param moneyUpdate
     */
    public void updateBalance(double moneyUpdate){
        this.balance = this.balance + moneyUpdate;
    }

    /**
     * This method creates a txt file for the invoice summary of the selected customer
     * @author Isabella Garcia
     * 
     * @since November 6th 2023
     */
    public void createInvoiceSummary() {
        //Writer writer = writer.getInstance();
        //Logs log = new Logs();

        //writer.logAction(lastName, firstName);
        try (BufferedWriter writer = new BufferedWriter(new FileWriter(this.lastName + this.firstName + "_Invoice.txt"))) {
            writer.write("|-----------------------------------------------------------------------------------------------------------------|");
            writer.write("|                  Invoice Summary for " + this.firstName + " "+ this.lastName+ "                    |");
            writer.write("|-----------------------------------------------------------------------------------------------------------------|");
            

            for(int i = 0; i < this.listInvoice.size(); i++){
                writer.write(this.listInvoice.get(i).stringInvoice());
            }
            
            writer.write("|-----------------------------------------------------------------------------------------------------------------|");
            System.out.println("Invoice summary for " + this.firstName + this.lastName + " has been generated.");
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    /**
     * This method traverses through the invoices 
     * and returns the one with the matching id
     * 
     * @author Jorge Garcia
     * @since 11/13/2023
     * @param eventName
     * @return
     */
    public Invoice traverseInvoices(String eventName){
        for(int i = 0; i < this.listInvoice.size(); i++){
            if (eventName.equalsIgnoreCase(this.listInvoice.get(i).getEventName())) {
                return this.listInvoice.get(i);
            }
        }
        return null;
    }
}
