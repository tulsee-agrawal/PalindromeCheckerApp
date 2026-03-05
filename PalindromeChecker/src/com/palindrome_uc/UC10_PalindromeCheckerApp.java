/**
 * MAIN CLASS - UC10PalindromeCheckerApp
 * 
 * UC10: Normalized Palindrome Validation
 * 
 * Description:
 * This class validates a palindrome after preprocessing
 * the input string.
 * 
 * Normalization includes:
 * - removing spaces and symbols
 * - converting to lowercase
 * 
 * This ensures the palindrome check is logical rather
 * than character-format dependent.
 * 
 * @author Tulsee Agrawal
 * @version 10.0
 */
package com.palindrome_uc;

public class UC10_PalindromeCheckerApp {
	public static void main(String[] args) {

		        // 1) Raw input (change to test)
		        String raw = "A man, a plan, a canal: Panama";

		        // 2) Normalize 
		        StringBuilder sb = new StringBuilder(raw.length());
		        for (char c : raw.toCharArray()) {
		            if (Character.isLetterOrDigit(c)) {
		                sb.append(Character.toLowerCase(c));
		            }
		        }
		        String normalized = sb.toString();
		        boolean isPalindrome=true;
		        
		        // 3) Two-pointer palindrome check 
		        for(int i=0;i<normalized.length()/2;i++) {
		        	if(normalized.charAt(i)!=normalized.charAt(normalized.length()-1-i)) {
		        		isPalindrome=false;
		        	}
		        }

		        // 4) Output
		        System.out.println("Raw Input        : " + raw);
		        System.out.println("Normalized Input : " + normalized);
		        System.out.println("Is Palindrome?   : " + isPalindrome);

	}
	
}
