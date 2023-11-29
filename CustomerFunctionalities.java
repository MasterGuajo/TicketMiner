/**
 * This is our CustomerFunctionalities class where we have customer's basic funtionalities such as 
 * logging in, and methods that help check if the log in is being performed correctly
 * 
 * @author Jorge Garcia
 * @author Jazmin Huerta
 * @author Isabella Garcia
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
import java.util.Scanner;

public class CustomerFunctionalities {
    /**
     * userLogIn method
     * Takes in the customerMap and tries to log a user in by asking them information
     * 
     * @author Jorge Garcia
     * @author Jazmin Huerta
     * @author Isabella Garcia
     * @author Fernanda Zuany
     * @since November 6th, 2023
     * 
     * @param customerMap
     * @return Customer
     * 
     */
    static Customer userLogIn(HashMap<Integer, Customer> customerMap){

        Menu menu = new Menu();
        Scanner userInput = new Scanner(System.in);
        Customer attemptedCustomer = new Customer();
        boolean wantsToLogIn = true;
        String userChoice;

        while (wantsToLogIn){
            menu.logInMenu();
            userChoice = userInput.nextLine().trim();

            if(userChoice.equalsIgnoreCase("Y") || userChoice.equalsIgnoreCase("yes")){

                // We save their first and lastname without capitalization, as well as username and password
                System.out.println();
                System.out.print("Please enter your first name: ");
                String firstName = userInput.nextLine().trim().toLowerCase();

                System.out.print("Now your last name: ");
                String lastName = userInput.nextLine().trim().toLowerCase();

                System.out.print("Please input your username: ");
                String username = userInput.nextLine().trim();

                System.out.print("Please input your password: ");
                String password = userInput.nextLine().trim();

                // Call credentialsFound, which checks that all information is matching
                int customerID = credentialsFound(customerMap, firstName, lastName, username, password);

                // If a user is found, we return them
                if(customerID > 0){
                    System.out.println();
                    System.out.println();
                    System.out.format("                     +--------------------------------------------------------------+%n");
                    System.out.println("                                            Welcome " + firstName + " " + lastName+ "!                      ");
                    System.out.format("                     +--------------------------------------------------------------+%n");
                    return customerMap.get(customerID);
                }
            
            //If they wish to quit, we can return them right away
            } else if (userChoice.equalsIgnoreCase("N") || userChoice.equalsIgnoreCase("no")) {
                wantsToLogIn = false;
            } else {
                System.out.println("Please enter one of the specified options (Y / N)");
            }
        }
        return attemptedCustomer;
    }


    /**
     * credentialsFound method
     * Parses hashmap in order to find credential that match userinput. If found, we return their id for quicker lookup
     * 
     * @author Jazmin Huerta
     * @author Jorge Garcia
     * @author Isabella Garcia
     * @author Fernanda Zuany
     * @since November 6th, 2023
     * 
     * @param customerMap
     * @param nameIn
     * @param lastNameIn
     * @param usernameIn
     * @param passwordIn
     * @return int
     */
    public static int credentialsFound(HashMap<Integer,Customer> customerMap, String nameIn, String lastNameIn, String usernameIn, String passwordIn){

        for(int i = 1; i <= customerMap.size();i++){
            if((nameIn.equalsIgnoreCase(customerMap.get(i).getFirstName())) && (lastNameIn.equalsIgnoreCase(customerMap.get(i).getLastName())) &&(usernameIn.equals(customerMap.get(i).getUsername())) && (passwordIn.equals(customerMap.get(i).getPassword()))){
                return i;
            }
        }

        System.out.println();
        System.out.println("Please try again, your data does not match our records:(");
        System.out.println();
        return 0;
    }

     /**
     * customerExistsID
     * Check if the requested customer exists 
     * 
     * @author Jazmin Huerta
     * @author Maria Fernanda Zuany
     * @author Isabella Garcia
     * @author Jorge Garcia
     * @since November 18th, 2023
     * 
     * @param customerKey
     * @param customerMap
     * @param customerMapByName
     * @return customer ID
     */
    public static int customerExistsID(String customerKey, HashMap<Integer, Customer> customerMap, HashMap<String,Integer> customerMapByName) {
        int currCustomerID;
        customerKey = customerKey.toLowerCase();
        
        if (customerKey.equals("EXIT")) {
            return 0;
        } else {

            if(customerMapByName.containsKey(customerKey)){
                return customerMapByName.get(customerKey.toLowerCase());//returns the id that is stored as an integer inside the hashmap
            }

            try {
                currCustomerID = Integer.parseInt(customerKey);
                if (customerMap.containsKey(currCustomerID)) {
                    return currCustomerID;
                } else {
                    System.out.println("Customer not found, please try again");
                    return 0;
                }
            } catch (NumberFormatException e) {
                System.out.println("Please enter a valid ID or name (ID's are made up of numbers)");
                return 0;
            }
        }
    }
}
