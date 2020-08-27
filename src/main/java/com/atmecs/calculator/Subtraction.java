package com.atmecs.calculator;

import java.util.Scanner;

public class Subtraction {
	int a,n,i; 
	int sum;
	boolean loop = true;
	public void subtractionMultiple() {
		@SuppressWarnings("resource")
		Scanner scan = new Scanner(System.in);
		loop=true;
        System.out.println("Enter how many numbers you want sub");
        n=scan.nextInt();
        //System.out.println("Enter the "+i+" numbers ");
        int sum = 0;
        for(i=1;i<=n;)
        {
            System.out.println("Enter the "+i+" numbers ");
            a=scan.nextInt();
        	sum=a-sum;
        	i++;
        	System.out.println("subtract of all number is " +sum);
        }while(loop);
	}
}
