package com.string_problems;

public class CountCharacterWOhavingSpaceBeforeAfter_String {

	public static void main(String[] args) {

		String input = "my name is kapil";
		int count = 0;
		char c[]= input.toCharArray();
		for (int i=0; i< c.length; i++) {
			char data= c[i];
			
			if(data==' ') 
				continue;
				
		boolean whiteSpaceAfterChar= i < c.length-1 && c[i+1]==' ';
		boolean whiteSpaceBeforeChar= i >0 && c[i-1]==' ';
		
			if(!whiteSpaceAfterChar & !whiteSpaceBeforeChar) {
				count++;
			}
		}
		System.out.println("Count is: "+count);
	}
}
