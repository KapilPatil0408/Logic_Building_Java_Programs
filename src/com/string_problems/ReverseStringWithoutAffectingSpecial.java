package com.string_problems;

import java.util.Arrays;

public class ReverseStringWithoutAffectingSpecial {

	public static void main(String[] args) {

		String input = "#he&ll@o";
		char inputArray[] = input.toCharArray();
		int left = 0;
		int right = inputArray.length - 1;

		while(left<right) {
			if(!(Character.isLetter(inputArray[left]))) {	
				left++;
			}else if(!(Character.isLetter(inputArray[right]))){
				right--;
			}else {
				char temp= inputArray[left];
				inputArray[left]= inputArray[right];
				inputArray[right]= temp;
				left++;
				right--;
				}
			}
		System.out.println(new String(inputArray));
		}
	}


