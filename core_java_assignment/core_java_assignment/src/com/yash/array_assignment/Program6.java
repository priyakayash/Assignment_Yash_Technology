package com.yash.array_assignment;

import java.util.Arrays;

public class Program6 {
	public static void main(String args[]) {
		   int ar[] = {2,1,4,3,6,5,8,7,9};
		   Arrays.sort(ar);
		    for (int i = 0; i < ar.length / 2; i++)
		        System.out.print(ar[i]+" ");
		 
		    for (int j = ar.length - 1; j >= ar.length / 2; j--)
		    System.out.print(ar[j]+" ");
	   }

}
