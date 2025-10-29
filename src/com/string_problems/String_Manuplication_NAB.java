package com.string_problems;

public class String_Manuplication_NAB {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		double number= 123.3456;

		String numberString= String.valueOf(number);
		int indexOfDecimal= numberString.indexOf(".");
		
		System.out.println(numberString.length()-indexOfDecimal-1);
	}

}
