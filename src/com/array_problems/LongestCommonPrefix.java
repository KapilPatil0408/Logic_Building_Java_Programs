package com.array_problems;

public class LongestCommonPrefix {

	public static void main(String[] args) {
		 String[] strs1 = {"flower", "flow", "flight"};
	        System.out.println(longestCommonPrefix(strs1)); // Output: "fl"

	        String[] strs2 = {"dog", "racecar", "car"};
	        System.out.println(longestCommonPrefix(strs2)); // Output: ""

	}
	
	public static String longestCommonPrefix(String[] strs) {
        if (strs == null || strs.length == 0) {
            return "";
        }

        // Start with the first string as the initial prefix
        String prefix = strs[0];

        // Compare prefix with each string
        for (int i = 1; i < strs.length; i++) {
            while (strs[i].indexOf(prefix) != 0) {
                // Trim last character from prefix
                prefix = prefix.substring(0, prefix.length() - 1);
                
                // If prefix becomes empty, no common prefix exists
                if (prefix.isEmpty()) {
                    return "";
                }
            }
        }
        return prefix;
    }

}
