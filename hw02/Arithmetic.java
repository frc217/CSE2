////////////////////////////////////////////////////
//  Frederick Coleman
//  CSE 002 Section 111
//  February 3 2015
//  HW 02
//  Arithmetic Program
//  Calculate purchase cost of merchandise including sales tax
//
//  first compile the program
//      javac Arithmetic.java
//  run the program
//      java Arithmetic


public class Arithmetic {
    	// main method required for every Java program
   	public static void main(String[] args) {
        //Number of pairs of socks
        int nSocks=3;
        //Cost per pair of socks
        //(‘$’ is part of the variable name)
        double sockCost$=2.58;
        
        //Number of drinking glasses
        int nGlasses=6;
        //Cost per glass
        double glassCost$=2.29;
        
        //Number of boxes of envelopes
        int nEnvelopes=1;
        //cost per box of envelopes
        double envelopeCost$=3.25;
        
        double taxPercent=0.06; // PA sales tax
        
        // Sock Calculation
        double sockTotal=nSocks*sockCost$; // total cost of socks
        // Glass Calculation
        double glassTotal=nGlasses*glassCost$; // total cost of glasses
        // Envelopes Calculation
        double envelopeTotal=nEnvelopes*envelopeCost$; // total cost of envelopes
        //Total
        double grandTotal=sockTotal+glassTotal+envelopeTotal;
        
        System.out.println("Subtotal cost of socks before tax: " +sockTotal+
               	     ". Sales tax: " +(sockTotal*taxPercent)+ 
               	     ". Sales total: " +(sockTotal+sockTotal*taxPercent)+ 
               	     ".");
               	     
        System.out.println("Subtotal cost of socks before tax: " +glassTotal+
               	     ". Sales tax: " +(glassTotal*taxPercent)+ 
               	     ". Sales total: " +(glassTotal+glassTotal*taxPercent)+ 
               	     ".");
               	     
        System.out.println("Subtotal cost of socks before tax: " +envelopeTotal+
               	     ". Sales tax: " +(envelopeTotal*taxPercent)+ 
               	     ". Sales total: " +(envelopeTotal+envelopeTotal*taxPercent)+ 
               	     ".");
               	     
        System.out.println("Grand total cost of purchases before tax: " +grandTotal+
               	     ". Sales tax: " +(grandTotal*taxPercent)+ 
               	     ". Sales total: " +(grandTotal+grandTotal*taxPercent)+ 
               	     ".");
   	}
}