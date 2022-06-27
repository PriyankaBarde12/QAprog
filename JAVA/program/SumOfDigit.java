package com.program;

import java.util.Scanner;

public class SumOfDigit {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int n, dig, sum = 0;  
		Scanner sc = new Scanner(System.in);  
		System.out.print("Enter the number: ");  
		n = sc.nextInt();  
		while(n > 0)  
		{  
		dig = n % 10;  
		sum = sum + dig;  
		n = n / 10;  
		}   
		System.out.println("Sum of Digits: "+sum);  
		sc.close();

	}

}
