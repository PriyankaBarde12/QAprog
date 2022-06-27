package com.arrayprograms;
public class OddElements 
{

	int arr[] = {34, 6,89,90 ,7,23};
	public void checkOdd()
	{
		for(int i=0;i<arr.length;i++)
		{
			if(arr[i]%2 == 1)
			{
				System.out.println("Tne odd no in array  =  " + arr[i]);	
				
			}
		}
	}

	public static void main(String[] args) {
		
		OddElements odd =new OddElements();
		odd.checkOdd();
	}



}
