package com.atmecs.calculator;

import java.util.Scanner;

@SuppressWarnings("serial")
public class MenuDriven extends Exception { 
	public void calculator() {
		int num1=0, num2=0,option,ex = 0;
		do {
			try {
			@SuppressWarnings("resource")
			Scanner scan = new Scanner(System.in);
			System.out.println("enter the choice");
			System.out.println("1.Addition 2.Subtraction 3.Multiplication 4.Division 5.Exit");
			option = scan.nextInt();
			if(option!=5){
				//System.out.println("Enter the first number");
				//num1=scan.nextInt();
				//System.out.println("Enter the second number");
				//num2=scan.nextInt();
			}
			else
				break;
			switch(option)
			{
			    
				case 1: NumberOperation add = new NumberOperation();
		
					add.multilpleOperations();
                    break;
				case 2: Subtraction sub = new Subtraction();
				        sub.subtractionMultiple();
					break;
				case 3: Multiplication mul = new Multiplication();
				        mul.multilpleOperations();
					break;
				case 4:	if(num2==0)
						System.out.println("Error!!! In Division denominator cannot be 0!");
					else{
					System.out.println("In division of "+num1+" by "+num2+" quotient is "+(num1/num2)+" and remainder is "+(num1%num2));} 
					break;
				case 5: break;
				default: System.out.println("Invalid choice");
			}
			System.out.println("Do you want to continue?1.Yes 2.No");
			ex=scan.nextInt();

			}catch (Exception e) {
				System.out.println("wrong input...Try again");
			}
			}while(ex==1);
 }

}



