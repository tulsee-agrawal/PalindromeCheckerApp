/**
 * MAIN CLASS - UC8_PALINDROMECHECKERAPP
 * 
 * UC8: Linked List Based Palindrome Checker App
 * 
 * Description:
 * This class checks whether a string is a palindrome
 * using a LinkedList.
 * 
 * Characters are added to the list and then compared 
 * by removing elements from both ends:
 * 
 * - removeFirst()
 * - removeLast()
 * 
 * This demonstrates how LinkedList supports
 * double-ended operation for symmetric validation.
 * 
 * @author Tulsee Agrawal
 * @version 8.0
 */

package com.palindrome_uc;

import java.util.*;

public class UC8_PalindromeCheckerApp {
	public static void main(String[] args) {
		String inp="level";
		LinkedList<Character> list=new LinkedList<>();
		for(char c: inp.toCharArray()) {
			list.add(c);
		}
		boolean isPalindrome=true;
		while(list.size()>1) {
			char left = list.removeFirst();
			char right=list.removeLast();
			if(left!=right) {
				isPalindrome=false;
				break;
			}
			
		}
		System.out.println("Input : "+inp);
		System.out.println("Is Palindrome? : "+ isPalindrome);
	}
}
