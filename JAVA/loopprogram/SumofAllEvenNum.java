package com.loopprogram;

import java.util.Scanner;

//6.	 Write a program to find sum of all even numbers between 1 to n. 
public class SumofAllEvenNum {

	public static void main(String[] args) {
		int sum=0;
		Scanner scn=new Scanner(System.in);
		System.out.println("Enter number");
		int n=scn.nextInt();
		for(int i=1;i<=n;i++) {
			if(i%2==0) {
				sum=sum+i;
			}
			
		}
		System.out.print(sum+" ");
		scn.close();
	}
	

}
