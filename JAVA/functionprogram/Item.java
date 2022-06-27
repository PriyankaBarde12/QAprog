package com.functionprogram;

public class Item 
{
	int itemid , cost;
	String itemName, suppName;
	public void acceptItemDetails(int i, int c, String name, String sname)
	{
		itemid=i;
		cost=c;
		itemName=name;
		suppName=sname;
	}
	public void showitems()
	{
		System.out.println("Itemid :"  +itemid +"  cost :"+cost+ "  itemName :"+itemName+"  SuppName :"+suppName  );
	}
	
}
