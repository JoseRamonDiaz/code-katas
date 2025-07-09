package com.project_euler;

public class Amicables {
  public static void main(String[] args) {
    for (int a = 2; a < 10000; a++) {
      int b = sumDivisors(a);
      if (b > a && b < 10000 && sumDivisors(b) == a) {
        System.out.println("(" + a + ", " + b + ")");
      }
    }
  }

  static int sumDivisors(int n) {
    int sum = 1;
    for (int i = 2; i <= Math.sqrt(n); i++) {
      if (n % i == 0) {
        sum += i;
        int other = n / i;
        if (other != i)
          sum += other;
      }
    }
    return sum;
  }
}
