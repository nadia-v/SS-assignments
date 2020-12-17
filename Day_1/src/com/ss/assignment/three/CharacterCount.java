/**
 * Assignment Day 3 
 */
package com.ss.assignment.three;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;

/**
 * @author Nadia Vedeneyeva
 *
 */
public class CharacterCount {

	/**
	 * @param args
	 * 
	 * Count the number of times given character appears in a file 
	 */
	public static void main(String[] args) {
		
		String file = args[0];
		String character = args[1];
		
		try (BufferedReader in = new BufferedReader(new FileReader(file));){
			int count;
			char ch = character.charAt(0);
			int total = 0;
			while((count = in.read()) != -1) {
				if((char) count == ch) {
					total ++;				
				}
			}
			System.out.print("Character "+ch+" appears in the file "+file+" "+total+" times");
		} catch(IOException e) {
			e.printStackTrace();
		} 

	}

}
