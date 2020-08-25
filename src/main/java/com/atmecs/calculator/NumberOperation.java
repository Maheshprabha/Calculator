package com.atmecs.calculator;

import java.util.Scanner;

public class NumberOperation {

	public void multilpleOperations() {
		@SuppressWarnings("resource")
		Scanner scan = new Scanner(System.in);
		int n, sum = 0, i = 0;
		System.out.println("Enter how many numbers you want sum");
		n = scan.nextInt();
		int a[] = new int[n];
		System.out.println("Enter the " + n + " numbers ");
		while (i < n) {
			System.out.println("Enter  number  " + (i + 1) + ":");
			a[i] = scan.nextInt();
			sum += a[i];
			i++;
		}
		System.out.println("sum is =" + sum);
	}

}

/*
 * System.out.println("Enter how many numbers you want add"); n=scan.nextInt();
 * System.out.println("Enter the "+n+" numbers "); n=scan.nextInt();
 * for(i=0;i<n;i++) { num = scan.nextInt(); sum = sum + num; }
 * System.out.println("sum of all " +n+ " number is " +sum); }
 */
