package com.jrdadev.katas;

public class BinarySearch {
	int[] array = null;
	int lookingFor;

	public int search1(int n, int[] array) {
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
	
	public int search(int lookingFor, int[] array) {
		this.array = array;
		this.lookingFor = lookingFor;
		return recursiveSearch(0, array.length - 1);
	}
	
	private int recursiveSearch(int start, int end){
		int notFound = -1;
		
		if(start > end) {
			return notFound;
		}
		
		int pos = (start + end) / 2;
		if(array[pos] == lookingFor) {
			return pos;
		}
		
		if(lookingFor > array[pos]) {
			return recursiveSearch(pos + 1, end);
		}
		
		if(lookingFor < array[pos]) {
			return recursiveSearch(start, end - 1);
		}
		
		//this code is never reached, but compiler don't think like this
		return notFound;
	}
	
}
