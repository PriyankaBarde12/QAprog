package com.mapProgram;

import java.util.LinkedHashSet;

public class BookMap {
	int id ;
	String name; String author; String publisher;int quantity;
	public BookMap(int id, String name, String author, String publisher, int quantity) {
		this.id=id;
		this.name=name;
		this.author=author;
		this.publisher=publisher;
		this.quantity=quantity;
		
	}

	public static void main(String[] args) {  
	    LinkedHashSet<BookMap> hs=new LinkedHashSet<BookMap>();  
	    //Creating Books  
	    BookMap b1=new BookMap(101,"Let us C","Yashwant Kanetkar","BPB",8);  
	    BookMap b2=new BookMap(102,"Data Communications & Networking","Forouzan","Mc Graw Hill",4);  
	    BookMap b3=new BookMap(103,"Operating System","Galvin","Wiley",6);  
	    //Adding Books to hash table  
	    hs.add(b1);  
	    hs.add(b2);  
	    hs.add(b3);  
	//Traversing hash table  
	    for(BookMap b:hs){  
	    System.out.println(b.id+" "+b.name+" "+b.author+" "+b.publisher+" "+b.quantity);  
	    }  
	}  


}
