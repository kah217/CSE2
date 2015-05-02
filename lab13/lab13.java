/*Karen Huang
Spring 2015 CSE2

lab13 java program:
Write a program that creates a two dimensional ragged array of five rows of ints. The length the 0th row should be 5, the 1th row 8, etc. The jth row should have length equal to j*3+5. Then:
Fill the array with random numbers in the range 0...39.
Display the array.
Sort each row of the array in ascending order.
Display the array.
Convert each member array into a new member array that is the same size as the largest member array, and initialize all new array members to zero.
*/

import java.util.Arrays;

public class lab13{

    public static void main(String[] args) {
        System.out.println("The array before sorting:");
        int[][] array = createArray(); //calls createArray method
        printArray(array); //calls the print array method
        System.out.println("The array after sorting sorting:");
        printArray(sortArray(array)); //prints the array after sorting
        printArray(copyArray(array));//prints the array with the zeros
        
    }//end of main method

    public static int[][] createArray() { //creates and returns an array
        int[][] array = new int[5][];
        for (int i = 0; i < 5; i++) { //loops for the number of rows in an array
            array[i] = new int[(i * 3) + 5];
        }
        for (int[] array1 : array) { //loops for the number of elements per row
            for (int j = 0; j < array1.length; j++) { //sets a number per element
                array1[j] = (int) (Math.random()*39); //random numbers range [0,39]
            }
        }
        return array;
    }//end of createArray method
    

    public static int[][] copyArray(int [][]array) { //creates and returns an array
        int [][]arrayNew = new int[5][17];
        for (int i = 0; i < 5; i++) { //loops for the number of rows in an array
            for(int k=0; k<array[i].length; k++){
                arrayNew[i][k]=array[i][k];
            }
            for (int a=array[i].length; a<17; a++){
                arrayNew[i][a]=0;
            }
        }
     
        return arrayNew;
    }//end of copyArray method
    

    public static void printArray(int[][] array) { //prints array
        for (int[] array1 : array) {
            for (int j = 0; j < array1.length; j++) { 
                System.out.print(array1[j] + ", ");
            }
            System.out.println();
        }
    }//end of printArray method
    
    public static int[][] sortArray(int[][] array){ //sorts array
        for(int i = 0; i<5;i++){ //i is the index for row #
            Arrays.sort(array[i]); //goes through each row and sorts
        }
        return array;
        
    }//end of sortArray method

}//end of lab13 class
