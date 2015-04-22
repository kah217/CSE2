/*Karen Huang
CSE2 Spring 2015
April 19, 2015

Multiply.java program: Implement matrix multiplication on random matrices.  
*/
import java.util.Random;
import java.util.Scanner;

public class Multiply{

    public static void main (String []args){
    Scanner scan=new Scanner(System.in); //create scanner
    
    int width=-1; //set to -1 so that the following while loop runs
    int height=0;
    int width2=0;
    int height2=0;
    
    while(width!=height2){ /*if width does not equal height of array2, 
        then the loop runs again until user puts that in. This is to check
        for whether the matrices will be compatible*/
        while (height<=0){ //asks user for an int until one is put into it
        System.out.print("Enter a height for array1: ");
        height=checkInt(scan); //checks whether the input is an integer
        }
        
        while (width<=0){ //asks user for an int until one is put into it
        System.out.print("Enter a width for array1: ");
        width = checkInt(scan);
        }

        while (height2<=0){
        System.out.print("Enter a height for array2: ");
        height2=checkInt(scan);
        }
        
        while (width2<=0){
        System.out.print("Enter a width for array2: ");
        width2=checkInt(scan);
        }
        
        if (width!=height2){
            System.out.println("Error! Dimensions of matrices not compatible. Try again.");
            width=-1; //variables are put here again to reset values
            height=0;
            width2=0;
            height2=0;
        }
    }
    int array1[][]= randomMatrix(height, width); //calls randomMatric method
    int array2[][]= randomMatrix(height2, width2);
    int product[][]=matrixMultiply(array1, array2, height, width2);//calls matrixMultiply method
    
    printArray(product); //calls the printArray method
    }//end of main method
    
    
    
    //generates random numbers for an array [-10,10]
    public static int[][] randomMatrix(int height, int width){ 
        int array1[][]= new int[height][width];
        for (int i=0; i<height; i++){ //goes through the row#
            for (int j=0; j<width; j++){ //inputs the elements next by incrementing columns
            array1[i][j]=(int) (-10+Math.random()*20); //random# generator
            }
        }
        return array1;
    }//end of randomMatrix method
    
    
    
    //multiplies two arrays 
    public static int[][] matrixMultiply(int[][] array1, int[][] array2, int height, int width) {
        int[][] product = new int[height][width]; //declare and initialize an array
        for (int i = 0; i < array1.length; i++) {
            for (int j = 0; j < array2[i].length; j++) {
                int prod = 0;
                for (int k = 0; k < array1.length; k++) {
                    prod = prod + array1[i][k] * array2[k][j];
                }
                product[i][j] = prod; //inputs elements for new array
            }
        }
        return product;
    }//end of matrixMultiply method
    
    
    
    //prints array
    public static void printArray(int[][] array){
        System.out.println(" ");
        System.out.println("Row Major Representation:");
     
        for (int i=0; i<array.length; i++){
            for (int j=0; j<array[i].length; j++){
            System.out.print(array[i][j]+" ");
            }
        System.out.println();
        }
        System.out.println(" ");
        System.out.println("Column Major Representation:");
   
        for (int i=0; i<array[1].length; i++){
            for (int j=0; j<array.length; j++){
            System.out.print(array[j][i]+" ");
            }
            
        System.out.println();
        }
    }
    
    
    
    //checks whether an input is an integer
    public static int checkInt (Scanner scan){
        int width=0;
        if (scan.hasNextInt()){
            width=scan.nextInt();
            return width;
        }
        else {
            scan.next();
            return 0;
        }
    }
    
    
    
}//end of public class Multiply
