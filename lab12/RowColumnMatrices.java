/*Karen Huang
CSE2 Spring 2015
April 17, 2015

RowColumnMatrices java program:
Print out and operate on row- and column- major matrices represented 
by two dimensional arrays.
*/

import java.util.Scanner;
public class RowColumnMatrices{
    
    
    
    public static void main (String []args){
    Scanner scan=new Scanner(System.in);
    System.out.print("Enter a width:");
    int width=scan.nextInt();
    System.out.print("Enter a height:");
    int height=scan.nextInt();
    System.out.println("Is this in row major representation? Type 'true' or 'false': ");
    boolean confirmation=scan.nextBoolean();
    
    int[][] matrix=new int[width][height];
    matrix= increasingMatrix(width, height, confirmation);
    
    
    }//end of main method
    
    
    
    public static int[][] increasingMatrix(int width,int height,boolean format){
        int array[][]=new int[width][height];
        int num=1;
        if (format=true){//matrix to be generated in row-major representation
            for (int a=0; a<width; a++){
                for (int j=0; j<array[a].length; j++){
                    for (num=1; num<(width*height+1); num++){
                    array[a][j]=num;
                    }
                }
            }
        }
        return array;
    }//end of increasingMatrix method
    
    
    
    public static void printMatrix(int [][] array, boolean format){
        if (format=true){
        for (int a=0; a<array.length; a++){
                for (int j=0; j<array[a].length; j++){
                    for (int num=1; num<(array.length*array[a].length); num++){
                    array[a][j]=num;
                    System.out.println(array[j] +", ");
                    }
                }
            }    
        }
    }//end of printMatric method
    
    
    
}//end of RowColumnMatrices class