package com.yash.string_assignment;

public class Program5 {

	public static void main(String[] args) {
		long startTime = System.currentTimeMillis();  
        StringBuffer sb = new StringBuffer("Yash");  
        for (int i=0; i<1000000; i++){  
            sb.append("Technology");  
            sb.append("Indore");  
//            System.out.println(sb);
        }  
        System.out.println("Time taken by StringBuffer: " + (System.currentTimeMillis() - startTime) + "ms");  
        startTime = System.currentTimeMillis();  
        StringBuilder sb2 = new StringBuilder("Yash");  
        for (int i=0; i<1000000; i++){  
            sb2.append("Technology");  
            sb2.append("Indore");  
//            System.out.println(sb2);
        }  
        System.out.println("Time taken by StringBuilder: " + (System.currentTimeMillis() - startTime) + "ms");  


	}

}
