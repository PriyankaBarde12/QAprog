package com.polymorphismprog;

public class Item {
	public static double gst=18.5;

	double tot, totalbill;
	public static int cnt= 200, objectcount;

	private static String itemId;
	public void calbill(double cost, double qty)
	{
	 int itemId=++cnt;
	 System.out.println("ItemId  : "+Item.itemId);
	//cost=(cost*gst)/100;
	//System.out.println(cost);
	tot=qty*cost;
	totalbill=(tot*gst)/100;
	System.out.println(totalbill);
	}
	public static void changegst(double gst) 
	{
		
	}
	
	

	public static void main(String[] args) {
		// TODO Auto-generated method
		System.out.println(Item.gst);
		Item item =new Item();
		item.calbill(200000 ,2);
		Item.changegst(30);
		//System.out.println();
		item.calbill(200000, 2);
		//item.total(2);

	}

}
