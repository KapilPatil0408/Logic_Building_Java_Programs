package com.string_problems;

public class ReverseFirstWordInString {

	public static void main(String[] args) {

		String input = "Hello world from java";
		reverseFirstWord(input);
//		StringBuilder sb = new StringBuilder();
//		String inputArray[] = input.split("\\s");
//
//		char c[] = inputArray[0].toCharArray();
//
//		int right = c.length - 1;
//		int left = 0;
//
//		while (left < right) {
//			char temp = c[left];
//			c[left] = c[right];
//			c[right] = temp;
//			left++;
//			right--;
//		}
//		sb.append(c);
//
//		for (int i = 1; i < inputArray.length; i++) {
//			sb.append(" ").append(inputArray[i]);
//		}
//		System.out.println(sb.toString());

//		for(int j=inputArray[0].length()-1; j>=0; j--) {
//			sb.append(inputArray[0].charAt(j));
//		}
//		
//		for(int i=1; i<inputArray.length; i++) {
//			sb.append(" ").append(inputArray[i]);
//		}
//		
//		System.out.println(sb.toString());
	}

	private static void reverseFirstWord(String input) {
		if (input == null || input.isEmpty()) {
			System.out.println("Cannot reverse the string");
		} else {
			String words[] = input.split(" ", 2);
			char charArray[] = words[0].toCharArray();
			int left = 0;
			int right = charArray.length - 1;

			while (left < right) {
				char temp = charArray[left];
				charArray[left] = charArray[right];
				charArray[right] = temp;
				left++;
				right--;
			}
			String reverseFirstWord=new String(charArray);
			System.out.println(reverseFirstWord+" "+words[1]);
		}
	}
}
