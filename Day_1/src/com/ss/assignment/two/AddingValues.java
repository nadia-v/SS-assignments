/**
 * Assignment Day 2
 */
package com.ss.assignment.two;

import java.util.ArrayList;
import java.util.Scanner;

/**
 * @author Nadia Vedeneyeva
 *
 */
public class AddingValues {

	/** 
	 * Class overloads add method
	 * add method take arguments: strings / integers
	 * Add method adds the values from the arguments together and prints the result
	 * 
	 * User is asked for integers input to be added together
	 * User is asked for strings input to be added together
	 */
	public static void main(String[] args) {

		AddingValues adv = new AddingValues();
		ArrayList<Integer> nums = new ArrayList<>();
		nums.add(1);
		nums.add(2);
		nums.add(3);
		nums.add(4);
		nums.add(5);
		adv.add(nums);
		adv.add("a", "b", "c", "d");
		
		//Ask user for an array of integers to add
		try {		
			Scanner scan = new Scanner(System.in);
			System.out.println("Please enter integers you wish to add separated by space:");
			String intInput = scan.nextLine();
			String[] intValues = intInput.split(" ");
			ArrayList<Integer> numbers = new ArrayList<>();
			for (String i: intValues) {
				int num = Integer.parseInt(i);
				numbers.add(num);
			}
			adv.add(numbers);
			
			
			//Ask user for strings to add
			System.out.println("Please enter strings you wish to add separated by space:");
			String input = scan.nextLine();
			String[] values = input.split(" ");
			adv.add(values);
			
			scan.close();
		}catch(Exception e) {
			System.out.println("The input has to be integers");
			System.out.println("Lets try again");
			e.printStackTrace();
			AddingValues.main(args);
		}
	}
	
	
	public void add(String ...s) {
		// Method takes multiple strings as an argument, adds them together
		// and prints the result
		StringBuilder sb = new StringBuilder();
		for (String i: s) {
			sb.append(i);
		}
		System.out.println("Result for adding strings: " + sb);
	}
	
	public void add(ArrayList<Integer>numbers) {
		// Method takes ArrayList of integers as an argument, adds them together 
		// and prints the result
		int c=0;
		for (int i: numbers) {
			c += i;
		}
		System.out.println("Result for adding integers: " + c);
	}

}
