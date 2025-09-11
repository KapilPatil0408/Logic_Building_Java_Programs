package com.string_problems;

public class EvenWordsOfString {

	public static void main(String[] args) {
		String input="sky is blue and vast";
		String data[]=input.split(" ");
		
//		for(int i=0; i<data.length;i++) {
//			if(data[i].length() % 2==0) {
//				System.out.println(data[i]);
//			}
//		}
		
		for(String word:data) {
			if(word.length()%2==0) {
				System.out.println(word);
			}
		}

	}

}
