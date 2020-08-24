package com.atmecs.calculation;

import java.util.Scanner;

class Hidden extends Multi {

        // TODO Auto-generated method stub
		public  int result;
		public int input1,input2;
		
			//@SuppressWarnings("resource")
	        Scanner sc = new Scanner(System.in);
	        @Override
			void mulCalculation() {
				// TODO Auto-generated method stub
		    System.out.println("enter the input1");
		    input1 = sc.nextInt();
		    System.out.println("enter the input2");
		    input2 = sc.nextInt();
		    result = input1 * input2;
		    System.out.println("multiplication of the given "   + result);
		}
	}


		
	
	


