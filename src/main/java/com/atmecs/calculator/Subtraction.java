package com.atmecs.calculator;

import java.util.Scanner;

public class Subtraction {
	int a,n,i; 
	int sum;
	boolean loop = true;
	public void subtractionMultiple() {
		@SuppressWarnings("resource")
		Scanner scan = new Scanner(System.in);
        System.out.println("Enter how many numbers you want sub");
        n=scan.nextInt();
        //System.out.println("Enter the "-n-" numbers ");

        int sum = 0;
        for(i=1;i<=n;)
        {
            System.out.println("Enter the "+n+" numbers ");
            a=scan.nextInt();
        	sum=a-sum;
            //System.out.println("sum of all " +n+ " number is " -sum);
	
        }
	}
}
