package com.string_problems;

public class Swap_Stings {

	public static void main(String[] args) {
	
		String str1="abc";
		String str2="def";
		
		System.out.println("String before swapping: "+str1+ " "+ str2);
		
		str1= str1+str2;  // abcdef
		
		str2 = str1.substring(0, str1.length()- str2.length()); 
		
		str1= str1.substring(str2.length());
		
		
		System.out.println("String after swapping: "+str1+ " "+ str2);

	}

}
