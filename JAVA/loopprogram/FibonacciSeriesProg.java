package com.loopprogram;
import java.util.Scanner;

// WAP to print Fibonacci series up to 20 terms
public class FibonacciSeriesProg {
	public static void main(String args[])
	{
	Scanner sc = new Scanner(System.in);
	//int n=50;
	int sum = 0;
	int a = 1;
	int b = 1;
	//System.out.println("Enter the value: ");
//	n = sc.nextInt();
	System.out.println("Fibonacci series are ");
	while(sum <= 50)
	{
	System.out.print(sum + " ");
	a = b;  // swap elements
	b = sum;
	sum = a + b;  
	}
	sc.close();
	}
/*int a=0,b=1,c;
		for(int i=1;i<=10;i++)
		{
			c=a+b;
			System.out.println(a);
			a=b;
			b=c;
		}
*/

}
