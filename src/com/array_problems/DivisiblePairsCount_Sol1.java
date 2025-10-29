package com.array_problems;

public class DivisiblePairsCount_Sol1 {

	public static void main(String[] args) {
	
		int[] arr = {5, 9, 36, 74, 52, 31, 42};
        int divisor = 3;
        System.out.println(divisor_pair(arr, divisor)); // Output: 8

	}
	
	public static int divisor_pair(int[] arr, int divisor) {
        int[] remainderCount = new int[divisor];

        for (int num : arr) {
            remainderCount[num % divisor]++;
        }

        int count = 0;

        // Remainder 0 case
        count += (remainderCount[0] * (remainderCount[0] - 1)) / 2;

        // Remainder r with divisor-r
        for (int r = 1; r <= divisor / 2; r++) {
            if (r != divisor - r) {
                count += remainderCount[r] * remainderCount[divisor - r];
            }
        }

        // Special case: divisor even
        if (divisor % 2 == 0) {
            count += (remainderCount[divisor / 2] * (remainderCount[divisor / 2] - 1)) / 2;
        }

        return count;
    }



}
