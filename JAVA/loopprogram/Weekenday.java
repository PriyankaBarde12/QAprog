package com.loopprogram;

import java.util.Scanner;
/*Write a program that displays the day of the week corresponding to the number 
entered i.e. 1 - "Monday", 2 - "Tuesday" and so on. For any integer input not between 1 
to 7 it should display "error, day does not exist".*/

public class Weekenday {
	 public static void main(String[] args) {
	        Scanner scn = new Scanner(System.in);

	        System.out.println("Enter weekday number : ");
	        int wday = scn.nextInt();

	        switch (wday)
	        {
	            case 1:
	                System.out.println("Monday");
	                break;
	            case 2:
	                System.out.println("Tuesday");
	                break;
	            case 3:
	                System.out.println("Wednesday");
	                break;
	            case 4:
	                System.out.println("Thursday");
	                break;
	            case 5:
	                System.out.println("Friday");
	                break;
	            case 6:
	                System.out.println("Saturday");
	                break;
	            case 7:
	                System.out.println("Sunday");
	                break;
	            default:
	                System.out.println("enter day number bet 1-7");
	        }
	        scn.close();
	    }
}
