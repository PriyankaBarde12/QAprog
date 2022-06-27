package com.arrayprograms;

public class SquareProgramNum
{
	static void checkSquare(int arr[] , int n)
	{
		int square;
		for (int i=0 ;i<n;i++)
		{
			square = arr[i] * arr[i];
			
			for(int j=0 ;j<n ;j++)
			{
				if(arr[j] == square)
				{
					System.out.println(arr[j]);
					
				}
			}
		}
		
	}
	
	public static void main(String[] args)
	{
			int arr[] = {23, 6 ,36 ,64 ,9,4 ,49};
			int n = arr.length;
			
			checkSquare(arr , n);
		}
	}

