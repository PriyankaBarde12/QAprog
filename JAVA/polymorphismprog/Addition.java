package com.polymorphismprog;

public class Addition
{
	public double makeAddition(double d, int y)
	{
		System.out.println("(int ,int)");
		System.out.println("Addition is " +(+y));
		return y;
	}
	public float makeAddition(float x ,int y)
	{
		System.out.println("(float,int)");
		System.out.println("Addition is "+(x+y));
		return x;
		
	}
	public void makeAddition(String s1, String s2)
	{
		System.out.println("(String , String)");
		System.out.println("TwoString : "+(s1+s2));
	}
	

	public static void main(String[] args) 
	{
		Addition add =new Addition();
		add.makeAddition(44, 45);
		add.makeAddition(25.5, 10);
		add.makeAddition("priyanka", "Barde");
		

	}

}
