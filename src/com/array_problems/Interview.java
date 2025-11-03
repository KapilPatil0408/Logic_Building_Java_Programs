package com.array_problems;

import java.util.Arrays;

public class Interview {

	public static void main(String[] args) {
		
		
		//solution 1
		
/*		String arr[] = {"Somesh", "Nagesh", "Sarvesh", "Yogesh"};
        String result[] = new String[arr.length];

        // Traverse the array from end to start
        for (int i = 0; i < arr.length; i++) {
            // Take first 3 characters of the current element
            String truncated = arr[arr.length - 1 - i].substring(0, 3);
            result[i] = truncated;
        }

        // Print result as array format
        System.out.print("[");
        for (int i = 0; i < result.length; i++) {
            System.out.print(result[i]);
            if (i != result.length - 1) {
                System.out.print(", ");
            }
        }
        System.out.println("]");
*/
		
		//solution 2
		
		 String arr[] = {"Somesh", "Nagesh", "Sarvesh", "Yogesh"};
         //{Yog, Sarv, Nag, Som};
 
		 int left= 0; 
		 int right = arr.length -1;
		 
		 while(left < right){
		     String temp = arr[left];
		     arr[left] = arr[right];
		     arr[right] = temp;
		     left++;
		     right--;
		 }
		 System.out.println(Arrays.toString(arr));
		 String output[]= new String[arr.length];
		 
		 for(int i=0; i< arr.length; i++){
		     if(arr[i].equals("Sarvesh")){
		         output[i]= arr[i].substring(0,4);
		     }else {
		         output[i]= arr[i].substring(0,3);
		     }
		 }
		 
		 System.out.println(Arrays.toString(output));
	}

}
