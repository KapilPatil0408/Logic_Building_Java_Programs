package com.array_problems;

public class AdjacentPairGrouping {

	public static void main(String[] args) {
	
		int[] arr = {4, 2, 5, 8, 7, 3, 7};
        System.out.println(evenSum(arr)); // Output: 2

	}
	
	
	public static int evenSum(int[] arr) {
        int count = 0;
        int i = 0;

        while (i < arr.length - 1) { // ensure i+1 exists
            if ((arr[i] + arr[i + 1]) % 2 == 0) {
                count++;
                i += 2; // skip next to avoid overlap
            } else {
                i += 1; // just move one step
            }
        }

        return count;
    }

}
