package com.string_problems;

import java.util.HashMap;
import java.util.LinkedHashMap;
import java.util.Map;

public class UniqueCharactersInString {

	public static void main(String[] args) {

		String input = "Programming";
		char inputArray[] = input.toCharArray();

		LinkedHashMap<Character, Integer> hm = new LinkedHashMap();

		for (char c : inputArray) {

//			if(hm.containsKey(c)) {
//				hm.put(c, hm.get(c)+1);
//			}else {
//				hm.put(c, 1);
//			}	

			hm.put(c, hm.getOrDefault(c, 0) + 1);
		}
		
//		for(char c: hm.keySet()) {
//			if(hm.get(c)==1) {
//				System.out.println(c+ " = "+hm.get(c));
//			}
//		}

		for (Map.Entry<Character, Integer> entry : hm.entrySet())
			if (entry.getValue() == 1) {
				System.out.println(entry.getKey());
			}
	}
}
