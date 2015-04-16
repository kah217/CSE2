/*Karen Huang
CSE2 Spring 2015
April 14, 2015

CSE2Linear java program:
prompts the user to enter 15 ints for students’ final grades 
in CSE2. Check that the user only enters ints, and print an 
error message if the user enters anything other than an int.
Print a different error message for an int that is out of the 
range from 0-100, and finally a third error message if the int 
is not greater than or equal to the last int.  Print the final 
input array.  Next, prompt the user to enter a grade to be 
searched for. implement a binary search to find the entered grade.
Indicate if the grade was found or not, and print out the number 
of iterations used. 

Next, scramble the sorted array randomly, and print out the
scrambled array. Prompt the user again to enter an int to be 
searched for, and use linear search to find the grade. Indicate if 
the grade was found or not, and how many iterations it took. 
*/

import java.util.Scanner;
import java.util.Random;

public class CSE2Linear{
    public static void main (String[]args){
        Scanner scan=new Scanner(System.in);
        System.out.print("Please enter 15 integers from 0-100:");
        int[]array=new int [15]; //set size of array
        
        for (int count=0; count<15; count++){ //inputting numbers into array
            if (scan.hasNextInt()){
            int input=scan.nextInt();
                if ((input>-1)&&(input<101)){
                    if (count==0){ //if count is equal to 0, nothing happens
                        array[count]=input;
                    }
                    else if (input>array[count-1]){
                    array[count]=input;
                    }
                    else{
                    System.out.println("Please enter an int greater than the last one you put in.");
                    count--; //count decrements so that the proper input is put into it 
                    }
                }
                
                else {
                System.out.println("Please enter an int from 0-100:");
                count--;
                }
                
            }
            else {
            System.out.println("You entered a string. Please enter an int 0-100:");
            count--; //if string is entered, counter decrements
            scan.next(); //to erase previous input
            }
        }
        //display sorted grades
        System.out.print("The grades, sorted, are: ");
        for (int count2=0; count2<15; count2++){ //display array elements
        System.out.print(array[count2]+" ");
        }
        
        System.out.print("\n");
        System.out.println("Enter a grade 0-100 to search for: ");
        
        int input2=scan.nextInt();
        
        String result=binarySearch(array, input2);
        System.out.println(result);
        
        //print out the scrambled numbers
        String print="Scrambled:";
        int[]arrayScrambled=scramble(array);
        print+=listArray(arrayScrambled);
        System.out.println(print);
        
        System.out.println("Enter a grade to search for: ");
        int iteration2=0;
        if (scan.hasNextInt()){
        int input3=scan.nextInt();
        int i=0;
            while (input3!=arrayScrambled[i]&&(i<15)){
                iteration2++;
                i++;
                
                if (input3==arrayScrambled[i]){
                System.out.println(input3+ " was found in the list with "+iteration2+" iterations.");
                return;
                }
            }
            System.out.println(input3+ " was not found in the list with.");
            return;
        }
        
    }//end of main method
    
    
    public static int[] scramble(int[] array){
        Random randomGenerator=new Random();
        for (int count=0; count<15; count++){
            
        int random = randomGenerator.nextInt((14)+1); //a random # is generated
        int num= random; 
        int temp=array[count]; //temp is a place holder to hold array[count]
        array[count]=array[num]; //an element in a random position of array is put into the array
        array[num]=temp; //temp puts the element back into array [num];
        }
        return array;
    }// end of scramble method
    
    
    
    public static String listArray(int num[]){ //method to display array Elements
    String out="";
    for(int j=0;j<num.length;j++){
        if(j>0){
         out+=", ";
        }
        out+=num[j];
        }
        out+=" ";
        return out;
    }//end of listArray method
    
    
    
    public static String binarySearch(int[]array, int input){//binarySearch method
        int low =0;
        int high=array.length-1;
        int mid=(high+low)/2;
        int iteration=0;
        String notFound= "";
            
        while ((low<=high)&& (array[mid]!=input)){
            iteration ++;
            if (array[mid]<input){
                low=mid+1; /*if array[]mid<input, then the new low becomes the mid
                +1. This means that all of the numbers that input is greater than 
                will not be searched */
            }
            else{
                high=mid-1;
            }
            mid=(low+high)/2; 
        }
        if (low>high){
        notFound=(input+" was not found with "+iteration+" iterations.");
        }
        else {
        notFound=(input+" was found with "+iteration+" iterations.");
        }
        return notFound;
        }//end of binary search method
        
        
}//end of CSE2Linear class
