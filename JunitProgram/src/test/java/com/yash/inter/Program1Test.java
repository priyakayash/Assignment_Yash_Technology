package com.yash.inter;

import static org.junit.Assert.assertEquals;

import org.junit.Test;

public class Program1Test {

	Program1 p1=new Program1();
	
	@Test
    public void testCharAt1(){  
    	assertEquals('a',p1.testCharAtMethod("abc", 0));  
    } 

    @Test
    public void testCharAt2(){  
    	assertEquals('b',p1.testCharAtMethod("abc", 0));  
    } 
    
    @Test
    public void testConcatMethod1(){  
    	assertEquals("javadeveloper",p1.testConcatMethod("java", "developer"));  
    } 

    @Test
    public void testConcatMethod2(){  
    	assertEquals("java  developer",p1.testConcatMethod("java", "developer"));
    } 
    
    @Test
    public void testContainMethod1(){  
    	assertEquals(true,p1.testContainMethod("java developer", "developer"));  
    } 

    @Test
    public void testContainMethod2(){  
    	assertEquals(true,p1.testContainMethod("java developer", "hello56"));
    }
    
    @Test
    public void testEndWithMethod1(){  
    	assertEquals(true,p1.testEndWithMethod("java developer", "r"));  
    } 

    @Test
    public void testEndWithMetho2(){  
    	assertEquals(true,p1.testEndWithMethod("java developer", "p"));
    }
}
