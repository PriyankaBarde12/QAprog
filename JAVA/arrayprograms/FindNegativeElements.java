package com.arrayprograms;

import java.util.Scanner;

public class FindNegativeElements
{
	public static void ngativeCount(int a[], int n) 
	{
		System.out.println("Negative elemnts are");
		for (int i = 0; i < a.length; i++) {
			if (a[i] < 0) {

				System.out.print(a[i] + "  ");
			}
		}	
	}

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter Array size");
		int n = sc.nextInt();
		int a[] = new int[n];
		System.out.println("Enter array elements");
		for (int i = 0; i < n; i++) {
			a[i] = sc.nextInt();

		}
		ngativeCount(a, n);
		sc.close();
	}

}
