package com.atmecs.calculator;

import java.util.Scanner;

public class Division {
	public int divisionOperations() {
		int i, n;
		@SuppressWarnings("resource")
		Scanner scan = new Scanner(System.in);
		System.out.print("How many elements you want to divide : ");
		n = scan.nextInt();
		System.out.println("Enter the dividend");
		n = scan.nextInt();
		System.out.println("Enter the divisor");
		i = scan.nextInt();
		if (n==0)
		{
			System.out.println("error!! divisible by 0");
			System.exit(1);
		}
        int sign = 1;
        if(n*1<0) {
        	sign= -1;
        }
		n = Math.abs(n);
		i = Math.abs(i);
		int quotient = 0;
		while (n>=i) {
			n=n-i;
			quotient++;
			}
		System.out.println("Remainder is " + i);
		return sign * quotient;
		
	}
}



