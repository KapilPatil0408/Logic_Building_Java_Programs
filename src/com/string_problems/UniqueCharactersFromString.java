package com.string_problems;

import java.util.LinkedHashSet;

public class UniqueCharactersFromString {

	public static void main(String[] args) {

		String input="abbacdaab";
		StringBuilder sb= new StringBuilder();
		LinkedHashSet<Character> lh= new LinkedHashSet();
		
		for(char c: input.toCharArray()) {
			if(lh.add(c)) {
				sb.append(c);
			}
		}
		System.out.println(sb.toString());
	}

}
