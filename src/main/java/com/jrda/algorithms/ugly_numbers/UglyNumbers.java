package com.jrda.algorithms.ugly_numbers;

/**
 * Problem https://leetcode.com/problems/ugly-number-ii/
 */
public class UglyNumbers {
    private boolean[] primas = new boolean[5000];
    private int lastNumberUsed = 1;

    public boolean[] calculatePrimeNumbers(int n) {
        if (n == 0 || n == 1 || n == lastNumberUsed) {
            return primas;
        }

        //calculate the next number
        lastNumberUsed++;

        for (int i = lastNumberUsed; i <= n; i++) {
            int j = 2;
            int currentValue = i * j;
            while (currentValue < 5000) {
                primas[currentValue] = true;
                j++;
                currentValue = i * j;
            }
        }
        lastNumberUsed = n;
        return primas;
    }
}
