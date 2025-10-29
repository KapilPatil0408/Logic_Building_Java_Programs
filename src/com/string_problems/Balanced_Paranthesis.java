package com.string_problems;

import java.util.Stack;

public class Balanced_Paranthesis {

	public static void main(String[] args) {
		String input = "{[]";
		boolean b = balancedParanthesis(input);
		System.out.println(b);
	}

	private static boolean balancedParanthesis(String input) {
		char c[] = input.toCharArray();
		Stack<Character> stack = new Stack<Character>();

		for (char current : c) {
			if (current == '(' || current == '{' || current == '[') {
				stack.push(current);
			} else if (current == ')' || current == '}' || current == ']') {
				if (stack.isEmpty()) {
					return false; // Mismatch occurred! No opening bracket is present!
				}
				char topChar = stack.pop();
				if (current == ')' && topChar != '(' || current == '}' && topChar != '{'
						|| current == ']' && topChar != '[') {
					return false;
				}
			}
		}
		return stack.isEmpty();
	}
}