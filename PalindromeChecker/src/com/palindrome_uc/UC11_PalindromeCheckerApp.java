/**
 * MAIN CLASS - UC11_PalindromeCheckerApp
 * 
 * UC11 - Object-Oriented Palindrome Service
 * 
 * Description:
 * This class demonstrates palindrome validation using
 * object-oriented design.
 * 
 * The palindrome logic is encapsulated inside a 
 * PalindromeService class.
 * 
 * This improves:
 * - Reusability
 * - Readability
 * - Separation of concerns
 * 
 * @author Tulsee Agrawal
 * @version 11.0
 */

package com.palindrome_uc;

import java.util.*;

public class UC11_PalindromeCheckerApp {
	public static void main(String[] args) {
		PalindromeService check=new PalindromeService();
		String inp="racecar";
		boolean isPalindrome=check.checkPalindrome(inp);
		System.out.println("Input : "+inp);
		System.out.println("Is Palindrome? : "+isPalindrome);
	}
}
class PalindromeService{
	/**
	 * checks whether the input string is a palindrome.
	 * 
	 * @param input Input string
	 * @return true if palindrome, false otherwise
	 */
	public boolean checkPalindrome(String inp) {
		int start=0;
		int end=inp.length()-1;
		while(start<end) {
			if(inp.charAt(start)!=inp.charAt(end)) {
				return false;
			}
			start++;
			end--;
		}
		return true;
	}
}
