/*Karen Huang
CSE 2 Spring 2015
April 10, 2015

Arrays java program: to perform linear and binary search on
large arrays of random numbers. 

1. Create two integer arrays (array1 and array2) of size 50.
2. Fill array1 with random integers between 0 and 100
3. Use linear search to print out the minimum and maximum values of array1.
4. Add increasing random numbers to array2. (The first number should be between 0 and 100).
5. Print out the minimum and maximum values of array2.
6. Prompt the user to enter an int >= 0, and exit the program if they do not enter an int >= 0.
7. Use binary search to search the array for the inputted value.
8. Say if the number was found or not found.
9. If the number was not found, print out the numbers below and above the searched for number.
*/

import java.util.Random;
import java.util.Scanner;

public class Arrays {
    public static void main(String[]args){
    Scanner scan=new Scanner (System.in);   
    int[] array1=new int[50];
    int[] array2=new int[50];
    int counter=0;
    int counter2=0;
        
    array1=randomGen(); //receives random nums from randomGen() method
    array2=randomGenSum();
        
    //     String printer = "Print out array1 nums"; //initialize
  	 //   printer += listArray(array1); //Declare
  	 //   System.out.println(printer);// print out array nums
        String printer2 = "Print out array2 nums";
        printer2+=listArray(array2);
        System.out.println(printer2);
        
    int min = getMin(array1);
    System.out.println("The minimun of array1 is: "+min);
    int max = getMax(array1);
    System.out.println("The maximum of array1 is: "+max);
        
    int min2 = getMin(array2);
    System.out.println("The minimun of array2 is: "+min2);
    int max2 = getMax(array2);
    System.out.println("The maximum of array2 is: "+max2);
        
    
    
    System.out.print("Enter an integer > 0: ");
    if (scan.hasNextInt()){
    int input=scan.nextInt();
    int highClose=0;
    int lowClose=0;
        if (input>=0){
            for (int count=25; count>-1; count--){ //search from 25-0, 
                if (input!=array2[count]){
                    if (input>=max2){
                    System.out.println("You have entered an int >= the max#.");
                    return;
                    }
                    if ((input<array2[count]) && (input>array2[count-1])){
                    highClose=array2[count];
                    lowClose=array2[count-1];
                    System.out.println(input+" was not found on the list.");
                    System.out.println("The number above the key was " + highClose);
                    System.out.println("The number below the key was "+ lowClose);
                    return;
                    }
                    
                    else {
                        
                    }
                }
                else {
                System.out.println(input+" was found on the list.");
                return;
                }
            }
            
            for(int count=25; count<50; count++){
                if (input!=array2[count]){
                    if (input>=max2){
                    System.out.println("You have entered an int >= the max#.");
                    }
                        if ((input>array2[count]) && (input<array2[count+1])){
                        highClose=array2[count+1];
                        lowClose=array2[count];
                        System.out.println(input+" was not found on the list.");
                        System.out.println("The number above the key was " + highClose);
                        System.out.println("The number below the key was "+ lowClose);
                        return;
                        }
                }
                else {
                System.out.println(input+" was found on the list.");
                return;
                }
                
            }
        }
        else {
        System.out.println("You didn't enter an int>0.");
        return;
        }
        
    }
    else{
            System.out.println("You did not enter an integer");
    }
    
}//end of main method
    
   
   
    
    public static int getMax(int[]array){
        int max=0;
        for (int count=0; count<50; count++){
            if (max<array[count]){
                max=array[count]; 
            }
            else {
                max=max;
            }
        }
    return max;  
    }//end of getMax method
    

    public static int getMin(int[]array){
        int min=5000;
        for (int count=0; count<50; count++){
            if (min>array[count]){
                min=array[count]; 
            }
            else {
                min=min;
            }
            
        }
    return min;  
    }//end of getMin method
    
    
    
    public static int [] randomGen(){ //generates 50 random #s for an array
        int randNums []= new int [50];
        for (int counter = 0; counter < 50; counter++) {
            Random randomGenerator =new Random(); //create Random
            int random = randomGenerator.nextInt(50); //initialize + declare variable for random #
            double randNum = (Math.random()*101); //generates numbers from 0-100
            int rand = (int) randNum; //casts these double# into int
            randNums [counter]+=rand; //these double# (rand) go into the array randNums
        }
        return randNums; //returns the random numbers
    }// end of randonInput method
    
    
    
    
    public static int [] randomGenSum(){ //generates 50 random #s for an array
        int randNums2 []= new int [50];
        Random randomGenerator =new Random(); //create Random
        double randNum = randomGenerator.nextInt(50); //initialize + declare variable for random #
        
        double randFirst = (Math.random()*101); //generates numbers from 0-100
        int first = (int) randFirst; //casts these double# into int
        randNums2[0]=first;
        
        for (int counter = 1; counter < 50; counter++) {
            randNum = (Math.random()*101); //generates numbers from 0-100
            int rand = (int) randNum; //casts these double# into int
            
            randNums2 [counter]+=rand+randNums2[counter-1]; //these double# (rand) go into the array randNums
            
        }
        return randNums2; //returns the random numbers
    }// end of randonInput method
    
    
    
    
    public static String listArray(int num[]){ //to display array elements
    	String out="{";
    	for(int j=0;j<num.length;j++){
      	if(j>0){
        	out+=", ";
      	}
      	out+=num[j];
    	}
    	out+="} ";
    	return out;
    }
  
    
}//end of Arrays class
