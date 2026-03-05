/**
 * MAIN CLASS - UC7PalindromeCheckerApp
 * 
 * UC7 : Deque Based Optimized Palindrome Checker
 * 
 * Description:
 * This class validates a palindrome using a Deque
 * (Double Ended Queue)
 * 
 * Characters are inserted into the deque and then
 * compared by removing elements from both ends:
 * - removeFirst()
 * - removeLast()
 * 
 * This avoids reversing the string and provides an 
 * efficient front-to-back comparison approach.
 * 
 * This use case demonstrates optimal biidirectional
 * traversal using Deque.
 * 
 * @author Tulsee Agrawal
 * @version 7.0
 */
package com.palindrome_uc;

import java.util.*;

public class UC7_PalindromeCheckerApp {
public static void main(String[] args) {
	String inp="refer";
	Deque<Character> deque=new ArrayDeque<>();
	for(char c: inp.toCharArray()) {
		deque.add(c);
	}
	boolean isPalindrome=true;
	while(deque.size()>1) {
		if(deque.removeFirst()!=deque.removeLast()) {
			isPalindrome=false;
		}
	}
	System.out.println("Input : "+inp);
	System.out.println("Is Palindrome? : "+isPalindrome);
}
}
