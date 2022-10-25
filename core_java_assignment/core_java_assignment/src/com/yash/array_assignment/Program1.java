package com.yash.array_assignment;

public class Program1 {
static int getThirdLargest(int []a) {
		
		int temp;
		
		for(int i=0;i<a.length;i++) {
			
			for(int j=i+1;j<a.length;j++) {
				if(a[i]>a[j]) {
					temp=a[i];
//					System.out.println(a[i]+"======="+temp+"_"+a[j]);
					a[i]=a[j];
//					System.out.println(a[j]+"======="+a[i]);
					a[j]=temp;
					
//					System.out.println("======="+temp);
				}
			}
			
		}
//		System.out.println(a.length+"======="+a[a.length-7]);
		return a[a.length-3];
		
	}

	public static void main(String[] args) {
		
		int a[]= {11,10,4,15,16,3,2};
		
		System.out.println("getThirdLargest=======>>>>"+getThirdLargest(a));
		
		
	

		
	}

}
