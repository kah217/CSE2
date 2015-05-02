/*Karen Huang
Spring 2015
CSE 2
March 30, 2015

Zigzag java program
1. Create an int variable nStars and assign it the value of 10. Then, use
a loop to pring out nStarts copies of '*' on a line:
***********
(Hints: use nStars as the sentinel variable, and declare a second
variable to control the loop. Recall that the System.in method print()
stays on the same line, while println() goes to the next line).

2. Nest a loop similar to the above in a second loop so that program 
prints out the following:
*
 *
  *
   *
    *
     *
      *
       *
        *
         *

3. Repeat #1 Create an int variable nStarts

4. 4) import java.util.Scanner. Then write a loop(s) that appear 
above the loops you wrote above and forces the user to enter an int 
between 3 and 33, storing the int in nStars. (Recall the Scanner method 
hasNextInt(). Your loop(s) will be controlled by two boolean conditions, 
hasNextInt() and the value of nextInt() being in the range 3-33, inclusive.)
*/

import java.util.Scanner;

public class zigzag {
    public static void main (String []args){
    System.out.print("Enter an int between 3 and 33: ");  
    Scanner scan=new Scanner(System.in);
    
    
    while (scan.hasNextInt()){
        int input=scan.nextInt();
        if ((input>2)&&(input<34)){
    
            int nStars=input;
            int a=1;
            while (a<nStars){
            a++;
            System.out.print("*"); //Line of stars at the top
            
            }  
        
            int sputnik=input;
            int b=1; //counter for spaces
            int c=2;
            int random=0;
            
        
            while (b<(sputnik)){
            b++;
           
                while (c<input){ //loops the spaces per line
                c++;
                System.out.print(" ");
                }
            System.out.println("*"); //a star after each line of space is looped
            }
    
            int nStarts=input;
            int n=0;
            while (n<nStarts){
                n++;
                System.out.print("*"); //line of stars at the bottom
            }
            System.out.println();
            System.out.print("Enter y or Y to go again: ");
            
            String answer=scan.next();
            if (answer.equals("y") || answer.equals("Y")){
                System.out.println("Enter an int between 3 and 33: ");
            }
            else {
                System.out.println("You didn't put y or Y, so bye bye!");
                return;
            }
        }
        else {
        System.out.println("The number is out of range [3,33]");
        System.out.println("Enter an int between 3 and 33:");
        }
    }    
    }//end of main method
}//end of class