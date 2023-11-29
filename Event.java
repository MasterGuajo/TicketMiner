/**
 * This is our class EVENT
 * Here we save all general information that each event has
 * 
 * @author Isabella Garcia
 * @author Maria Fernanda Zuany
 * @author Jazmin Huerta
 * @author Jorge Garcia
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

import java.util.ArrayList;

public abstract class Event{

    //ATTRIBUTES
    private int eventId;
    private String eventType;
    private String name;
    private String date;
    private String time;
    private double vipPrice;
    private double goldPrice;
    private double silverPrice;
    private double bronzePrice;
    private double generalAdmissionPrice;
    private Venue venue;
    private double taxMoney;
    private ArrayList<Invoice> eventListInvoice;
    private double discounts;
    private double convenienceFee;
    private double serviceFee;
    private double charityFee;

    /**
     * Default constructor
     * @author Jorge Garcia
     * @author Jazmin Huerta
     * @author Maria Fernanda Zuany
     * @author Isabella Garcia
     * @since 11/13/2023
     */
    public Event() {
    }

    /**
     * Default constructor
     * @author Jorge Garcia
     * @author Jazmin Huerta
     * @author Maria Fernanda Zuany
     * @author Isabella Garcia
     * @since 11/13/2023
     * @param eventId
     * @param eventType
     * @param name
     * @param date
     * @param time
     * @param generalAdmissionPrice
     * @param venue
     * @param convenienceFee
     * @param serviceFee
     * @param charityFee
     */

    public Event(int eventId, String eventType, String name, String date, String time, double generalAdmissionPrice, Venue venue, double convenienceFee, double serviceFee, double charityFee){

        this.eventId = eventId;
        this.eventType = eventType;
        this.name = name;
        this.date = date;
        this.time = time;
        this.vipPrice = generalAdmissionPrice * 5;
        this.goldPrice = generalAdmissionPrice * 3;
        this.silverPrice = generalAdmissionPrice * 2.5;
        this.bronzePrice = generalAdmissionPrice * 1.5;
        this.generalAdmissionPrice = generalAdmissionPrice;
        this.venue = venue;
        this.taxMoney= 0.0;
        this.eventListInvoice = new ArrayList<Invoice>();
        this.discounts = 0.0;
        this.convenienceFee = 0.0;
        this.serviceFee = 0.0;
        this.charityFee = 0.0;
    }

    /**
     * Constructor
     * 
     * @author Jorge Garcia
     * @author Jazmin Huerta
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
     * @param convenienceFee
     * @param serviceFee
     * @param charityFee
     */
    public Event(int eventId, String eventType, String name, String date, String time, double vipPrice, double goldPrice,
                    double silverPrice, double bronzePrice, double generalAdmissionPrice, Venue venue) {
        
        this.eventId = eventId;
        this.eventType = eventType;
        this.name = name;
        this.date = date;
        this.time = time;
        this.vipPrice = vipPrice;
        this.goldPrice = goldPrice;
        this.silverPrice = silverPrice;
        this.bronzePrice = bronzePrice;
        this.generalAdmissionPrice = generalAdmissionPrice;
        this.venue = venue;
        this.taxMoney=0.0;
        this.eventListInvoice = new ArrayList<Invoice>();
        this.discounts =0.0;
        this.convenienceFee = 0.0;
        this.serviceFee = 0.0;
        this.charityFee = 0.0;

    }


    // public Event (int eventId, String eventType, String name, String date, String time, double generalAdmissionPrice, Venue venue){
    //      this.eventId = eventId;
    //     this.eventType = eventType;
    //     this.name = name;
    //     this.date = date;
    //     this.time = time;
    //     this.venue = venue;
    // }

    //Getters ------------------------

    /**
     * @author Jorge Garcia
     * @author Jazmin Huerta
     * @author Maria Fernanda Zuany
     * @author Isabella Garcia
     * @since Nov 9, 2023
     * @return discounts
     */
    public double getDiscounts() {
        return discounts;
    }
    /**
     * @author Jorge Garcia
     * @author Jazmin Huerta
     * @author Maria Fernanda Zuany
     * @author Isabella Garcia
     * @since Nov 9, 2023
     * @return convenienceFee
     */
    public double getConvenienceFee() {
        return convenienceFee;
    }

    /**
     * @author Jorge Garcia
     * @author Jazmin Huerta
     * @author Maria Fernanda Zuany
     * @author Isabella Garcia
     * @since Nov 9, 2023
     * @return serviceFee
     */
    public double getServiceFee() {
        return serviceFee;
    }


    /**
     * @author Jorge Garcia
     * @author Jazmin Huerta
     * @author Maria Fernanda Zuany
     * @author Isabella Garcia
     * @since Nov 9, 2023
     * @return charityFee
     */
    public double getCharityFee() {
        return charityFee;
    }


    /**
     * @author Jorge Garcia
     * @author Jazmin Huerta
     * @author Maria Fernanda Zuany
     * @author Isabella Garcia
     * @since October 22nd, 2023
     * @return eventListInvoice
     */
    public ArrayList<Invoice> getEventListInvoice() {
        return eventListInvoice;
    }

    /**
     * @author Jorge Garcia
     * @author Jazmin Huerta
     * @author Maria Fernanda Zuany
     * @author Isabella Garcia
     * @since October 22nd, 2023
     * @return taxMoney
     */
    public double getTaxMoney() {
        return taxMoney;
    }

    /**
     * @author Jorge Garcia
     * @author Jazmin Huerta
     * @author Maria Fernanda Zuany
     * @author Isabella Garcia
     * @since October 22nd, 2023
     * @return eventId
     */
    public int getEventId() {
        return eventId;
    }

    /**
     * @author Jorge Garcia
     * @author Jazmin Huerta
     * @author Maria Fernanda Zuany
     * @author Isabella Garcia
     * @since October 22nd, 2023
     * @return eventType
     */
    public String getEventType() {
        return eventType;
    }

    /**
     * @author Jorge Garcia
     * @author Jazmin Huerta
     * @author Maria Fernanda Zuany
     * @author Isabella Garcia
     * @since October 22nd, 2023
     * @return name
     */
    public String getName() {
        return name;
    }

    /**
     * @author Jorge Garcia
     * @author Jazmin Huerta
     * @author Maria Fernanda Zuany
     * @author Isabella Garcia
     * @since October 22nd, 2023
     * @return date
     */
    public String getDate() {
        return date;
    }

    /**
     * @author Jorge Garcia
     * @author Jazmin Huerta
     * @author Maria Fernanda Zuany
     * @author Isabella Garcia
     * @since October 22nd, 2023
     * @return time
     */
    public String getTime() {
        return time;
    }

    /**
     * @author Jorge Garcia
     * @author Jazmin Huerta
     * @author Maria Fernanda Zuany
     * @author Isabella Garcia
     * @since October 22nd, 2023
     * @return vipPrice
     */
    public double getVipPrice() {
        return vipPrice;
    }

    /**
     * @author Jorge Garcia
     * @author Jazmin Huerta
     * @author Maria Fernanda Zuany
     * @author Isabella Garcia
     * @since October 22nd, 2023
     * @return goldPrice
     */
    public double getGoldPrice() {
        return goldPrice;
    }

    /**
     * @author Jorge Garcia
     * @author Jazmin Huerta
     * @author Maria Fernanda Zuany
     * @author Isabella Garcia
     * @since October 22nd, 2023
     * @return silverPrice
     */
    public double getSilverPrice() {
        return silverPrice;
    }

    /**
     * @author Jorge Garcia
     * @author Jazmin Huerta
     * @author Maria Fernanda Zuany
     * @author Isabella Garcia
     * @since October 22nd, 2023
     * @return bronzePrice
     */
    public double getBronzePrice() {
        return bronzePrice;
    }

    /**
     * @author Jorge Garcia
     * @author Jazmin Huerta
     * @author Maria Fernanda Zuany
     * @author Isabella Garcia
     * @since October 22nd, 2023
     * @return generalAdmissionPrice
     */
    public double getGeneralAdmissionPrice() {
        return generalAdmissionPrice;
    }
    
    /**
     * @author Jorge Garcia
     * @author Jazmin Huerta
     * @author Maria Fernanda Zuany
     * @author Isabella Garcia
     * @since October 22nd, 2023
     * @return venue
     */
    public Venue getVenue(){
        return venue;
    }

    //Setters -------------------------------------------

    /**
     * @author Jorge Garcia
     * @author Jazmin Huerta
     * @author Maria Fernanda Zuany
     * @author Isabella Garcia
     * @since October 22nd, 2023
     * @param eventIdIn
     */
    public void setEventID(int eventIdIn) {
        this.eventId = eventIdIn;
    }

    /**
     * @author Jorge Garcia
     * @author Jazmin Huerta
     * @author Maria Fernanda Zuany
     * @author Isabella Garcia
     * @since October 22nd, 2023
     * @param eventType
     */
    public void setEventType(String eventType) {
        this.eventType = eventType;
    }

    /**
     * @author Jorge Garcia
     * @author Jazmin Huerta
     * @author Maria Fernanda Zuany
     * @author Isabella Garcia
     * @since October 22nd, 2023
     * @param nameIn
     */
    public void setName(String nameIn) {
        this.name = nameIn;
    }

    /**
     * @author Jorge Garcia
     * @author Jazmin Huerta
     * @author Maria Fernanda Zuany
     * @author Isabella Garcia
     * @since October 22nd, 2023
     * @param dateIn
     */
    public void setDate(String dateIn) {
        this.date = dateIn;
    }

    /**
     * @author Jorge Garcia
     * @author Jazmin Huerta
     * @author Maria Fernanda Zuany
     * @author Isabella Garcia
     * @since October 22nd, 2023
     * @param timeIn
     */
    public void setTime(String timeIn) {
        this.time = timeIn;
    }

    /**
     * @author Jorge Garcia
     * @author Jazmin Huerta
     * @author Maria Fernanda Zuany
     * @author Isabella Garcia
     * @since October 22nd, 2023
     * @param vipPriceIn
     */
    public void setVipPrice(double vipPriceIn) {
        this.vipPrice = vipPriceIn;
    }

    /**
     * @author Jorge Garcia
     * @author Jazmin Huerta
     * @author Maria Fernanda Zuany
     * @author Isabella Garcia
     * @since October 22nd, 2023
     * @param goldPriceIn
     */
    public void setGoldPrice(double goldPriceIn) {
        this.goldPrice = goldPriceIn;
    }

    /**
     * @author Jorge Garcia
     * @author Jazmin Huerta
     * @author Maria Fernanda Zuany
     * @author Isabella Garcia
     * @since October 22nd, 2023
     * @param silverPriceIn
     */
    public void setSilverPrice(double silverPriceIn) {
        this.silverPrice = silverPriceIn;
    }

    /**
     * @author Jorge Garcia
     * @author Jazmin Huerta
     * @author Maria Fernanda Zuany
     * @author Isabella Garcia
     * @since October 22nd, 2023
     * @param bronzePriceIn
     */
    public void setBronzePrice(double bronzePriceIn) {
        this.bronzePrice = bronzePriceIn;
    }

    /**
     * @author Jorge Garcia
     * @author Jazmin Huerta
     * @author Maria Fernanda Zuany
     * @author Isabella Garcia
     * @since October 22nd, 2023
     * @param generalAdmissionPriceIn
     */
    public void setGeneralAdmissionPrice(double generalAdmissionPriceIn) {
        this.generalAdmissionPrice = generalAdmissionPriceIn;
    }

    /**
     * @author Jorge Garcia
     * @author Jazmin Huerta
     * @author Maria Fernanda Zuany
     * @author Isabella Garcia
     * @since October 22nd, 2023
     * @param venueIn
     */
    public void setVenue(Venue venueIn){
        this.venue = venueIn;
    }

    /**
     * @author Jorge Garcia
     * @author Jazmin Huerta
     * @author Maria Fernanda Zuany
     * @author Isabella Garcia
     * @since October 22nd, 2023
     * @param discounts
     */
    public void setDiscounts(double discounts) {
        this.discounts = discounts;
    }

    /**
     * @author Jorge Garcia
     * @author Jazmin Huerta
     * @author Maria Fernanda Zuany
     * @author Isabella Garcia
     * @since October 22nd, 2023
     * @param eventListInvoice
     */
    public void setEventListInvoice(ArrayList<Invoice> eventListInvoice) {
        this.eventListInvoice = eventListInvoice;
    }

    /**
     * @author Jorge Garcia
     * @author Jazmin Huerta
     * @author Maria Fernanda Zuany
     * @author Isabella Garcia
     * @since October 22nd, 2023
     * @param eventId
     */
    public void setEventId(int eventId) {
        this.eventId = eventId;
    }

    /**
     * @author Jorge Garcia
     * @author Jazmin Huerta
     * @author Maria Fernanda Zuany
     * @author Isabella Garcia
     * @since October 22nd, 2023
     * @param taxMoney
     */
    public void setTaxMoney(double taxMoney) {
        this.taxMoney = taxMoney;
    }

    /**
     * @author Jorge Garcia
     * @author Jazmin Huerta
     * @author Fernanda Zuany
     * @author Isabella Garcia
     * @since November 19th 2023
     * @param charityFee
     */
    public void setCharityFee(double charityFee) {
        this.charityFee = charityFee;
    }

    /**
     * @author Jorge Garcia
     * @author Jazmin Huerta
     * @author Fernanda Zuany
     * @author Isabella Garcia
     * @since Nov 19, 2023
     * @param convenienceFee
     * 
     */
    public void setConvenienceFee(double convenienceFee) {
        this.convenienceFee = convenienceFee;
    }

    /**
     * @author Jorge Garcia
     * @author Jazmin Huerta
     * @author Fernanda Zuany
     * @author Isabella Garcia
     * @since Nov 19, 2023
     * @param serviceFee
     * 
     */
    public void setServiceFee(double serviceFee) {
        this.serviceFee = serviceFee;
    }

    /**
     * printGeneralEventInfo method
     * Prints event information (non-detailed)
     * 
     * @author Jorge Garcia
     * @author Jazmin Huerta
     * @since October 22nd, 2023
     * 
     * @return void
     */
    public void printGeneralEventInfo(){
        System.out.println("=====================================");
        System.out.println("| ---------- Event ID: " + this.eventId);
        System.out.println("| ---- Name of event : " + this.name);
        System.out.println("| ---- Date of event : " + this.date);
        System.out.println("|  Time of the event : " + this.time);
        System.out.println("| ------- VIP Price : $" + this.vipPrice);
        System.out.println("| ------ Gold Price : $" + this.goldPrice);
        System.out.println("| ---- Silver Price : $" + this.silverPrice);
        System.out.println("| ---- Bronze Price : $" + this.bronzePrice);
        System.out.println("| General Admission : $" + this.generalAdmissionPrice);
    }


    /**
     * printTicketsPrices method
     * Prints tickets prices
     * 
     * @author Jorge Garcia
     * @author Jazmin Huerta
     * @since October 22nd, 2023
     * 
     * @return void
    */
    public void printTicketPrices(){
        System.out.println();
        System.out.println("|~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~|");
        System.out.println("                 Event: "+this.name);
        System.out.println();
        System.out.println("|~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~|");
        System.out.println("Here are the ticket prices for the event:");
        System.out.println("| ------- VIP Price : $" + this.vipPrice);
        System.out.println("| ------ Gold Price : $" + this.goldPrice);
        System.out.println("| ---- Silver Price : $" + this.silverPrice);
        System.out.println("| ---- Bronze Price : $" + this.bronzePrice);
        System.out.println("| General Admission : $" + this.generalAdmissionPrice);
        System.out.println("|~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~|");
    }

    /**
     * revenueCurrentTickets method
     * Calculates current ticket sold revenue
     * 
     * @author Jorge Garcia
     * @author Jazmin Huerta
     * @since October 22nd, 2023
     * 
     * @return double
    */
    public double revenueCurrentTickets(){
        return (venue.getVipSeatsAvailableSold() * getVipPrice()) + 
                (venue.getGoldSeatsAvailableSold() * getGoldPrice()) + 
                (venue.getSilverSeatsAvailableSold() * getSilverPrice()) + 
                (venue.getBronzeSeatsAvailableSold() * getBronzePrice()) + 
                (venue.getGeneralAdmissionSeatsAvailableSold() * getGeneralAdmissionPrice());
    }

    /**
     * revenueAllTickets method
     * Calculates all ticket sold revenue
     * 
     * @author Jorge Garcia
     * @author Jazmin Huerta
     * @since October 22nd, 2023
     * 
     * @return double
    */
    public double revenueAllTickets(){
        return (venue.getTotalVipSeats() * getVipPrice()) + 
                (venue.getTotalGoldSeats() * getGoldPrice()) + 
                (venue.getTotalSilverSeats() * getSilverPrice()) + 
                (venue.getTotalBronzeSeats() * getBronzePrice()) + 
                (venue.getTotalGeneralAdmissionSeats() * getGeneralAdmissionPrice());
    }
    /**
     * @author Isabella Garcia
     * @since 11/12/2023
     *  Admin way to display event proceeds for a specific event
     */
    public void eventProceeds() {

        System.out.format(
                        "+---------------------------------------------------------------------------------------------------------------+%n");
        System.out.println("                                             EVENT PROCEEDS                                                           ");
        System.out.format(
                        "+---------------+---------------+----------+-----------+----------+------------+--------------+-----------------+%n");
        System.out.printf(
                        "  +Total Service Fees: $%.2f\n" , this.serviceFee);
        System.out.format(
                        "+---------------------------------------------------------------------------------------------------------------+%n");
        System.out.printf(
                        "  +Total Conveineince Fees: $%.2f\n" ,this.convenienceFee);
        System.out.format(
                        "+---------------------------------------------------------------------------------------------------------------+%n");
        System.out.printf(
                        "  +Total Charity Fees: $%.2f\n" , this.charityFee);
        System.out.format(
                        "+---------------------------------------------------------------------------------------------------------------+%n");
        System.out.printf(
                        "  +Total Fees: $%.2f\n" , totalFees() );
        System.out.format(
                        "+---------------------------------------------------------------------------------------------------------------+%n");
    }
    /**
     * Calulates the sum of the total fees collected for an event
     * 
     * @author Fernanda Zuany
     * @since 11/13/2023
     * @return total fees
     */
    public double totalFees(){
        return this.charityFee + this.convenienceFee + this.serviceFee;
    }


    /**
     * When an event is cancelled, we reset the prices and fees, beacuse we can no longer purchase 
     * and we have to give the fees collected back
     * 
     * @author Isabella Garcia
     * @author Jorge Garcia
     * @author Jazmin Huerta
     * 
     * @since 11/15/2023
     */
    public void cancelEvent(){

        setName(this.name + " **CANCELLED**");

        this.getVenue().cancelVenue();

        this.vipPrice = 0.0;
        this.goldPrice = 0.0;
        this.silverPrice = 0.0;
        this.bronzePrice = 0.0;
        this.generalAdmissionPrice = 0.0;
        this.convenienceFee =0.0;
        this.serviceFee=0.0;
        this.taxMoney =0.0;
        this.discounts =0.0;
        //refundInvoices();
    }

    /**
     * @author Jorge Garcia
     * @since 11/13/2023
     * @param eventName
     * @return
     */
    public void refundInvoices(){

        for(int i = 0; i < this.eventListInvoice.size(); i++){

            double refund = this.eventListInvoice.get(i).getSubtotal();
            this.eventListInvoice.get(i).getCustomer().updateBalance(refund);

        }
    }
}