package com.yash.exception_assignment;

import java.util.Scanner;

public class Program3 {
	public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        try {
        	System.out.println("Enter the size of array");
        	int size = sc.nextInt();
        	Object a[] = new Object[size];
        	System.out.println("Array is created Successfully");
        }catch(NegativeArraySizeException | NumberFormatException e) {
        	System.out.println(e);
        }
	}

}
