package com.string_problems;

public class String_Practice {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		String input="aceg";
		StringBuilder result= new StringBuilder();
		
		for(char c: input.toCharArray()) {
			c++;
			result.append(c);
			
		}
		System.out.println(result.toString());
	}

}
