package com.arrayProgram;

public class ArrayBinary {

	public static void main(String[] args)
	{
		int[] arr= {23,11,46,7,4,55,9,76,7,5,44,67,99,4};
		int i=BinarysearchEle(arr,76);
		System.out.println(i);
	}

	private static int BinarysearchEle(int[] arr, int ele) {
		int f=0;
		int l=arr.length-1;
		while(f<l)
		{
			int m=(f+l)/2;
			if(arr[m]==ele)
			{
				return m;
			}
			else if(arr[m]>ele) {
					l=m-1;
				
			}else if(arr[m]<ele){
				l=m+1;
			}
		}
		return -1;
	}

}
