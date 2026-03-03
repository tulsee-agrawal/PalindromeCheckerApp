package com.palindrome_uc;
/**
 * MAIN CLASS- UC2_PalindromeCheckerApp
 * 
 * Use Case 2: Hardcoded palindrome Validation
 * 
 * Description:
 * This class demonstrates basic palindrome validation
 * using a hardcoded string value.
 * 
 * At this stage, the application:
 * - stores a predefined string
 * - Compares characters from both ends
 * - Determines whether the string is a palindrome
 * - Displays the result on console
 * 
 * This use case introduces fundamental comparison logic
 * before using advanced data structures.
 * 
 * @author Tulsee Agrawal
 * @version 2.0
 */
public class UC2_PalindromeCheckerApp {
	/**
	 * Application entry point for UC2
	 * 
	 * @param args Command-line arguments
	 * 
	 */
	public static void main(String[] args) {
		String input="madam";
		boolean flag=true;
		for(int i=0;i<input.length()/2;i++) {
			if(input.charAt(i)!=input.charAt(input.length()-i-1)) {
				flag=false;
			}
			
		}
		System.out.println("Input text: "+input);
		System.out.println("Is it a palindrome? : "+flag);
	}
}
