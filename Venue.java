/**
 * This is our class VENUE. It stores all information about where the event will take place. It is abstract since we won't be creating an actual venue
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

public abstract class Venue {

    //Attributes
    private String venueName;
    private double seatsUnavailablePct;
    private String venueType;
    private int capacity;
    private double cost;
    
    private int vipPct;
    private int goldPct;
    private int silverPct;
    private int bronzePct;
    private int generalPct;
    private int reservedPct;

    private boolean hasFireworks;
    private double costFireworks;

    private int totalVipSeats;
    private int totalGoldSeats;
    private int totalSilverSeats;
    private int totalBronzeSeats;
    private int totalGeneralAdmissionSeats;
    private int totalReservedSeats;

    private int vipSeatsAvailable;
    private int goldSeatsAvailable;
    private int silverSeatsAvailable;
    private int bronzeSeatsAvailable;
    private int generalAdmissionSeatsAvailable;
    private int reservedSeatsAvailable;

    private int vipSeatsAvailableSold;
    private int goldSeatsAvailableSold;
    private int silverSeatsAvailableSold;
    private int bronzeSeatsAvailableSold;
    private int generalAdmissionSeatsAvailableSold;
    private int reservedSeatsAvailableSold;

    //NEW
    private int totalSeatsSold;

    
    /**
     * Default Constructor
     * 
     * @author Jorge Garcia
     * @author Jazmin Huerta
     * @author Isabella Garcia
     * @author Maria Fernanda Zuany
     * @since October 22nd, 2023
     */
    public Venue(){}
    
    public Venue(String venueName, String venueType, int capacity, double cost){
        this.venueName = venueName;
        this.seatsUnavailablePct = 0;
        this.venueType = venueType;
        this.capacity = capacity;
        this.cost = cost;
        this.vipPct = 5;
        this.goldPct = 10;
        this.silverPct = 15;
        this.bronzePct = 50;
        this.generalPct = 45;
        this.reservedPct = 5;
        this.hasFireworks= false;
        this.costFireworks = 0.0;

        // if(hasFireworks.equalsIgnoreCase("yes")){
        //     this.hasFireworks = true;

        // } else if(hasFireworks.equalsIgnoreCase("no")){
        //     this.hasFireworks= false;

        // } else{
        //     this.hasFireworks=false;
        // }

        // if(costFireworks.equals("")){
        //     this.costFireworks = 0.0;

        // } else{
        //     this.costFireworks = Double.parseDouble(costFireworks);
        // }


        this.totalVipSeats = (capacity * vipPct) / 100;
        this.totalGoldSeats = (capacity * goldPct) / 100;
        this.totalSilverSeats = (capacity * silverPct) / 100;
        this.totalBronzeSeats = (capacity * bronzePct) / 100;
        this.totalGeneralAdmissionSeats = (capacity * generalPct) / 100;
        this.totalReservedSeats = (capacity * reservedPct) / 100;
        
        this.vipSeatsAvailable = totalVipSeats;
        this.goldSeatsAvailable = totalGoldSeats;
        this.silverSeatsAvailable = totalSilverSeats;
        this.bronzeSeatsAvailable = totalBronzeSeats;
        this.generalAdmissionSeatsAvailable = totalGeneralAdmissionSeats;
        this.reservedSeatsAvailable = totalReservedSeats;

        this.vipSeatsAvailableSold = 0;
        this.goldSeatsAvailableSold = 0;
        this.silverSeatsAvailableSold = 0;
        this.bronzeSeatsAvailableSold = 0;
        this.generalAdmissionSeatsAvailableSold = 0;
        this.reservedSeatsAvailableSold = 0;
    }


    /**
     * Constructor
     * 
     * @author Jorge Garcia
     * @author Jazmin Huerta
     * @author Isabella Garcia
     * @author Maria Fernanda Zuany
     * @since October 22nd, 2023
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
     * @param generalPct
     * @param reservedPct
     * @param hasFireworks
     * @param costFireworks
     */
    public Venue(String venueName, double seatsUnavailablePct, String venueType, int capacity, double cost, int vipPct,
            int goldPct, int silverPct, int bronzePct, int generalPct, int reservedPct,
            String hasFireworks, String costFireworks) {


        this.venueName = venueName;
        this.seatsUnavailablePct = seatsUnavailablePct;
        this.venueType = venueType;
        this.capacity = capacity;
        this.cost = cost;
        this.vipPct = vipPct;
        this.goldPct = goldPct;
        this.silverPct = silverPct;
        this.bronzePct = bronzePct;
        this.generalPct = generalPct;
        this.reservedPct = reservedPct;


        if(hasFireworks.equalsIgnoreCase("yes")){
            this.hasFireworks = true;

        } else if(hasFireworks.equalsIgnoreCase("no")){
            this.hasFireworks= false;

        } else{
            this.hasFireworks=false;
        }

        if(costFireworks.equals("")){
            this.costFireworks = 0.0;

        } else{
            this.costFireworks = Double.parseDouble(costFireworks);
        }


        this.totalVipSeats = (capacity * vipPct) / 100;
        this.totalGoldSeats = (capacity * goldPct) / 100;
        this.totalSilverSeats = (capacity * silverPct) / 100;
        this.totalBronzeSeats = (capacity * bronzePct) / 100;
        this.totalGeneralAdmissionSeats = (capacity * generalPct) / 100;
        this.totalReservedSeats = (capacity * reservedPct) / 100;
        
        this.vipSeatsAvailable = totalVipSeats;
        this.goldSeatsAvailable = totalGoldSeats;
        this.silverSeatsAvailable = totalSilverSeats;
        this.bronzeSeatsAvailable = totalBronzeSeats;
        this.generalAdmissionSeatsAvailable = totalGeneralAdmissionSeats;
        this.reservedSeatsAvailable = totalReservedSeats;

        this.vipSeatsAvailableSold = 0;
        this.goldSeatsAvailableSold = 0;
        this.silverSeatsAvailableSold = 0;
        this.bronzeSeatsAvailableSold = 0;
        this.generalAdmissionSeatsAvailableSold = 0;
        this.reservedSeatsAvailableSold = 0;
    }

    //SETTERS -------------------------------------

    /**
     * @author Jorge Garcia
     * @author Jazmin Huerta
     * @author Isabella Garcia
     * @author Maria Fernanda Zuany
     * @since October 22nd, 2023
     * @param venueNameIn
     */
    public void setvenueName(String venueNameIn) {
        this.venueName = venueNameIn;
    }
    
    /**
     * @author Jorge Garcia
     * @author Jazmin Huerta
     * @author Isabella Garcia
     * @author Maria Fernanda Zuany
     * @since October 22nd, 2023
     * @param seatsUnavailablePctIn
     */
    public void setSeatsUnavailablePct(double seatsUnavailablePctIn) {
        this.seatsUnavailablePct = seatsUnavailablePctIn;
    }
 
    /**
     * @author Jorge Garcia
     * @author Jazmin Huerta
     * @author Isabella Garcia
     * @author Maria Fernanda Zuany
     * @since October 22nd, 2023
     * @param venueTypeIn
     */
    public void setVenueType(String venueTypeIn) {
        this.venueType = venueTypeIn;
    }

    /**
     * @author Jorge Garcia
     * @author Jazmin Huerta
     * @author Isabella Garcia
     * @author Maria Fernanda Zuany
     * @since October 22nd, 2023
     * @param capacityIn
     */
    public void setCapacity(int capacityIn) {
        this.capacity = capacityIn;
    }

    /**
     * @author Jorge Garcia
     * @author Jazmin Huerta
     * @author Isabella Garcia
     * @author Maria Fernanda Zuany
     * @since October 22nd, 2023
     * @param costIn
     */
    public void setCost(double costIn) {
        this.cost = costIn;
    }

    /**
     * @author Jorge Garcia
     * @author Jazmin Huerta
     * @author Isabella Garcia
     * @author Maria Fernanda Zuany
     * @since October 22nd, 2023
     * @param vipPctIn
     */
    public void setVipPct(int vipPctIn) {
        this.vipPct = vipPctIn;
    }

    /**
     * @author Jorge Garcia
     * @author Jazmin Huerta
     * @author Isabella Garcia
     * @author Maria Fernanda Zuany
     * @since October 22nd, 2023
     * @param goldPctIn
     */
    public void setGoldPct(int goldPctIn) {
        this.goldPct = goldPctIn;
    }

    /**
     * @author Jorge Garcia
     * @author Jazmin Huerta
     * @author Isabella Garcia
     * @author Maria Fernanda Zuany
     * @since October 22nd, 2023
     * @param silverPctIn
     */
    public void setSilverPct(int silverPctIn) {
        this.silverPct = silverPctIn;
    }

    /**
     * @author Jorge Garcia
     * @author Jazmin Huerta
     * @author Isabella Garcia
     * @author Maria Fernanda Zuany
     * @since October 22nd, 2023    
     * @param bronzePctIn
     */
    public void setBronzePct(int bronzePctIn) {
        this.bronzePct = bronzePctIn;
    }

    /**
     * @author Jorge Garcia
     * @author Jazmin Huerta
     * @author Isabella Garcia
     * @author Maria Fernanda Zuany
     * @since October 22nd, 2023
     * @param generalPctIn
     */
    public void setGeneralPct(int generalPctIn) {
        this.generalPct = generalPctIn;
    }

    /**
     * @author Jorge Garcia
     * @author Jazmin Huerta
     * @author Isabella Garcia
     * @author Maria Fernanda Zuany
     * @since October 22nd, 2023
     * @param reservedPctIn
     */
    public void setReservedPct(int reservedPctIn) {
        this.reservedPct = reservedPctIn;
    }

    /**
     * @author Jorge Garcia
     * @author Jazmin Huerta
     * @author Isabella Garcia
     * @author Maria Fernanda Zuany
     * @since October 22nd, 2023
     * @param hasFireworksIn
     */
    public void setHasFireworks(boolean hasFireworksIn) {
        this.hasFireworks = hasFireworksIn;
    }

    /**
     * @author Jorge Garcia
     * @author Jazmin Huerta
     * @author Isabella Garcia
     * @author Maria Fernanda Zuany
     * @since October 22nd, 2023
     * @param costFireworksIn
     */
    public void setCostFireworks(double costFireworksIn) {
        this.costFireworks = costFireworksIn;
    }

    /**
     * @author Jorge Garcia
     * @author Jazmin Huerta
     * @author Isabella Garcia
     * @author Maria Fernanda Zuany
     * @since October 22nd, 2023
     * @param totalVipSeats
     */
    public void setTotalVipSeats(int totalVipSeats) {
        this.totalVipSeats = totalVipSeats;
    }

    /**
     * @author Jorge Garcia
     * @author Jazmin Huerta
     * @author Isabella Garcia
     * @author Maria Fernanda Zuany
     * @since October 22nd, 2023
     * @param totalGoldSeats
     */
    public void setTotalGoldSeats(int totalGoldSeats) {
        this.totalGoldSeats = totalGoldSeats;
    }

    /**
     * @author Jorge Garcia
     * @author Jazmin Huerta
     * @author Isabella Garcia
     * @author Maria Fernanda Zuany
     * @since October 22nd, 2023
     * @param totalSilverSeats
     */
    public void setTotalSilverSeats(int totalSilverSeats) {
        this.totalSilverSeats = totalSilverSeats;
    }

    /**
     * @author Jorge Garcia
     * @author Jazmin Huerta
     * @author Isabella Garcia
     * @author Maria Fernanda Zuany
     * @since October 22nd, 2023
     * @param totalBronzeSeats
     */
    public void setTotalBronzeSeats(int totalBronzeSeats) {
        this.totalBronzeSeats = totalBronzeSeats;
    }

    /**
     * @author Jorge Garcia
     * @author Jazmin Huerta
     * @author Isabella Garcia
     * @author Maria Fernanda Zuany
     * @since October 22nd, 2023
     * @param totalGeneralAdmissionSeats
     */
    public void setTotalGeneralAdmissionSeats(int totalGeneralAdmissionSeats) {
        this.totalGeneralAdmissionSeats = totalGeneralAdmissionSeats;
    }

    /**
     * @author Jorge Garcia
     * @author Jazmin Huerta
     * @author Isabella Garcia
     * @author Maria Fernanda Zuany
     * @since October 22nd, 2023
     * @param totalReservedSeats
     */
    public void setTotalReservedSeats(int totalReservedSeats) {
        this.totalReservedSeats = totalReservedSeats;
    }

    /**
     * @author Jorge Garcia
     * @author Jazmin Huerta
     * @author Isabella Garcia
     * @author Maria Fernanda Zuany
     * @since October 22nd, 2023
     * @param vipSeatsAvailable
     */
    public void setVipSeatsAvailable(int vipSeatsAvailable) {
        this.vipSeatsAvailable = vipSeatsAvailable;
    }

    /**
     * @author Jorge Garcia
     * @author Jazmin Huerta
     * @author Isabella Garcia
     * @author Maria Fernanda Zuany
     * @since October 22nd, 2023
     * @param goldSeatsAvailable
     */
    public void setGoldSeatsAvailable(int goldSeatsAvailable) {
        this.goldSeatsAvailable = goldSeatsAvailable;
    }

    /**
     * @author Jorge Garcia
     * @author Jazmin Huerta
     * @author Isabella Garcia
     * @author Maria Fernanda Zuany
     * @since October 22nd, 2023
     * @param silverSeatsAvailable
     */
    public void setSilverSeatsAvailable(int silverSeatsAvailable) {
        this.silverSeatsAvailable = silverSeatsAvailable;
    }

    /**
     * @author Jorge Garcia
     * @author Jazmin Huerta
     * @author Isabella Garcia
     * @author Maria Fernanda Zuany
     * @since October 22nd, 2023
     * @param bronzeSeatsAvailable
     */
    public void setBronzeSeatsAvailable(int bronzeSeatsAvailable) {
        this.bronzeSeatsAvailable = bronzeSeatsAvailable;
    }

    /**
     * @author Jorge Garcia
     * @author Jazmin Huerta
     * @author Isabella Garcia
     * @author Maria Fernanda Zuany
     * @since October 22nd, 2023
     * @param generalAdmissionSeatsAvailable
     */
    public void setGeneralAdmissionSeatsAvailable(int generalAdmissionSeatsAvailable) {
        this.generalAdmissionSeatsAvailable = generalAdmissionSeatsAvailable;
    }

    /**
     * @author Jorge Garcia
     * @author Jazmin Huerta
     * @author Isabella Garcia
     * @author Maria Fernanda Zuany
     * @since October 22nd, 2023
     * @param reservedSeatsAvailable
     */
    public void setReservedSeatsAvailable(int reservedSeatsAvailable) {
        this.reservedSeatsAvailable = reservedSeatsAvailable;
    }

    /**
     * @author Jorge Garcia
     * @author Jazmin Huerta
     * @author Isabella Garcia
     * @author Maria Fernanda Zuany
     * @since October 22nd, 2023
     * @param vipSeatsAvailableSold
     */
    public void setVipSeatsAvailableSold(int vipSeatsAvailableSold) {
        this.vipSeatsAvailableSold = vipSeatsAvailableSold;
    }

    /**
     * @author Jorge Garcia
     * @author Jazmin Huerta
     * @author Isabella Garcia
     * @author Maria Fernanda Zuany
     * @since October 22nd, 2023
     * @param goldSeatsAvailableSold
     */
    public void setGoldSeatsAvailableSold(int goldSeatsAvailableSold) {
        this.goldSeatsAvailableSold = goldSeatsAvailableSold;
    }

    /**
     * @author Jorge Garcia
     * @author Jazmin Huerta
     * @author Isabella Garcia
     * @author Maria Fernanda Zuany
     * @since October 22nd, 2023
     * @param silverSeatsAvailableSold
     */
    public void setSilverSeatsAvailableSold(int silverSeatsAvailableSold) {
        this.silverSeatsAvailableSold = silverSeatsAvailableSold;
    }

    /**
     * @author Jorge Garcia
     * @author Jazmin Huerta
     * @author Isabella Garcia
     * @author Maria Fernanda Zuany
     * @since October 22nd, 2023
     * @param bronzeSeatsAvailableSold
     */
    public void setBronzeSeatsAvailableSold(int bronzeSeatsAvailableSold) {
        this.bronzeSeatsAvailableSold = bronzeSeatsAvailableSold;
    }

    /**
     * @author Jorge Garcia
     * @author Jazmin Huerta
     * @author Isabella Garcia
     * @author Maria Fernanda Zuany
     * @since October 22nd, 2023
     * @param generalAdmissionSeatsAvailableSold
     */
    public void setGeneralAdmissionSeatsAvailableSold(int generalAdmissionSeatsAvailableSold) {
        this.generalAdmissionSeatsAvailableSold = generalAdmissionSeatsAvailableSold;
    }

    /**
     * @author Jorge Garcia
     * @author Jazmin Huerta
     * @author Isabella Garcia
     * @author Maria Fernanda Zuany
     * @since October 22nd, 2023
     * @param reservedSeatsAvailableSold
     */
    public void setReservedSeatsAvailableSold(int reservedSeatsAvailableSold) {
        this.reservedSeatsAvailableSold = reservedSeatsAvailableSold;
    }

    /**
     * @author Jorge Garcia
     * @author Jazmin Huerta
     * @author Isabella Garcia
     * @author Maria Fernanda Zuany
     * @since October 22nd, 2023
     * @param totalSeatsSold
     */
    public void setTotalSeatsSold(int totalSeatsSold){
        this.totalSeatsSold = totalSeatsSold;
    }


    // GETTERS ----------------------------

    /**
     * @author Jorge Garcia
     * @author Jazmin Huerta
     * @author Isabella Garcia
     * @author Maria Fernanda Zuany
     * @since October 22nd, 2023
     * @return venueName
     */
    public String getVenueName() {
        return venueName;
    }

    /**
     * @author Jorge Garcia
     * @author Jazmin Huerta
     * @author Isabella Garcia
     * @author Maria Fernanda Zuany
     * @since October 22nd, 2023
     * @return seatsUnavailablePct
     */
    public double getSeatsUnavailablePct() {
        return seatsUnavailablePct;
    }

    /**
     * @author Jorge Garcia
     * @author Jazmin Huerta
     * @author Isabella Garcia
     * @author Maria Fernanda Zuany
     * @since October 22nd, 2023
     * @return venueType
     */
    public String getVenueType() {
        return venueType;
    }

    /**
     * @author Jorge Garcia
     * @author Jazmin Huerta
     * @author Isabella Garcia
     * @author Maria Fernanda Zuany
     * @since October 22nd, 2023
     * @return capacity
     */
    public int getCapacity() {
        return capacity;
    }

    /**
     * @author Jorge Garcia
     * @author Jazmin Huerta
     * @author Isabella Garcia
     * @author Maria Fernanda Zuany
     * @since October 22nd, 2023
     * @return cost
     */
    public double getCost() {
        return cost;
    }

    /**
     * @author Jorge Garcia
     * @author Jazmin Huerta
     * @author Isabella Garcia
     * @author Maria Fernanda Zuany
     * @since October 22nd, 2023
     * @return vipPct
     */
    public int getVipPct() {
        return vipPct;
    }

    /**
     * @author Jorge Garcia
     * @author Jazmin Huerta
     * @author Isabella Garcia
     * @author Maria Fernanda Zuany
     * @since October 22nd, 2023
     * @return goldPct
     */
    public int getGoldPct() {
        return goldPct;
    }

    /**
     * @author Jorge Garcia
     * @author Jazmin Huerta
     * @author Isabella Garcia
     * @author Maria Fernanda Zuany
     * @since October 22nd, 2023
     * @return silverPCT
     */
    public int getSilverPct() {
        return silverPct;
    }

    /**
     * @author Jorge Garcia
     * @author Jazmin Huerta
     * @author Isabella Garcia
     * @author Maria Fernanda Zuany
     * @since October 22nd, 2023
     * @return bronzePct
     */
    public int getBronzePct() {
        return bronzePct;
    }

    /**
     * @author Jorge Garcia
     * @author Jazmin Huerta
     * @author Isabella Garcia
     * @author Maria Fernanda Zuany
     * @since October 22nd, 2023
     * @return generalPct
     */
    public int getGeneralPct() {
        return generalPct;
    }

    /**
     * @author Jorge Garcia
     * @author Jazmin Huerta
     * @author Isabella Garcia
     * @author Maria Fernanda Zuany
     * @since October 22nd, 2023
     * @return reservedPCt
     */
    public int getReservedPct() {
        return reservedPct;
    }

    /**
     * @author Jorge Garcia
     * @author Jazmin Huerta
     * @since October 22nd, 2023
     * @return hasFireworks
     */
    public boolean hasFireworks() {
        return hasFireworks;
    }

    /**
     * @author Jorge Garcia
     * @author Jazmin Huerta
     * @author Isabella Garcia
     * @author Maria Fernanda Zuany
     * @since October 22nd, 2023
     * @return costFireworks
     */
    public double getCostFireworks() {
        return costFireworks;
    }

    /**
     * @author Jorge Garcia
     * @author Jazmin Huerta
     * @author Isabella Garcia
     * @author Maria Fernanda Zuany
     * @since October 22nd, 2023
     * @return totalVIPSeats
     */
    public int getTotalVipSeats() {
        return totalVipSeats;
    }

    /**
     * @author Jorge Garcia
     * @author Jazmin Huerta
     * @author Isabella Garcia
     * @author Maria Fernanda Zuany
     * @since October 22nd, 2023
     * @return totalGoldSeats
     */
    public int getTotalGoldSeats() {
        return totalGoldSeats;
    }

    /**
     * @author Jorge Garcia
     * @author Jazmin Huerta
     * @author Isabella Garcia
     * @author Maria Fernanda Zuany
     * @since October 22nd, 2023
     * @return totalSilverSeats
     */
    public int getTotalSilverSeats() {
        return totalSilverSeats;
    }
    
    /**
     * @author Jorge Garcia
     * @author Jazmin Huerta
     * @author Isabella Garcia
     * @author Maria Fernanda Zuany
     * @since October 22nd, 2023
     * @return venueName
     */
    public int getTotalBronzeSeats() {
        return totalBronzeSeats;
    }

    /**
     * @author Jorge Garcia
     * @author Jazmin Huerta
     * @author Isabella Garcia
     * @author Maria Fernanda Zuany
     * @since October 22nd, 2023
     * @return totalGeneralAdmissions
     */
    public int getTotalGeneralAdmissionSeats() {
        return totalGeneralAdmissionSeats;
    }

    /**
     * @author Jorge Garcia
     * @author Jazmin Huerta
     * @author Isabella Garcia
     * @author Maria Fernanda Zuany
     * @since October 22nd, 2023
     * @return totalReservedSeats
     */
    public int getTotalReservedSeats() {
        return totalReservedSeats;
    }

    /**
     * @author Jorge Garcia
     * @author Jazmin Huerta
     * @author Isabella Garcia
     * @author Maria Fernanda Zuany
     * @since October 22nd, 2023
     * @return vipSeatsAvailable
     */
    public int getVipSeatsAvailable() {
        return vipSeatsAvailable;
    }

    /**
     * @author Jorge Garcia
     * @author Jazmin Huerta
     * @author Isabella Garcia
     * @author Maria Fernanda Zuany
     * @since October 22nd, 2023
     * @return venueName
     */
    public int getGoldSeatsAvailable() {
        return goldSeatsAvailable;
    }

    /**
     * @author Jorge Garcia
     * @author Jazmin Huerta
     * @author Isabella Garcia
     * @author Maria Fernanda Zuany
     * @since October 22nd, 2023
     * @return silverSeatsAvailable
     */
    public int getSilverSeatsAvailable() {
        return silverSeatsAvailable;
    }

    /**
     * @author Jorge Garcia
     * @author Jazmin Huerta
     * @author Isabella Garcia
     * @author Maria Fernanda Zuany
     * @since October 22nd, 2023
     * @return bronzeSeatsAvailable
     */
    public int getBronzeSeatsAvailable() {
        return bronzeSeatsAvailable;
    }

    /**
     * @author Jorge Garcia
     * @author Jazmin Huerta
     * @author Isabella Garcia
     * @author Maria Fernanda Zuany
     * @since October 22nd, 2023
     * @return generalAdmissionSeatsAvailable
     */
    public int getGeneralAdmissionSeatsAvailable() {
        return generalAdmissionSeatsAvailable;
    }

    /**
     * @author Jorge Garcia
     * @author Jazmin Huerta
     * @author Isabella Garcia
     * @author Maria Fernanda Zuany
     * @since October 22nd, 2023
     * @return reservedSeatsAvailable
     */
    public int getReservedSeatsAvaiable() {
        return reservedSeatsAvailable;
    }

    /**
     * @author Jorge Garcia
     * @author Jazmin Huerta
     * @author Isabella Garcia
     * @author Maria Fernanda Zuany
     * @since October 22nd, 2023
     * @return vipSeatsAvailableSold
     */
    public int getVipSeatsAvailableSold() {
        return vipSeatsAvailableSold;
    }

    /**
     * @author Jorge Garcia
     * @author Jazmin Huerta
     * @author Isabella Garcia
     * @author Maria Fernanda Zuany
     * @since October 22nd, 2023
     * @return goldSeatsAvailableSold
     */
    public int getGoldSeatsAvailableSold() {
        return goldSeatsAvailableSold;
    }

    /**
     * @author Jorge Garcia
     * @author Jazmin Huerta
     * @author Isabella Garcia
     * @author Maria Fernanda Zuany
     * @since October 22nd, 2023
     * @return silverSeatsAvailableSOld
     */
    public int getSilverSeatsAvailableSold() {
        return silverSeatsAvailableSold;
    }

    /**
     * @author Jorge Garcia
     * @author Jazmin Huerta
     * @author Isabella Garcia
     * @author Maria Fernanda Zuany
     * @since October 22nd, 2023
     * @return bronzeSeatsAvailableSold
     */
    public int getBronzeSeatsAvailableSold() {
        return bronzeSeatsAvailableSold;
    }

    /**
     * @author Jorge Garcia
     * @author Jazmin Huerta
     * @author Isabella Garcia
     * @author Maria Fernanda Zuany
     * @since October 22nd, 2023
     * @return generalAdmissionSeatsAvaialableSold
     */
    public int getGeneralAdmissionSeatsAvailableSold() {
        return generalAdmissionSeatsAvailableSold;
    }

    /**
     * @author Jorge Garcia
     * @author Jazmin Huerta
     * @author Isabella Garcia
     * @author Maria Fernanda Zuany
     * @since October 22nd, 2023
     * @return reservedSeatsAvailable
     */
    public int getReservedSeatsAvailableSold() {
        return reservedSeatsAvailableSold;
    }

    /**
     * @author Jorge Garcia
     * @author Jazmin Huerta
     * @author Isabella Garcia
     * @author Maria Fernanda Zuany
     * @since October 22nd, 2023
     * @return totalSeatsSold
     */
    public int getTotalSeatsSold(){
        return totalSeatsSold;
    }

    /**
     * printSeatsAvailable method
     * prints total seats available for each section
     * 
     * @author Jorge Garcia
     * @author Jazmin Huerta
     * @since October 22nd, 2023
     */
    public void printSeatsAvailable(){
        System.out.println();
        System.out.println("|~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~|");
        System.out.println("Here are how many seats we have available for each section:");
        System.out.println("| ------- VIP Price : " + this.vipSeatsAvailable);
        System.out.println("| ------ Gold Price : " + this.goldSeatsAvailable);
        System.out.println("| ---- Silver Price : " + this.silverSeatsAvailable);
        System.out.println("| ---- Bronze Price : " + this.bronzeSeatsAvailable);
        System.out.println("| General Admission : " + this.generalAdmissionSeatsAvailable);
        System.out.println("| -- Reserved Seats : " + this.reservedSeatsAvailable);
        System.out.println("|~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~|");
    }

    /**
     * updates tickets available when tickets are bought
     * 
     * @author Jorge Garcia
     * @since 11/13/2023
     * @param ticketType
     * @param seats
     */
    public void updateSeats(String ticketType, int seats){
        if(ticketType.equalsIgnoreCase("VIP")){
            
            //We should take off the seats if we buy
            // We should add if they refund
            this.vipSeatsAvailable = (this.vipSeatsAvailable - seats);

            //We should add if they buy
             // WE should take off if they refund
            this.vipSeatsAvailableSold = (this.vipSeatsAvailableSold + seats);

        } else if (ticketType.equalsIgnoreCase("Gold")) {

            this.goldSeatsAvailable = (this.goldSeatsAvailable - seats);
            this.goldSeatsAvailableSold = (this.goldSeatsAvailableSold + seats);

        } else if (ticketType.equalsIgnoreCase("Silver")) {

            this.silverSeatsAvailable = (this.silverSeatsAvailable - seats);
            this.silverSeatsAvailableSold = (this.silverSeatsAvailableSold + seats);
            
        } else if (ticketType.equalsIgnoreCase("Bronze")) {

            this.bronzeSeatsAvailable = (this.bronzeSeatsAvailable - seats);
            this.bronzeSeatsAvailableSold = (this.bronzeSeatsAvailableSold + seats);
            
        } else if (ticketType.equalsIgnoreCase("General Admission")) {

            this.generalAdmissionSeatsAvailable = (this.generalAdmissionSeatsAvailable - seats);
            this.generalAdmissionSeatsAvailableSold = (this.generalAdmissionSeatsAvailableSold + seats);
            
        }
    }

    /**
     * calculates TOTAL seats sold
     * 
     * @author Jazmin Huerta
     * @return update of totalSeatsSols
     */
    public int calculateTotalSeatsSold(){
        return this.vipSeatsAvailableSold+this.goldSeatsAvailableSold+this.silverSeatsAvailableSold+this.bronzeSeatsAvailableSold+this.generalAdmissionSeatsAvailableSold+this.reservedSeatsAvailableSold;
    }

    /** 
     * When an event is cancelled by the admin all the values get reseted to 0 
     * because it is not available for purchase
     * 
     * @author Isabella Garcia
     * @author Jorge Garcia
     * @since 11/15/2023
     */
    public void cancelVenue(){

        //Sets all
        setVipSeatsAvailable(0);
        setGoldSeatsAvailable(0);
        setSilverSeatsAvailable(0);
        setBronzeSeatsAvailable(0);
        setGeneralAdmissionSeatsAvailable(0);
        setReservedSeatsAvailable(0);

        setVipSeatsAvailableSold(0);
        setGoldSeatsAvailableSold(0);
        setSilverSeatsAvailableSold(0);
        setBronzeSeatsAvailableSold(0);
        setGeneralAdmissionSeatsAvailableSold(0);
        setReservedSeatsAvailableSold(0);
        
    }
}
