package com.problem5;

public class CheckStringPangram {

    public static void main(String[] args) {
        
        String input = "The quick brown fox jumps over the lazy dog";
        input = input.toLowerCase();
        System.out.println(input);
        boolean result = checkPangram(input);
        
        if(result) {
            System.out.println("String is pangram");
        } else {
            System.out.println("String is not pangram");
        }
    }

    private static boolean checkPangram(String input) {
        
        if (input.length() < 26) {
            return false;
        }
        
        for (char i = 'a'; i <= 'z'; i++) {
            if (input.indexOf(i) < 0) {
                return false;
            }
        }
        return true;
    }
}