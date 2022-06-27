package com.ifelseprogram;

import java.util.Scanner;

public class Calculator {

	public static void main(String[] args) {
		
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter operator - ,+ , / , *");
		char op=sc.next().charAt(0);
		System.out.println("enter n1");
		int n1=sc.nextInt();
		System.out.println("enter n2");
		int n2=sc.nextInt();
		
		switch(op) {
		case '-' : System.out.println("Substraction is "+(n1-n2));
					break;
		case '+' : System.out.println("Addition is "+(n1+n2));
					break;
		case '*' : System.out.println("Multiplication "+(n1*n2));
					break;
		case '/' : System.out.println("Division is "+(n1/n2));
					break;
		default :  System.out.println("Invalid ");
					break;
		}
		sc.close();
	}

}
