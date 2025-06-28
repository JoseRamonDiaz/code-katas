package com.project_euler;

import java.util.HashSet;
import java.util.Objects;
import java.util.Set;

public class AmicableNumbers {
	
	public Set<Pair> getAmiableNumbers(int n) {
		Set<Pair> amicableNumbers = new HashSet<>();
		int[] divisorSum = getDivisorSumNaive(n);
		
		for (int i = 0; i < divisorSum.length; i++) {
			if (divisorSum[i] > i) {
				if (divisorSum[i] < divisorSum.length && divisorSum[divisorSum[i]] == i) {
					amicableNumbers.add(new Pair(i, divisorSum[i]));
				}
			}
		}
		
		return amicableNumbers;
	}
	
	public int[] getDivisorSumNaive(int n) {
		int[] sums = new int[n+1];
		
		for (int i = 2; i <= n; i++) {
			sums[i] = getSumSqrt(i);
		}
		
		return sums;
	}
	
	private int getSumSqrt(int n) {
		int sum = 1;
		
		for (int i = 2; i < Math.sqrt(n); i++) {
			if (n % i == 0) {
				sum += i;
				
				if (n/i != i) {
					sum += n/i;
				}
			}
		}
		
		return sum;
	}

	private int getSumNaive(int n) {
		int sum = 0;
		
		for (int i = 1; i <= n/2; i++) {
			if (n % i == 0)
				sum += i;
		}
		
		return sum;
	}
	
	class Pair {
		private int a;
		private int b;
		
		public Pair(int a, int b) {
			if (a < b) {
				this.a = a;
				this.b = b;
				return;
			} 
			
			this.a = b;
			this.b = a;
		}

		public int getA() {
			return a;
		}

		public int getB() {
			return b;
		}

		@Override
		public int hashCode() {
			return Objects.hash(a, b);
		}

		@Override
		public boolean equals(Object obj) {
			if (this == obj)
				return true;
			
			if (obj == null)
				return false;
			
			if (getClass() != obj.getClass())
				return false;
			
			Pair other = (Pair) obj;
			
			return a == other.a && b == other.b;
		}

		@Override
		public String toString() {
			return "Pair [" + a + ", " + b + "]";
		}
	}
}
