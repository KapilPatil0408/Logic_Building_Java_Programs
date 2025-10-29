package com.string_problems;

public class StringManipulation {

	public static void main(String[] args) {

		String input = "99956";
		StringBuilder sb = new StringBuilder();

		for (int i = 0; i < input.length()-1; i++) {
			sb.append(input.charAt(i));
			int currentNumber = Character.getNumericValue(input.charAt(i));
			int nextNumber = Character.getNumericValue(input.charAt(i+1));

			if ((currentNumber % 2 != 0) && (nextNumber % 2 != 0) && (currentNumber == nextNumber)) {
				sb.append("-");
			}
		}
		sb.append(input.charAt(input.length()-1));

		System.out.println(sb);
		

	}

}
