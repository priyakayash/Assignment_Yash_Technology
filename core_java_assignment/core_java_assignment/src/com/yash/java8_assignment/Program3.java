package com.yash.java8_assignment;

import java.util.Scanner;

@FunctionalInterface
interface EvenInterface{
    void isEvenInterface(int num1,int num2);
}

interface OddInterface{
    void isOddInterface(int num1,int num2);
}


public class Program3 {
	
	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Enter 1 for Even Number: ");
		System.out.println("Enter 2 for Odd Number: ");
		System.out.println("Enter 3 for Armstrong Number: ");
	    System.out.println("Enter 4 for palindrome Number: ");
	    
	    int option=sc.nextInt();
	    
	    if(option==1) {
		
	  	System.out.println("Enter the Number: ");
	  	int n1 = sc.nextInt();
	  	
	  	System.out.println("Enter the second Number: ");
	  	int n2 = sc.nextInt();
		   
		EvenInterface e1 = (num1,num2) ->{
		            
					if(num1%2==0) {
		                System.out.println("Even Number"+num1);
		            }
					if(num2%2==0) {
						 System.out.println("Even Number"+num2);
		            }
					
		        };
		        
		      
		         e1.isEvenInterface(n1,n2);  

		        
		
	}
	    
	    if(option==2) {
	    	
	    	System.out.println("Enter the Number: ");
	      	int n1 = sc.nextInt();
	      	
	      	System.out.println("Enter the second Number: ");
	      	int n2 = sc.nextInt();
	    	   
	      	OddInterface e2 = (num1,num2) ->{
	    	            
	    				if(num1%2 !=0) {
	    	                System.out.println("Odd Number"+num1);
	    	            }
	    				if(num2%2 !=0) {
	    					 System.out.println("Odd Number"+num2);
	    	            }
	    				
	    	        };
	    	        
	    	      
	    	         e2.isOddInterface(n1,n2);  
	    }

	}

}
