package com.weektest3;

public class Shopping 
{
	public CreditCard doTransaction(CreditCard c)
	{
		return c;
	}
	public DebitCard doTransaction(DebitCard  d)
	{
		return d;
		
	}
	public static void main(String[] args) 
	{
		CreditCard credit =new CreditCard();
		DebitCard debit = new DebitCard();
		debit.displayDebit();
		credit.displaycredit();
		

	}

}
