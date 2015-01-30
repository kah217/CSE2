//Karen Huang
//CSE 2 Spring 2015
//January 30, 2015
//
//Cyclometer Java Program
//
//measure the time in seconds per trip and
//number of rotations on the front wheel within given time. 
//  print: number of minutes for each trip
//         number of counts for each trip
//         distance of each trip in miles 
//         distance for the two trips combimed
public class Cyclometer {
    //main method required for every program
    public static void main (String [] args) {
        
   

    //our input data
        int secsTrip1=480; //number of seconds for trip 1
        int secsTrip2=3220; //number of seconds for trip 2
        int countsTrip1=1561; //number of rotations for trip 1
        int countsTrip2=9037; //number of rotations for trip 2
        
    //our immediate variables and output data
        double wheelDiameter=27.0; //wheel diameter
        double PI=3.14159; //value of pi
        int feetPerMile=5280; //number of feet per mile
        int inchesPerFoot=12; //number of inches per foot
        int secondsPerMinute=60; //number of seconds per minute
        double distanceTrip1, distanceTrip2, totalDistance; //defining output data
        
    //display
        System.out.println("Trip 1 took " + 
            (secsTrip1/secondsPerMinute) + " minutes and had " +
            countsTrip1 + " counts."); 
        System.out.println("Trip 2 took " +
            (secsTrip2/secondsPerMinute) + " minutes and had " +
            countsTrip2 + " counts.");
            
    //run the calculations; store the values
        //calculate distance of Trip 1
        distanceTrip1=countsTrip1*wheelDiameter*PI;
        //Above gives distance in inches
        //(for each count, a rotation of the wheel travels
        //the diameter in inches times PI)
        distanceTrip1=countsTrip1*wheelDiameter*PI/inchesPerFoot/feetPerMile; // Converts to distance in miles
        distanceTrip2=countsTrip2*wheelDiameter*PI/inchesPerFoot/feetPerMile;
        totalDistance=distanceTrip2+distanceTrip1;
        
    //Print out the output data
        System.out.println("Trip 1 was " + distanceTrip1 + " miles");
        System.out.println("Trip 2 was " + distanceTrip2 + " miles");
        System.out.println("The total distance was " + totalDistance + " miles");
        
    }//end of main method
}//end of class