package com.testngprogram;

import org.testng.annotations.Test;

public class ArgumentwithTestNG {


		@Test(dependsOnMethods= "Test4")
		public void Test3() {
			System.out.println("Test3");
		}
		@Test
		public void Test4() {
			System.out.println("test4");
		}

	}


