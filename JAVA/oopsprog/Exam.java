package com.oopsprog;

public class Exam {
	public Semester calculateResult(Semester s1,Semester s2) 
	{
		Semester finalResult= new Semester();
		finalResult.rollno=s1.rollno;
		finalResult.m1=(s1.m1+s2.m1);
		finalResult.m2=(s1.m2+s2.m2);
		finalResult.m3=(s1.m3+s2.m3);
		return finalResult;
	}

	public static void main(String[] args) {
		
		Semester sm1 =new Semester();
		sm1.acceptDetails(77,89,67,2);
		sm1.display();
		
		Semester sm2 =new Semester();
		sm2.acceptDetails(81,77,67,2);
		sm2.display();
		
		System.out.println("Marks");
		
		Exam exam=new Exam();
		Semester sem=	exam.calculateResult(sm1, sm2);
		sem.display();
		

	}

}
