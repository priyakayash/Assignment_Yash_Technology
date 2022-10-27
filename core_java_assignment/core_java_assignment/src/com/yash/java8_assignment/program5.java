package com.yash.java8_assignment;

import java.util.Scanner;

public class program5 {
	
	interface Sequence{

	    void sqnce(int a[]);
	}

	public static void main(String[] args) {
		  Scanner sc = new Scanner(System.in);
	        int arr[]= new int[] {1,2,3,4,6,7,8,11,13,14,15,19,20,21};

	       System.out.println("1");
	        for(int i=0;i<arr.length-1;i++) {
	        if(arr[i]+2-arr[i+1]==1) {
	        //    System.out.println(arr[i]);
	        }

	       else

	            System.out.print("-");
	        System.out.print(arr[i+1]);

	   }

	       Sequence obj=(int[] x)->{

	        };



	}

}
