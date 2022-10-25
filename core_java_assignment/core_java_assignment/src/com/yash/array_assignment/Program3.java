package com.yash.array_assignment;

import java.util.Scanner;

public class Program3 {

	public static void main(String[] args) {

		Scanner scan= new Scanner(System.in);
		int arr[]=new int[5];
		
		System.out.println("Enter 5 elemnent");
		
		for(int i=0;i<arr.length;i++) {
			arr[i]=scan.nextInt();
				
		}
		
		System.out.println("Entered values are:");
		
		for(int i=0;i<arr.length;i++) {
			
			System.out.println(arr[i]);
				
		}
		
	}

}
