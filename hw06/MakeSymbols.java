/*Karen Huang
kah217@lehigh.edu
CSE2 Spring 2015
February 26, 2015

MakeSymbols Java Program
Print out #. If # is even, print out that # of "*".
If # is odd, print out that # of "&" characters.*/


public class MakeSymbols {
    public static void main (String [] args){
    
    double num=(Math.random())*101; //random number generated from 1-100
    int random= (int)num;
    int count1=0;
    int count2=0;
    
        if ((random%2==0)&& (random >0)){ //make sure its an even > 0
            System.out.println ("Random number generated: " + random); //keep these statements
            //out of the loop so it's  not repeated as well
            System.out.print("The output pattern: "); 
            do {
            System.out.print("*");
            count1 ++; //loop increases by 1 until it is less than the random number
            } while (count1 <random);
        
        }
        
        else if ((random%2==1)&& (random >0)){ //make sure its an odd >0
            System.out.println("Random number generated: " + random);
            System.out.print("The output pattern: ");
            do {  
            System.out.print("&");
            count2 ++;
            } while (count2 <random);
            
        }
        
    
    }//end of main method
}//end of class