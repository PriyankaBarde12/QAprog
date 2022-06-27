package com.oopsprog;



public class EncapItem 
{

	private int itemid;
	private int cost;
	public String itemname;
	public int getItemid() 
	{
		return itemid;
	}
	public int getCost() 
	{
		return cost;
	}
	public String setItemname(String name) 
	{
		itemname=name;
		return itemname;
	}
	public static void main(String args[]) 
	{
		EncapItem it=new EncapItem();
		it.getItemid();
		it.getCost();
		System.out.println(it.setItemname("pen"));
	}
}
