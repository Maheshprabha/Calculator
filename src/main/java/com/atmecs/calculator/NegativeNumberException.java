package com.atmecs.calculator;

@SuppressWarnings("serial")
public class NegativeNumberException extends Exception {
	public NegativeNumberException() {
		super("NegativeNumberException");
		}
		
	
public NegativeNumberException(String msg) {
	 super(msg);
	
}

}
