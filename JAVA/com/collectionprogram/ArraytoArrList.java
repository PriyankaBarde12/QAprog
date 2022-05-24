package com.collectionprogram;

import java.util.ArrayList;
import java.util.List;

public class ArraytoArrList {

	public static void main(String[] args) {
		int[] ar= {56,34,2,8,36};
	
		List<Integer> li=new ArrayList<Integer>();
		for(int ar1:ar) {
			li.add(ar1);
		}
		System.out.println(li);
	}

}
