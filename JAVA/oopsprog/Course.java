package com.oopsprog;

public class Course
{
	int cid;
	String cname ,cduration ;
	public void acceptCourse(int id , String name ,String duration) 
	{
		cid=id;
		cname=name;
		cduration=duration;
		
	}
	public void courseDetails() 
	{
		System.out.println("course id : "+cid);
		System.out.println("Course name : "+cname);
		System.out.println("Course Duration : "+cduration);
	}
}
