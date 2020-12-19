/**
 * 
 */
package com.ss.assignment.five;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

/**
 * @author nadik
 *
 */
public class EvenOddNumbersString {

	/**
	 * @param args
	 */
	
	public static void main(String[] args) {
		List<Integer> numbers = new ArrayList<>();
		numbers.add(2);
		numbers.add(25);
		numbers.add(245);
		numbers.add(222);
		numbers.add(26);
		numbers.add(2);
		List<String> converted = new ArrayList<>();
		
		
		numbers.forEach(n -> {
			if (n%2==0) {converted.add("e"+Integer.toString(n));}
			else{converted.add("o"+Integer.toString(n));}});
		
		String result = String.join(",", converted);
		System.out.println(result);
	}

}
