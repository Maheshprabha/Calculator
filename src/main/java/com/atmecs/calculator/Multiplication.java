package com.atmecs.calculator;

import java.util.Scanner;

public class Multiplication {
	 int i,n, product=1,num;
     
     public void multilpleOperations() {
     @SuppressWarnings("resource")
		Scanner scan = new Scanner(System.in);
     System.out.println("Enter how many numbers you want multiply");
     n=scan.nextInt();
     System.out.println("Enter the "+n+" numbers ");
     for(i=1;i<n;i++)
     {
     	num = scan.nextInt();
     	product *= num; 
     }
     System.out.println("product of all " +product);
     }
}


