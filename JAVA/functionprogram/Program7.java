package com.functionprogram;

public class Program7 {

	public static void main(String[] args) {
		int n=7;
		int x=0;
		for(int i=1;i<=n;i++) {
			for(int j=0;j<=x;j++) {
				System.out.print((char)(i+64)+" ");
			}
			System.out.println();
			if(i<=n/2) {
				x++;
			}else {
				x--;
			}
		}

	}

}
