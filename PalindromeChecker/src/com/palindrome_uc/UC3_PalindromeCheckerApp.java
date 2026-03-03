package com.palindrome_uc;
/**
 * MAIN CLASS - UC3_PalindromeCheckerApp
 * 
 * UC3 : Reverse String Based Plaindrome Check
 * 
 * Description:
 * This class checks whether a string is a palindrome
 * by reversing the string and comparing it with
 * the original value
 * 
 * At this stage, the application:
 * - Iterates the string in reverse order
 * - builds a reversed version
 * - Compares original and reversed strings
 * - Displays the validation result
 * 
 * This introduces tranformation-based validation
 * 
 * @author Tulsee Agrawal
 * @version 3.0
 */
public class UC3_PalindromeCheckerApp {
public static void main(String[] args) {
	String s="level";
	String reverse="";
	boolean flag=true;
	for(int i=s.length()-1;i>=0;i--) {
		reverse+=s.charAt(i);
	}
	for(int i=0;i<s.length();i++) {
		if(s.charAt(i)!=reverse.charAt(i)) {
			flag=false;
		}
	}
	System.out.println("Original : "+s);
	System.out.println("Reversed : "+reverse);
	System.out.println("Is Palindrome? : "+flag);
}
}
