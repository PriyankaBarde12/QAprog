package com.loopprogram;
import java.util.Scanner;

//
//Write a java program to find sum of digits in any number. e.g. number is 435 sum is 12 

public class SumOfDigit {

public static void main(String args[])  
{  
int n, digit, sum = 0;  
Scanner sc = new Scanner(System.in);  
System.out.print("Enter the number: ");  
n = sc.nextInt();  
while(n > 0)  
{  
digit = n % 10;  
sum = sum + digit;  
n = n / 10;  
}   
System.out.println("Sum of Digits: "+sum);  
sc.close();
} 

}
