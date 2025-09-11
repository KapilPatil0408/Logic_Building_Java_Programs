package com.string_problems;

public class FindLengthOfString_Part2 {

	public static void main(String[] args) {

		String input = "hello";
		int count = 0;

		while (true) {
			try {
			input.charAt(count);
			count++;
			}catch(StringIndexOutOfBoundsException e) {
				System.out.println("length of String: " + count);
				break;
			}
		}
		
	}
}
