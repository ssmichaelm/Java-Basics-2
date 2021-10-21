package com.ss.jb.two;

// Assignment 1: take multiple values from the command line and show the result of add
// all of them
public class Assignment1 {
	public static void main(String args[]) {
		int total = 0;
		
		// For each argument "s"...
		for(String s: args) {
			
			// Try converting "s" into an integer and adding it to the total sum.
			try {
				total += Integer.parseInt(s);
			}
			// If "s" cannot be converted into an integer (i.e. the argument is not an integer)
			catch(NumberFormatException e) {
				System.err.println("Argument \"" + s + "\" is not an integer.");
				System.exit(1);
			}
		}
		
		// Print out the total
		System.out.println("Total is " + total);
	}
}
