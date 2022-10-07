package com.yash;

import static org.junit.jupiter.api.Assertions.assertEquals;

import org.junit.jupiter.api.Test;

public class Program3Test {
	
	Program3 series=new Program3();
	
	 public void testSeries1(){  
	        assertEquals("3 3",series.totalEven(23456));  
	       
	    } 	

		@Test  
	    public void testSeries2(){  
	        assertEquals("12 10",series.totalEven(23456));
	        

	}


}
