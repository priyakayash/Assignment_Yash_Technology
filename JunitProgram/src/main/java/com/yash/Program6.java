package com.yash;

public class Program6 {

	public static int main(int n) {
	
		int sum=0, count=0;
		
		for(int i=101;i<=n;i++) {
			if(i%7==0)
			{
				
				sum=sum+i;
			}
			}
		return sum;
		
//		System.out.println(sum);

	}

}
