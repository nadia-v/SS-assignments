/**
 * Assignment week 1
 */
package com.ss.assignment.weekendone;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.IntStream;

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

		List<Integer> numbers = new ArrayList<>();
		numbers.add(11);
		numbers.add(22);
		numbers.add(3333);
		numbers.add(43);
		numbers.add(10);
		
		List <Integer> rightmost = numbers.stream().map(num -> num%10)
				.collect(Collectors.toList());
		rightmost.forEach(n -> System.out.println(n));
		
		System.out.println();
		
		List <Integer> doubling = numbers.stream().map(num -> num * 2)
				.collect(Collectors.toList());
		doubling.forEach(n -> System.out.println(n));
		
		System.out.println();
		
		List<String> strings = new ArrayList<>();
		strings.add("ax");
		strings.add("bb");
		strings.add(" ");
		strings.add("axadsx");
		
		
		List <String> noX = strings.stream()
				.map(s -> s.replaceAll("x", ""))
				.collect(Collectors.toList());
		noX.forEach(n -> System.out.println(n));
		
	}

}
