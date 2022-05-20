package com.arrayProgram;

public class ArrString {

	public static void main(String[] args) {
		String[] s=new String[6];
		s[0]="JAVA";
		s[1]="ANDROID";
		s[2]="PYTHON";
		s[3]="ANGULAR";
		s[4]="C++";
		s[5]="JAVASCRIPT";
		System.out.println(s);
	
	for(String a:s) {
		System.out.println(a);
		System.out.println(a.length());
	}
	}
}
