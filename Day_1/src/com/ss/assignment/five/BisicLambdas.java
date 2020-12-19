/**
 * Assignment Day 5
 */
package com.ss.assignment.five;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Comparator;
import java.util.List;

/**
 * @author nadik
 *
 */
public class BisicLambdas {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		
		List<String> stringsList = new ArrayList<>();
		for(String arg: args) {
			stringsList.add(arg);
		}

		//Sort strings shortest to longest
		stringsList.sort(Comparator.comparingInt(String::length));
		stringsList.forEach(n -> System.out.println(n));
		System.out.println();
		
		//Sort strings longest to shortest
		stringsList.sort((first, second) -> Integer.compare(second.length(),first.length()));
		stringsList.forEach(n -> System.out.println(n));
		System.out.println();																	
	    
		//Sort strings alphabetically by the first character
		stringsList.sort((first, second) -> first.toLowerCase().charAt(0) - second.toLowerCase().charAt(0));
		stringsList.forEach(n -> System.out.println(n));
		System.out.println();
		
		//Sort strings that contain 'e' first than everything else
		//Arrays.sort(stringsList, Comparator.comparingInt(a -> (a.contains("E") || a.contains("e") ? 0 : 1)));
		stringsList.sort(Comparator.comparingInt(s -> (s.contains("e")?0:1)));
		stringsList.forEach(n -> System.out.println(n));
		System.out.println();
		
		// Sort strings that contain 'e' first than everything else 
		// using static method Arrays.sort(words, (s1,s2) -> Utils.yourMethod(s1,s2))

	}

}
