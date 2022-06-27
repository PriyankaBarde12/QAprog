package com.testngprogram;

import org.testng.annotations.Test;

public class Numberofexecution {

	
		
		@Test(invocationCount= 30)
		public void TestngTest1(){
			System.out.println("Test case execution");
		}
	}


