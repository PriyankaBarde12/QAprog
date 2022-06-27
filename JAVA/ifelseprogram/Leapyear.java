package com.ifelseprogram;

import java.util.Scanner;

public class Leapyear {

	public static void main(String[] args) {
		int year;
		System.out.println("enter year");
		Scanner sc=new Scanner(System.in);
		year=sc.nextInt();
		if(((year%4==0)&&(year%100!=0)) || (year%400 ==0))
				{
				System.out.println("Year is leap ");
				}
		else {
			System.out.println("year is not leap");
		}
		sc.close();
	}

}