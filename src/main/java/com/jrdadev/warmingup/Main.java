package com.jrdadev.warmingup;

public class Main {
		
	public static <T> void genericMethod(T[] array){
		for(T obj : array) {
			System.out.printf("%s ", obj);
		}
		System.out.println("");
	}
	
	public static <T extends Comparable<T>> T maximun(T x, T y, T z) {
		T max = x;
		
		if(y.compareTo(max) > 0) {
			max = y;
		}
		
		if(z.compareTo(max) > 0) {
			max = z;
		}
		
		return z;
	}

	public class Box<T>{
		private T t;
		
		public void add(T t){
			this.t = t;
		}
	}
	
	public static void main(String[] args) {
		Integer[] numArray = {1,2,3,4,5,6};
		Character[] charArray = {'a', 'b'};
		
		genericMethod(numArray);
		
	}

}
