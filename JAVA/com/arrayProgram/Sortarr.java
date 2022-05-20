package com.arrayProgram;


public class Sortarr {

	public static void main(String[] args) {
		int[] arr= {2,5,67,78,5,89,6,1};
		arrsort(arr);
		for(int a:arr) {
			System.out.println(a);
		}

	}

	private static void arrsort(int[] arr) {
		for(int i=0;i<arr.length;i++) {
			for(int j=i+1;j<arr.length;j++) {
				if(arr[i]<arr[j]) {
					int temp;
					temp=arr[i];
					arr[i]=arr[j];
					arr[j]=temp;
				}
			}
		}
		
	}

}
