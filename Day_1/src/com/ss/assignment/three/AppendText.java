/**
 * Assignment Day 3 
 */
package com.ss.assignment.three;

import java.io.FileWriter;
import java.io.IOException;
import java.io.PrintWriter;

/**
 * @author Nadia Vedeneyeva
 *
 */
public class AppendText {

	/**
	 * @param args
	 * 
	 * Appends text to an existing file
	 */
	public static void main(String[] args) {
		
		String file = args[0];
	
		try (PrintWriter fw = new PrintWriter(new FileWriter(file, true));){
			fw.println("This is additional text");
		} catch(IOException e) {
			e.printStackTrace();
		}
	}

}
