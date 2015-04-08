/*Karen Huang
CSE 2 Spring 2015
April 6, 2015

RemoveElements java program:
The randomInput() method generates an array of 10 random integers between 
0 to 9. Implement randomInput so that it fills the array with random 
integers and returns the filled array. 

The method delete(list,pos) takes, as input, an integer array called list 
and an integer called pos.  It should create a new array that has one member 
fewer than list, and be composed of all of the same members except the member 
in the position pos.  

*/
import java.util.Random;
import java.util.Scanner;
public class RemoveElements{
    
  public static void main(String [] arg){
	Scanner scan=new Scanner(System.in);
    int num[]=new int[10];
    int newArray1[];
    int newArray2[];
    int index,target;
	String answer="";
	
	do{
  	System.out.print("Random input 10 ints [0-9]");
  	num = randomInput();
  	String out = "The original array is:";
  	out += listArray(num);
  	System.out.println(out);
 
  	System.out.print("Enter the index ");
  	index = scan.nextInt();
  	    if ((index>-1) && (index <10)){
  	        System.out.println("Index "+index+" element is removed.");
  	        newArray1 = delete(num,index);
  	        String out1="The output array is ";
  	        out1+=listArray(newArray1); //return a string of the form "{2, 3, -9}"  
  	        System.out.println(out1);
  	    }
  	    else{
  	        System.out.println("The index is not valid");
  	        String out1="The output array is ";
  	        out1+=listArray(num); //return a string of the form "{2, 3, -9}"  
  	        System.out.println(out1);
  	    }
 
    System.out.print("Enter the target value ");
  	target = scan.nextInt();
  	newArray2 = remove(num,target); //calls remove method
  	    if ((target>-1) && (target <10)){//if target is [0-9]
  	        String out2="The output array is ";
  	        out2+=listArray(newArray2); //return a string of the form "{2, 3, -9}"  
  	        System.out.println(out2); 
  	    }
  	    else{
  	        System.out.println("Element "+target+" was not found");
          	String out2="The output array is ";
          	out2+=listArray(num); //return a string of the form "{2, 3, -9}"  
          	System.out.println(out2);
  	    }
  	System.out.print("Go again? Enter 'y' or 'Y', anything else to quit-");
  	answer=scan.next();
  	
	}while(answer.equals("Y") || answer.equals("y")); //if 'y' or'Y' is entered, the do-while starts again
    }//end of main method
  
  
  
    public static int [] randomInput(){ //generates 10 random numbers
        int num []= new int [10];
        for (int counter = 0; counter < 10; counter++) {
            Random randomGenerator =new Random();
            int random = randomGenerator.nextInt(10); 
            double randNum = (Math.random()*10);
            int rand = (int) randNum;
            num [counter]=rand;
        }
        return num;
    }// end of randonInput method
    
    
 
    public static int [] delete(int[]list, int pos){ //deletes an element from an array based on user input
        //pos has to be between 0 and 9
        int [] newList=new int [list.length-1];
        
        for (int counter=0; counter<list.length-1; counter ++){
            newList[counter]+=list[counter];
            if (counter==pos){
                for (int counter2=pos; counter2<(list.length-1); counter2 ++){
                newList[counter2]=list[counter2+1];
                }
                return newList;
            }    
        }
    return newList;    
    }//end of delete method
    
    
    
    public static int[] remove(int[]list, int target){
        int ct=0; //to keep track of the number of elements that equals target
        
        for (int counter=0; counter<list.length; counter++){
            
            if (list[counter]==target){
                ct++; //increment each time an element=target is detected
                list[counter]=-1; //changes all target found to -1 to "tag" for deletion later
            }
        }
        int[] newList=new int[list.length-ct]; //new size of array is original - #of elements that matches target
        int ct2=0; //to keep track of the size of the new array
        
        for (int counter2=0; counter2<list.length; counter2++){ 
            if (list[counter2]!=-1){ //add elements that aren't -1 to the new array
                newList[ct2]=list[counter2];
                ct2++;
            }
        
        }
    return newList;
    }//end of remove method

    
    
    
    public static String listArray(int num[]){
    	String out="{";
    	for(int j=0;j<num.length;j++){
      	if(j>0){
        	out+=", ";
      	}
      	out+=num[j];
    	}
    	out+="} ";
    	return out;
  }//end of listArray method
  
  
  
}//end of RemoveElements class
