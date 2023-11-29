
/**
 * This class helps display most of the menus used in our main method 
 * @author Isabella Garcia
 * @author Jazmin Huerta
 * @author Jorge Garcia
 * @author Maria Fernanda Zuany
 * @since November 26th, 2023
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

import java.util.HashMap;

public class Menu {
        HashMap<String, Customer> customerDic = new HashMap<String, Customer>();
        HashMap<Integer, Event> eventDic = new HashMap<Integer, Event>();
        HashMap<String, Customer> userDic = new HashMap<String, Customer>();
        HashMap<String, Integer> eventNameToId = new HashMap<String, Integer>();
        Customer attemptedCustomer = new Customer();

        public Menu() {
        }


        /**
         * Prints out menu for logging in
         * 
         * @author Isabella Garcia
         * @author Jorge Garcia
         * @author Jazmin Huerta
         * @author Maria Fernanda Zuany
         * @since 11/06/2023
         *         
         */
        public void mainMenu() {
                System.out.println();
                System.out.println();
                System.out.format(
                                "+---------------------------------------------------------------------------------------------------------------+%n");
                System.out.println("                                             WELCOME TO TICKETMINER!                                              ");
                System.out.println("                                                    Let's begin:                                             ");
                System.out.println("                                        (Please enter 'EXIT' to end program)                                         ");
                System.out.format(
                                "+---------------------------------------------------------------------------------------------------------------+%n");
                System.out.print("                                                      Are you a: \n 1. Customer\n 2. Administrator\n");
                System.out.format(
                                "+---------------------------------------------------------------------------------------------------------------+%n>>");

        }

        /**
         * Prints out menu for logging in confirmation
         * 
         * @author Isabella Garcia
         * @author Jorge Garcia
         * @author Jazmin Huerta
         * @author Maria Fernanda Zuany
         * @since 11/06/2023
         *         
         */
        public void logInMenu() {

                System.out.println();
                System.out.format(
                                "+---------------------------------------------------------------------------------------------------------------+%n");
                System.out.println("                                            Would you like to log in?                                                  ");
                System.out.println("                                                    (Y / N)                                                            ");
                System.out.format(
                                "+---------------------------------------------------------------------------------------------------------------+%n>>");
                

        }

        /**
         * Prints out options for admin to choose
         * 
         * @author Isabella Garcia
         * @since 11/12/2023
         *         
         */
        public void adminMenu() {
                System.out.println();
                System.out.format(
                                "+---------------------------------------------------------------------------------------------------------------+%n");
                System.out.format(
                                "                                       	 Welcome back admin!                                                       %n");
                System.out.format(
                                "                                  What would you like to do today?	                                           %n");
                System.out.format(
                                "+---------------+---------------+----------+-----------+----------+------------+--------------+-----------------+%n");
                System.out.println(
                                "  1) Find Event                                                                                                             ");
                System.out.format(
                                "+---------------------------------------------------------------------------------------------------------------+%n");
                System.out.println(
                                "  2) Run Autobuyer                                                                                           ");
                System.out.format(
                                "+---------------------------------------------------------------------------------------------------------------+%n");
                System.out.println(
                                "  3) Create Event                                                                                          ");
                System.out.format(
                                "+---------------------------------------------------------------------------------------------------------------+%n");
                System.out.println(
                                "  4) Cancel Event                                                                                          ");
                System.out.format(
                                "+---------------------------------------------------------------------------------------------------------------+%n");
                System.out.println(
                                "  5) Create an Electronic Invoice Summary                                                                                        ");
                System.out.format(
                                "+---------------------------------------------------------------------------------------------------------------+%n");
                System.out.println(
                                "  6) Compute The TickerMiner Company Proceeds                                                                                        ");
                System.out.format(
                                "+---------------------------------------------------------------------------------------------------------------+%n");
                System.out.println(
                                "  Enter BACK to return to main menu                                                                                         ");
                System.out.format(
                                "+---------------+---------------+----------+-----------+----------+------------+--------------+-----------------+%n");

        }

        /**
         * Admin menu to choose a venue when creating an event
         * 
         * @author Isabella Garcia
         * @since 11/12/2023
         *  
         */
        public void venueMenu() {
                System.out.println();
                System.out.format(
                                "+---------------------------------------------------------------------------------------------------------------+%n");
                System.out.println("                          Please select a Venue from below (enter the name or the number):                           ");
                System.out.format(
                                "+---------------+---------------+----------+-----------+----------+------------+--------------+-----------------+%n");
                System.out.println(
                                "  1) Sun Bowl Stadium                                                                                                     ");
                System.out.format(
                                "+---------------------------------------------------------------------------------------------------------------+%n");
                System.out.println(
                                "  2) Don Haskins Center                                                                                                   ");
                System.out.format(
                                "+---------------------------------------------------------------------------------------------------------------+%n");
                System.out.println(
                                "  3) Magoffin Auditorium                                                                                                     ");
                System.out.format(
                                "+---------------------------------------------------------------------------------------------------------------+%n");
                System.out.println(
                                "  4) San Jacinto Plaza                                                                                                   ");
                System.out.format(
                                "+---------------------------------------------------------------------------------------------------------------+%n");
                System.out.println(
                                "  5) Centennial Plaza                                                                                                   ");
                System.out.format(
                                "+---------------------------------------------------------------------------------------------------------------+%n");

        }

        /**
         * Admin Menu for computing the company's proceeds
         * 
         * @author Isabella Garcia
         * @since 11/12/2023
         *  
         */
        public void proceedsMenu() {
                System.out.println();
                System.out.format(
                                "+---------------------------------------------------------------------------------------------------------------+%n");
                System.out.println("                      Which way would you like to compute The TicketMiner Company Proceeds:                             ");
                System.out.format(
                                "+---------------+---------------+----------+-----------+----------+------------+--------------+-----------------+%n");
                System.out.println(
                                "  1) Compute proceeds for a specific event                                                                                       ");
                System.out.format(
                                "+---------------------------------------------------------------------------------------------------------------+%n");
                System.out.println(
                                "  2) Compute proceeds for all events                                                                                            ");
                System.out.format(
                                "+---------------------------------------------------------------------------------------------------------------+%n");

        }

        /**
         * Prints out menu for customers
         * 
         * @author Isabella Garcia
         * @author Jorge Garcia
         * @author Jazmin Huerta
         * @author Maria Fernanda Zuany
         * @since 11/06/2023
         *  
         */
        public void customerMenu() {
                System.out.format(
                                "+---------------------------------------------------------------------------------------------------------------+%n");
                System.out.println("                                             Let's buy some tickets!                                               ");
                System.out.println("                Enter the event ID you're looking for (or enter BACK to return to main menu)                     ");
                System.out.println("      Just a reminder that you can only buy tickets to ONE event and we limit purchases from 1 - 6 tickets         ");
                System.out.format(
                                "+---------------------------------------------------------------------------------------------------------------+%n");
                System.out.println("                                  Please enter 1 to buy tickets or 2 to cancel                                     ");
                System.out.format(
                                "+---------------------------------------------------------------------------------------------------------------+%n>>");

        }

        /**
         * Autobuyer Menu
         * 
         * @author Jorge Garcia
         * @author Isabella Garcia
         * @since 11/12/2023
         *  
         */
        public void autobuyerMenu() {
                System.out.println();
                System.out.println("|-----------------------------------------------------------------------------------------------------------------|");
                System.out.println("                                            Which Autobuyer would you like to run?                                      ");
                System.out.format(
                                "+---------------+---------------+----------+-----------+----------+------------+--------------+-----------------+%n");
                System.out.println("                1) AutoPurchase100                     ");
                System.out.format(
                                "+---------------------------------------------------------------------------------------------------------------+%n");
                System.out.println("                2) AutoPurchase1K                     ");
                System.out.format(
                                "+---------------------------------------------------------------------------------------------------------------+%n");
                System.out.println("                3) AutoPurchase500K                     ");
                System.out.format(
                                "+---------------------------------------------------------------------------------------------------------------+%n");
                System.out.println("                4) AutoPurchase1M                     ");
                System.out.format(
                                "+---------------------------------------------------------------------------------------------------------------+%n");
                System.out.println("                5) AutoPurchase5M                     ");
                System.out.println("|-----------------------------------------------------------------------------------------------------------------|");
        }

        /**
         * Prints out options to change an event's details
         * 
         * @author Isabella Garcia
         * @author Jorge Garcia
         * @author Jazmin Huerta
         * @author Fernanda Zuany
         * @since 11/06/2023
         *         
         */
        public void eventChangeMenu() {
                System.out.println();
                System.out.format(
                                "+---------------------------------------------------------------------------------------------------------------+%n");
                System.out.format(                              "What would you like to change about the event:                                   %n");
                System.out.format(
                                "+---------------+---------------+----------+-----------+----------+------------+--------------+-----------------+%n");
                System.out.println(
                                "  1) Change the name of the event                                                                                            ");
                System.out.format(
                                "+---------------------------------------------------------------------------------------------------------------+%n");
                System.out.println(
                                "  2) Change the date of the event                                                                                           ");
                System.out.format(
                                "+---------------------------------------------------------------------------------------------------------------+%n");
                System.out.println(
                                "  3) Change the time of the event                                                                                            ");
                System.out.format(
                                "+---------------------------------------------------------------------------------------------------------------+%n");
                System.out.println(
                                "  4) Change the price of the VIP ticket                                                                                            ");
                System.out.format(
                                "+---------------------------------------------------------------------------------------------------------------+%n");
                System.out.println(
                                "  5) Change the price of the Gold ticket                                                                                           ");
                System.out.format(
                                "+---------------------------------------------------------------------------------------------------------------+%n");
                System.out.println(
                                "  6) Change the price of the Silver ticket                                                                                            ");
                System.out.format(
                                "+---------------------------------------------------------------------------------------------------------------+%n");
                System.out.println(
                                "  7) Change the price of the Bronze ticket                                                                                           ");
                System.out.format(
                                "+---------------------------------------------------------------------------------------------------------------+%n");
                System.out.println(
                                "  8) Change the price of the General Admission ticket                                                                                            ");
                System.out.format(
                                "+---------------------------------------------------------------------------------------------------------------+%n");
                System.out.println(
                                "  Enter BACK to return to the menu                                                                                            ");
                System.out.format(
                                "+---------------+---------------+----------+-----------+----------+------------+--------------+-----------------+%n>>");

        }

        /**
         * Displays all information regarding one event
         * 
         * @author Jazmin Huerta
         * @author Isabella Garcia
         * @author Maria Fernanda Zuany
         * @param eventDic
         * @param eventId
         */
        public void printInfoEvent(HashMap<Integer, Event> eventDic, int eventId) {
                System.out.println();
                System.out.format(
                                "+---------------------------------------------------------------------------------------------------------------+%n");
                System.out.format(
                                "|                                       	 EVENT INFORMATION	                                        |%n");
                System.out.format(
                                "+---------------+---------------+----------+-----------+----------+------------+--------------+-----------------+%n");
                System.out.println("|   +Event ID: " + eventDic.get(eventId).getEventId());
                System.out.format(
                                "+---------------------------------------------------------------------------------------------------------------+%n");
                System.out.println("|  +Name: " + eventDic.get(eventId).getName());
                System.out.format(
                                "+---------------------------------------------------------------------------------------------------------------+%n");
                System.out.println("|   +Date: " + eventDic.get(eventId).getDate());
                System.out.format(
                                "+---------------------------------------------------------------------------------------------------------------+%n");
                System.out.println("|   +Time: " + eventDic.get(eventId).getTime());
                System.out.format(
                                "+---------------------------------------------------------------------------------------------------------------+%n");
                System.out.println("|   +Event Type: " + eventDic.get(eventId).getEventType());
                System.out.format(
                                "+---------------------------------------------------------------------------------------------------------------+%n");
                System.out.println("|   +Event Capacity: " + eventDic.get(eventId).getVenue().getCapacity());
                System.out.format(
                                "+---------------------------------------------------------------------------------------------------------------+%n");
                System.out.println("|   +Does the event have fireworks?: "+ eventDic.get(eventId).getVenue().hasFireworks());
                System.out.format(
                                "+---------------------------------------------------------------------------------------------------------------+%n");
                System.out.println("|   +Total Seats Sold: " + eventDic.get(eventId).getVenue().calculateTotalSeatsSold());
                System.out.format(
                                "+---------------------------------------------------------------------------------------------------------------+%n");
                System.out.println("|   +Total VIP Seats Sold: " + eventDic.get(eventId).getVenue().getVipSeatsAvailableSold());
                System.out.format(
                                "+---------------------------------------------------------------------------------------------------------------+%n");
                System.out.println("|   +Total Gold Seats Sold: " + eventDic.get(eventId).getVenue().getGoldSeatsAvailableSold());
                System.out.format(
                                "+---------------------------------------------------------------------------------------------------------------+%n");
                System.out.println("|   +Total Silver Seats Sold: " + eventDic.get(eventId).getVenue().getSilverSeatsAvailableSold());
                System.out.format(
                                "+---------------------------------------------------------------------------------------------------------------+%n");
                System.out.println("|   +Total Bronze Seats Sold: " + eventDic.get(eventId).getVenue().getBronzeSeatsAvailableSold());
                System.out.format(
                                "+---------------------------------------------------------------------------------------------------------------+%n");
                System.out.println("|   +Total General Adm Seats Sold: " + eventDic.get(eventId).getVenue().getGeneralAdmissionSeatsAvailableSold());
                System.out.format(
                                "+---------------+---------------+----------+-----------+----------+------------+--------------+-----------------+%n");
                System.out.printf("|   +Total Revenue for VIP Tickets: $%.2f\n", eventDic.get(eventId).getVenue().getVipSeatsAvailableSold()* eventDic.get(eventId).getVipPrice());
                System.out.format(
                                "+---------------------------------------------------------------------------------------------------------------+%n");
                System.out.printf("|   +Total Revenue for Gold Tickets: $%.2f\n", eventDic.get(eventId).getVenue().getGoldSeatsAvailableSold()* eventDic.get(eventId).getGoldPrice());
                System.out.format(
                                "+---------------------------------------------------------------------------------------------------------------+%n");
                System.out.printf("|   +Total Revenue for Silver Tickets: $%.2f\n", eventDic.get(eventId).getVenue().getSilverSeatsAvailableSold()* eventDic.get(eventId).getSilverPrice());
                System.out.format(
                                "+---------------------------------------------------------------------------------------------------------------+%n");
                System.out.printf("|   +Total Revenue for Bronze Tickets: $%.2f\n", eventDic.get(eventId).getVenue().getBronzeSeatsAvailableSold()* eventDic.get(eventId).getBronzePrice());
                System.out.format(
                                "+---------------------------------------------------------------------------------------------------------------+%n");
                System.out.printf("|   +Total Revenue for General Adm. Tickets: $%.2f\n",  (eventDic.get(eventId).getVenue().getGeneralAdmissionSeatsAvailableSold()* eventDic.get(eventId).getGeneralAdmissionPrice()));
                System.out.format(
                                "+---------------+---------------+----------+-----------+----------+------------+--------------+-----------------+%n");
                System.out.printf("|   +Total Member Discounts given: $%.2f\n", eventDic.get(eventId).getDiscounts());
                System.out.format(
                                "+---------------+---------------+----------+-----------+----------+------------+--------------+-----------------+%n");
                System.out.printf("|   +Tax Money Collected: $%.2f\n",eventDic.get(eventId).getTaxMoney());
                System.out.format(
                                "+---------------+---------------+----------+-----------+----------+------------+--------------+-----------------+%n");
                System.out.printf("|   +Convinience Fee Money Collected: $%.2f\n" ,eventDic.get(eventId).getConvenienceFee());
                System.out.format(
                                "+---------------+---------------+----------+-----------+----------+------------+--------------+-----------------+%n");
                System.out.printf("|   +Service Fee Money Collected: $%.2f\n", eventDic.get(eventId).getServiceFee());
                System.out.format(
                                "+---------------+---------------+----------+-----------+----------+------------+--------------+-----------------+%n");
                System.out.printf("|   +Charity Fee Money Collected: $%.2f\n", eventDic.get(eventId).getCharityFee());
                System.out.format(
                                "+---------------+---------------+----------+-----------+----------+------------+--------------+-----------------+%n");
                System.out.printf("|   +Total Revenue for All Tickets (currently): $%.2f\n" , eventDic.get(eventId).revenueCurrentTickets());
                System.out.format(
                                "+---------------+---------------+----------+-----------+----------+------------+--------------+-----------------+%n");
                System.out.printf("|   +Expected profit (sell out): $%.2f\n" , eventDic.get(eventId).revenueAllTickets());
                System.out.format(
                                "+---------------+---------------+----------+-----------+----------+------------+--------------+-----------------+%n");
                System.out.printf("|   +Actual Profit: $%.2f\n" , (eventDic.get(eventId).revenueCurrentTickets() - eventDic.get(eventId).getVenue().getCost()));
                System.out.format(
                                "+---------------+---------------+----------+-----------+----------+------------+--------------+-----------------+%n>>");
            }
    

}
