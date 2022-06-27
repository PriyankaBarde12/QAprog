package com.ifelseprogram;

public class Emp {

	public static void main(String[] args) {
		double basic=20000.50,gross,da,hra;
	    if(basic <=10000)
	    {
	        da = basic * 0.8;
	        hra = basic *0.2;
	    }     
	        else if(basic <=20000)
	    {
	        da = basic * 0.09;
	        hra = basic *0.25;
	    }
	    else
	    {
	        da = basic * 0.95;
	        hra = basic * 0.3;
	    }
	    gross = basic + da + hra;
	    System.out.println("The Gross Salary is :-"+gross);    
	
	}

}
