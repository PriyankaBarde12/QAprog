package com.oopsprog;

public class Bookcopy {

	public BookCop createcopy(BookCop b1) 
	{
		return null;
	
	}
	public static void main(String[] args) {
		Bookcopy cbook1=new Bookcopy();
		BookCop bk1=new BookCop();
		cbook1.createcopy(bk1);
		bk1.acceptDetails(5, "abc", "xyz");
		bk1.showDetails();
		

	}

}
