package com.string_problems;

public class StringPermutations {

	public static void main(String[] args) {

		String str = "ABC";
		System.out.println("All permutations of " + str + " are:");
		permute(str.toCharArray(), 0, str.length() - 1);

	}

	// Function to swap characters in a char array
	private static void swap(char[] chars, int i, int j) {
		char temp = chars[i];
		chars[i] = chars[j];
		chars[j] = temp;
	}

	// Recursive function to generate permutations
	private static void permute(char[] chars, int left, int right) {
		if (left == right) {
			System.out.println(String.valueOf(chars));
		} else {
			for (int i = left; i <= right; i++) {
				swap(chars, left, i); // Swap current index with i
				permute(chars, left + 1, right); // Recurse for the rest
				swap(chars, left, i); // Backtrack
			}
		}
	}

}
