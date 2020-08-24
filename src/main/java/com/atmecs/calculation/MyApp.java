package com.atmecs.calculation;

public class MyApp extends Substract {
	@Override
	public void subCalculation() {
		System.out.println("subtraction of two numbers");
	
	}
	public static void main(String args[]) {
		Substract sub = new Substract();
		sub.subCalculation();
	}
}

