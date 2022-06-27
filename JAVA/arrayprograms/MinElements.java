package com.arrayprograms;

import java.util.Scanner;

public class MinElements 
{ 
	public static void main(String args[])
	{
		 int min, size , i;
		 int   arr[] = new int[7];
	       Scanner sc = new Scanner(System.in);
	 
	       System.out.print("Enter array Size : ");
	       size = sc.nextInt();
	 
	       System.out.print("Enter array elements : ");
	       for(i=0; i<size; i++){
	           arr[i] = sc.nextInt();
	       }
	 
	       min = arr[0];
	 
	       for(i=0; i<size; i++){
	           if(min > arr[i]){
	               min = arr[i];
	           }
	 
	       }
	    System.out.print("Min Element : " + min);
	    sc.close();
	}

}
