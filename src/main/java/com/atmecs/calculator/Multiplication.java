package com.atmecs.calculator;

import java.util.Scanner;

@SuppressWarnings("serial")
public class Multiplication extends Exception {

	@SuppressWarnings("unused")
	public void multilpleOperations() {
		int i, n, sum;
		@SuppressWarnings("resource")
		Scanner scan = new Scanner(System.in);
		System.out.print("How many elements you want to multiply : ");
		int size = scan.nextInt();
		try {

			int myArray[] = new int[size];
			int product = 1;
			System.out.println("Enter the elements ");
			for (int i = 0; i < size; i++) {
				myArray[i] = scan.nextInt();
				product = product * myArray[i];
			}
			System.out.println("Sum of the elements of the array ::" + product);

		} catch (Exception ex) {
			

		}
	}
}
