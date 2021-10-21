package com.ss.jb.two;

public class Triangle implements Shape {
	private double height;
	private double base;
	
	@Override
	public Double calculateArea() {
		// TODO Auto-generated method stub
		Double area = (base*height)/2;
		return area;
	}

	@Override
	public void display() {
		// TODO Auto-generated method stub
		System.out.println("A triangle was randomly generated with a base of " +  
				String.format("%,.4f", base) + " and a height of " +
				String.format("%,.4f", height));
	}
	
	public Triangle(double x, double y) {
		base = x;
		height = y;
	}

}
