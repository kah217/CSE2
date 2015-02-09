//Karen Huang
//CSE 2 Spring 2015
//February 7, 2015
//
//Bicycle java program
//ask user for the number of counts on a cyclometer and
//the sesond gicing the # of secomes during which the 
//counts occurred.
//Print the distance traveled and the avg miles per hour
//Assume diameter of wheel is 27 inches
//
import java.util.Scanner;

public class Bicycle {
    //main method required for every program
    public static void main (String []args) {
        
    //declare instance of the Scanner object to accept input:        
    Scanner myScanner;
    myScanner = new Scanner (System.in); //call the Scanner constructor
    
        //accept input from user:
        System.out.print(
            "Enter the number of counts: "); //prompts user for # of counts
        int numCounts = myScanner.nextInt(); 
        System.out.print(
            "Enter the number of seconds: "); //prompts user for # of seconds
        int numSecs = myScanner.nextInt(); 
        
        //our immediate variables
        double wheelDiameter = 27.0; 
        double PI = 3.14159;
        int feetPerMile = 5280;
        int inchesPerFoot = 12;
        int secondsPerMinute = 60; 
        int minutesPerHour = 60;
        
        //output variables 
        double distance; //define output variables
        distance = numCounts * wheelDiameter * PI /inchesPerFoot/feetPerMile; //formula for distance
        double timeInMin;
        timeInMin = (numSecs/secondsPerMinute); //formula for time in minutes
        double milesPerHour;
        milesPerHour = distance/(timeInMin/minutesPerHour); //formula for avg mph
        
        //print out answers to two decimal points
        double xDistance = distance * 100; //gets answer to 2 additional places
        int xxDistance = (int)xDistance; //converts to integer, dropping decimal places
        double xxxDistance = ((double) xxDistance) /100; //converts answer back to decimal
        //and returns answer back two decimal places
        
        double xTimeInMin = timeInMin * 100;
        int xxTimeInMin = (int)xTimeInMin;
        double xxxTimeInMin = ((double)xxTimeInMin)/100;
        
        double xMilesPerHour = milesPerHour *100;
        int xxMilesPerHour = (int)xMilesPerHour;
        double xxxMilesPerHour = ((double) xxMilesPerHour)/100;
        
        //print out 
        System.out.print("The distance was " + xxxDistance + " miles and took " + 
            xxxTimeInMin + " minutes.");
        System.out.print("The average mph was " + xxxMilesPerHour);
        
        
    }//end of main method
}//end of class