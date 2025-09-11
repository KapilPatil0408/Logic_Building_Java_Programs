package com.string_problems;

public class NameShortnerString {

	public static void main(String[] args) {

		String fullName = "Kapil Vilas Patil";
		String nameArray[] = fullName.trim().split(" ");

		StringBuilder sb = new StringBuilder();

		for (int i = 0; i < nameArray.length - 1; i++) {
			sb.append(nameArray[i].charAt(0)).append(". ");
		}
		sb.append(nameArray[nameArray.length - 1]);
		System.out.println(sb.toString());
	}
}
