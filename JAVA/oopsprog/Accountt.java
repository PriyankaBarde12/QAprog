package com.oopsprog;

public class Accountt
{
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
			System.out.println("deposite : "+amt);
			acbal=acbal+amt;
			System.out.println("after adding Deposite : " +acbal);
		}
		public void withdrawAmount(float amt) {
			if(acbal>amt)
			{
				System.out.println("withdraw : "+amt);
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
			
			Accountt acc=new Accountt();
			acc.openAccount(234166745, 5500, "abcd");
			acc.showAccount();
			acc.depositeAmount(200);
			acc.withdrawAmount(500);
			acc.showUpdatedBalance();
		}

	}



