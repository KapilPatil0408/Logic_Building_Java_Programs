package com.string_problems;

public class LongestPalindromeInString_solu2 {

	public static void main(String[] args) {
		String input = "my name is kapil patil. i am an automation tester and my level is high. i have learnt multiple langauges but i struggle in malayalam";

		String inputArray[] = input.split(" ");
		String longestPalindrome = "";

		for (String s : inputArray) {
			String originalString = s.replace("[^a-zA-Z0-9]", "");
			String reverse = reverseFunction(originalString);
			
			if (reverse.equals(originalString) && originalString.length() > longestPalindrome.length()) {
				System.out.println("String is palindrome:-  " + originalString);
				longestPalindrome = originalString;
			}
		}

		if (!longestPalindrome.isEmpty()) {
			System.out.println("Longest palindrome is:- " + longestPalindrome);
		} else {
			System.out.println("No palindrome found");
		}
	}
	
	public static String reverseFunction(String s){
        
        char[] c = s.toCharArray();
        int left = 0;
        int right = c.length-1;
        char temp;
        
        while(left < right){
            temp = c[left];
            c[left] = c[right];
            c[right] = temp;
            left++;
            right--;
        }
        String reverseString = new String(c);
        return reverseString;
        
    }

}
