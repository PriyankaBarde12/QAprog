package com.weektest3;

public class B
{
	static int add(int a,int b)
	{
		return a+b;
	}  
	static int add(int a,int b,int c)
	{
		return a+b+c;
	} 
	public static void main(String[] args)
	{  
		System.out.println(B.add(40,110));  
		System.out.println(B.add(51,10,60)); 
	} 

}
Static Variable:

In java when a variable declared as static, it is called a class variable and all objects (instances) share the same variable.

Static Method:

A static method always accesses static data and it also belongs to class not instance. Hence the static method is called with the class name not object name. It cannot be referred to like this or super keyword.
