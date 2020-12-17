/**
 * Assignment Day 3
 */
package com.ss.assignment.three;

import java.io.File;
import java.io.IOException;

/**
 * @author Nadia Vedeneyeva
 *
 */
public class DirectoryList {

	/**
	 * @param args
	 * @throws IOException 
	 * 
	 * Reads names of the files and directories in a given directory
	 */
	public static void main(String[] args) throws IOException {

		String path = args[0];
		File directory = new File(path);
		String[] names = directory.list();
		
		for (String s: names) {
			System.out.println(s);
		}
	}
}




