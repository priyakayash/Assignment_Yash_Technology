package com.yash.string_assignment;

import java.util.Scanner;

public class Program3 {

	public static void main(String[] args) {
		   System.out.println("Enter the String");
	       Scanner sc = new Scanner(System.in);
	       String s = sc.nextLine();
	       for (int i = 0; i < s.length(); i++) {
	           if (s.charAt(i) == 'a' || s.charAt(i) == 'e'
	               || s.charAt(i) == 'i' || s.charAt(i) == 'o'
	               || s.charAt(i) == 'u' || s.charAt(i) == 'A'
	               || s.charAt(i) == 'E' || s.charAt(i) == 'I'
	               || s.charAt(i) == 'O'
	               || s.charAt(i) == 'U') {
	               continue;
	           }
	           else {
	               System.out.print(s.charAt(i));
	           } 
	       }
	   }

	}


