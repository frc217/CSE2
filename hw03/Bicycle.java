////////////////////////////////////////////////////
//  Frederick Coleman
//  CSE 002 Section 111
//  February 10 2015
//  Hw 03
//  Bicycle Program
//  Calculate distance and time traveling using a cyclometer
//
//  first compile the program
//      javac Bicycle.java
//  run the program
//      java Bicycle

import java.util.Scanner;

public class Bicycle {
    	// main method required for every Java program
   	public static void main(String[] args) {
   	Scanner myScanner;
   	myScanner = new Scanner(System.in);
   	    
        System.out.print("Enter the number of seconds: ");
        int nSeconds = myScanner.nextInt();
        
        System.out.print("Enter the number of counts: ");
        int nCounts = myScanner.nextInt();
        
        // our intermediate variables and output data. Document!
        double wheelDiameter=27.0,  // diameter of wheel as a string
      	PI=3.14159,                 // measure of the math var. pi
      	feetPerMile=5280,           // feet in a mile
      	inchesPerFoot=12,           // inches in a foot
      	secondsPerMinute=60;        // seconds in a minute
    	double distance, minutes, average;  //
    	
    	distance = ((PI*wheelDiameter*nCounts)/inchesPerFoot)/feetPerMile;
    	// Above gives distance in miles
    	minutes = nSeconds/secondsPerMinute;
    	// Above gives time in minutes
        average = (distance/(minutes/60));
        // Above gives average miles per hour
        
        System.out.println("The distance was "+distance+" miles.");
        System.out.println("Took "+minutes+" minutes.");
        System.out.println("The average was "+average+" mph.");
	}  //end of main method   
} //end of class