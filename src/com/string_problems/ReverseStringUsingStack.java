package com.string_problems;

import java.util.Stack;

public class ReverseStringUsingStack {

	public static void main(String[] args) {

		String input = "Hello";
		char dataArray[] = input.toCharArray();
		StringBuilder result = new StringBuilder();

		Stack<Character> stack = new Stack<Character>();

		for (char data : dataArray) {
			stack.push(data);
		}

		System.out.println(stack);

		while (!stack.isEmpty()) {
			char c = stack.pop();
			result.append(c);
		}

		System.out.println(result.toString());
	}

}
