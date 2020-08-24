package com.atmecs.calculation;

import java.util.Scanner;

public class Calculator  {
	
	    private int input1, input2;
	    int result;
            

	    public int getInput1() {
			return input1;
		}

		public void setInput1(int input1) {
			this.input1 = input1;
		}

		public int getInput2() {
			return input2;
		}

		public void setInput2(int input2) {
			this.input2 = input2;
		}

		public int getResult() {
			return result;
		}

		public void setResult(int result) {
			this.result = result;
		}

		Calculator(int input1, int input2) {
	        this.input1 = input1;
	        this.input2 = input2;
	    }

	    public int Add() {
	       
			@SuppressWarnings("resource")
			Scanner sc = new Scanner(System.in);
			System.out.println("enter the input1");
		    input1 = sc.nextInt();
		    System.out.println("enter the input2");
		    input2 = sc.nextInt();
		    result = input1 + input2;
		    System.out.println("addition of the given "   + result);
			return result;
	    }
}

	    /*}
	    public int Subtract() {
	        return num1 - num2;
	    }
	    public int Multiply() {
	        return num1 * num2;
	    }
	    public int Divide() {
	        return num1 / num2;
	    }
	    
	    }
	}*/


	
	