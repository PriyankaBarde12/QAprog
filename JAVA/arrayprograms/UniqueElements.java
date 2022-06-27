package com.arrayprograms;

import java.util.Scanner;

public class UniqueElements 
{
	public static void findUnique(int arr[] ,int n)
	{
		int count =0 ;
		for(int i=0;i<n;i++)
		{
			for (int j=0;j<n;j++)
			{
				if(arr[i] == arr[j])
				{
					count++;
				}
				if(count == 1)
				{
					System.out.println(""+arr[j]);
				
				}
			}
		}
		System.out.println("Unique Elements : " +count);
	}
	public static void main(String args[])
	{
		Scanner sc =new Scanner(System.in);
		System.out.println("Enter size of array");
		int n= sc.nextInt();
		System.out.println("enter array");
		int arr[] = new int[n];
		for(int i=0;i<n;i++)
		{
			 arr[i] = sc.nextInt();
			// System.out.println("nn "+arr[i]);

		}

		
		findUnique(arr, n);
		sc.close();
	}

}
