//Karen Huang
//CSE 2 Spring 2015
//February 13, 2015
//
//Cookie java program
//Obtain from users # of cookies they want, how many people they are buying for, 
//and at least how many cookies they want each person to get.
//Then determine if # of cokies is evenly divisible among people and
//if there is enough for each person.
//If not enough cookies, tell user how many more are needed
//
import java.util.Scanner; //imports scanner class

public class Cookies {
    //main method required for every program 
    public static void main (String [] args) {
        
    //declare instance of scanner to accept user input
    Scanner myScanner;
    myScanner = new Scanner (System.in);// call the Scanner constructor
   
    //variables:
    int numPeople = 0; // # of people at event
    int numBuy = 0; // # of cookies user is planning to buy
    int numPeopleWant = 0; // # of cookies per person 
    
    //accept input from user:
    System.out.print (
        "Enter the number of People: ");//prompt user for # of People
    if (myScanner.hasNextInt()) {  //check whether user inputs an int
        numPeople = myScanner.nextInt();//accept input from user with this statement
        if (numPeople < 0) {
            System.out.println ("You did not enter an int > 0");
            return; //leaves the program, i.e. the program terminates
            }
        }
        else {
            System.out.println("You did not enter an integer.");
            return;
        }
    
    
    System.out.print(
        "Enter the number of cookies you are planning to buy: ");
    if (myScanner.hasNextInt()) {  
        numBuy = myScanner.nextInt ();//accept input from user with this statement
        if (numBuy < 0) {
            System.out.println ("You did not enter an int > 0");
            return;
            }
        }
        else {
            System.out.println ("You did not enter an integer.");
            return;
        }
    
    
    System.out.print (
        "How many do you want each person to get? ");
    if (myScanner.hasNextInt()) { 
        numPeopleWant = myScanner.nextInt ();//accept input from user with this statement
        if (numPeopleWant < 0) {
            System.out.println ("You did not enter an int > 0");
            return;
            }    
        }
        else {
            System.out.println ("You did not enter an integer.");
            return;
        }
        
        
    //print output and formulas for # of cookies needed and whether 
    //the amount of cookies divide evenly
    if ((numBuy % numPeople == 0) && (numBuy >= (numPeople * numPeopleWant))) {
        System.out.println (
        "You have enough cookies for each person and the amount will divide evenly.");
        }
    else if (numBuy < (numPeople * numPeopleWant)) {
        int numToBuy = ((numPeople * numPeopleWant) - numBuy);//# of cookies to buy
        System.out.println (
        "You don't have enough cookies. You need to buy at least " + numToBuy + " more.");
        }
    else if (((numBuy % numPeople) !=0) && (numBuy > (numPeople * numPeopleWant))) {
        System.out.println (
        "You have enough, but they will not divide evenly.");
        }
    
    }//end of main method
}//end of class