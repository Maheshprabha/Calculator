package com.atmecs.calculator;

import java.util.Scanner;

public class TwoNumberOperation {
	int input , input1 ,input2;
	int result;
	public void add(int input , int input1) {
		@SuppressWarnings("resource")
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the input");
		input = sc.nextInt();
		System.out.println("Enter the input1");
		input1 = sc.nextInt();
		result = input + input1;
	    System.out.println("addition of the given "   + result);
	    
}

	public void add(int input , int input1 , int input2) {
		@SuppressWarnings("resource")
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the input");
		input = sc.nextInt();
		System.out.println("Enter the input1");
		input1 = sc.nextInt();
        System.out.println("Enter the input2");
        input2 = sc.nextInt();
		result = input + input1 + input2;
	    System.out.println("addition of the given "   + result);
}
}
	
	

	
	
	
	
	
	
	
	
	
	
	
	
	


