package com.program;

//import java.util.Scanner;

public class ModularAproach 
{
	public int maxfunc(int a,int b) {
	
		if(a>b) {
			System.out.println(a+ " is max");
		}
		else {
			System.out.println(b+ "is less");
		}
		return 0;
	}
	public static void main(String args[]) {
		ModularAproach m=new ModularAproach();
		m.maxfunc(23, 11);
	}
}
