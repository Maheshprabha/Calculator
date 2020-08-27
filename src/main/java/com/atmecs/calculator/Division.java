package com.atmecs.calculator;

import java.util.Scanner;

public class Division {
	public int divisionOperations() {
	    
	    int dividend;
	    int divisior;
		int quoitent=1;
        @SuppressWarnings("resource")
		Scanner scan = new Scanner(System.in);
		System.out.print("How many elements you want to divide : ");
	   dividend = scan.nextInt();
		System.out.println("Enter the dividend");
		divisior = scan.nextInt();
		System.out.println("Enter the divisor");{
			{
	     int[] a = 1;
		for(int i=0; i<=a.length-1;i++)
			{
			quoitent=dividend/divisior;
			divisior=quoitent;

			if(i<a.length-2)
			{
				dividend=a[i+1];
			}

			}
			System.out.println("The division of the numbers is:"+quoitent);
			}

		
	}
		return divisior;
	}

}

