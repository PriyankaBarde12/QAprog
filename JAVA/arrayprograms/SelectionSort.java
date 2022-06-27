package com.arrayprograms;

import java.util.Arrays;

public class SelectionSort
{
	public static void selectionSort(int a[])
	{
		for(int i=0;i<a.length-1;i++) 
		{
			int minIdx=i;
			for(int j=i+1; j<a.length;j++)
			{
				if(a[j]< a[minIdx]) 
				{
					minIdx=j;
				}
			}
			int temp =a[minIdx];
			a[minIdx] =a[i];
			a[i] =temp;
		}
		System.out.print(Arrays.toString(a));	
	}
	
	public static void main(String[] args) 
	{
		System.out.println("**************Selection Sort********");
		int a[] = {34,4,67,2,88};
		selectionSort(a);
	}

}
