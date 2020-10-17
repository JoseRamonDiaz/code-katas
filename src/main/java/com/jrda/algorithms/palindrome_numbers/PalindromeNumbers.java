package com.jrda.algorithms.palindrome_numbers;

public class PalindromeNumbers {

    public static boolean isPalindrome(int num) {

        if (num < 0) {
            return false;
        } else {
            int accum = 0;
            int workingNum = num;

            while(workingNum > 0) {
                int rightDigit = workingNum % 10;
                //remove last digit from workingNum
                workingNum = workingNum / 10;

                accum = accum * 10 + rightDigit;
            }

            return accum == num;
        }

    }

}