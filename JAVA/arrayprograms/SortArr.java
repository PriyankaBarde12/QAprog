package com.arrayprograms;

import java.lang.reflect.Array;
import java.util.Arrays;

public class SortArr {
	public void bubbleSort(int a[])
	{
		for(int i=0;i<a.length;i++)
		{
			for(int j=0;j<a.length-1;j++)
			{
				if(a[j] > a[j+1])
				{
					int temp =a[j+1];
					a[j+1] = a[j] ;
					a[j] = temp;
				}
			}
		}
	}
	public void selectionSort(int a[])
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
	}
	public static void main(String[] args) {
		int a[] = {6,7,34,7,9};
		SortArr sort =new SortArr();
		sort.bubbleSort(a);
		System.out.println(Arrays.toString(a));
		System.out.println("**************Selection Sort********");
		sort.selectionSort(a);
		System.out.println(Arrays.toString(a));

	}

}
