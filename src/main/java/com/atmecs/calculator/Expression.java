package com.atmecs.calculator;

import java.util.ArrayList;


public class Expression {

	    public  double calculate(String expression){        
	        ArrayList<String> operators=new ArrayList<String>();
	        ArrayList<Double> operands=new ArrayList<Double>(); 
	        int lastOperatorIndex=0; 
	        int priorityOperationCount=0;
	        //Start reading expression
	        for(int i=0; i<expression.length();i++)
	        {
	            String currentChar=String.valueOf(expression.charAt(i));
	            if(isOperator(currentChar) && i!=0){ 
	                operators.add(currentChar);
	                if(isPriortyOperator(currentChar))
	                    priorityOperationCount++;
	                
	                int startIndex=lastOperatorIndex==0?0:lastOperatorIndex+1;                      
	                String operand=expression.substring(startIndex, i);
	                operands.add(Double.parseDouble(operand));
	                lastOperatorIndex=i;                
	            }           
	            else if(i==expression.length()-1){
	                String operand=lastOperatorIndex==0?(expression.substring(lastOperatorIndex)):(expression.substring(lastOperatorIndex+1));//Subtract the last operand
	                operands.add(Double.parseDouble(operand));        
	            }
	        }
	        
	        int i=0;
	        while( !operators.isEmpty() ) //Loop through until there are no operators left on the expression
	        {
	           String currentOperator=operators.get(i);        
	           double leftOperand=operands.get(i);
	           double rightOperand=operands.get(i+1);           
	            if( (currentOperator.equals("+") || currentOperator.equals("-"))  && (priorityOperationCount==0)  )//If current operator is + or - and there are no priority operators on the expression then simply evaluate the expression
	            {   
	                   operands.remove(i);
	                   //double result=currentOperator.equals("+");
	                   operands.set(i,result);
	                   operators.remove(i);
	            }                   
	
	        
	        }
	    }
	      }
