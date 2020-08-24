package com.atmecs.calculator;

import java.util.Scanner;

public class NumberOperation {
        int i,n,sum=0,num;
        
        public void multilpleOperations() {
        @SuppressWarnings("resource")
		Scanner scan = new Scanner(System.in);
        System.out.println("Enter how many numbers you want add");
        n=scan.nextInt();
        System.out.println("Enter the "+n+" numbers ");
        n=scan.nextInt();
        for(i=0;i<n;i++)
        {
        	num = scan.nextInt();
        	sum = sum + num; 
        }
        System.out.println("sum of all " +n+ " number is " +sum);
        }
}
