package com.loopprogram;

public class LoopPattern6 {

	public static void main(String[] args)
	{
		for(int i=5;i>=1;i--)
		{
			for(int k=5-1;k>=i;k--)
			{
			System.out.print(" ");
			}
			
			for (int j=i;j>=1;j--)
			{
				System.out.print("* ");
			}
			System.out.println();
		
		}
	}

}
