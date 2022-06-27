package com.oopsprog;

public class Product
{
	float   amount, totalAmt ,d;
	public void acceptDetails(float a) 
	{
		amount=a;
		System.out.println("Original amount : "+amount);	
	}
	public void discountDetails(float discount) 
	{
		System.out.println("Discount : "+discount);
		d=100-discount;
		totalAmt=(d*amount)/100 ;
		System.out.println("Total Amount : " +totalAmt);
	}
	public static void main(String[] args)
	{
		Product prod= new Product();
		prod.acceptDetails(2000);
		prod.discountDetails(25);
	}

}
