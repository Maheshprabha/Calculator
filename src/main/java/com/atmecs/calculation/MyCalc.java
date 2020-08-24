package com.atmecs.calculation;

public class MyCalc extends Addition {
	public static void main(String[] args) {
	
	Addition add = new Addition();
	Substract sub = new Substract();
	//Multiplication mul = new Multiplication();
	Division div = new Division();
	add.additionCalculation();
	sub.subCalculation();
	//mul.mulCalculation();
	div.divCalculation();
	Multi mul = new Hidden();
	mul.mulCalculation();
	
	
	}
	

}
