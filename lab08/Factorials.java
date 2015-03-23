/*Karen Huang
CSE2 Spring 2015
March 20, 2015

Factorials java program: 
Write a java program consisting of 3 methods 
that calculates the super factorial. 

Take n as an input from users and write  methods:
1. The first method called factorial(int input) takes
in a positive integer and returns the factorial of the
integer.
2. The second method called print (int input, int sum)
simply prints out the number pass in with the following
format:
    a. "The super factorial of 5 is 153"
*/
import java.util.Scanner;

public class Factorials {
    
    
//add the factorials together
    public static void main (String [] args){
        Scanner myScanny; //declare instance of scanner to accept user input
        myScanny=new Scanner (System.in); // call the scanner constructor
        
        int sum=0; /*declared variable for the sum of all factorials. Starts
        at 0 because there's nothing to be added at first*/
        System.out.print("Enter a positive integer: ");
        
        while (myScanny.hasNextInt()|| myScanny.hasNext()){ //runs if int or string is inputted
            if (myScanny.hasNextInt()){
            int n=myScanny.nextInt(); //variable for input   
                if (n>0){ //if input is positive, run program
                    for (int count=1; count<=n; count ++){
                        sum+=factorial(count); /*loops and adds all factorials from
                        the factorials method. "count" is the value that will
                        be passed to the factorials method.*/
                    }
                print(n, sum); /*"n" is the input variable for print method
                and "sum" is the sum variable for print method */
                return; //ends the loop once a pos. int. has been entered
                }
                else {
                    System.out.print ("Put in a positive integer! ");
                    //no "return" so loop keeps going
                }
            }
            else {
                String letterInput=myScanny.next();//store input here if it's a string
                System.out.print ("Not a string, put in postitive integer! ");
                    //no "return" so loop keeps going
            }
        }
    }//end of main method
    
    
    
//finds the factorial of a number
    public static int factorial (int entered){
        int fact =1; 
        for (int i=1; i<=entered; i++){
            fact*=i; //finds the factorial of a num
        }
        System.out.println(fact);
        return fact; /*return an output so its value can be used. The name of
        variable doesn't matter*/
    }//end of factorial method
    
    
    
//prints out the input and super factorial    
    public static void print(int input, int sum){
        System.out.println ("The super factorial of "+ input +" is equal to " + sum);
    }//end of print method
    
    
    
}//end of class Factorials