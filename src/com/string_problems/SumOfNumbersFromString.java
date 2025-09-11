package com.string_problems;

public class SumOfNumbersFromString {

	public static void main(String[] args) {

		String input = "This is 1000 and it should be 20 30 50 100";

		StringBuilder sb = new StringBuilder();
		int sum = 0;
		String inputArray[] = input.split(" ");

		for (String s : inputArray) {
			try {
				sum= sum + Integer.parseInt(s);
			}catch(NumberFormatException e) {
				
			}
		}
		System.out.println(sum);
	}
}
