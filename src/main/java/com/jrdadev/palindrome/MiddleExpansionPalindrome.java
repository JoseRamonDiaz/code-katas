package com.jrdadev.palindrome;

public class MiddleExpansionPalindrome implements Palindrome {
    @Override
    public int maxPalSubStr(String s) {
        if (s.isEmpty() || s.length() == 1) {
            return 1;
        }

        int start = 0;
        int end = 0;

        for (int i = 0; i < s.length(); i++) {
            int len1 = maxPalStr(s, i , i);
            int len2 = maxPalStr(s, i, i + 1);
            int max = Math.max(len1, len2);
            if (max > end - start) {
                start = i - ((max-1)/2);
                end = i + (max / 2);
            }
        }
        return end - start + 1;
    }

    protected int maxPalStr(String s, int left, int right) throws IllegalArgumentException {
        if (right - left > 1 || left > right) {
            throw new IllegalArgumentException("Boundaries need to be consecutive numbers");
        }

        while (left >= 0 && right < s.length()) {
            if (s.charAt(left) == s.charAt(right)) {
                if (left == 0 || right == s.length() - 1) {
                    return getLen(left, right);
                }
                right++;
                left--;
            } else {
                if (right - left == 1) {
                    return 1;
                } else {
                    return getLen(++left, --right);
                }
            }
        }

        return getLen(left, right);
    }

    private int getLen(int left, int right) {
        return right - left + 1;
    }
}
