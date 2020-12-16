/**
 * Assignment Day 2
 */
package com.ss.assignment.two;

import java.util.Random;

/**
 * @author Nadia Vedeneyeva
 *
 */
public class Triangle implements Shape{

	/**
	 * Create a triangle
	 * implement Shape interface
	 */
	
	//Create a random rectangle
	Random rand = new Random();
	double a = rand.nextInt(101);
	double b = rand.nextInt(101);
	double c = rand.nextInt(101);
	
	public static void main(String[] args) {
		Triangle tr = new Triangle();
		tr.calculateArea();
		tr.display();
	}

	//Calculate area of the triangle
	@Override
	public double calculateArea() {
		double s = (a+b+c)/2;
		double area = Math.round((Math.sqrt(s*(s-a)*(s-b)*(s-c)) * 100.0)) / 100.0;
		return area;
	}

	//Print calculations and the area of the triangle
	@Override
	public void display() {
		System.out.println("Sides of the triangle are:  "+a+", "+b+", "+c);
		System.out.println("Calculations:");
		System.out.println("s = (a + b + c) / 2");
		System.out.println("Area = sqrt(s * (s - a)(s - b)(s - c))");
		System.out.println("Area of the rectangle is "+calculateArea());
		
	}

}
