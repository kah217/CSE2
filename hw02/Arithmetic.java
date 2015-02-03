//Karen Huang
//CSE 2 Spring 2015
//February 1, 2015

//Arithmetic Program
//Calculate the cost of items plus 6% tax of items

public class Arithmetic{
    //main method required for every program
    public static void main (String [] args) {

    //input data
        int nSocks=3; //numbers of pairs of socks
        double sockCost$=2.58; //cost per pair of sock ('$' is part of variable name)
        
        int nGlasses=6; //number of drinking glasses
        double glassCost$=2.29; //cost per glass
        
        int nEnvelopes=1; //number of boxes of envelopes
        double envelopeCost$=3.25;//cost per box of envelope
        
        double taxPercent=0.06; //PA tax percent
        
    //output data
        double totalSockCost$; //total cost of socks
        double sockTax$; //sales tax for socks
        
        double totalGlassCost$; //total cost of glasses
        double glassTax$; //sales tax for glasses
        
        double totalEnvelopeCost$; //total cost of boxes of envelopes
        double envelopeTax$; //sales tax for boxes of envelopes
        
        double totalBeforeTax$; //total cost of purchase before taxes
        double totalTax$; //sales tax of total purchase
        double totalAfterTax$; //total cost of purchase plus sales tax
        
    //calculations
        totalSockCost$=nSocks*sockCost$; //total cost of socks before taxes
        sockTax$=totalSockCost$*taxPercent; //tax on socks
        
        totalGlassCost$=nGlasses*glassCost$; //total cost of glasses before taxes
        glassTax$=totalGlassCost$*taxPercent; //tax on glasses
        
        totalEnvelopeCost$=nEnvelopes*envelopeCost$; //total cost of boxes of envelopes before taxes
        envelopeTax$=totalEnvelopeCost$*taxPercent; //tax on boxes of envelopes
        
        totalBeforeTax$=totalSockCost$+totalGlassCost$+totalEnvelopeCost$; //cost of purchase before tax
        totalTax$=totalBeforeTax$*taxPercent; //sales tax of total purchase
        totalAfterTax$=totalBeforeTax$+totalTax$; //total cost of purchase after sales tax
        
    //display output data and adjust decimal places of answer
        double xTotalSockCost=totalSockCost$*100;//answer*100 (moves two decimal places to the right)
        int xxTotalSockCost=(int)xTotalSockCost;//convert to integer (gets rid of decimals)
        double xxxTotalSockCost=((double)xxTotalSockCost)/100;//answer/100 (moves decimal point back two places)
        //Above calculations keeps the answer at two decimal places
        //Same calculations done for each displayed output below
        System.out.println("Total cost of socks: $" + xxxTotalSockCost);
        
        double xSockTax=sockTax$*100;
        int xxSockTax=(int)xSockTax;
        double xxxSockTax=((double)xxSockTax)/100;
        System.out.println("Sales tax of socks: $" + xxxSockTax);
        
        double xTotalGlassCost=totalGlassCost$*100;
        int xxTotalGlassCost=(int)xTotalGlassCost;
        double xxxTotalGlassCost=((double)xxTotalGlassCost)/100;
        System.out.println("Total cost of glasses: $" + xxxTotalGlassCost);
        
        double xGlassTax=glassTax$*100;
        int xxGlassTax= (int)xGlassTax;
        double xxxGlassTax=((double)xxGlassTax)/100;
        System.out.println("Sales tax of glasses: $" + xxxGlassTax);
        
        double xTotalEnvelopeCost = totalEnvelopeCost$ * 100;
        int xxTotalEnvelopeCost = (int)xTotalEnvelopeCost;
        double xxxTotalEnvelopeCost= ((double)xxTotalEnvelopeCost)/100;
        System.out.println("Total cost of boxes of envelopes: $" + xxxTotalEnvelopeCost);
        
        double xEnvelopeTax = envelopeTax$*100;
        int xxEnvelopeTax=(int)xEnvelopeTax;
        double xxxEnvelopeTax = ((double)xxEnvelopeTax)/100;
        System.out.println("Sales tax of boxes of envelopes: $" + xxxEnvelopeTax);
        
        double xTotal = totalBeforeTax$ * 100;
        int xxTotal = (int)xTotal;
        double xxxTotal = ((double)xxTotal)/100;
        System.out.println("Cost of purchase before tax: $" + xxxTotal);
        
        double xTotalTax = totalTax$ * 100;
        int xxTotalTax = (int)xTotalTax;
        double xxxTotalTax = ((double)xxTotalTax)/100;
        System.out.println("Sales tax of total purchase: $" + xxxTotalTax);
        
        double xTotalAfterTax=totalAfterTax$ * 100;
        int xxTotalAfterTax=(int)xTotalAfterTax;
        double xxxTotalAfterTax=((double)xxTotalAfterTax)/100;
        System.out.println("Total cost of purchase after tax: $" + xxxTotalAfterTax);
    }//end of main method
}//end of class