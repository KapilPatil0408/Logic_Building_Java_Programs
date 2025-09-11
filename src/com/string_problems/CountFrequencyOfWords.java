package com.string_problems;

import java.util.HashMap;
import java.util.Map;

public class CountFrequencyOfWords {

	public static void main(String[] args) {

		String input = "Hi my name is kapil kapil";

		Map<String, Integer> map = new HashMap<String, Integer>();

		String inputArray[] = input.split(" ");

		for (String s : inputArray) {
			map.put(s, map.getOrDefault(s, 0) + 1);
		}

		for (Map.Entry<String, Integer> entry : map.entrySet()) {
			System.out.println(entry.getKey() + " = " + entry.getValue());
		}

//		for (String s : inputArray) {
//			if (map.containsKey(s)) {
//				map.put(s, map.get(s) + 1);
//			} else {
//				map.put(s, 1);
//			}
//		}
//
//		for (String s1 : map.keySet()) {
//			System.out.println(s1 + " = " + map.get(s1));
//		}

	}
}
