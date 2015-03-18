/*Karen Huang
CSE 2 Spring 2015
February 26, 2015

Smile Generator Java program:
Goal: Print :) using loops
*/

public class SmileGenerator {
    public static void main (String [] args){
    
    int count=0;
    int count1=0;
    int count2=0;
    
    int count3=0;
    int count4=0;
    int count5=0;
    
//for loop
    System.out.println ("The for loop");
    for (count2=0; count2<5; count2++) {
        System.out.println (":)");
    }
    
//while loop  
    System.out.println ("The while loop");
    while (count <5) {
        System.out.println(":)");
        count ++;
    }
    
//do-while loop
    System.out.println ("The do-while loop");
    do {
        System.out.println(":)");
        count1 ++;
    } while (count1 <5);
        

//(Step 2) Generate :) on one line
    System.out.println("All on one line");
    double gen = Math.random()*101;
    int gen2 = (int)gen;
    System.out.println(gen2);
    while (count3<gen2) {
        System.out.print(":) ");
        count3++;
    }
    
//(Step 3) 
    System.out.println("All on one line");
    gen = Math.random()*101;
    gen2 = (int)gen;
    System.out.println(gen2);
    while (count4<gen2) {
        if (count4%30==0)
        System.out.println ();
        System.out.print(":) ");
        count4++;
    }
    
//Step 4)
    System.out.println("All on one line");
    gen = Math.random()*101;
    gen2 = (int)gen;
    int count6=0;
    System.out.println(gen2);
    while (count5<gen2) {
        if (count5%30==0)
        System.out.println ();
        int i=0;
        for (i=0; i<count6; i++) {
            if ((count5+i)>gen2)
            break;
            System.out.print(":) ");
        }
        System.out.println("p");
        count6++;
        count5+=i;
    }
    
    }//end of main method
}//end of class