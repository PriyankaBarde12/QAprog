package com.loopprogram;

//WAP to print odd numbers from 521 to 229 using while loop. 
public class OddNum {

	public static void main(String[] args) {
		for(int i=521;i>=229;i--) 
		{
			if(i%2==1)
			{
				System.out.print(i+" ");
			}
		}

	}

}
