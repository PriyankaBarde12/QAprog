package com.polymorphismprog;

public class Area 
{
	public float calArea(float d)
	{
		return (float) (3.14*d);
	}
	public int calArea(int l, int b)
	{
		return l*b;
	}
	public float calArea(float pi ,int radius)
	{
		return pi*radius ;
	}

	public static void main(String[] args) 
	{
		Area area=new Area();
		System.out.println( area.calArea(45));
		System.out.println(area.calArea(20, 30));
		System.out.println(area.calArea(10, 6));	
	}

}
