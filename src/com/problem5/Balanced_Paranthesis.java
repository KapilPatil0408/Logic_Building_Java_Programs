package com.problem5;

import java.util.Stack;

public class Balanced_Paranthesis {

	public static void main(String[] args) {
		String input = "{[((())";
		boolean b = balancedParanthesis(input);
		System.out.println(b);
	}

	private static boolean balancedParanthesis(String input) {
		char c[] = input.toCharArray();
		Stack<Character> stack = new Stack<Character>();

		for (char current : c) {
			if (current == '(' || current == '{' || current == '[') {
				stack.push(current);
			} else {
				if (stack.isEmpty()) {
					return false;
				} else {
					char topchar = stack.pop();
					if (topchar != '(' || topchar != '{' || topchar != '[') {
						return false;
					}
				}
			}
		}
		return stack.isEmpty();
	}
}
