package com.string_problems;

public class ReverseLastWordInString {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		String input = "Hello world from java";
		int lastSpaceIndex = input.lastIndexOf(" ");
		
		String firstString = input.substring(0, lastSpaceIndex + 1 );
		String lastString = input.substring(lastSpaceIndex +1 );
		
		char charArray[] =lastString.toCharArray();
		
		int left = 0;
		int right = charArray.length - 1;

		while (left < right) {
			char temp = charArray[left];
			charArray[left] = charArray[right];
			charArray[right] = temp;
			left++;
			right--;
	}
		
		String result  = firstString + new String(charArray);
		
		System.out.println(result);

}
}
