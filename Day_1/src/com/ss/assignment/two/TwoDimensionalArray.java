/**
 * Assignment Day 2
 */
package com.ss.assignment.two;

import java.util.Random;

/**
 * @author Nadia Vedeneyeva
 *
 */
public class TwoDimensionalArray {

	/**
	 * Create a two-dimensional array and populate in with random numbers
	 * Locate and print the largest number in the array and its index
	 */
	
	public static void main(String[] args) {
		
		// Create 5x5 matrix of random integers in 1-100 range
		Random rand = new Random();
		int[][] matrix = new int[5][5];
		for (int row=0;row<matrix.length;row++) {
			for (int column=0;column<matrix[row].length;column++) {
				matrix[row][column] = rand.nextInt(101);
			}
		}
//		
//		for (int row=0;row<matrix.length;row++) {
//			for (int column=0;column<matrix[row].length;column++) {
//				System.out.print(matrix[row][column] + " ");
//			}
//			System.out.println();
//		}
		
		// Locate and print the largest number in the matrix and its index
		int maxNum = matrix[0][0];
		int maxRow = 0;
		int maxColumn = 0;
		for (int row=0;row<matrix.length;row++) {
			for (int column=0;column<matrix[row].length;column++) {
				if(matrix[row][column] > maxNum) {
					maxNum = matrix[row][column];
					maxRow = row;
					maxColumn = column;
				}
			}
		}
		System.out.println("The largest number in the matrix is: " + maxNum);
		System.out.println("Its index is: matrix["+maxRow+"]["+maxColumn+"]");
	}

}
