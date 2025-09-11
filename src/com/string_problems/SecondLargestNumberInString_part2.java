package com.string_problems;

import java.util.Set;
import java.util.TreeSet;

public class SecondLargestNumberInString_part2 {

	public static void main(String[] args) {

		String input = "abc6712334522";

		TreeSet<Integer> dataSet = new TreeSet<>();

		for (char character : input.toCharArray()) {
			if (Character.isDigit(character)) {
				int num = character - '0';
				dataSet.add(num);
			}
		}
		System.out.println(dataSet);
		dataSet.pollLast();
		System.out.println(dataSet);
		System.out.println("Second largest number in String is: " + dataSet.last());
	}
}
