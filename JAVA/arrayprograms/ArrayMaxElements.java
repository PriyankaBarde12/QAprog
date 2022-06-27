package com.arrayprograms;

public class ArrayMaxElements 
{
	
	public void findMax(int arr[]) 
	{
		int max=arr[0];
		for(int i=0;i<arr.length;i++) 
		{
			if(arr[i]> max)
			{
				max = arr[i];
			}
		}
		System.out.println("Max element of Array : " +max);
	}
	

	public static void main(String[] args) {
		ArrayMaxElements arrMax = new ArrayMaxElements();
		int ar[] = {34,56,2,78,9,67};
		arrMax.findMax(ar);	
	}



}
