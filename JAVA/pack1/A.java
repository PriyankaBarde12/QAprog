package com.pack1;

public class A
{
	private int val;
	protected int a;
	int b;
	public void show() 
	{
		System.out.println(val);
	}

}
  class B extends A
 {
	 public void display() 
	 {
	//	 System.out.println(val);
		 System.out.println(a);
		 System.out.println(b);
	 }
 }