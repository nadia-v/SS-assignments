/**
 * Assignment Day 2
 */
package com.ss.assignment.two;

import java.util.Random;

/**
 * @author Nadia Vedeneyeva
 *
 */
public class Circle implements Shape{

	/**
	 * Create a circle
	 * implement Shape interface
	 */
	
	//Create a random circle
	Random rand = new Random();
	int radius = rand.nextInt(101);
	double pi = 3.14;
	
	public static void main(String[] args) {
		Circle circ = new Circle();
		circ.calculateArea();
		circ.display();

	}

	//Calculate area of the circle
	@Override
	public double calculateArea() {
		double area = Math.round((pi * radius * radius) * 100.0) / 100.0;
		return area;
	}

	//Print calculations and area of the circle
	@Override
	public void display() {
		System.out.println("Cirlce radius is:  "+radius);
		System.out.println("Area of the rectangle is "+calculateArea());
		System.out.println("Calculations:");
		System.out.println("Area = Pi x radius^2");
		System.out.println("Area = "+pi+" * "+radius+"^2 = "+calculateArea());
		
	}
	
}
