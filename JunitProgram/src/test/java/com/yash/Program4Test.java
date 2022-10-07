package com.yash;

import static org.junit.jupiter.api.Assertions.assertEquals;

import org.junit.jupiter.api.Test;

public class Program4Test {
	
	
	Program4 series=new Program4();
	
	@Test  
    public void testSeries1(){  
        assertEquals(9,series.sumdigit(234));  
    } 	

	@Test  
    public void testSeries2(){  
        assertEquals(1,series.sumdigit(234)); 

}

}
