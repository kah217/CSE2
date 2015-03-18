/* Karen Huang
CSE2 Spring 2015
February 21, 2015

Space Exploration Java program
Output a timeline of signigicant space exploration advances
from 2000-2010. Use a random number generator to select
a year within that decade. Then, output all events in the
timeline that have occurred from 2000 up until the year
that has been randomly selected (ex. output all events from 2000
to 2004).
*/

public class SpaceExploration {
    //main method necessary for every java program.
    public static void main (String []arg){

    double gen = Math.random()*11 + 2000;//random number generator from 0-1. 
    //because we want a year, we take the # generated, multiply by 11, then 
    //add 2000.
    int year =(int)gen; //convert year into integer
    System.out.println (
        "Here is a timeline of space exploration events from " + year + " to 2000:");
    switch (year) {
        //put the years in reverse chronological order so fallthrough of cases goes
        //up to the year generated
        case 2010:
        System.out.println ("2010: SpaceX successfully sends spacecraft to orbit and back");
        
        case 2009:
        System.out.println ("2009: N/A");
        
        case 2008:
        System.out.println ("2008: Kepler launched to study deep space");
        
        case 2007:
        System.out.println ("2007: N/A");
        
        case 2006:
        System.out.println ("2006: Spacecraft returns with collections from a comet");
        
        case 2005:
        System.out.println ("2005: Spacecraft collies with comet");
        
        case 2004:
        System.out.println ("2004: N/A");
        
        case 2003:
        System.out.println ("2003: Largest infrared telescope released");
        
        case 2002:
        System.out.println ("2002: N/A");
        
        case 2001:
        System.out.println ("2001: First spacecraft lands on asteroid");
        
        case 2000: 
        System.out.println ("2000: First spacecraft orbits an asteroid");
        
        default:
        System.out.println ("Cannot compute. Explosion in 5 seconds.");
        }
        
    }//end of main
}//end of class