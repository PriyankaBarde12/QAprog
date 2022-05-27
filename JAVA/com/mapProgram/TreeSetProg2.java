package com.mapProgram;

import java.util.Iterator;
import java.util.TreeSet;

public class TreeSetProg2 {

	public static void main(String[] args) {
		TreeSet<String> set=new TreeSet<String>();
		set.add("Priyanka");
		set.add("Zebra");
		set.add("Abc");
		set.add("Kalyani");
		System.out.println("Traversing element");
		Iterator<String> itr=set.descendingIterator();
		while(itr.hasNext()) {
			System.out.println(itr.next());
		}
	}

}