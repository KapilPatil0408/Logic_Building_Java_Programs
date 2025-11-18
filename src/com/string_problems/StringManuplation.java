package com.string_problems;

public class StringManuplation {

	public static void main(String[] args) {

		String input = "Tomorrow";

		StringBuilder sb = new StringBuilder();
		char[] character = input.toCharArray();
		int oCount = 0;
		for (char ch : character)
			if (ch == 'o' || ch == 'O') {
				oCount++;
				sb.append("@".repeat(oCount));
			} else {
				sb.append(ch);
			}
		System.out.println(sb);

	}

}
