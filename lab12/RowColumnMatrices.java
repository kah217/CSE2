/*Karen Huang
 CSE2 Spring 2015
 April 17, 2015

 RowColumnMatrices java program:
 Print out and operate on row- and column- major matrices represented 
 by two dimensional arrays.
 */

import java.util.Scanner;

public class RowColumnMatrices {

    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);

        int width = (int) (2 + Math.random() * 5); //random number from 2-5
        int height = (int) (2 + Math.random() * 5);

        int[][] matrix = increasingMatrix(width, height, true); //row representation
        int[][] matrix2 = increasingMatrix(width, height, false); //column representation

        width = (int) (2 + Math.random() * 5); /* initialize different width and 
        height than matrix1 and matrix 2 which have the same widths and heights*/
        height = (int) (2 + Math.random() * 5);
        int[][] matrix3 = increasingMatrix(width, height, true); 
        
        System.out.println("Matrix 1:");
        printMatrix(matrix, true);
        System.out.println();
        System.out.println("Matrix 2:");
        printMatrix(matrix2, true);
        System.out.println();
        System.out.println("Matrix 3:");
        printMatrix(matrix3, true);
        System.out.println();
        System.out.println("Sum of matrix 1 and 2:");
        printMatrix(addMatrix(matrix, true, matrix2, false), true);
        System.out.println();
        System.out.println("Sum of matrix 1 and 3:");
        printMatrix(addMatrix(matrix, true, matrix3, true), true);
    }//end of main method


    //adds matrices
    public static int[][] addMatrix(int[][] matrix1, boolean confirmation1, int[][] matrix2, boolean confirmation2) {
        if (matrix1.length == matrix2.length & matrix1[0].length == matrix2[0].length) {

            for (int a = 0; a < matrix1.length; a++) {
                for (int j = 0; j < matrix1[a].length; j++) {
                    matrix1[a][j] = matrix1[a][j] + matrix2[a][j];
                }
            }
            return matrix1;


        } else {
            System.out.println("Matricies can not be added!");
            matrix1 = null;
            return matrix1;
        }
    }//end of addMatric method



    public static int[][] translate(int[][] array) {
        int[][] array2 = new int[array[0].length][array.length];
        for (int a = 0; a < array.length; a++) {
            for (int j = 0; j < array[a].length; j++) {
                array2[j][a] = array[a][j];
            }
        }
        return array2;
    }//end of translate method
    
    

    public static int[][] increasingMatrix(int width, int height, boolean format) {
        int array[][] = new int[width][height];
        int num = 1;
        if (format = true) {//matrix to be generated in row-major representation
            for (int a = 0; a < width; a++) {
                for (int j = 0; j < height; j++) {
                    array[a][j] = num;
                    num++;
                }
            }
        }
        return array;
    }//end of increasingMatrix method
    
    

    public static void printMatrix(int[][] array, boolean format) { //prints matrices
        if (array != null) {
            if (format = true) {
                for (int[] array1 : array) {
                    for (int j = 0; j < array1.length; j++) {
                        System.out.print(array1[j] + ", ");
                    }
                    System.out.println();
                }
            } else {
                for (int a = 0; a < array.length; a++) {
                    for (int j = 0; j < array[a].length; j++) {
                        System.out.println(array[j][a] + ", ");
                    }
                    System.out.println();
                }
            }

        }
    }//end of printMatric method
    
    
    
}//end of RowColumnMatrices class

