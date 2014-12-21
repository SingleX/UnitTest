package net.singlex.junit;

public class Fibonacci {
	public static void main(String[] args) {
		int nums = compute(6);
		System.out.println(nums);
	}

	// 0, 1, 1, 2, 3, 5, 8, 13, 21, 34, 55, 89, 144, ...
	public static int compute(int n) {
		if (n == 0)
			return 0;
		if (n <= 1)
			return 1;
		return compute(n - 1) + compute(n - 2);
	}
}