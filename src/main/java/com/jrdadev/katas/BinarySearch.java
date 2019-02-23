package com.jrdadev.katas;

public class BinarySearch {

	public int search(int n, int[] array) {
		int start = 0;
		int end = array.length - 1;
		int pos = (start + end) / 2; 
	
		while(start <= end) {
			pos = (start + end) / 2;
			if(n == array[pos]) {
				return pos;
			}
			
			if(n > array[pos]) {
				start = pos + 1;
			}
			
			if(n < array[pos]) {
				end = pos - 1;
			}
		}
		return -1;
	}
	
}
