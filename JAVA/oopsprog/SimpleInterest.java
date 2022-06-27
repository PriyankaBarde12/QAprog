package com.oopsprog;

public class SimpleInterest 
{
	float priAmt ,rate ,time;
	float simpleInterest;
	public void acceptDet(float p, float r, float t)
	{
		priAmt=p;
		rate=r;
		time=t;
	}
	public void calInterest() 
	{
		simpleInterest =( priAmt*rate*time)/100;
		System.out.println("Simple Interest : "+simpleInterest);
	}

	public static void main(String[] args) {
		SimpleInterest si =new SimpleInterest();
		si.acceptDet(4000, 8, 1);
		si.calInterest();

	}

}
