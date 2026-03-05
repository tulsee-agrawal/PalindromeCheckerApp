/**
 * MAIN CLASS - UC12_PalindromeCheckerApp
 * 
 * UC12 : Strategy Pattern for palindrome algorithms
 * 
 * Description:
 * This class demonstrates has different palindrome
 * validation algorithms can be selected dynamically
 * at runtime using the strategy design pattern.
 * 
 * At this stage, the application:
 * - defines a common PalindromeStrategy interface
 * - implements  a concrete stack based strategy
 * - injects the strategy at runtime
 * - executes the selected algorithm
 * 
 * No performance comparison is done in this use case.
 * The focus is purely on algorithm interchangeability.
 * 
 * The goal is to teach extensible algorithm design.
 * 
 * @author Tulsee Agrawal
 * @version 12.0
 */

package com.palindrome_uc;

import java.util.*;

public class UC12_PalindromeCheckerApp {
	public static void main(String[] args) {
		StackStrategy stackStrategy=new StackStrategy();
		String inp="level";
		boolean isPalindrome=stackStrategy.check(inp);
		System.out.println("Input : "+inp);
		System.out.println("Is Palindrome? : "+ isPalindrome);
	}
}

/**
 * INTERFACE - PalindromeStrategy
 * 
 * This interface defines a contract for all
 * palindrome checking algorithms.
 *
 */
interface PalindromeStrategy{
	public boolean check(String input);
}

/**
 * CLASS - StackStrategy
 * 
 * This class provides a stack based implementation
 * of the PalindromeStrategy interface.
 * 
 */
class StackStrategy implements PalindromeStrategy{
	public boolean check(String inp) {
		Stack<Character> stack=new Stack<>();
		for(char c:inp.toCharArray()) {
			stack.push(c);
		}
		for(char c:inp.toCharArray()) {
			if(c!=stack.pop()) {
				return false;
			}
		}
		return true;
	}
}