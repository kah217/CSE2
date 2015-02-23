/*
Karen Huang
CSE 2 Spring 2015
February 21, 2015

ToHex Java program
Goal: take decimal RGB values and convert them to hexadecimal.
*/

import java.util.Scanner;

public class ToHex {
    //main method needed for every java program
    public static void main (String [] arg){
    
    
    //declare instance of scanner to accept user input
    Scanner myScanner;
    myScanner = new Scanner (System.in); //call scanner constructor
    
    //declare integers of input from users.
    int amount=0; 
    int amount2=0;
    int amount3=0;
    
    int whole; //1st number/letter of the red hexidecimal
    char red = '\0';
    int remainder; //2nd number/letter of the red hexidecimal
    char red2 = '\0';
    
    int whole2; //1st number/letter of the green hexidecimal
    char green = '\0';
    int remainder2; //2nd number/letter of the green hexidecimal
    char green2 = '0';
    
    int whole3; //1st number/letter of the blue hexidecimal
    char blue ='\0';
    int remainder3; //2nd number/letter of the blue hexidecimal
    char blue2 ='\0';
    
    System.out.println ("Please enter three numbers representing RGB values:");
    
        if (myScanner.hasNextInt()) {
        amount = myScanner.nextInt(); //accept input from user
        remainder = amount%16; /*conversion to hex. */
        whole = amount/16;
                if (amount>255 || amount<0) {
                System.out.println ("Sorry, you must enter values between 0-255");
                return;
                }
                if (whole > 9) {
                switch (whole) {
                case 10:
                    red = 'A'; //if input is 10, the letter is A
                    break;
                case 11:
                    red = 'B';
                    break;
                case 12:
                    red = 'C';
                    break;
                case 13:
                    red = 'D';
                    break;
                case 14:
                    red = 'D';
                    break;
                case 15:
                   red = 'F';
                    break;
                } 
                }
                else {
                    red = Integer.toString(whole).charAt(0); /*converts integer
                    to a string if input is less than 9. This will be easier to display.
                    */
                }
                
                if (remainder > 9) {
                switch (remainder) {
                case 10:
                    red2 = 'A';
                    break;
                case 11:
                    red2 = 'B';
                    break;
                case 12:
                    red2 = 'C';
                    break;
                case 13:
                    red2 = 'D';
                    break;
                case 14:
                    red2 = 'D';
                    break;
                case 15:
                    red2 = 'F';
                    break;
                }
                }
                 else {
                    red2 = Integer.toString(remainder).charAt(0);
                }
        }
        
        else {
        System.out.println ("Sorry, your input must consist of integers.");
        return;
        }
        
        if (myScanner.hasNextInt()) {
        amount3=myScanner.nextInt();
        remainder3= amount3%16;
        whole3 =amount3/16;
            if (amount3>255 || amount3<0) {
            System.out.println ("Sorry, you must enter values between 0-255.");
            return;
            }
                if (whole3 > 9) {
                switch (whole3) {
                case 10:
                    green = 'A';
                    break;
                case 11:
                    green = 'B';
                    break;
                case 12:
                    green = 'C';
                    break;
                case 13:
                    green = 'D';
                    break;
                case 14:
                    green = 'D';
                    break;
                case 15:
                    green = 'F';
                    break;
                }
                }
                else {
                    green = Integer.toString(whole3).charAt(0);
                }
        
                if (remainder3 > 9) {
                switch (remainder3) {
                case 10:
                    green2 = 'A';
                    break;
                case 11:
                    green2 = 'B';
                    break;
                case 12:
                    green2 = 'C';
                    break;
                case 13:
                    green2 = 'D';
                    break;
                case 14:
                    green2 = 'D';
                    break;
                case 15:
                    green2 = 'F';
                    break;
                }
                }
                 else {
                    green2 = Integer.toString(remainder3).charAt(0);
                }
        }
        else {
        System.out.println ("Sorry, your input must consist of integers.");
        return;
        }
        
        if (myScanner.hasNextInt()) {
        amount2=myScanner.nextInt();
        remainder2 =amount2%16;
        whole2 =amount2/16;
            if (amount2>255 || amount2<0) {
            System.out.println ("Sorry, you must enter values between 0-255.");
            return;
            }
                if (whole2 > 9) {
                switch (whole2) {
                case 10:
                    blue = 'A';
                    break;
                case 11:
                    blue = 'B';
                    break;
                case 12:
                    blue = 'C';
                    break;
                case 13:
                    blue = 'D';
                    break;
                case 14:
                    blue = 'D';
                    break;
                case 15:
                    blue = 'F';
                    break;
                }
                }
                else {
                    blue = Integer.toString(whole2).charAt(0);
                }
        
                if (remainder2 > 9) {
                switch (remainder2) {
                case 10:
                    blue2 = 'A';
                    break;
                case 11:
                    blue2 = 'B';
                    break;
                case 12:
                    blue2 = 'C';
                    break;
                case 13:
                    blue2 = 'D';
                    break;
                case 14:
                    blue2 = 'D';
                    break;
                case 15:
                    blue2 = 'F';
                    break;
                }
                }
                else {
                    blue2 = Integer.toString(remainder2).charAt(0);
                }
        }
        else {
        System.out.println ("Sorry, your input must consist of integers.");
        return;
        }
           
    System.out.println (red + "" + red2 + " " + green+ green2 + " " + blue + blue2);
    }//end of main method
}//end of class