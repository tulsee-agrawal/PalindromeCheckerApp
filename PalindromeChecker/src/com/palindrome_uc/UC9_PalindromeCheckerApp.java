/**
 * MAIN CLASS - UC9_PalindromeCheckerApp
 * 
 * UC9 : Recursive Palindrome Checker
 * 
 * Description:
 * This class validates a palindrome using recursion.
 * 
 * Characters are compared from the outer positions
 * moving inward using recursive calls.
 * 
 * The recursion stops when:
 * - All characters are matched, or
 * - A mismatch is found.
 * 
 * This use case demonstrates divide-and-conquer
 * logic using method recursion.
 * 
 * @author Tulsee Agrawal
 * @version 9.0
 * 
 */
package com.palindrome_uc;

import java.util.*;

public class UC9_PalindromeCheckerApp {
	public static void main(String[] args) {

	   		String inp = "madam"; 
	        boolean isPalindrome = isPalindromeRecursive(inp, 0, inp.length() - 1);

	        System.out.println("Input : " + inp);
	        System.out.println("Is Palindrome? : " + isPalindrome);

	}

	//Recursive check
    private static boolean isPalindromeRecursive(String s, int start, int end) {
        if (start >= end) return true; 
        if (s.charAt(start) != s.charAt(end)) return false;
        return isPalindromeRecursive(s, start + 1, end - 1);
    }

}
