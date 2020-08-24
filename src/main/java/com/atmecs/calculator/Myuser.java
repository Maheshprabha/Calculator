package com.atmecs.calculator;

public class Myuser {
	public static void main(String[] args) {
		//NumberOperation add = new NumberOperation();
		//add.multilpleOperations();
		//Subtraction sub = new Subtraction();
		//sub.subtractionMultiple();
		Multiplication mul = new Multiplication();
		mul.multilpleOperations();
		MenuDriven cal = new MenuDriven();
		cal.calculator();
	}
}
