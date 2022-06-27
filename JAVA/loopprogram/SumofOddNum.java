package com.loopprogram;

import java.util.Scanner;

//7.	 Write a program to find sum of all odd numbers between 1 to n.
public class SumofOddNum {

	public static void main(String[] args) {
		int sum=0;
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter number");
		int num=sc.nextInt();
		for(int i=1;i<=num;i++)
		{
			if(i%2==1) {
				sum=sum+i;
			}
		}
		System.out.println(sum);sc.close();
	}

}
