package com.ss.jb.two;

public class Assignment3 {
	public static void main(String args[]) {
		// For generating random double dimensions to be used as dimensions for the shapes
		double upperBound = 20;
		double lowerBound = 2;
		double range = upperBound - lowerBound + 1; 
				
		// Rectangle
		Rectangle rectangle = new Rectangle((double)(Math.random() * range) + lowerBound, (double)(Math.random() * range) + lowerBound);
		rectangle.display();
		System.out.println("Rectangle's area is approximately: " + String.format("%,.4f", rectangle.calculateArea()) );
		System.out.println();

		// Circle
		Circle circle = new Circle((double)(Math.random() * range) + lowerBound);
		circle.display();
		System.out.println("Circle's area is approximately: " + String.format("%,.4f", circle.calculateArea()) );
		System.out.println();

		// Triangle
		Triangle triangle = new Triangle((double)(Math.random() * range) + lowerBound, (double)(Math.random() * range) + lowerBound);
		triangle.display();
		System.out.println("Triangle's area is approximately: " + String.format("%,.4f", triangle.calculateArea()) );
		System.out.println();
		
	}
}
