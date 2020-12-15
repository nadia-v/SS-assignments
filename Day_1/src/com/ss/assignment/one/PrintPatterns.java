/**Assignment day 1
 * 
 */
package com.ss.assignment.one;

/**
 * @author Nadia Vedeneyeva
 *
 */
public class PrintPatterns {

	/**
	 * Prints 4 triangular patterns
	 */
	public void halfPyramid(int num) {
		// Prints right half of a pyramid 
		// Prints dashed line 
		for(int i=1;i<=num;i++) {
			for(int j=1;j<=i;j++) {
				System.out.print("*");
			}
			System.out.println();
		}
		for(int i=1;i<num;i++) {
			System.out.print("- ");
		}
		System.out.println();
		System.out.println();
	}
	
	
	public void halfInvertedPyramid(int num) {
		// Prints dashed line 
		// Prints right half of inverted pyramid
		for(int i=1;i<num;i++) {
			System.out.print("- ");
		}
		System.out.println();
		for(int i=1;i<=num;i++) {	
			for(int j=i;j<=num;j++) {
				System.out.print("*");
			}
			System.out.println();
		}
		System.out.println();
	}
	
	public void pyramid(int num){
		// Prints a pyramid with the base size passed as an argument
		// Prints dashed line 
		for(int i=1;i<=num;i++) {
			for(int j=i;j<num;j++) {
				System.out.print(" ");
			}
			for(int k=1;k<i*2;k++) {
				System.out.print("*");
			}
			System.out.println();
		}
		for(int i=1;i<num*2;i++) {
			System.out.print("- ");
		}
		System.out.println();
		System.out.println();
	}

	public void invertedPyramid(int num) {
		// Prints an inverted pyramid with the base size passed as an argument
		// Prints dashed line slightly larger than base of the shape
		for(int i=1;i<num*2;i++) {
			System.out.print("- ");
		}
		System.out.println();
		for(int i=1;i<=num;i++) {
			for(int k=i-1;k>0;k--) {
				System.out.print(" ");
			}
			for(int j=(num-i)*2;j>=0;j--) {
				System.out.print("*");
			}
			System.out.println();
		}
	}
		
	
	
	public static void main(String[] args) {

		PrintPatterns shape = new PrintPatterns();
		System.out.println("1)");
		shape.halfPyramid(4);
		System.out.println("2)");
		shape.halfInvertedPyramid(4);
		System.out.println("3)");
		shape.pyramid(4);
		System.out.println("4)");
		shape.invertedPyramid(4);
		
	}

}
