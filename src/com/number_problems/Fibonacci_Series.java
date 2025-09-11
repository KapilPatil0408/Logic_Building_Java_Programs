package com.number_problems;

public class Fibonacci_Series {

	public static void main(String[] args) {

		fibonacciSeries(1);

	}

	public static void fibonacciSeries(int n) {
		int firstNumber = 0;
		int secondNumber = 1;
		int next;

		if (n == 1) {
			System.out.print(firstNumber);
			System.exit(0);
		}
		System.out.print(firstNumber + " " + secondNumber + " ");

		for (int i = 2; i < n; i++) {
			next = firstNumber + secondNumber;
			System.out.print(next + " ");
			firstNumber = secondNumber;
			secondNumber = next;
		}
	}
}
