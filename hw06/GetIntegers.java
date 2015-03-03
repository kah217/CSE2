/* Karen Huang
CSE2 Spring 2015
February 26, 2015

GetIntegers Java Program
Goal: Ask user for 5 non-negative integers (if an invalid value is
entered, then ask again, using a loop), and print out the sum of 
the 5 integers. Use only non-nested for-loops. 
*/

import java.util.Scanner;

public class GetIntegers {
    //main method required for every program 
    public static void main (String [] args) {
    
    //declare instance of scanner to accept user input
    Scanner myScanner;
    myScanner = new Scanner (System.in);// call the Scanner constructor
    
    int integer= 0; //variable for user input
    int sum=0; //variable for sum of integers inputted
    int counter= 0; //variable for # of times user inputs an integer
   
        
        System.out.println ("Please enter 5 non-negative integers");
        for (counter = 0; counter < 5; counter++) {
            // System.out.println("counter: " + counter);
            if (myScanner.hasNextInt()) {
                integer = myScanner.nextInt();
                if (integer >0){ 
                    sum=sum+integer; //as each integer is put in, it gets added
                    //to the integer before it
                }
                else {
                    System.out.println("Invalid Input. Enter again.");
                    counter --; //decreases counter by one because the invallid 
                    //input didn't count towards the 5 integers we want
                }
            } 
            else {
                System.out.println("Invalid Input. Enter again.");
                String in = myScanner.next(); //to say the input is a string to avoid error
                counter--;
            }
        }
        System.out.println ("Sum is: "+ sum);
    
        
     
        
    }//end of class
}//end of method