////////////////////////////////////////////////////
//  Frederick Coleman
//  CSE 002 Section 111
//  February 10 2015
//  Hw 03
//  Root Program
//  Calculate the square root of a number
//
//  first compile the program
//      javac Root.java
//  run the program
//      java Root

import java.util.Scanner;

public class Root {
    	// main method required for every Java program
   	public static void main(String[] args) {
   	Scanner myScanner;
   	myScanner = new Scanner(System.in);
   	
   	System.out.print("Enter a double, and I'll print its cube root: ");
    int number = myScanner.nextInt();
    double guess = (number/3);
    guess = (guess*guess*guess+number)/(3*guess*guess);
    double root = guess*guess*guess;
    
    System.out.print("The cube root is:"+guess+".");
    System.out.print("The guessed root cubed is:"+root+".");
    
	}  //end of main method   
} //end of class