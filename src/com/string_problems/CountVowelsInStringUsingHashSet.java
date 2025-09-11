package com.string_problems;

import java.util.HashSet;
import java.util.Set;

public class CountVowelsInStringUsingHashSet {

	public static void main(String[] args) {
		
		String input="Apple";
		int vowelsCount=0;
		
		Set<Character> vowelSet= new HashSet<Character>();
		vowelSet.add('a');
		vowelSet.add('e');
		vowelSet.add('i');
		vowelSet.add('o');
		vowelSet.add('u');
		vowelSet.add('A');
		vowelSet.add('E');
		vowelSet.add('I');
		vowelSet.add('O');
		vowelSet.add('U');
		
		for(int i=0; i<input.length();i++) {
			if(vowelSet.contains(input.charAt(i))){
				vowelsCount++;
			}
		}
		System.out.println(vowelsCount);
		

	}

}
