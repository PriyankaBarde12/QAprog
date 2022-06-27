package com.loopprogram;

//WAP to print even numbers from 121 to 229 using for loop. 
public class EvenNum {
int count=1;
	public static void main(String[] args) {
		for (int i=121;i<=229;i++)
		{
			if(i%2==0)
			{
				System.out.print(i+ " ");
				
			}
		}

	}

}
