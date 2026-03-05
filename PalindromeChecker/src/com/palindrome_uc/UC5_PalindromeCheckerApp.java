package com.palindrome_uc;
import java.util.*;

/**
 * MAIN CLASS - UC5PalindromeCheckerApp
 * 
 * UC5: Stack based palindrome checker
 * 
 * Description:
 * This class validates a palindrome using a stack
 * data structure which follows the LIFO principle.
 * 
 * At this stage, the application:
 * 1) Pushes characters into a stack
 * 2) Pops them in reverse order
 * 3) Compares with original sequence
 * 4) Displays the result
 * 
 * This map stacks behavior to reversal logic.
 * 
 * @author Tulsee Agrawal
 * @version 5.0
 */
public class UC5_PalindromeCheckerApp {
	public static void main(String[] args) {
		String inp="noon";
		Stack<Character> stack=new Stack<>();
		for(char c: inp.toCharArray()) {
			stack.push(c);
		}
		boolean isPalindrome=true;
		for(char c:inp.toCharArray()) {
			if(c!=stack.pop())isPalindrome=false;
			
		}
		System.out.println("Input : "+inp);
		System.out.println("Is Palindrome? : "+isPalindrome);
		
	}
}
