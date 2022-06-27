package com.arrayprograms;


public class Addition {

	public static void main(String[] args) 
	{
		
		int i=0 ,j=0;
		int a[][] = {{1,2,3},{4,5,6}};
		int b[][] = {{7,8,9},{10,11,12}};
		int c[][] = new int[2][3];
		for(i= 0;i<2;i++)
		{
			for(j=0;j<3;j++)
			{
				c[i][j] = a[i][j] + b[i][j];
				System.out.print("Result = " +c[i][j] + " " );
			}
			System.out.println();
		}
		

	}

}
