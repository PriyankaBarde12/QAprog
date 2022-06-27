package com.loopprogram;

import java.util.Scanner;

public class Automorphic {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
        System.out.println("Enter a number");
        int num = sc.nextInt();
 
        int c=0, sqr = num*num;
        int temp =num;  //copying num
 
        //countint digits of num
        while(temp>0){
            c++;
            temp=temp/10;
        }
 
        int lastSquareDigits = (int) (sqr%(Math.pow(10,c)));
 
        if(num == lastSquareDigits)
            System.out.println("Automorphic number");
        else
            System.out.println("Not an Automorphic number");
sc.close();
	}

}
