package com.program;

import java.util.Scanner;

public class DemoFunc {
	public void addnum() {
		int n1,n2,c;
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter 1st num");
		 n1=sc.nextInt();
		System.out.println("Enter 2nd num");
		 n2 =sc.nextInt();
		//int c=sc.nextInt();
		 c= n1+n2;
		System.out.println("Addition of num : "+c);
		sc.close();
	}

	public static void main(String[] args) {
		DemoFunc d=new DemoFunc();
		d.addnum();
		d.addnum();

	}

}
