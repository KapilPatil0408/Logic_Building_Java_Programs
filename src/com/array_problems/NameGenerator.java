package com.array_problems;

public class NameGenerator {

	public static void main(String[] args) {

		String names[] = { "Raj", "Rahul" };
		StringBuilder result = new StringBuilder();
		int maxLength = 0;

		for (String name : names) {
			maxLength = Math.max(maxLength, name.length());
		}
			for (int i = 0; i < maxLength; i++) {
				for (String name : names) {
				if (i < name.length()) {
					result.append(name.charAt(i));
				}
			}
		}
		System.out.println(result);
	}

}
