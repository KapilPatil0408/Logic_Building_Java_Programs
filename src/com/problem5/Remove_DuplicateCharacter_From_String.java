package com.problem5;


import java.util.LinkedHashSet;
import java.util.Set;

public class Remove_DuplicateCharacter_From_String {

	public static void main(String[] args) {

		String input="java";
		char inputArray[]=input.toCharArray();
		Set<Character> linkedHashSet= new LinkedHashSet<Character>();
	//	String result="";
		
		StringBuilder sb= new StringBuilder();
		
		for(char character : inputArray) {
			if(linkedHashSet.add(character))
//				result=result+character;  // J //Ja //Jav - three strings are created--> not optimized code
				sb.append(character);
		}
		System.out.println(sb);
	}
}
