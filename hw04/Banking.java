//Karen Huang
//CSE 2015 Spring 2015
//February 15, 2015
//
//Banking java program
//allows users to process banking transactions
import java.util.Scanner; //imports Scanner class
import java.util.Random; //imports Random class

public class Banking {
    //main method needed for every program
    public static void main (String [] args) {
        
    //declare instance of scanner to accept user input
    Scanner myScanner;
    myScanner = new Scanner (System.in);// call the Scanner constructor
    String action; //declare
    action = "view balance"; //initialize
    
    //declare variables for random # generation:
    Random random = new Random();
    int min = 1000;
    int max = 5000;
    int randNum = random.nextInt(max-min) + min;
    
    //declare variables for math of deposit and withdrawal
    double amount; //user $input
    double balanceAfterWithdrawal;
    double balanceAfterDeposit;
    
    System.out.print (
        "What would you like to do today? Enter withdraw, deposit or balance to view balance.");
    if (myScanner.hasNext()) {
    action = myScanner.next();
    switch (action) {
        case "Deposit": //"Deposit" and "deposit" so one or the other works when user input
        case "deposit": 
            System.out.println ("How much would you like to deposit?");
            if (myScanner.hasNextDouble()) {
            amount = myScanner.nextDouble();
            balanceAfterDeposit = randNum+amount;
                if (amount > 0) { //ensure amount input is positive
                System.out.println ("You had $" + randNum + "." + 
                " After deposit, you have $" + balanceAfterDeposit + ".");
                }
            else {
            System.out.println ("Sorry, that is not a valid input. Please try again.");
            } 
            }    
               
            break;
        
        case "Withdraw":
        case "withdraw":
            System.out.println ("How much would you like to withdraw?");
            if (myScanner.hasNextDouble()) {
            amount = myScanner.nextDouble();
            balanceAfterWithdrawal = randNum-amount;
                if (amount >0){ //ensure amount input is positive
                    if (balanceAfterWithdrawal < 0) {
                    System.out.println ("You've exceeded the amount in your account.");
                    }
                    else if (balanceAfterWithdrawal > 0) { //ensure user doesn't exceed balance
                    System.out.println ("You had $" + randNum + "." + 
                    " After withdrawal, you have $" + balanceAfterWithdrawal + " left.");
                    }
                }
                else {
                System.out.println ("Sorry, that is not a valid input. Please try again.");
                }
            }    
            else {
            System.out.println ("Sorry, that is not a valid input. Please try again.");
            }
            
            break;  
        
        case "Balance":
        case "balance":
        System.out.println ("You have $" + randNum + " in your account.");
        break;
        
        default:
        System.out.println ("Sorry, not a valid input. Please try again.");
        break;
        
    }
        
    }
    }//end of class
        
}//end of main method
