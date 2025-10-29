package com.array_problems;

import java.util.Arrays;

public class Interview {

	public static void main(String[] args) {
		
		String arr[] = {"Somesh", "Nagesh", "Sarvesh", "Yogesh"};
        String result[] = new String[arr.length];

        // Traverse the array from end to start
        for (int i = 0; i < arr.length; i++) {
            // Take first 3 characters of the current element
            String truncated = arr[arr.length - 1 - i].substring(0, 3);
            result[i] = truncated;
        }

        // Print result as array format
        System.out.print("[");
        for (int i = 0; i < result.length; i++) {
            System.out.print(result[i]);
            if (i != result.length - 1) {
                System.out.print(", ");
            }
        }
        System.out.println("]");

	}

}
