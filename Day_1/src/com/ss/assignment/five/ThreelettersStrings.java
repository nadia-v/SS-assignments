/**
 * 
 */
package com.ss.assignment.five;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

/**
 * @author nadik
 *
 */
public class ThreelettersStrings {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		List<String> words = new ArrayList<>();
		for(String arg: args) {
			words.add(arg);
		}
		
		List <String> result = words.stream().
				filter(word -> word.length()==3 && word.charAt(0)=='a').collect(Collectors.toList());
		result.forEach(n -> System.out.println(n));
	}

}
