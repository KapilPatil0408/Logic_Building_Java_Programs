package com.array_problems;

public class PrimeNumber_InArray {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		int a[] = { 1, 2, 3, 4, 5, 6, 7, 8, 9 };

		for (int i = 0; i < a.length; i++) {
			boolean isPrime = true;
			if (a[i] > 1) {
				for (int j = 2; j < a[i]; j++) {
					if (a[i] % j == 0) {
						isPrime = false;
						break;
					}
				}

			} else {
				isPrime = false;
			}

			if (isPrime) {
				System.out.println(a[i] + " is prime number");
			}
		}

	}
}
