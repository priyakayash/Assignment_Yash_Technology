package com.yash;

import static org.junit.jupiter.api.Assertions.assertEquals;

import org.junit.jupiter.api.Test;

public class Program6Test {
	
Program6 series=new Program6();
	
	@Test  
    public void testSeries1(){  
        assertEquals(2107,series.main(200));  
    } 	

	@Test  
    public void testSeries2(){  
        assertEquals(5,series.main(200)); 

}

}
