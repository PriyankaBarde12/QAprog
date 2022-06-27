package com.ifelseprogram;

import java.util.Scanner;

public class CheckEvenodd {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter number");
		int n=sc.nextInt();
		if(n%2==0)
		{
			System.out.println(n+ " number is even");
		}
		else if(n%2==1)
		{
			System.out.println(n+ " number is odd");
		}
		sc.close();

	}

}
