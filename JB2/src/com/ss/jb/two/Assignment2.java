package com.ss.jb.two;

/*
 * Assignment 2:
 * Construct a 2D array, find the max number, and show its position
 */
public class Assignment2 {
	public static void main(String args[]) {
		int upperBound = 6;
		int lowerBound = 2;
		int range = upperBound - lowerBound + 1;
		int x = (int)(Math.random() * range) + lowerBound, y = (int)(Math.random() * range) + lowerBound;
		
		Integer[][] intArray = new Integer[x][y]; // Create a 2D array with randomly generated bounds, from (2 - 6)
		Assignment2 myObj = new Assignment2(); // Instantiate an object of class Assignment2
		
		myObj.fillArray(intArray);
		myObj.displayArray(intArray);
		myObj.getMax(intArray);
	}
	
	/*
	 * This method fills the array with randomly generated values of 1 - 1000
	 */
	void fillArray(Integer[][] intArray) {
		int upperBound = 1000;
		int lowerBound = 1;
		int range = upperBound - lowerBound + 1;
		
		for(int i = 0; i < intArray.length; i++) 
			for(int j = 0; j < intArray[i].length; j++) 
				intArray[i][j] = (int)(Math.random() * range) + lowerBound;
	}
	
	/*
	 * This method displays the 2D array 
	 */
	void displayArray(Integer[][] intArray){
		for(int i = 0; i < intArray.length; i++) {
			for(int j = 0; j < intArray[i].length; j++) {
				System.out.print(
					String.format("%5d", intArray[i][j]));
			}
			
			System.out.println();
		}
		
		System.out.println();
	}
	
	/*
	 * This method finds the highest value in the array, then prints it and its location out
	 */
	void getMax(Integer[][] intArray) {
		int maximum = intArray[0][0];
		int x = 0;
		int y = 0;
		
		for(int i = 0; i < intArray.length; i++) {
			for(int j = 0; j < intArray[i].length; j++) {
				if(intArray[i][j] >= maximum) {
					maximum = intArray[i][j];
					x = i;
					y = j;
				}
			}
		}
		
		System.out.println("The maximum value in the 2D array is: " + maximum);
		System.out.printf("It's position is at: array[%d][%d]", x, y);
	}
}
