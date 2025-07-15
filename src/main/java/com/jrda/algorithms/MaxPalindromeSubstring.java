package com.jrda.algorithms;

public class MaxPalindromeSubstring {
	public String get(String s) {
		char[] charArray = s.toCharArray();
		int palLength = 0;
		int start = 0;
		int end = 0;
		
		for (int i = 0; i < charArray.length; i++) {
			//get odd palindrome
			int l = i, r = i;
			while (l >= 0 && r < charArray.length && charArray[l] == charArray[r]) {
				if (palLength < r - l + 1) {
					palLength = r - l + 1;
					start = l;
					end = r;
				}
				l--;
				r++;
			}
			
			//get even palindrome
			l = i;
			r = i + 1;
			while (l >= 0 && r < charArray.length && charArray[l] == charArray[r]) {
				if (palLength < r - l + 1) {
					palLength = r - l + 1;
					start = l;
					end = r;
				}
				l--;
				r++;
			}
		}
		
		return s.substring(start, end + 1);
	}
}
