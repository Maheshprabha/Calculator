package com.atmecs.calculator;

import java.util.Scanner;
import java.util.Stack;

public class Evaluation {
    public int evaluate() 
    { 
        
		String exp="";
		char[] tokens = exp.toCharArray(); 
        @SuppressWarnings({ "resource", "unused" })
		Scanner scan = new Scanner("System.in");
		System.out.print("enter expression");

         // Stack for numbers 
        Stack<Integer> values = new Stack<Integer>(); 
  
        // Stack for Operator 
        Stack<Character> ops = new Stack<Character>(); 
  
        for (int i = 0; i < tokens.length; i++) 
        { 
             // Current token is a whitespace
            if (tokens[i] == ' ') 
                continue; 
  
            // Current token is a number, push it to stack for numbers 
            if (tokens[i] >= '0' && tokens[i] <= '9') 
            { 
                StringBuffer sbuf = new StringBuffer(); 
                 
                while (i < tokens.length && tokens[i] >= '0' && tokens[i] <= '9') 
                    sbuf.append(tokens[i++]); 
                values.push(Integer.parseInt(sbuf.toString())); 
            } 
  
            // Current token is an opening brace, push it to 'ops' 
            else if (tokens[i] == '(') 
                ops.push(tokens[i]); 
  
            // Closing brace encountered, solve entire brace 
            else if (tokens[i] == ')') 
            { 
                while (ops.peek() != '(') 
                  values.push(applyOp(ops.pop(), values.pop(), values.pop())); 
                ops.pop(); 
            } 
  
            // Current token is an operator. 
            else if (tokens[i] == '+' || tokens[i] == '-' || 
                     tokens[i] == '*' || tokens[i] == '/') 
            { 
                while (!ops.empty() && hasPrecedence(tokens[i], ops.peek())) 
                  values.push(applyOp(ops.pop(), values.pop(), values.pop())); 
  
                // Push current token 
                ops.push(tokens[i]); 
            } 
        } 
  
        while (!ops.empty()) 
            values.push(applyOp(ops.pop(), values.pop(), values.pop())); 
  
        
        return values.pop(); 
    } 
  
    public static boolean hasPrecedence(char op1, char op2) 
    { 
        if (op2 == '(' || op2 == ')') 
            return false; 
        if ((op1 == '*' || op1 == '/') && (op2 == '+' || op2 == '-')) 
            return false; 
        else
            return true; 
    } 
  
    public static int applyOp(char op, int b, int a) 
    { 
        switch (op) 
        { 
        case '+': 
            return a + b; 
        case '-': 
            return a - b; 
        case '*': 
            return a * b; 
        case '/': 
            if (b == 0) 
                throw new
                UnsupportedOperationException("Cannot divide by zero"); 
            return a / b; 
        } 
        return 0; 
    }
    {
    System.out.println("result"); 
} 
  
}  



