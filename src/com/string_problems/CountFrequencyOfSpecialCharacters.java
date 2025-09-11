package com.string_problems;

import java.util.HashMap;
import java.util.Map;

public class CountFrequencyOfSpecialCharacters {

	public static void main(String[] args) {

		String input = "1dhr$%#*#$ ty09jbcd &*(!@";
		char inputArray[] = input.toCharArray();
		Map<Character, Integer> freqeuncyMap= new HashMap<Character, Integer>();

		for (char ch : inputArray) {
			if (!((ch >= 'a' && ch <= 'z') || (ch >= 'A' && ch <= 'Z') || (ch >= '0' && ch <= '9')
					|| (ch== ' '))) {
				if(freqeuncyMap.containsKey(ch)) {
					freqeuncyMap.put(ch, freqeuncyMap.get(ch)+1);
				}else {
					freqeuncyMap.put(ch, 1);
				}
			}
		}
		System.out.println(freqeuncyMap);
	}
}
