package com.mapProgram;

public class ThreadDemo extends Thread {
	public void run(){  
		System.out.println("thread is running...");  
		}  
		public static void main(String args[]){  
			ThreadDemo tr=new ThreadDemo();  
		tr.start();  
		 }  


}
