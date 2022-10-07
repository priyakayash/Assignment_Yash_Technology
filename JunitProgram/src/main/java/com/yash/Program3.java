package com.yash;

public class Program3 {
	
	static String totalEven(int n)
	{
		int even_count=0;
		int odd_count=0;
		
		while(n>0) {
			int rem=n%10;
			
			if(rem%2==0) {
				even_count++;
			}
			
			else {
				odd_count++;
			}
			
		}
		
		
		return even_count+" "+odd_count;
		
	}
	
	static int totalOdd(int n) {
		
		int odd_count=0;
		
		
		while(n>0) {
			int rem=n%10;
			
			if(rem%2 !=0) {
				odd_count++;
			}
			
		}
		
		return odd_count;
		
	}
}
