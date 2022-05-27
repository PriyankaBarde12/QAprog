package com.mapProgram;

import java.util.Hashtable;

public class HashTableprog {

	public static void main(String[] args) {
		Hashtable<Integer, String> ht=new Hashtable<Integer, String>();
		ht.put(11 , "Harsh");
		ht.put(3,"Kaira");
		//ht.put(null, null)
		ht.put(9, "Pooja");
		System.out.println(ht);
	}

}
