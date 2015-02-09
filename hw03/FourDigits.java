//Karen Huang
//CSE2 Spring 2015
//February 8, 2015
//
//Four Digits Java program
//prompts user for a number (double), then print out the first
//four digits to the right of the decimal point 
//
import java.util.Scanner; //imports scanner class

public class FourDigits {
    //main method required for every java program
    public static void main (String [] args){
    
    //declare instance of scanner object to accept input:
    Scanner myScanner; 
    myScanner = new Scanner (System.in); //call the Scanner constructor
    
        //accept input from user:
        System.out.print(
            "Enter a double and I display the 4 digits to the right of the decimal point: "); 
            // ^ prompt user for a number
        double num = myScanner.nextDouble (); //accept user input using this statement
        
        //calculations for obtaining only four digits to right of decimal 
        int newNum = (int)num; //drop decimal places of input number
        int newNum1000 = ((int)newNum * 10000); //input number with dropped decimals*10000
        double newNumDec= ((double) num * 10000); //input number with decimals moved to right 4 places
        int intNewNum = ((int)newNumDec); //dropping any additional decimal places (convert to int)
        int fourDecimal = intNewNum - newNum1000; //four digits
        
        System.out.println ("The four digits are: " + fourDecimal);
    }//end of main method
}//end of class
