package com.array_problems;

import java.util.HashMap;
import java.util.Map;

public class MaximumQuantity {

	public static void main(String[] args) {

		String input[] = { "xyz 9", "abc 20", "xyz 21" };
		Map<String, Integer> map = new HashMap();
	

		for (String s : input) {
			String data[] = s.split(" ");
			String name = data[0];
			int quantity = Integer.parseInt(data[1]);

			map.put(name, map.getOrDefault(name, 0) + quantity);
		}
		System.out.println(map);
		int maxQuantity= 0;
		String product = "";
		
		for (Map.Entry<String, Integer> entry : map.entrySet()) {
			if (entry.getValue() > maxQuantity) {
				maxQuantity = entry.getValue();
				product = entry.getKey();
			}
		}
		System.out.println("Maximum Quantity in array: "+ product+ " = "+maxQuantity);
	}
}
