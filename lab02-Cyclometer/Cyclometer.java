////////////////////////////////////////////////////
//  Frederick Coleman
//  CSE 002 Section 111
//  January 30 2015
//  Lab 02
//  Cyclometer Program
//  Measures statistics of bycicle trips; time elapsed, # of rotations
//
//  first compile the program
//      javac Cyclometer.java
//  run the program
//      java Cyclometer
//
public class Cyclometer {
    	// main method required for every Java program
   	public static void main(String[] args) {
        // our input data. 
	   	int secsTrip1=480;          // time elapsed of the 1st trip
       	int secsTrip2=3220;         // time elapsed of the 2nd trip
		int countsTrip1=1561;       // # of wheel rotation 1st trip
		int countsTrip2=9037;       // # of wheel rotation 2nd trip
		
		// our intermediate variables and output data. Document!
        double wheelDiameter=27.0,  // diameter of wheel as a string
      	PI=3.14159,                 // measure of the math var. pi
      	feetPerMile=5280,           // feet in a mile
      	inchesPerFoot=12,           // inches in a foot
      	secondsPerMinute=60;        // seconds in a minute
    	double distanceTrip1, distanceTrip2, totalDistance;  //
    	
    	System.out.println("Trip 1 took "+
       	     (secsTrip1/secondsPerMinute)+" minutes and had "+
       	      countsTrip1+" counts.");
	       System.out.println("Trip 2 took "+
       	     (secsTrip2/secondsPerMinute)+" minutes and had "+
       	      countsTrip2+" counts.");
       	
        //run the calculations; store the values. Document your
		//calculation here. What are you calculating?
		//
		//
    	distanceTrip1=countsTrip1*wheelDiameter*PI;
        	// Above gives distance in inches
        	//(for each count, a rotation of the wheel travels
        	//the diameter in inches times PI)
    	distanceTrip1/=inchesPerFoot*feetPerMile; // Gives distance in miles
    	distanceTrip2=countsTrip2*wheelDiameter*PI/inchesPerFoot/feetPerMile;
        totalDistance=distanceTrip1+distanceTrip2; // adds all the distance together
        	
    	//Print out the output data.
        System.out.println("Trip 1 was "+distanceTrip1+" miles");
	    System.out.println("Trip 2 was "+distanceTrip2+" miles");
	    System.out.println("The total distance was "+totalDistance+" miles");

	}  //end of main method   
} //end of class