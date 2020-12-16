/**
 * Assignment Day 2
 */
package com.ss.assignment.two;

import java.util.Random;

/**
 * @author Nadia Vedeneyeva
 *
 */
public class Rectangle implements Shape{

	/**
	 * Create a rectangle
	 * implement Shape interface
	 */
	
	//Create a random rectangle
	Random rand = new Random();
	double width = rand.nextInt(101);
	double length = rand.nextInt(101);
	
	public static void main(String[] args) {
		Rectangle rect = new Rectangle();
		rect.calculateArea();
		rect.display();
	}

	//Calculate area of the rectangle
	@Override
	public double calculateArea() {
		double area = width * length;
		return area;
	}

	//Print calculations and the area of the rectangle 
	@Override
	public void display() {
		
		System.out.println("Rectangle width is:  "+width);
		System.out.println("Rectangle length is:  "+length);
		System.out.println("Area of the rectangle is "+calculateArea());
		System.out.println("Calculations:");
		System.out.println("Area = width x length");
		System.out.println("Area = "+width+" * "+length+" = "+calculateArea());
		
	}

}
