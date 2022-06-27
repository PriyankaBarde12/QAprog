package com.polymorphismprog;

public class PaymentDe 
{

	public void doPayment(double amt, CreditCard c)
	{
		System.out .println("payment with CreditCard");
	}
	public void doPayment(double amt, DebitCard c)
	{
		System.out .println("Payment with Debitcard");

	}
	public void doPayment(double amt, NetBankingCard c)
	{
		System.out .println("Payment with NetBanking");

	}
	
	public static void main(String[] args)
	{
		CreditCard c1 = new CreditCard();
		PaymentDe pay =new PaymentDe();
		pay.doPayment(23000, c1);
		
	}

}
