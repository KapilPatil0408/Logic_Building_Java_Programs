package com.string_problems;

public class String_Manuplation2 {

	public static void main(String[] args) {
		
		String input= "My Name is Venkata Sai";
		// Output: String = "Venkata Name Sai My";
		
		String inputArray[]= input.split(" ");
		int index[] = {3,1,4,0,2};
		StringBuilder result= new StringBuilder();
		
		for(int i: index) {
			result.append(inputArray[i]).append(" ");
		}
		
		System.out.println(result.toString().trim());
		

	}

}
