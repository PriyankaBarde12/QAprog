package com.ifelseprogram;

import java.util.Scanner;

public class CheckDivisible {

	public static void main(String[] args) {

		System.out.println("enter number");

		Scanner sc =new Scanner(System.in);
		int n=sc.nextInt();
		if(n%5==0) {
			System.out.println("no is divi by 5");
		}else if(n%11==0) {
			System.out.println("no is divi by 11");
		}else {
			System.out.println("no is not divi by 5 or 11");
		}
		sc.close();
	}

}
