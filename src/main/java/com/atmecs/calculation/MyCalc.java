package com.atmecs.calculation;

public class MyCalc extends Addition {
	public static void main(String[] args) {
	
	Addition add = new Addition();
	Substract sub = new Substract();
	//Calculator cal = new Calculator(input1, input1);
    //cal.Add();
	
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
