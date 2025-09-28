package com.string_problems;

public class StringFunction {

	public static void main(String[] args) {
		String str = stringFunction(5);
		System.out.println(str);

	}

	public static String stringFunction(int n) {
		// StringBuilder result = new StringBuilder();

//		for (int i = 0; i < n; i++) {
//			result.append(i % 2==0 ? "x":"-");

//			if (i % 2 == 0) {
//				result.append("x");
//			}else {
//				result.append("-");
//			}

//		}
		// return result.toString();
		String repeated = "x-".repeat((n + 1) / 2);
		return repeated.substring(0,5);
	}

}
