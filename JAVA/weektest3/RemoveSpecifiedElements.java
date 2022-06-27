package com.weektest3;

import java.util.Arrays;

public class RemoveSpecifiedElements
{
	public static void main(String args[])
	{
		int[] arr = {78,56,34,77,23,90,12,33,11,123}; 
		System.out.println("Original Array : "+Arrays.toString(arr));     
		int removeIndex = 4;

	   for(int i = removeIndex; i < arr.length -1; i++)
	   {
	        arr[i] = arr[i + 1];
	   }
	    System.out.println("After removing element: "+Arrays.toString(arr));
	 }

}
