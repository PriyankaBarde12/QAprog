package com.oopsprog;

public class BookCop
{
	int bookid;
	String bname, bauthor;
	public void acceptDetails(int id ,String name ,String author) 
	{
		bookid=id;
		bname=name;
		bauthor=author;
	}
	public void showDetails() 
	{
		System.out.println("Book id : "+bookid);
		System.out.println("Book name : "+bname);
		System.out.println("Book Author : "+bauthor);
	}

}
