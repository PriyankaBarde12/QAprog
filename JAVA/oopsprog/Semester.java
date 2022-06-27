package com.oopsprog;

public class Semester
{
	int m1, m2, m3,rollno;
	public void acceptDetails(int mk1,int mk2,int mk3, int r) 
	{
		m1=mk1;
		m2=mk2;
		m3=mk3;
		rollno=r;
	}
	public void display()
	{
		System.out.println("Marks m1 "+m1);
		System.out.println("Marks m2 "+m2);
		System.out.println("Marks m3 "+m3);
		System.out.println("Roll : "+rollno);
	}
}
