package com.functionprogram;

public class Programm {

	public static void main(String[] args) {
		String str= "PRIYA";
		int len= str.length();
		for(int i=0;i<len;i++) {
			for(int j=0;j<len;j++) {
				System.out.print(str.charAt(j)+" ");
			}
			System.out.println();
		}

	}

}
