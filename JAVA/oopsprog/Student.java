package com.oopsprog;
import java.util.Scanner;

public class Student
{

	int roll ,m1,m2;
	String sname;
	float percent;
	Scanner sc =new Scanner(System.in);
	public void show() 
	{
		System.out.println("enter roll");
		roll=sc.nextInt();
		System.out.println("enter sub1 marks");
		m1=sc.nextInt();
		System.out.println("enter sub2 marks");
		m2=sc.nextInt();
		
	}
	public void percentageDetails()
	{
		percent=(((m1+m2)*100)/200);
		System.out.println("Total percent : " +percent);
	}
	public static void main(String args[]) 
	{
		Student stu=new Student();
		stu.show();
		stu.percentageDetails();
	}

}
