package com.string_problems;

public class CaptilizeFirstLetterOfString {

	public static void main(String[] args) {
		String input= "mY nAMe iS kAPil paTIl";
		StringBuilder sb= new StringBuilder();
		boolean capitalizeNext= true;
		
		for(char c: input.toCharArray()) {
			if(Character.isWhitespace(c)) {
				sb.append(c);
				capitalizeNext= true;
			}else if(capitalizeNext) {
				sb.append(Character.toUpperCase(c));
					capitalizeNext= false;
			}else {
				sb.append(Character.toLowerCase(c));
			}
		}	
		System.out.println(sb.toString());
	}
}
