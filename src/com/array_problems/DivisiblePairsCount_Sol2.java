package com.array_problems;

public class DivisiblePairsCount_Sol2 {

	public static void main(String[] args) {
	
		int[] arr = {5, 9, 36, 74, 52, 31, 42};
        int divisor = 3;
        System.out.println(divisor_pair(arr, divisor)); // Output: 8

	}
	
	public static int divisor_pair(int[] arr, int divisor) {
        int count = 0;
        int n = arr.length;

        for (int i = 0; i < n; i++) {
            for (int j = i + 1; j < n; j++) {
                if ((arr[i] + arr[j]) % divisor == 0) {
                    count++;
                }
            }
        }
        return count;
    }


}
