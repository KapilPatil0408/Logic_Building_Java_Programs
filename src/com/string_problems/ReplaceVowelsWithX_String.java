package com.string_problems;

public class ReplaceVowelsWithX_String {
	public static void main(String[] args) {
		String input = "Name";
		StringBuilder sb = new StringBuilder();

		for (char chararcter : input.toCharArray()) {
			if (isVowel(chararcter)) {
				sb.append('x');
			} else {
				sb.append(chararcter);
			}
		}
		System.out.println(sb.toString());
	}

	public static boolean isVowel(char chararcter) {
		if (chararcter == 'a' || chararcter == 'e' || chararcter == 'i' || chararcter == 'o' || chararcter == 'u'
				|| chararcter == 'A' || chararcter == 'E' || chararcter == 'I' || chararcter == 'O'
				|| chararcter == 'U') {
			return true;
		} else {
			return false;
		}
	}

}
