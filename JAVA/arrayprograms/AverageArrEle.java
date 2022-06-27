package com.arrayprograms;

public class AverageArrEle
{
	double n[]= {2,3,4,78,8,9,45};

	public void findAvg()
	{
		double sum = 0 , avg = 0;
		for(int i = 0 ; i<n.length;i++)
		{
			sum = sum + n[i];
		}
		System.out.println("The sum of Array = " + sum );
		avg = sum/n.length;
		System.out.println("The average of Array = " + avg);
	}


	public static void main(String[] args)
	{
		
		AverageArrEle avg = new AverageArrEle();
		avg.findAvg();
	
	}

}
