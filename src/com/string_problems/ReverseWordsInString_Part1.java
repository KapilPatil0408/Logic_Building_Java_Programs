package com.string_problems;

import java.util.Arrays;

public class ReverseWordsInString_Part1 {

	public static void main(String[] args) {
		String input = "This is fun";
		String inputArray[] = input.split(" ");
		String result = "";

		for (String word : inputArray) {
			char c[] = word.toCharArray();
			int left = 0;
			int right = c.length - 1;
			while (left < right) {
				char ca = c[left];
				c[left] = c[right];
				c[right] = ca;
				left++;
				right--;
			}
			result = result + new String(c) + " ";
		}
		System.out.println(result.trim());
	}
}
