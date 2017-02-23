package com.fcat.test;

public class Math {

	public int getFact(int num) {

		if (num < 0) {
			throw new IllegalArgumentException();
		}
		if (num == 0) {
			return 1;
		} else if (num > 0) {
			int i, fact = 1;
			int number = num;// It is the number to calculate factorial
			for (i = 1; i <= number; i++) {
				fact = fact * i;
			}
			System.out.println("Factorial of " + number + " is: " + fact);

			return fact;

		}
		return 1;
	}

	public int testTimeExecution() {
		int j = 0;
		for (int i = 1; i < 2; i++) {
			System.out.println(" time excception" + i);
		}
		return j;
	}

	public boolean isEvenNumber(int number) {

		boolean result = false;
		if (number % 2 == 0) {
			result = true;
		}
		return result;
	}
}