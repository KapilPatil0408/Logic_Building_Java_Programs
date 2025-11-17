package com.string_problems;

public class ReverseString_WithoutSplitMethod_1 {

	public static void main(String[] args) {
		
		String input= "Kapil Vilas Patil";
		
		int start= 0;
		
		String result="";
		
		for(int i=0; i<=input.length(); i++) {
			 // When we hit a space OR end of string — we found a word
            if (i == input.length() || input.charAt(i) == ' ') {

                // Reverse the current word manually
                for (int j = i - 1; j >= start; j--) {
                    result += input.charAt(j);
                }

                // Add space between words (except after last word)
                if (i < input.length()) {
                    result += " ";
                }

                // Move start index to next word
                start = i + 1;
            }
        }

        System.out.println(result);
		}
		

	}


