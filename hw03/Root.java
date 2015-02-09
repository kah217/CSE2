//Karen Huang
//CSE 2 Spring 2014
//February 8, 2015
//
//Root java program
//prompt user for a number (double) then print out a
//crude estimate of the cubic root of the number and
//the value of this crude guess when cubed

import java.util.Scanner; //imports the Scanner class

public class Root {
    //main method required for every java program
    public static void main (String []args) {
        
    //declare instance of the scanner object to accept input
    Scanner myScanner;
    myScanner = new Scanner (System.in); //call the scanner constructor
    
        //accept input from user
        System.out.print(
            "Enter a number in the form (xx.xx) ");//prompt user for number
        double num = myScanner.nextDouble(); //accept user input using this statement
    
        //calculations for cubic root
        double guess = num/3; //first guess of number
        double cuberoot = ((num/3)*(num/3)*(num/3)+num)/(3*(num/3)*(num/3));
        double cuberoot2 = (2*(cuberoot)*(cuberoot)*(cuberoot)+num)/(3*(cuberoot)*(cuberoot));
        double cuberoot3 = (2*(cuberoot2)*(cuberoot2)*(cuberoot2)+num)/(3*(cuberoot2)*(cuberoot2));
        double cuberoot4 = (2*(cuberoot3)*(cuberoot3)*(cuberoot3)+num)/(3*(cuberoot3)*(cuberoot3));
        double cuberoot5 = (2*(cuberoot4)*(cuberoot4)*(cuberoot4)+num)/(3*(cuberoot4)*(cuberoot4));
        double cuberoot6 = (2*(cuberoot5)*(cuberoot5)*(cuberoot5)+num)/(3*(cuberoot5)*(cuberoot5));
        
        System.out.println ("The cubic root is " + cuberoot6);
        
    }//end of main method
}//end of class