package com.ifelseprogram;

import java.util.Scanner;

public class CheckVowelConsonant {

	public static void main(String[] args) {
		Scanner scn=new Scanner(System.in);
		System.out.println("Enter Letter");
		char ch=scn.next().charAt(0);
		if(ch== 'a' || ch=='e' || ch=='i' || ch=='o' || ch=='u')
		{
			System.out.println(ch+" is a vowel");
		}
		else
		{
			System.out.println(ch+ " is a Consonant");
		}
		scn.close();

	}

}
