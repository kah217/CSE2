/* Karen Huang
kah217@lehigh.edu
CSE2 Spring 2015
February 28, 2015

RunFactorial Java program
Use while-loop to solve factorial programs. Use scanner to input an
integer that is between 9 and 16 inclusively. Then calculate the
factorial of the input number.
*/
import java.util.Scanner;

public class RunFactorial {
    public static void main (String [] args){
    
    Scanner myScanner; //create scanner
    myScanner=new Scanner (System.in); //call scanner constructor
    
    int input=0; //variable for input
    int counter = 0; //counts the number of times that multiplication(loop) happens
    int fact = 1; /*number to start out and also acts as a variable to
    store the multiplication of each incrementing #*/
    
    System.out.println("Enter an integer between 9 and 16 inclusively.");
        while((myScanner.hasNextInt()) || (myScanner.hasNext())) { /*if there is an int or string, 
        the while loop runs*/
            if(myScanner.hasNextInt()) { /* if there is an int, then it gets stored in the 
            next line. Storing numbers also prevent program from going into infinity with 
            output*/
                input = myScanner.nextInt();
                if((input > 8) && (input < 17)) { //checks this condition, if true, it runs
                    while (counter < input){
                        fact *= (counter+1);
                        counter++; 
                    }
                    System.out.println("Input accepted:");
                    System.out.println(input+"! = "+ fact);
                    return; //ends the loop here after we get an int and its factorial is
                    //calculated
                }
                else {
                    System.out.println("Invalid input, enter again!");
                }
            }
            else {
                String in = myScanner.next();
                System.out.println("Invalid input, enter again");
            }
        }//end of while loop. The brackets enclose everything that will lead to the loop again
    
    }//end of class
}//end of main method
    