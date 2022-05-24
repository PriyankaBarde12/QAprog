package com.collectionprogram;

import java.util.LinkedList;


public class LinkListDemo {

	public static void main(String[] args) {
		LinkedList<Integer> le =new LinkedList<Integer>();
		
		le.add(786);
		le.add(456);
		le.add(89);
		System.out.println(le);
		System.out.println(le.getFirst());
		System.out.println(le.getLast());
		le.offer(3675);
		System.out.println(le.getLast());
		System.out.println(le.offerFirst(4655));
		
		System.out.println(le);
	}

}
