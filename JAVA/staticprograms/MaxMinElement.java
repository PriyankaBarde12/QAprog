package com.staticprograms;

public class MaxMinElement 
{
	public static void findMax(int n[])
	{
		int max = n[0];
		for(int i =0; i<n.length;i++)
		{
			if(n[i] > max)
			{
				max = n[i];
			}
		}
		System.out.println("The max element of  that array is = "+ max);
		
	}
	
	public static void findMin(int arr[])
	{
		int min = arr[0];
		for(int i = 0;i<arr.length;i++)
		{
			if(arr[i]<min)
			{
				min = arr[i];
			}
		}
		System.out.println("The min element of array is =  " + min);
	}
	

	public static void main(String[] args) {
		
		int [] p = {89,77,33,89,60,32,8};
		int [] x = {8 ,40 ,51 ,28,9,3,0, -7,-2};
		findMax(p);
		findMin(x);
	}



}
