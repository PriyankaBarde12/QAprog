package com.functionprogram;

public class Patternprog2 {

	public static void main(String[] args) {
		int n=5;
		int x=1;
		for(int i=n;i>=1;i--) {
			for(int j=n;j>=i;j--) {
				System.out.print(x+" ");
				x+=2;
			}
			System.out.println();
			
		}
	}

}
