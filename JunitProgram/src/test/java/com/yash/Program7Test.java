package com.yash;

import static org.junit.jupiter.api.Assertions.assertEquals;

import org.junit.jupiter.api.Test;

public class Program7Test {
	
Program7 series=new Program7();
	
	@Test  
    public void testSeries1(){  
        assertEquals(0000,series.decimalToBinary(45));  
    } 	

	@Test  
    public void testSeries2(){  
        assertEquals(1,series.decimalToBinary(45)); 

}

}
