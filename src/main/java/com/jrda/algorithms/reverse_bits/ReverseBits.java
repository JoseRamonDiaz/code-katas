package com.jrda.algorithms.reverse_bits;

public class ReverseBits {
    public int reverseBits(int n) {
        int result = 0;
        int offset = 31;

        while (n != 0) {
            //get last bit ot the right
            int rightBit = n & 1;

            //if bit equals 1 add it to the number
            if (rightBit == 1) {
                result += 1 << offset;
            }

            //reduce offset
            offset--;

            //remove bit from n
            n >>>= 1;
        }

        return result;
    }
}
