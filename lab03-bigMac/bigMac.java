//Karen Huang
//CSE2 Spring 2015
//February 6, 2015
//
//Big Mac java program
//Computes the cost of buying Big Macs with input from 
//the user: the # of Big Macs, cost per Big Mac, 
//and the percentage tax
//Then display the total cost

import java.util.Scanner; //imports the Scanner class

public class bigMac {
    //main method required for every Java program
    public static void main (String[]args) {
    
//declare instance of the Scanner object to accept input:    
    Scanner myScanner; 
    myScanner = new Scanner (System.in); //call the Scanner constructor
    
//accept input from user:
    System.out.print(
        "Enter the number of Big Macs (an integer > 0): ");//prompt user for # of Big Macs
    int nBigMacs = myScanner.nextInt(); //accept user input using this statement
    
    System.out.print(
        "Enter the cost per Big Mac as" + " a double (in the form xx.xx): ");//prompt user for 
        //cost per Big Mac
    double bigMac$ = myScanner.nextDouble ();
    
    System.out.print(
        "Enter the percent tax as a whole number (xx): ");
    double taxRate = myScanner.nextDouble ();
    taxRate/=100; //user enters percent, but I want proportion
    
//Print output:
    double cost$;
    int dollars, //whole dollar amount of cost
        dimes, pennies; //for storing digits to the right of the decimal point
        //for cost$
    cost$ = nBigMacs*bigMac$*(1+taxRate);
    dollars = (int)cost$; //get the whole amount, dropping decimal fraction
    dimes = (int)(cost$*10)%10;
    pennies = (int)(cost$*100)%10;
    
    System.out.println ("The total cost of " + nBigMacs + " BigMacs, at $" +
        bigMac$ + " per BigMac, with a" + " sales tax of " + (int)(taxRate*100) +
        "%, is $" + dollars + '.' + dimes + pennies);
    
    } //end of main method
} //end of class
