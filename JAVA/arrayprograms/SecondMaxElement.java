package com.arrayprograms;

public class SecondMaxElement 
{
	public static void main(String args[])
	{
		int a[] = {45,67,4,78,83,77};
		int max=a[0];
		int secondmax=a[1];
		for(int i=2;i<a.length;i++ )
		{
			if(a[i]>max) 
			{
				secondmax=max;
				max=a[i];
				//System.out.println(max);
			}
			else if(a[i] > secondmax)
			{
				secondmax= a[i];
				System.out.println(secondmax);
			}
			
		}
	}


}
