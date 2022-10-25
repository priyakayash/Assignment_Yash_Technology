package com.yash.string_assignment;

public class Program4 {

	public static void main(String[] args) {
		
	        String name  = "yash technology Indore";
	        int count = 0;
	        for(int i=0; i<name.length(); i++) {
	        	for(int j=i+1; j<name.length(); j++) {
	            	if(name.charAt(i)==name.charAt(j)) {
	            		count++;
	            	}
	            }	
	        }
	        System.out.println(count);

	}

}
