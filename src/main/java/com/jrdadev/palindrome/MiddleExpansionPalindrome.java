package com.jrdadev.palindrome;

public class MiddleExpansionPalindrome implements Palindrome {
    @Override
    public int maxPalSubStr(String s) {
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

        int cpLeft = left;
        int cpRight = right;

        if (s.isEmpty()) {
            return 0;
        }

        while (left >= 0 && right < s.length()) {
            if (s.charAt(left) == s.charAt(right)) {
                if (left == 0 || right == s.length() - 1) {
                    return getLen(left, right);
                }
                right++;
                left--;
            } else { //stop the search and we need to get back to the last pointers that were palindrome
                //don't want to create a left bigger than right
                //only update values if we changed'em before
                if (right - left > 1 && right != cpRight && left != cpLeft) {
                    right--;
                    left++;
                    //consecutive values in left and right
                } else if (right - left == 1) {
                    return 1;
                }


                return getLen(left, right);
            }
        }

        return getLen(left, right);
    }

    private int getLen(int left, int right) {
        return right - left + 1;
    }
}
