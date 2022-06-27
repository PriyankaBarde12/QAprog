package com.oopsprog;

import java.util.Scanner;

public class Employee 
{
	int eid ;
	int empSalary ;
	String empName, empAddress;
	Scanner sc=new Scanner(System.in);
	
	public void acceptEmpDetails(int id,String name,int salary,String add)
	{
		eid=id;
		empName=name;
		empSalary=salary;
		empAddress=add;
		
	}
	public void showDetails()
	{
		System.out.println("id : "+eid+ " name : "+empName+" Salary : "+empSalary+" address : "+empAddress);
	}
	public static void main(String args[])
	{
		Employee emp= new Employee();
		emp.acceptEmpDetails(5, "abc", 3200, "Mumbai");
		emp.showDetails();
	}
	

}
