/*Karen Huang
Spring 2015 CSE2
March 19, 2015

HW8-GAME
To create a game using methods:

public static String getInput(Scanner scan, String string), this function 
takes in a scanner and a string “Cc”. It is used to continue the game. If
the user enter ‘C’ or ‘c’, the game continue. 
ANY OTHER KEY results in “Yea right LOSER!” and quit the game.

public static String getInput(Scanner scan, String string, int trial), 
the most complicated method in this program. It takes in a string “AaEe”, 
and a counter trial:
    a.  If the user enter ‘A’ or ‘a’, it means attack, trial is used to 
        record the number of critical hit. You may either give a critical hit 
        or miss! This is determined by a random number that either yields 0 or 1. 
        When you have 10 critical hits, you kill the GIANT and get to move on. 
    b.  If the user enter ‘E’ or ‘e’, it means escape. Everytime the user 
        tries to escape, a random number from 1-10 is generated, if the number 
        equals 10, the program will report that the user escaped successfully. 
        Otherwise, the user faces the “AaEe” option again.

Any key other than ‘A’ ‘a’ ‘E’ ‘e’ should generate the output 
“Executed by the GIANT! Game Over! ”

public static String getInput(Scanner scan), the user chooses to open
a treasury box from 1 of the 3. Use SWITCH statement to assign rewards 
and set default case as A Wrong Number! You get nothing! Better restart 
the game LOL” Make sure you print out what the reward is.*/

import java.util.Scanner;

public class HW8 {

     public static void main(String[] args) {
        char option;
        Scanner scan;
        scan = new Scanner(System.in);
        
        System.out.println("Welcome to MG's adventure world. Now your journey begins. Good luck!");
        System.out.println("Please hit 'C' or 'c' to continue, anything else to quit-");
        String input = getInput(scan, "Cc");
        System.out.println("You are in a dead valley.");
        System.out.println("Please hit 'C' or 'c' to continue, anything else to quit-");
        input = getInput(scan, "Cc");
        System.out.println("You walked and walked and walked and you saw a cave!");
        cave();
        System.out.println("Please hit 'C' or 'c' to continue, anything else to quit-");
        input = getInput(scan, "Cc");
        System.out.println("You entered a cave!");
        System.out.println("Please hit 'C' or 'c' to continue, anything else to quit-");
        input = getInput(scan, "Cc");
        System.out.println("Unfortunately, you ran into a GIANT!");
        giant();
        System.out.println("Enter 'A' or 'a' to Attack, 'E' or 'E' to Escape, ANYTHING else is to YIELD");
        input = getInput(scan, "AaEe", 10);
        System.out.println("Congratulations! You SURVIVED! Get your REWARD!");
        System.out.println("There are three 3 treasure boxes in front of you! Enter the box number you want to open!");
        box();
        input = getInput(scan);
        System.out.println("Hero! Have a good day!");
    }//end of main method
    
    
    
    public static String getInput(Scanner scan, String string){
        String input=scan.nextLine();
        if ((!input.equals("c")) && (!input.equals("C"))){
        System.out.println("Yea right LOSER!");
        System.exit(0);
        }
        else {}
        return string;
    } //end of getInput Cc
    
    
    
    public static String getInput(Scanner scan, String string, int trial){
        
        for (trial=0; trial <10; trial ++){
            String input=scan.nextLine();
            
            if (trial==9){
            System.out.println ("Critical hit!");
            return input;
            }
            if ((input.equals("A"))||(input.equals("a"))||(input.equals("E"))||(input.equals("e"))){
                if ((input.equals("A"))||(input.equals("a"))){
                    double gen = (Math.random()*2);
                    int gen2 =(int)gen;
                    if (gen2!=0){
                    System.out.println("Gosh! How can you miss it?");
                    System.out.println("Enter 'A' or 'a' to Attack, 'E' or 'E' to Escape, ANYTHING else is to YIELD");
                    trial --;
                    } 
                    else {
                    System.out.println ("Critical hit!");
                    System.out.println ("Enter 'A' or 'a' to Attack, 'E' or 'E' to Escape, ANYTHING else is to YIELD");
                    }
                    }
                    else if ((input.equals("E"))||(input.equals("e"))){
                    double gen3=(Math.random()*10)+1;
                    int gen4=(int)gen3;
                    if (gen4!=10){
                    System.out.println("Oh no! You didn't escape successfully.");
                    System.out.println("Enter 'A' or 'a' to Attack, 'E' or 'E' to Escape, ANYTHING else is to YIELD");
                    }
                    else {
                    System.out.println("Yay! You've escaped successfully.");
                    return input;
                    } //returns back to the AaEe choice
                    }
            }
            else {
                System.out.println("Executed by the GIANT! Game Over!");
                System.exit (0);
            }
        }
        return string;
    }//end of getInput method AaEe
    
    
    
    public static String getInput (Scanner scan){
        String delete="";
        while(scan.hasNextInt() || scan.hasNext()){
            if (scan.hasNextInt()){
                int number=scan.nextInt();
                switch (number){
                    case 1:
                    System.out.println("It is a giant Bar of GOLD!");
                    return delete;
        
                    
                    case 2:
                    System.out.println("Is is a Unicorn!");
                    return delete;
                    
                    case 3:
                    System.out.println("Is is the Elixir of Life!");
                    return delete;
                    
                    default: 
                    System.out.println("A wrong number! You get nothing! Better restart the game. LOL!");
                    System.exit(0);
                }
            }
            else {
                System.out.println("A wrong number! You get nothing! Better restart the game. LOL!");
                System.exit(0);
            }
        
        }
        return delete;
    }//end of getInput method switch
    
    
    public static void giant() {
        System.out.println("                                 ---------                    ");
        System.out.println("                                |  /    \\|                   ");
        System.out.println("                      ZZZZZH    |    O    |    HZZZZZ             ");
        System.out.println("                           H     -----------   H              ");
        System.out.println("                      ZZZZZHHHHHHHHHHHHHHHHHHHHHZZZZZ                   ");
        System.out.println("                           H    HHHHHHHHHHH    H                      ");
        System.out.println("                      ZZZZZH    HHHHHHHHHHH    HZZZZZ               ");
        System.out.println("                                HHHHHHHHHHH                   ");
        System.out.println("                                HHH     HHH                   ");
        System.out.println("                               HHH       HHH                   ");
    }//end of giant method



    public static void cave() {
        System.out.println("                              *****   * * * * * * * *        ");
        System.out.println("                         ***         ***                      ");
        System.out.println("                      ***               ***                   ");
        System.out.println("                 |    ***               ***                   ");
        System.out.println("                 |    ***               ***                   ");
        System.out.println("             O __|__  ***               ***                   ");
        System.out.println("           ******l    ***               ***                   ");
        System.out.println("            * *       ***               ***                   ");
        System.out.println("           *   *      ********************* * * * * * *       ");
    }//end of cave method
    
    
    
    public static void box(){
       System.out.println("                      *********************     *********************    *********************             ");
        System.out.println("                     ***               ***     ***               ***    ***               ***              ");
        System.out.println("                     ***       1       ***     ***       2       ***    ***       3       ***              ");
        System.out.println("                     ***               ***     ***               ***    ***               ***              ");
        System.out.println("                     *********************     *********************    *********************               "); 
    }//end of box method


   
    
}//end of HW8 class