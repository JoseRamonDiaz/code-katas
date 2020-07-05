package com.jrda.algorithms.ugly_numbers;

/**
 * Problem https://leetcode.com/problems/ugly-number-ii/
 */
public class UglyNumbers {
   public int nthUglyNumber(int n) {
       int[] uglyNum = new int[n];
       int i2 = 0, i3 = 0, i5 = 0;

       int next2mul = 2, next3mul = 3, next5mul = 5;
       int next = 1;
       uglyNum[0] = 1;

       for (int i = 1; i < n; i++) {
           next = min(next2mul, next3mul, next5mul);
           uglyNum[i] = next;
           if (next == next2mul){
               i2++;
               next2mul = uglyNum[i2] * 2;
           }

           if (next == next3mul) {
               i3++;
               next3mul = uglyNum[i3] * 3;
           }

           if (next == next5mul) {
               i5++;
               next5mul = uglyNum[i5] * 5;
           }
       }

       return next;
   }

   protected int min(int a, int b, int c) {
       if (a < b) {
           return Math.min(a, c);
       } else {
           return Math.min(b, c);
       }
   }
}
