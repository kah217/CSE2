/*Karen Huang
CSE 2 Spring 2015
April 2, 2015

ArrayInputs java program:
Goal:
1. Ask the user to enter the size of an one-dimentional array
2. Ask the user to fill up the arrary with integers
3. Write a metho to check if the input is a positive integer.
If the input is not an integer or not positive, the method
will return an error message. Reprompt the user to enter
a new input, until the array is completely filled.
4. Print out the array
*/
import java.util.Scanner;
public class ArrayInputs {
    
    public static void main (String [] args){
    Scanner scan=new Scanner (System.in);
    
    System.out.print("Please enter an integer for the size of an array: ");
    
    if (scan.hasNextInt()){ //if there is an input entered
        int input = scan.nextInt(); //number for size of array
        check (input); 
        System.out.print("Please enter "+input+" positive integers: ");
        
        
        int counter =0;
        int [] listOfIntegers = new int [input]; /* declaration and "new" allocates the space for 
        the list itself */
        
        for (counter = 0; counter < input; counter++) {
                double input2 = scan.nextDouble();
                if(check (input2)){
                    
                    listOfIntegers[counter] = (int)input2;
                        
                } else {
                    counter--;
                    continue;
                }
        }
        
        System.out.println("The array is: ");
        for(int i = 0; i < input; i++) {
            System.out.println(listOfIntegers[i]);
        }
    }
       
    }// end of main method
    
    
    public static boolean check (double input) {
        if (input<0){
            System.out.println ("Sorry the number you entered is negative");
            System.out.print ("Please enter a positive integer: ");
            return false;
        }
        if (input!=(int)input ){
            System.out.println ("Sorry, you didn't enter an integer.");
            System.out.print("Please enter a positive integer: ");
            return false;
        }
        return true;
    }//end of check method
    
    
    
}// end of ArrayInputs class