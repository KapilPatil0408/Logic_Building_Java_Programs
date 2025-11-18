package com.string_problems;

public class longest_Prefix_Suffix {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		
		
		String input= "ababcdabab";
		String longest = "";
		
		
		for(int i=1; i <input.length(); i++) {
			String prefix = input.substring(0, i);
			String suffix = input.substring(input.length()-i);
			
			if(prefix.equals(suffix)) {
				longest = prefix;
			}
		}
		
		System.out.println(longest);

	}

}
