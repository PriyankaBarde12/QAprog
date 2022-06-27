package com.oopsprog;

public class Book {
	int bid , price;
	String bname, authername;
	public void acceptdetails(int id, int p,String bookname,String aname) 
	{
		bid=id;
		price=p;
		bname=bookname;
		authername=aname;
	}
	public void calBill(int qty)
	{
		price=price*qty;
		System.out.println("Total bill : " +price);
	}

	public static void main(String[] args) {
		Book book=new Book();
		Book b1=new Book();
		Book b2=new Book();
		book.acceptdetails(56, 250, "English", "abc");
				b1.bid=book.bid;
		b1.price=book.price;
		b1.bname=book.bname;
		b1.authername=book.authername;
		b1.calBill(2);
		book.calBill(2);
		//book=b1;
	


	}

}
