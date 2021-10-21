package com.ss.jb.two;

public class Circle implements Shape{
	private double radius;
	static double pi = Math.PI;
	
	@Override
	public Double calculateArea() {
		// TODO Auto-generated method stub
		Double area = pi*Math.pow(radius, 2);
		return area;
	}

	@Override
	public void display() {
		// TODO Auto-generated method stub
		System.out.println("A circle was randomly generated with a radius of " +  
				String.format("%,.4f", radius));
	}
	
	public Circle(double x) {
		radius = x;
	}

}
