package com.palindrome_uc;
import java.util.*;

/**
 * MAIN CLASS - UC6PalindromeCheckerApp
 * 
 * UC6 : Queue + Stack Fairness Check
 * 
 * Description:
 * This class demonstrates palindrome validation using
 * two different data structures:
 * 
 * Queue (FIFO)
 * Stack (LIFO)
 * 
 * Characters are inserted into both structures and then compared by 
 * removing from the front of the queue and the
 * top of the stack
 * 
 * If all characters match, the input string is confirmed
 * as a palindrome.
 * 
 * This use case helps understand how FIFO and LIFO
 * Behaviors can be combined for symmetric comparison.
 * 
 * @author Tulsee Agrawal
 * @version 6.0
 */
public class UC6_PalindromeCheckerApp {
public static void main(String[] args) {
	String inp="civic";
	Queue<Character> queue = new LinkedList<>();
	Stack<Character> stack=new Stack<>();
	for(char c:inp.toCharArray()) {
		queue.add(c);
		stack.push(c);
	}
	boolean isPalindrome = true;
	while(!queue.isEmpty()) {
		if(queue.poll()!=stack.pop()) {
			isPalindrome =false;
		}
	}
	System.out.println("Input : "+inp);
	System.out.println("Is Palindrome? :"+isPalindrome);
	
}
}
