package com.string_problems;

public class FindLengthOfString_Part1 {

	public static void main(String[] args) {

		String input = "hello";
		char c[] = input.toCharArray();
		int count = 0;

		for (char x : c) {
			count++;
		}
		System.out.println("length of String: "+count);
	}
}
