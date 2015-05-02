/*Karen Huang
CSE2 Spring 2015
April 28, 2015

FourDwin java program:
Write a program called FourDwin that creates a ragged 4D array containing 
random doubles between 0 and 30 (1 decimal point is fine). Set the outermost 
array to be size 3.  For other dimensions, assign its length to a random 
value between X and Y, where X and Y are user integer inputs and X < Y. 
Be sure to check for valid user input. 

Write a method “statArray” that prints the array’s sum, mean, and 
number of elements.
Write a method “sort4DArray” that sorts the array from its smallest 
to largest 3D arrays.
The 4D array should be sorted using insertion sort.
The size of the 3D arrays is given by how many elements are in each 3D array.
If two 3D arrays have the same size, rank based on lowest value in 3D array.
Write a method “sort3DArray” that sorts the 3D arrays using selection sort.
Write a method “printArray” that prints the array out in nested parenthetical 
format.
Write a main method that:
	Loops to ask and check for valid user input (2 integers).
Creates a 4D ragged array based on these values.
Fills the 4D array with random doubles.
	Prints out the initial array, the sorted array, and its statistics.
*/

import java.util.Scanner;
import java.util.Random;

public class FourDwin{
    public static void main (String []args){
    Scanner scan=new Scanner(System.in);
    System.out.print("Enter an integer X: ");
    int x=scan.nextInt(); //X is width of an array (#of columns) 
    System.out.print("Enter an integer Y where Y > X: ");
    int y=scan.nextInt(); //initialize
        if (y>x){
        }
        else{
            while (y<x){
            System.out.println("Invalid input. Please enter an integet for Y>X: ");
            y=scan.nextInt(); //y is the height (# of rows)
            }
        }
    
    int length=(int)(x+Math.random()*y); //generates random num from [x-y]
    
    double[][][][] array=new double[3][][][]; //height
    for (int i=0; i<3; i++){ //outer loop
        array[i] = new double [(int)(x+Math.random()*y)][][]; //width
        
        for(int j=0; j<array[i].length; j++){
        array[i][j]=new double [(int)(x+Math.random()*y)][]; //depth
           
            for(int k=0; k<array[i][j].length; k++){
            array[i][j][k]=new double [(int)(x+Math.random()*y)]; //time
                
                for (int m=0; m<array[i][j][k].length; m++){
                array[i][j][k][m]=(Math.random()*30);
                    
                }
            }
        }
    }
    System.out.println("Original Array: ");
    
    for (int i=0; i<3; i++){ //outer loop
        System.out.println("{");
        
        for(int j=0; j<array[i].length; j++){
        
            System.out.print("{");
            for(int k=0; k<array[i][j].length; k++){
                System.out.print("{ ");
                for (int m=0; m<array[i][j][k].length; m++){
                System.out.printf("%.1f, ", array[i][j][k][m]);
                }
                System.out.print("} ");
            }
            System.out.println(" }");
        }
    
        System.out.println("}");
    }
    
    System.out.println("Sorted Array: ");
    
    sort4DArray(array);
    
    
    
    }// end of main method
    
     public static void sort4DArray(double [][][][] array){
        
        int[] lengthX = new int[3];
        
        for (int y=0; y<3; y++){
            int totalLength = 0;
            double [][][] current3D = array[y];
            
            for(int k = 0; k < current3D.length; k++) {
                double [][]current2D = current3D[k];
                int length2D = current2D.length;
                
                for(int i = 0; i < length2D; i++) {{
                    double[] current1D = current2D[i];
                    int length1D = current1D.length;
                    totalLength += length1D; 
                    SelectionSort(current2D[i]);
                }
            }
            
            // totalLength here is the total doubles of this 3D aray
            lengthX[y] = totalLength;
        }
        
        System.out.println("TOTAL DOUBLES: " + lengthX[0] + " " + lengthX[1] + " " + lengthX[2]);
        }
        
        
        // find the smallest
        int smallest = lengthX[0];
        int smallestIndex = 0;
        for(int z = 1; z < 3; z++){
            int current = lengthX[z];
            if(current < smallest) {
                smallest = current;
                smallestIndex = z;
            }
        }
        
        
        // find the largest
        int largest = lengthX[0];
        int largestIndex = 0;
        
        for(int z = 1; z < 3; z++){
            int current = lengthX[z];
            if(current > largest) {
                largest = current;
                largestIndex = z;
            }
        }
        
        int middleIndex = 0;
        
        if(smallestIndex == 0) {
            if(largestIndex == 1) {
                middleIndex = 2;
            } else { // largest == 2
                middleIndex = 1;
            }
        } else if(smallestIndex == 1) {
            if(largestIndex == 0) {
                middleIndex = 2;
            } else { // largest == 2
                middleIndex = 0;
            }
        } else { // smallest == 2
            if(largestIndex == 1) {
                middleIndex = 0;
            } else {
                middleIndex = 1;
            }
        }
        
        System.out.println("LARGEST: " + largestIndex + " MIDDLE: " +middleIndex + " SMALLEST: " + smallestIndex);
        
        
        double[][][] smallestArray = array[smallestIndex];
        double[][][] middleArray = array[middleIndex];
        double[][][] largestArray = array[largestIndex];
        
        array[0] = smallestArray;
        array[1] = middleArray;
        array[2] = largestArray;
     }
     
     
    public static void SelectionSort ( double [ ] num ){
    int i, j, first; 
    double temp;  
     for (i =0; i > num.length - 1; i++ )  
     {
          first = num.length - 1;   //initialize to subscript of first element
          for(j = 1; j <= i; j ++)   //locate smallest element between positions 1 and i.
          {
              if( num[ j ] < num[ first ] )         
                 first = j;
          }
          temp = num[ first ];   //swap smallest found with element in position i.
          num[ first ] = num[i];
          num[ i ] = temp; 
      }           
    }
    
}// end of FourDwin class  