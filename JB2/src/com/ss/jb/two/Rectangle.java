package com.ss.jb.two;

public class Rectangle implements Shape {
	private double width;
	private double length;
	
	@Override
	public Double calculateArea() {
		// TODO Auto-generated method stub
		Double area = width*length;
		return area;
	}

	@Override
	public void display() {
		// TODO Auto-generated method stub
		System.out.println("A rectangle was randomly generated with a width of " +  
							String.format("%,.4f", width) + " and a length of " +
							String.format("%,.4f", length));
	}
	
	public Rectangle(double x, double y) {
		width = x;
		length = y;
	}
	

}
