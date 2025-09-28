package com.array_problems;

import java.util.Arrays;

public class SortStringArrayAscendingLengthBasis {

	public static void main(String[] args) {

		String countries[] = { "India", "Peru", "Zimbawe", "Brasil", "Canada", "Australia" };

		for (int i = 0; i < countries.length - 1; i++) {
			for (int j = 0; j < countries.length - i - 1; j++) {
				if (countries[j].length() > countries[j + 1].length()) {
					String temp = countries[j];
					countries[j] = countries[j + 1];
					countries[j + 1] = temp;
				}
			}
		}
		System.out.println(Arrays.toString(countries));
	}

}
