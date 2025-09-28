package com.string_problems;

public class CountChangingKeyString {

	public static void main(String[] args) {
		
		String input="cddrtcC";
		int count=0;
		
		char lastKey= input.toCharArray()[0];
		lastKey=Character.toLowerCase(lastKey);
		
		for(int i=0; i< input.length(); i++) {
			char currentKey= input.toCharArray()[i];
			currentKey= Character.toLowerCase(currentKey);
			
			if(currentKey != lastKey) {
				count++;
			}
			lastKey=currentKey;
			
		}

		System.out.println("Total number of keys changed is= "+count);
	}

}
