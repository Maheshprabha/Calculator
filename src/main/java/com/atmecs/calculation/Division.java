package com.atmecs.calculation;

import java.util.Scanner;

public class Division {
	
		 int result;
		 int input1,input2;
		
		public void divCalculation() {
			@SuppressWarnings("resource")
			Scanner sc = new Scanner(System.in);
			System.out.println("enter the input1");
		    input1 = sc.nextInt();
		    System.out.println("enter the input2");
		    input2 = sc.nextInt();
		    result = input1 / input2;
		    System.out.println("division of the given "   + result);
		}

	}

