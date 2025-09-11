package com.string_problems;

public class ReverseVowelsInString {

	public static void main(String[] args) {
		String input = "Hello";
		String vowels = "aeiouAEIOU";

		char[] inputArray = input.toCharArray();
		int left = 0;
		int right = inputArray.length - 1;

		while (left < right) {
				if(vowels.indexOf(inputArray[left]) ==-1) {
					left++;
				}else if(vowels.indexOf(inputArray[right])==-1) {
					right--;
				}else {
					char temp=inputArray[left];
					inputArray[left]=inputArray[right];
					inputArray[right]=temp;
					left++;
					right--;
				}
			}
		System.out.println("Output:- "+new String(inputArray));
		}
	}


