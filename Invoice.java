/**
 * This INVOICE method helps us store the receipt data that the customer is
 * gonna get after each purchase is complete
 * it also has a method that prints out the information of the transaction
 * 
 * @author Jorge Garcia
 * @author Jazmin Huerta
 * @author Isabella Garcia
 * @author Maria Fernanda Zuany
 * @since November 26th, 2023
 * Instructor: Daniel Mejia
 * Final Deliverable
 * 
 *        This work is to be done in teams of 4 people. It is not permitted to
 *        share,
 *        reproduce, or alter any part of this assignment for any purpose.
 *        Students are not
 *        permitted from sharing code, uploading this assignment online in any
 *        form,
 *        viewing, receiving, or modifying code written from anyone else. This
 *        assignment
 *        is part of an academic course at The University of Texas at El Paso
 *        and a grade
 *        will be assigned for the work produced individually by the student.
 */

public class Invoice {
        // Atributes
        private int eventId;
        private String eventName;

        private Customer customer;

        private String ticketType;
        private double subtotal;
        private int ticketCount;
        private double pricePerTicket;

        private String confirmationNum;

        private double total;
        private double calcTax;
        private double memberDiscount;
        private double charityFee;
        private double serviceFee;
        private double convenienceFee;

        /**
         * Default Constructor
         * 
         * @author Jorge Garcia
         * @author Jazmin Huerta
         * @author Isabella Garcia
         * @author Maria Fernanda Zuany
         * @since 11/06/2023
         */
        public Invoice() {
        }

        /**
         * 
         * @author Jazmin Huerta
         * @author Jorge Garcia
         * @author Isabella Garcia
         * @author Maria Fernanda Zuany
         * @since 11/06/2023
         * 
         * @param curr
         * @param nameIn
         * @param typePrice
         * @param ticketCountIn
         * @param randomNum
         */
        public Invoice(Customer currCustomer, int eventIdIn, String nameIn, String ticketTypeIn, double typePrice,
                        int ticketCountIn, String randomNum, double [] fees) {

                this.eventId = eventIdIn;
                this.ticketType = ticketTypeIn;
                this.eventName= nameIn;
                this.customer = currCustomer;
                
                // fees
                this.charityFee = fees[3];
                this.serviceFee = fees[4];
                this.convenienceFee = fees[5];

                this.ticketCount = ticketCountIn;
                this.confirmationNum = nameIn + randomNum;
                this.pricePerTicket = typePrice;
                this.subtotal = fees[6];
                this.memberDiscount = fees[2];
                currCustomer.setSavings(currCustomer.getSavings() + this.memberDiscount);

                this.calcTax = fees[1];
                this.total = fees[0];
        }

        /**
         * @author Jorge Garcia
         * @author Jazmin Huerta
         * @author Isabella Garcia
         * @author Maria Fernanda Zuany
         * @since 11/06/2023
         * @param confirmationNum
         */
        public void setConfirmationNum(String confirmationNum) {
                this.confirmationNum = confirmationNum;
        }

        /**
         * @author Jorge Garcia
         * @author Jazmin Huerta
         * @author Isabella Garcia
         * @author Maria Fernanda Zuany
         * @since 11/06/2023
         * @return pricePerTicket
         */
        public double getPricePerTicket() {
                return pricePerTicket;
        }

        /**
         * @author Jorge Garcia
         * @author Jazmin Huerta
         * @author Isabella Garcia
         * @author Maria Fernanda Zuany
         * @since 11/06/2023
         * @param pricePerTicket
         */
        public void setPricePerTicket(double pricePerTicket) {
                this.pricePerTicket = pricePerTicket;
        }

        /**
         * @author Jorge Garcia
         * @author Jazmin Huerta
         * @author Isabella Garcia
         * @author Maria Fernanda Zuany
         * @since 11/06/2023
         * @return total
         */
        public double getTotal() {
                return total;
        }
        /**
         * @author Jorge Garcia
         * @author Jazmin Huerta
         * @author Isabella Garcia
         * @author Maria Fernanda Zuany
         * @since 11/06/2023
         * @return eventId
         */
        public int getEventId() {
                return eventId;
        }

         /**
         * @author Jorge Garcia
         * @author Jazmin Huerta
         * @author Isabella Garcia
         * @author Maria Fernanda Zuany
         * @since 11/06/2023
         * @param eventId
         */
        public void setEventId(int eventId) {
                this.eventId = eventId;
        }
        /**
         * @author Jorge Garcia
         * @author Jazmin Huerta
         * @author Isabella Garcia
         * @author Maria Fernanda Zuany
         * @since 11/06/2023
         * @return eventName
         */
        public String getEventName() {
                return eventName;
        }
        /**
         * @author Jorge Garcia
         * @author Jazmin Huerta
         * @author Isabella Garcia
         * @author Maria Fernanda Zuany
         * @since 11/06/2023
         * @param eventName
         */

        /**
         * @author Jorge Garcia
         * @author Jazmin Huerta
         * @author Isabella Garcia
         * @author Maria Fernanda Zuany
         * @since 11/06/2023
         * @param eventName
         */
        public void setEventName(String eventName) {
                this.eventName = eventName;
        }
        /**
         * @author Jorge Garcia
         * @author Jazmin Huerta
         * @author Isabella Garcia
         * @author Maria Fernanda Zuany
         * @since 11/06/2023
         * @return ticketType
         */
        public String getTicketType() {
                return ticketType;
        }

        /**
         * @author Jorge Garcia
         * @author Jazmin Huerta
         * @author Isabella Garcia
         * @author Maria Fernanda Zuany
         * @since 11/06/2023
         * @param ticketType
         */
        public void setTicketType(String ticketType) {
                this.ticketType = ticketType;
        }

        /**
         * @author Jorge Garcia
         * @author Jazmin Huerta
         * @author Isabella Garcia
         * @author Maria Fernanda Zuany
         * @since 11/06/2023
         * @param total
         */
        public void setTotal(double total) {
                this.total = total;
        }

        /**
         * @author Jorge Garcia
         * @author Jazmin Huerta
         * @author Isabella Garcia
         * @author Maria Fernanda Zuany
         * @since 11/06/2023
         * @return calcTax
         */
        public double getCalcTax() {
                return calcTax;
        }


        

        /**
         * @author Jorge Garcia
         * @author Jazmin Huerta
         * @author Isabella Garcia
         * @author Maria Fernanda Zuany
         * @since 11/19/2023
         * @return customer
         */
        public Customer getCustomer() {
                return customer;
        }

        /**
         * @author Jorge Garcia
         * @author Jazmin Huerta
         * @author Isabella Garcia
         * @author Maria Fernanda Zuany
         * @since 11/19/2023
         * @param customer
         */
        public void setCustomer(Customer customer) {
                this.customer = customer;
        }

        /**
         * @author Jorge Garcia
         * @author Jazmin Huerta
         * @author Isabella Garcia
         * @author Maria Fernanda Zuany
         * @since 11/06/2023
         * @param calcTax
         */
        public void setCalcTax(double calcTax) {
                this.calcTax = calcTax;
        }

        /**
         * @author Jorge Garcia
         * @author Jazmin Huerta
         * @author Isabella Garcia
         * @author Maria Fernanda Zuany
         * @since 11/06/2023
         * @return subTotal
         */
        public double getSubtotal() {
                return subtotal;
        }

        /**
         * @author Jorge Garcia
         * @author Jazmin Huerta
         * @author Isabella Garcia
         * @author Maria Fernanda Zuany
         * @since 11/06/2023
         * @param total
         */
        public void setSubtotal(double total) {
                this.subtotal = total;
        }

        /**
         * @author Jorge Garcia
         * @author Jazmin Huerta
         * @author Isabella Garcia
         * @author Maria Fernanda Zuany
         * @since 11/06/2023
         * @return ticketCount
         */
        public int getTicketCount() {
                return ticketCount;
        }

        /**
         * @author Jorge Garcia
         * @author Jazmin Huerta
         * @author Isabella Garcia
         * @author Maria Fernanda Zuany
         * @since 11/06/2023
         * @param ticketCount
         */
        public void setTicketCount(int ticketCount) {
                this.ticketCount = ticketCount;
        }

        /**
         * @author Jorge Garcia
         * @author Jazmin Huerta
         * @author Isabella Garcia
         * @author Maria Fernanda Zuany
         * @since 11/06/2023
         * @return confirmationNum
         */
        public String getConfirmationNum() {
                return confirmationNum;
        }

        /**
         * @author Jorge Garcia
         * @author Jazmin Huerta
         * @author Isabella Garcia
         * @author Maria Fernanda Zuany
         * @since 11/06/2023
         * @return memberDiscount
         */
        public double getMemberDiscount() {
                return memberDiscount;
        }

        /**
         * @author Jorge Garcia
         * @author Jazmin Huerta
         * @author Isabella Garcia
         * @author Maria Fernanda Zuany
         * @since 11/06/2023
         * @param memberDiscount
         */
        public void setMemberDiscount(double memberDiscount) {
                this.memberDiscount = memberDiscount;
        }

        /**
         * @author Jorge Garcia
         * @author Jazmin Huerta
         * @author Isabella Garcia
         * @author Maria Fernanda Zuany
         * @since 11/19/2023
         * @return charityFee
         */
        public double getCharityFee() {
                return charityFee;
        }

        /**
         * @author Jorge Garcia
         * @author Jazmin Huerta
         * @author Isabella Garcia
         * @author Maria Fernanda Zuany
         * @since 11/19/2023
         * @param charityFee
         */
        public void setCharityFee(double charityFee) {
                this.charityFee = charityFee;
        }

        /**
         * @author Jorge Garcia
         * @author Jazmin Huerta
         * @author Isabella Garcia
         * @author Maria Fernanda Zuany
         * @since 11/19/2023
         * @return serviceFee
         */
        public double getServiceFee() {
                return serviceFee;
        }

        /**
         * @author Jorge Garcia
         * @author Jazmin Huerta
         * @author Isabella Garcia
         * @author Maria Fernanda Zuany
         * @since 11/19/2023
         * @param serviceFee
         */
        public void setServiceFee(double serviceFee) {
                this.serviceFee = serviceFee;
        }

        /**
         * @author Jorge Garcia
         * @author Jazmin Huerta
         * @author Isabella Garcia
         * @author Maria Fernanda Zuany
         * @since 11/19/2023
         * @return convenienceFee
         */
        public double getConvenienceFee() {
                return convenienceFee;
        }

        /**
         * @author Jorge Garcia
         * @author Jazmin Huerta
         * @author Isabella Garcia
         * @author Maria Fernanda Zuany
         * @since 11/19/2023
         * @param convenienceFee
         */
        public void setConvenienceFee(double convenienceFee) {
                this.convenienceFee = convenienceFee;
        }

        /**
         * Adds a "cancelled" string to the name of the invoice so that we know it was cancelled by the customer
         * @author Jorge Garcia
         * @author Jazmin Huerta
         * @author Isabella Garcia
         * @author Maria Fernanda Zuany
         * @since 11/19/2023
         */
        public void cancelInvoiceCustomer() {
                // Update texts to say cancelled
                this.eventName = eventName + " **CANCELLED BY USER**";
        }
        /**
         * Adds a "cancelled" string to the name of the invoice so that we know it was cancelled by the admin
         * @author Jazmin Huerta
         * @author Isabella Garcia
         * @author Maria Fernanda Zuany
         * @since 11/19/2023
         */
        public void cancelInvoiceAdmin() {
                // Update texts to say cancelled
                this.eventName = eventName + " **CANCELLED BY ADMIN**";
        }

        /**
         * To prints the invoices for the customer purchases
         * @author Isabella Garcia
         * @author Jazmin Huerta
         *         
         * @since 11/26/2023
         */
        public void printInvoice() {
                ConfirmationNumberGenerator confirmationGenerator = ConfirmationNumberGenerator.getInstance();
                String confirmation1 = confirmationGenerator.generateConfirmationNumber();
                this.confirmationNum = confirmation1;
                System.out.println();
                System.out.format(
                                "+---------------------------------------------------------------------------------------------------------------+%n");
                System.out.format(
                                "|                                       	 INVOICE INFORMATION	                                        |%n");
                System.out.format(
                                "+---------------+---------------+----------+-----------+----------+------------+--------------+-----------------+%n");
                System.out.println(
                                "|   +If you are a TickerMiner Member: We are so glad to have you, here is an extra 10% disccount!                             ");
                System.out.format(
                                "+---------------------------------------------------------------------------------------------------------------+%n");
                System.out.println("|   +Name of event: " + this.eventName);
                System.out.format(
                                "+---------------------------------------------------------------------------------------------------------------+%n");
                System.out.println("|   +Total Tickets Purchased: " + this.ticketCount);
                System.out.format(
                                "+---------------------------------------------------------------------------------------------------------------+%n");
                System.out.println("|   +Price per Ticket: " + this.pricePerTicket);
                System.out.format(
                                "+---------------------------------------------------------------------------------------------------------------+%n");
                System.out.println("|   +Tickets * Price : " + this.pricePerTicket*this.ticketCount);
                System.out.format(
                                "+---------------------------------------------------------------------------------------------------------------+%n");
                System.out.printf("|   +Service Fee: $%.2f\n",this.serviceFee);
                System.out.format(
                                "+---------------------------------------------------------------------------------------------------------------+%n");
                System.out.printf("|   +Convenience Fee: $%.2f\n",this.convenienceFee);
                System.out.format(
                                "+---------------------------------------------------------------------------------------------------------------+%n");
                System.out.printf("|   +Charity Fee: $%.2f\n",this.charityFee );
                System.out.format(
                                "+---------------------------------------------------------------------------------------------------------------+%n");
                System.out.printf("|   +Discount: -$%.2f\n",this.memberDiscount);
                System.out.format(
                                "+---------------------------------------------------------------------------------------------------------------+%n");
                System.out.printf("|   +Subtotal: $%.2f\n",this.subtotal); 
                System.out.format(
                                "+---------------------------------------------------------------------------------------------------------------+%n");
                System.out.printf("|   +Tax: $%.2f\n",this.calcTax);
                System.out.format(
                                "+---------------------------------------------------------------------------------------------------------------+%n");
                System.out.printf("|   +Total Cost:$%.2f\n",this.total);
                System.out.format(
                                "+---------------------------------------------------------------------------------------------------------------+%n");
                System.out.println("|   +Confirmation Number: " + this.confirmationNum);
                System.out.format(
                                "+---------------------------------------------------------------------------------------------------------------+%n");
                System.out.println(
                                "|   Please refer back to it in case further assistance is needed :)                                                                        ");
                System.out.format(
                                "+---------------------------------------------------------------------------------------------------------------+%n");
                System.out.println(
                                "|   Thank you for using Ticket Miner. We hope to see you again!                                                              ");
                System.out.format(
                                "+---------------+---------------+----------+-----------+----------+------------+--------------+-----------------+%n");
        }

        /**
         * stringInvoice method
         * Creates a string of each invoice to then be able to use 
         * it in our summary txt file
         * 
         * @author Jazmin Huerta
         * @author Jorge Garcia
         * @author Isabella Garcia
         * @author Fernanda Zuany
         * @since 11/06/2023
         */
        public String stringInvoice() {

                String str;
                String str1;
                String str2;
                String str3;
                String str4;
                String str5;
                String str6;

                if(this.eventName.contains("CANCELLED")){

                        str = "\n**********************************\n This event was refunded\n \n Below is your confirmation order:\n Amount of tickets: "
                                + this.ticketCount + "\n Price per ticket: $" + this.pricePerTicket + "\n";
                        str1 = String.format(" Subtotal (no tax) (REFUNDED): $%.2f\n", this.subtotal);
                        str2 = String.format(" Member discount: -$%.2f\n", this.memberDiscount);
                        str3 = String.format(" Total: $%.2f \n", this.total);
                        str4 = " Event: "+ this.eventName + "\n";
                        str5 = String.format(" Here is your confirmation number: " + this.confirmationNum);
                        str6 = " Please refer back to it in case further assistance is needed\n **********************************\n";

                } else {
                        str = "\n**********************************\n Thank you for your purchase!\n \n Below is your confirmation order:\n Amount of tickets: "
                                + this.ticketCount + "\n Price per ticket: $" + this.pricePerTicket + "\n";
                        str1 = String.format(" Subtotal (no tax): $%.2f\n", this.subtotal);
                        str2 = String.format(" Member discount: -$%.2f\n", this.memberDiscount);
                        str3 = String.format(" Total: $%.2f (paid)\n", this.total);
                         str4 = " Event: "+ this.eventName + "\n";
                        str5 = String.format(" Here is your confirmation number: " + this.confirmationNum);
                        str6 = " Please refer back to it in case further assistance is needed\n Enjoy:)\n **********************************\n";
                }
            
                return str + str1 + str2 + str3 + str4 + str5 + str6;
        }

   

}
