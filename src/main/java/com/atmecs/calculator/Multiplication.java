package com.atmecs.calculator;

import java.util.Scanner;

public class Multiplication {

	public void multilpleOperations() {
		int i, n;
		@SuppressWarnings("resource")
		Scanner scan = new Scanner(System.in);
		System.out.print("How many elements you want to multiply : ");
		n = scan.nextInt();

		int a[] = new int[n];
		for (i = 0; i < n; i++) {
			System.out.print("Enter " + (i + 1) + " Element : ");
			a[i] = scan.nextInt();
		}
        for (i = 1; i < n; i++) {
			int j = 0, sum = 0;
			while (j < a[i]) {
				sum += a[i - 1];
				j++;
			}
			a[i] = sum;
		}
		System.out.println("\nMultiplication of " + n + " Numbers :" + a[n - 1] + " \n");
	}
}
