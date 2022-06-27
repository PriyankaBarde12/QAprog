package com.functionprogram;

public class Account {
	int acno ;
	float acbal;
	String acName;
	public void openAccount(int n,int bal, String name) {
		acno=n;
		acbal=bal;
		acName=name;
				
	}
	public void showAccount() {
		System.out.println("Current Balance : "+acbal);
		System.out.println("Name : " +acName);
		System.out.println("Account number : "+acno);
	}
	public void depositeAmount(float amt) {
		acbal=acbal+amt;
		System.out.println("add Deposite : " +acbal);
	}
	public void withdrawAmount(float amt) {
		if(acbal>amt)
		{
			acbal=acbal-amt;
			System.out.println( "after withdrawing amt : "+acbal);
		}
		else
		{
			System.out.println("Insufficient bal");
		}
		
	}
	public void showUpdatedBalance() 
	{
		System.out.println("Balance : " +acbal);
	}
	public static void main(String[] args)
	{
		
		Account acc=new Account();
		acc.openAccount(234166745, 5500, "abcd");
		acc.depositeAmount(200);
		acc.withdrawAmount(500);
		acc.showUpdatedBalance();
	}

}
