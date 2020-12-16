/**Assignment Day 1
 * 
 */
package com.ss.assignment.one;
import java.util.Scanner;
import java.util.Random;
import java.util.*;

/**
 * @author Nadia Vedeneyeva
 *
 */
public class NumberGuess {

	/**
	 * Generate a random number between 1-100
	 * Allow user 5 tries to guess the number
	 * User guess is allowed to be within 10 numbers plus and minus 
	 * from the number generated by the program
	 */
	public static void main(String[] args) {
		
		// Generate a random number
		Random rand = new Random();
		int number = rand.nextInt(101);
		
		int tries = 0;
		while(tries<5) {
			try {
				// Ask for user input
				Scanner scan = new Scanner(System.in);
				System.out.println("Please guess a number between 1 and 100: ");
				String input = scan.nextLine();
				int guess = Integer.parseInt(input);
				
				//Make sure input is within the range
				if(guess<0 || guess>100){
					System.out.println("Make sure you number is within the given range!");
					continue;
				//Check if the user guessed the number
				}else if(number-10<=guess && guess<=number+10) {
					System.out.println("Congratulations! You've guessed within the allowed range.");
					System.out.println("The number is " + number);
					break;
				}else {
					tries += 1;
				}
				if(tries>=5) {
					System.out.print("Sorry, you are out of tries. The number is " + number);
				}
				// Make sure input is an integer
				}catch(Exception e) {
					System.out.println("Invalid input. Please enter an integer.");			
			}
		}
	}
}