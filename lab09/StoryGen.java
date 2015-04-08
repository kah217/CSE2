/*Karen Huang
CSE2
Spring 2015

StoryGen java program
Goal: generate some basic random sentences.
*/

import java.util.Random;
import java.util.Scanner;
public class StoryGen {

    public static void main (String [] args){
    String word ="string";
    System.out.println("Let's create some sentences! Here's the first one:");
    System.out.println("");
    System.out.println("The "+adjectives(word)+", "+adjectives(word)+" "+nonPrimaryNounsSubject(word)+" "+pastTenseVerbs(word)+" "+"the "+adjectives(word)+" "+nonPrimaryNounsObject(word)+".");
    System.out.print("Would you like another? If yes, type 'Yes' or 'yes' if no, type anything: ");
    
    Scanner scan=new Scanner (System.in);
        while (scan.hasNext()){
        String input=scan.next();
            if (input.equals("yes") || input.equals ("Yes")){
        
        System.out.println("The "+adjectives(word)+", "+adjectives(word)+" "+nonPrimaryNounsSubject(word)+" "+pastTenseVerbs(word)+" "+"the "+adjectives(word)+" "+nonPrimaryNounsObject(word)+".");
        System.out.print("Would you like another? If yes, type 'Yes' or 'yes' if no, type anything: ");

            }
            else {
            System.out.println ("You didn't type 'yes' or 'Yes' so bye bye.");    
            return;
            }
        }
    }//end of main method
    
    
    
    public static String adjectives (String word){
    Random randomGenerator =new Random();
    int random = randomGenerator.nextInt(10); 
    double randNum = (Math.random()*10);
    int num= (int) randNum;
    String adjective ="adjective";

    switch (num) {
        case 0:
        adjective = "red";
        return adjective;
  
        
        case 1:
        adjective ="big";
        return adjective;
   
        case 2:
        adjective="pretty";
        return adjective;
  
        case 3:
        adjective="spiky";
        return adjective;

        case 4:
        adjective="funny";
        return adjective;
        
        case 5:
        adjective="high";
        return adjective;
        
        case 6:
        adjective="black";
        return adjective;
        
        case 7:
        adjective="greasy";
        return adjective;
        
        case 8:
        adjective="glossy";
        return adjective;

        case 9:
        adjective="hard";
        return adjective;
    }
    return adjective;
    }//end of adjectives method
    
    
    
    public static String nonPrimaryNounsSubject(String word){
    Random randomGenerator =new Random();
    double randNum = (Math.random()*10);
    int num= (int) randNum;
    String nonPrimaryNounsSubject ="nonPrimaryNounsSubject";

    switch (num) {
        case 0:
        nonPrimaryNounsSubject = "algebra";
        return nonPrimaryNounsSubject;
        
        case 1:
        nonPrimaryNounsSubject ="topic";
        return nonPrimaryNounsSubject;
        
        case 2:
        nonPrimaryNounsSubject="biology";
        return nonPrimaryNounsSubject;
        
        case 3:
        nonPrimaryNounsSubject="book";
        return nonPrimaryNounsSubject;
        
        case 4:
        nonPrimaryNounsSubject="council";
        return nonPrimaryNounsSubject;
        
        case 5:
        nonPrimaryNounsSubject="professor";
        return nonPrimaryNounsSubject;
        
        case 6:
        nonPrimaryNounsSubject="computer";
        return nonPrimaryNounsSubject;
        
        case 7:
        nonPrimaryNounsSubject="analogy";
        return nonPrimaryNounsSubject;
  
        case 8:
        nonPrimaryNounsSubject="phone";
        return nonPrimaryNounsSubject;
        
        case 9:
        nonPrimaryNounsSubject="water";
        return nonPrimaryNounsSubject;
    }
    return nonPrimaryNounsSubject;
    }//end of nonPrimaryNounsSubject method
    
    
    
    public static String pastTenseVerbs(String word){
    Random randomGenerator =new Random();
    double randNum = (Math.random()*10);
    int num= (int) randNum;
    String pastTenseVerbs ="non-primary nouns";

    switch (num) {
        case 0:
        pastTenseVerbs = "called";
        return pastTenseVerbs;
        
        case 1:
        pastTenseVerbs ="loved";
        return pastTenseVerbs;
        
        case 2:
        pastTenseVerbs="played";
        return pastTenseVerbs;
        
        case 3:
        pastTenseVerbs="hunted";
        return pastTenseVerbs;
        
        case 4:
        pastTenseVerbs="ticked";
        return pastTenseVerbs;
        
        case 5:
        pastTenseVerbs="drew";
        return pastTenseVerbs;
        
        case 6:
        pastTenseVerbs="marked";
        return pastTenseVerbs;
        
        case 7:
        pastTenseVerbs="tossed";
        return pastTenseVerbs;
        
        case 8:
        pastTenseVerbs="destroyed";
        return pastTenseVerbs;
        
        case 9:
        pastTenseVerbs="found";
        return pastTenseVerbs;
    }
    return pastTenseVerbs;
    }//end of past-tense verbs
    
    
    
    public static String nonPrimaryNounsObject(String word){
    Random randomGenerator =new Random();
    double randNum = (Math.random()*10);
    int num= (int) randNum;
    String nonPrimaryNounsObject="nonPrimaryNounsObject";

    switch (num) {
        case 0:
        nonPrimaryNounsObject = "table";
        return nonPrimaryNounsObject;
        
        case 1:
        nonPrimaryNounsObject ="apple";
        return nonPrimaryNounsObject;
        
        case 2:
        nonPrimaryNounsObject="platypus";
        return nonPrimaryNounsObject;
        
        case 3:
        nonPrimaryNounsObject="egg";
        return nonPrimaryNounsObject;
        
        case 4:
        nonPrimaryNounsObject="stool";
        return nonPrimaryNounsObject;
        
        case 5:
        nonPrimaryNounsObject="ointment";
        return nonPrimaryNounsObject;
        
        case 6:
        nonPrimaryNounsObject="kitchen";
        return nonPrimaryNounsObject;
        
        case 7:
        nonPrimaryNounsObject="screen";
        return nonPrimaryNounsObject;
        
        case 8:
        nonPrimaryNounsObject="closet";
        return nonPrimaryNounsObject;
        
        case 9:
        nonPrimaryNounsObject="face";
        return nonPrimaryNounsObject;
    }  
    return nonPrimaryNounsObject;
    }//end of nonPrimaryNounsObject method
    
    
    
}//end of StoryGen class