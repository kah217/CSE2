//Karen Huang
//CSE 2015 Spring 2015
//February 15, 2015
//
//WhichNumber java program
//prompts user to think of an integer between 1 and 10
//inclusive. 
//Then ask the user questions to guess which number user
//is thinking of.

import java.util.Scanner; //imports Scanner class

public class WhichNumber {
    //main method needed for every program
    public static void main (String [] args) {
        
    //declare instance of scanner to accept user input
    Scanner myScanner;
    myScanner = new Scanner (System.in);// call the Scanner constructor
    String answer; //declare variable 
    answer = "y";
    
    //accept input from user:
    System.out.print (
        "Think of a number between 1 and 10 inclusive. Is your number even? ");
    if (myScanner.hasNext()) {  //check whether user inputs a string
    answer = myScanner.next();//accept input from user with this statement
    
    if (answer.equals("y") || answer.equals("Y")) {
    System.out.println ("Is it divisible by 3? ");
        if (myScanner.hasNext()) {
        answer = myScanner.next();
        if (answer.equals ("y") || answer.equals("Y")) {
        System.out.println ("6");
        return;
        }
        
        else if (answer.equals("n") || answer.equals("N")) {
        System.out.println ("Is the number divisible by 4? ");
            if (myScanner.hasNext()) {
            answer = myScanner.next();
            if (answer.equals ("y") || answer.equals("Y")) {
            System.out.println ("Is the number divided by 4 greater than 1? ");
                if (myScanner.hasNext()) {
                answer = myScanner.next();
                if (answer.equals ("y") || answer.equals ("Y")) {
                System.out.println ("8");
                return;
                }
                else if (answer.equals ("n") || answer.equals ("N")) {
                System.out.println ("4");
                return;
                }
                else {
                System.out.println ("Sorry, that is not a valid input.");
                return;
                }    
                }
            }
            
            else if (answer.equals ("n") || answer.equals ("N")) {
            System.out.println ("Is it divisible by 5? ");
                if (myScanner.hasNext()) {
                answer = myScanner.next();
                if (answer.equals ("y") || answer.equals("Y")) {
                System.out.println ("10");
                return;
                }
                else if (answer.equals ("n") || answer.equals ("N")) {
                System.out.println ("2");
                return;
                }
                else {
                System.out.println ("Sorry, that is not a valid input.");
                return;
                } 
                }
            }
            
            else {
            System.out.println ("Sorry, that is not a valid input.");
            return;
            }
            }
        }
        else {
        System.out.println ("Sorry, that is not a valid input.");
        return;
        }
        }
    }
    
    
    else if (answer.equals("n") || answer.equals("N")) {
    System.out.println ("Is the number divisible by 3? ");
        if (myScanner.hasNext()) {
        answer = myScanner.next();
        if (answer.equals ("y") || answer.equals("Y")) {
        System.out.println ("When divided by 3 is the result greater than 1? ");
            if (myScanner.hasNext ()) {
            answer = myScanner.next ();
            if (answer.equals ("y") || answer.equals("Y")) {
            System.out.println ("9");
            return;
            }
            else if (answer.equals ("n") || answer.equals("N")) {
            System.out.println ("3"); 
            return;
            }
            else {
            System.out.println ("Sorry, that is not a valid input.");
            return;
            } 
            }
        }
        
        else if (answer.equals ("n") || answer.equals ("N")) {
        System.out.println ("Is it greater than 6? ");
            if (myScanner.hasNext()) {
            answer = myScanner.next();
            if (answer.equals ("y") || answer.equals("Y")) {
            System.out.println ("7");
            return;
            }
            else if (answer.equals ("n") || answer.equals("N")) {
            System.out.println ("Is it less than 3? ");
                if (myScanner.hasNext()) {
                answer = myScanner.next();
                if (answer.equals ("y") || answer.equals("Y")) {
                System.out.println ("1");
                return;
                }
                else if (answer.equals("n") || answer.equals("N")) {
                System.out.println ("5"); 
                return;
                }
                else {
                System.out.println ("Sorry, that is not a valid input.");
                return;
                }
                }
            }
            
            else {
            System.out.println ("Sorry, that is not a valid input.");
            return;
            }
            }
        }
        
        else {
        System.out.println ("Sorry, that is not a valid input.");
        return;
        }    
        }
    }
    
    else {
    System.out.println ("Sorry, that is not a valid input.");
    return;
    }    
    
    
    }
    }//end of class
}//end of main method