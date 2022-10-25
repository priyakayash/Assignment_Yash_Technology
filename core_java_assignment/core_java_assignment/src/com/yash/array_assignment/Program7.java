package com.yash.array_assignment;

import java.util.Scanner;

public class Program7 {
public static void main(String[] args) {
		
		int x;
	      Scanner s = new Scanner(System.in);
	      
	      System.out.print("Enter the Two Numbers: ");
	      int a = s.nextInt();
	      int b = s.nextInt();
	      
	      int numOne = a;
	      int numTwo = b;
	      
	      while(b!=0)
	      {
	         x = b;
	         b = a%b;
	         a = x;
	      }
	      
	      int hcf = a;
	      int lcm = (numOne*numTwo)/hcf;
	      
	      System.out.println("\nHCF(" +numOne+ ", " +numTwo+ ") = " +hcf);
	      System.out.println("LCM(" +numOne+ ", " +numTwo+ ") = " +lcm);


	}


}
