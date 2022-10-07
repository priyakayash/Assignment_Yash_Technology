package com.yash;

import static org.junit.jupiter.api.Assertions.assertEquals;

import org.junit.jupiter.api.Test;

public class MultiplyDigitTest {
	
	MultiplyDigit series=new MultiplyDigit();
	
	@Test  
    public void testSeries1(){  
        assertEquals(6,series.multiplydigit(123));  
    } 	

	@Test  
    public void testSeries2(){  
        assertEquals(1,series.multiplydigit(123));  
    }
}
