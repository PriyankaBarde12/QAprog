package com.weektest3;

public class A 
{
	static int i ;
	static 
	{
		i =45;
		System.out.println("static block ");
	}
	public static void main(String args[])
	{
		System.out.println("Values :  "+A.i);
	}
}
