package com.yash;

import static org.junit.jupiter.api.Assertions.assertEquals;

import org.junit.jupiter.api.Test;

public class Program1Test {
	
	Program1 series=new Program1();
	
	@Test  
    public void testSeries1(){  
        assertEquals(15,series.addUpTo(5));  
    } 	

	@Test  
    public void testSeries2(){  
        assertEquals(1,series.addUpTo(5)); 

}
}
