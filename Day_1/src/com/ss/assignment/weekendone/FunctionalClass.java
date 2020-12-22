/**
 * Assignment week 1
 */
package com.ss.assignment.weekendone;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

/**
 * @author nadik
 *
 */
public class FunctionalClass {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub

		
		List<String> strings = new ArrayList<>();
		
	
		try {
			List<Integer> numbers = new ArrayList<>();
			
			int n = Integer.parseInt(args[0]);
			numbers.add(n);
			for(int i=1;i<args.length;i++) {
				numbers.add(Integer.parseInt(args[i]));
			}	
			System.out.println("Input: "+numbers);
			System.out.println();
			
			//Return list of rightmost digits in the numbers
			List <Integer> rightmost = numbers.stream().map(num -> num%10)
					.collect(Collectors.toList());
			System.out.println("Rightmost: "+rightmost);
			System.out.println();
			
			//Return list of numbers multiplied by 2
			List <Integer> doubling = numbers.stream().map(num -> num * 2)
					.collect(Collectors.toList());
			System.out.println("Doubling: "+doubling);
			System.out.println();
			
		}catch (Exception e) {
			try {
				for(int i=0;i<args.length;i++) {
					strings.add(args[i]);
				}
				System.out.println("Input: "+strings);
				// Return list of strings without "x"
				List <String> noX = strings.stream()
						.map(s -> s.replaceAll("x", ""))
						.collect(Collectors.toList());
				System.out.println("No 'x': "+noX);
				
			}catch(Exception ex) {
				ex.printStackTrace();
			}	
		}
	}
}
