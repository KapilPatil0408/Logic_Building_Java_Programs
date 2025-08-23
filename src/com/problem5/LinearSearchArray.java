package com.problem5;

public class LinearSearchArray {

	public static void main(String[] args) {
		
		int numbers[]= {10,20,30,40,5,6,50};
		
		int key=30;
		boolean isPresent=false;
		int positionIndex=-1;
		
		for(int i=0; i<numbers.length; i++) {
			if(numbers[i]==key) {
				isPresent=true;
				positionIndex=i;
				break;
			}
		}

/*		for(int num:numbers) {
			if(num==key) {
				isPresent=true;
				break;
			}
		}
*/		
		if(isPresent) {
			System.out.println("Value found in array= "+positionIndex);
		}else {
			System.out.println("Value is not found in array");
		}
	}

}
