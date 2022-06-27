package com.functionprogram;

public class Inventory {

	public static void main(String[] args) {
		Item item=new Item();
		
		item.acceptItemDetails(22, 5000,"Cloth "," Priya Patil");
		item.showitems();

	}

}
