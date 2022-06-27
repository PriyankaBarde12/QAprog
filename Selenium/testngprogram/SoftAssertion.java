package com.testngprogram;

import org.testng.annotations.Test;
import org.testng.asserts.SoftAssert;

public class SoftAssertion {
		@Test
		public void SoftAssertionTest1() {
			SoftAssert s=new SoftAssert();
			s.assertEquals("Java","javaa","String not match");
			s.assertTrue(false,"Boolean value is not match");
			s.assertEquals(104, 108,"Integer value not match");
			s.assertAll();
		}

	}


