/**
 * Assignment week 1
 */
package com.ss.assignment.weekendone;

import java.util.HashMap;
import java.util.Map;
import java.util.stream.IntStream;

/**
 * @author nadik
 *
 */

public class PefrformOperation {
	/**
	 * @param args
	 * contains 3 lambda function: 
	 * check if number is odd
	 * check if number is prime
	 * check if number is palindrome
	 */
	public static void main(String[] args) {

		// Check if number is odd
		PerformOp isOdd = (Integer n) -> {
			if (n%2 == 0) {
				return "EVEN";	
			}else {
				return "ODD";
				}
		};
		
		// Check if number is prime
		PerformOp isPrime = (Integer n) -> {
			if (n>1 && IntStream.range(2, n).noneMatch(i->n%i==0)) {
				return "PRIME";
			}else {
				return "COMPOSITE";
				}
		};
		
		//Check if number is palindrome
		PerformOp isPalindrome = (Integer n) -> {
			if (n == IntStream.iterate(n, i -> i != 0, j -> j / 10)
            .map(i -> i % 10)
            .reduce(0, (a, b) -> a * 10 + b)) {
				return "PALINDROME";
			}else {
				return "NOT PALINDROME";
			}
		};
		
		Map <Integer, Integer> dictionary = new HashMap<Integer, Integer>();
		try {
			int cases = Integer.parseInt(args[0]);
			for (int i=1;i<args.length-1;i=i+2) {
				dictionary.put(Integer.parseInt(args[i]), Integer.parseInt(args[i+1]));
			}
			System.out.println(cases);
			
			dictionary.forEach((key, value) -> 
				{if (key==1) {System.out.println(isOdd.result(value));}
				else if (key==2) {System.out.println(isPrime.result(value));}
				else if (key==3) {System.out.println(isPalindrome.result(value));}
				else{System.out.println("Invalid input");}
				});
		}catch (Exception e) {
			e.printStackTrace();
		}
	}
}
