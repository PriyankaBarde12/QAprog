package com.loopprogram;
import java.util.Scanner;

public class TblNumm {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		int n=sc.nextInt();
	//	n=2;
		for(int i=1;i<=10;i++)
		{
			System.out.println(n*i);
		}
		sc.close();
	}

}
