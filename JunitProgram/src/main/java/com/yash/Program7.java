package com.yash;

public class Program7 {
	

	static int decimalToBinary(int num) {
		
		int[]binary=new int[35];
		int id=0;
		while(num>0) {
//			binary(id++)==num%2;
			id++;
			num=num/2;
		}
		
		
		PrintBinary(binary,id);
		return num;
		
	}
	static void PrintBinary(int []binary,int id) {
		
//		System.out.println(binary[2]);
		for(int i=id-1;i>=0;i--) {
//			System.out.println(binary[i]);
		}
	}
	
	

//	public static void main(String[] args) {
//		
//		int num=45;
//		
//		decimalToBinary(num);
//
//	}

}
