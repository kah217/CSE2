/*Karen Huang
CSE 2 Spring 2015
March 6, 2015

Waves Java program
Goal: Ask the user to enter an int between 1 and 30, 
inclusive, and then print out displays that depend on 
the value entered and look like the following:
-------
Enter a number between 1 and 30: 4

FOR LOOP:
1
2
22
333
33
4
44
444
4444

WHILE LOOP:
1
2
22
333
33
4
44
444
4444

D0-WHILE LOOP:
1
2
22
333
33
4
44
444
4444
--------
A different loop should be used to create each of the 
three stacks of number. The first stack should be create
using only for loops. THe second stack should be created
using only while loops and the third stack should be
created using only do-while loops.
*/

import java.util.Scanner;

public class waves {
    //main method necessary for every java program
    public static void main (String [] args){

        Scanner scanny; //create scanner
        scanny= new Scanner (System.in); //call the scanner constructor

        int counter=0; //counter for for loop
        int start=0; //Starting the stack with #1
        int input=0; //variable for user input
        
        int counter1=0; //while-loop counter
        int start1=0; //while-loop starting stack
        // int input1=input; //while-loop variable for user input
    

        System.out.print ("Enter a number between 1 and 30: ");
    
        String garbage = "";
        while((scanny.hasNextInt()) || (scanny.hasNext())) { /*if there is an int or string, 
            the while loop runs*/
                if(scanny.hasNextInt()) { // checks whether input is integer
                    input = scanny.nextInt(); // store input if input is integer
                    if((input < 1) || (input > 30)) { // checks to see if out of bounds
                        System.out.println("Enter an integer between 1 and 30 inclusive");
                    }
                    else { // if not out of bounds, do for-loop
                        System.out.println("FOR LOOP:");
                        // FOR-LOOP CODE
                        for (counter=0; counter<input; counter++) {
                            if ((input<31) && (input>0)){ //if there is an integer between 1 and 30
                                start=start+1; //the number to be displayed increases by 1
                               
                                if ((counter+1)%2==0){//if input is EVEN
                                    int a=0;
                                    
                                    for (a=0; a<start; a++){
                                        for (int j= start - a; j<=start ; j++){
                                           System.out.print(start); 
                                        }
                                        System.out.println ();
                                    }
                                
                                }
                                else if ((counter+1)%2==1){//if input is ODD
                                    int b=0;
                                    
                                    for (b=0; b<start; b++){
                                        for (int j= (start - b) ; j>=1; j--){
                                           System.out.print(start); 
                                        }
                                        System.out.println();  
                                    }
                                }
                            }
                        }
                        // END OF FOR-LOOP CODE
                    

                        
                        System.out.println ("WHILE LOOP");    
                        // WHILE-LOOP CODE
                        counter1=0;
                        while ( counter1<input) {
                            
                            
                            if ((input<31) && (input>0)){ //if there is an integer between 1 and 30
                                start1=start1+1;
                               
                                if ((counter1+1)%2==0){//if input is EVEN
                                    int d=0;
                                    
                                    while(d<start1){
                                        int f= start1 - d;
                                        
                                        while ( f<=start1){
                                           System.out.print(start1); 
                                           f++;
                                        }
                                    System.out.println ();
                                    d++;    
                                    }
                                
                                }
                                else if ((counter1+1)%2==1){//if input is ODD
                                int e=0;
                                   
                                    while ( e<start1){
                                        int f= (start1 -e);
                                        
                                        while (f>=1){
                                           System.out.print(start1); 
                                           f--;
                                        }
                                    System.out.println();  
                                    e++;   
                                    }
                                }
                            }
                        counter1++;
                        }
                        // END OF WHILE-LOOP CODE
                        
                        
                    
                        System.out.println ("DOWHILE LOOP");    
                        // DOWHILE-LOOP CODE
                        counter1=0;
                        start1=0;
                        if (counter1<input) { //surrounding the do-while with an if
                        //checks whether the condition is met before the do-while
                        //is run
                        
                        do{
                            if ((input<31) && (input>0)){ //if there is an integer between 1 and 30
                                start1=start1+1;
                               
                                if ((counter1+1)%2==0){//if input is EVEN
                                    int d=0;
                                    
                                    if (d<start1){
                                    do{
                                        int f= start1-d;
                                        
                                        if ( f<=start1){
                                        do{
                                           System.out.print(start1); 
                                           f++;
                                        }
                                        while ( f<=start1);
                                        }
                                        
                                        System.out.println ();
                                    d++;    
                                    }
                                    while(d<start1);
                                    }
                                }
                                
                                else if ((counter1+1)%2==1){//if input is ODD
                                    int e=0;
                                   
                                    if ( e<start1){
                                    do{
                                        int f= (start1-e);
                                        
                                        if (f>=1){
                                        do{
                                           System.out.print(start1); 
                                           f--;
                                        }
                                        while (f>=1);
                                        }
                                        
                                    System.out.println();  
                                    e++;   
                                    }
                                    while (e<start1);
                                    }
                                }
                        counter1++;
                            }
                        // END OF WHILE-LOOP CODE
                        }
                        while ( counter1<input);
                        }
                        return;
                        
                    }
                }
                else { // if it's not an integer, tell user to enter one
                    garbage = scanny.next();
                    System.out.println("Enter an integer.");
                }
        }
        
        
    
        
    }//end of class
}//end of main method