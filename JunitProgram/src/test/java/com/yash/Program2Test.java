package com.yash;

import static org.junit.jupiter.api.Assertions.assertEquals;

import org.junit.jupiter.api.Test;

public class Program2Test {
	
	Program2 series=new Program2();
	
	@Test  
    public void testSeries1(){  
        assertEquals(15,series.factorial(5));  
    } 	

	@Test  
    public void testSeries2(){  
        assertEquals(120,series.factorial(5)); 

}

}
