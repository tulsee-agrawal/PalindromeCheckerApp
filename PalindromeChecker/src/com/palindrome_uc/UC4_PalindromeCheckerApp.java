package com.palindrome_uc;
/**
 * MAIN CLASS - UC4_PalindromeCheckerApp
 * 
 * UC4: Character Array Based Validation
 * 
 * Description:
 * This class validates a palindrome by converting
 * the string into a character array and comparing
 * characters using the two-pointer technique
 * 
 * At this stage, the application:
 * - converts string to char array
 * - Uses start and end pointers
 * - Compares characters efficiently
 * - Displays the result
 * 
 * This reduces extra memory usage.
 * 
 * @author Tulsee Agrawal
 * @version 4.0
 */
public class UC4_PalindromeCheckerApp {
public static void main(String[] args) {
	String inp="radar";
	char[] chars=inp.toCharArray();
	int start=0;
	int end=chars.length-1;
	boolean isPalindrome=true;
	while(start<end) {
		if(chars[start]!=chars[end]) {
			isPalindrome=false;
			
		}
		start++;
		end--;
	}
	System.out.println("Input : "+inp);
	System.out.println("Is Palindrome? : "+isPalindrome);
}
}
