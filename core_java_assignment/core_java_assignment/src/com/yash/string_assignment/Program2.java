package com.yash.string_assignment;

public class Program2 {

	public static void main(String[] args) {
		
        String name = "yashtechnology";
        System.out.println("Ascending order is = "+ascending(name));
        System.out.println("Descending order is = "+descending(name));
	}

	public static String ascending(String s) {
		int len = s.length();
		char ch[] = s.toCharArray();
		for(int i=0; i<len; i++) {
			for(int j=i+1; j<len; j++) {
				if(ch[i]>ch[j]) {
					char temp = ch[i];
					ch[i] = ch[j];
					ch[j] = temp;
				}
			}
		}
		return String.copyValueOf(ch);
	}
	
	public static String descending(String s) {
		int len = s.length();
		char ch[] = s.toCharArray();
		for(int i=0; i<len; i++) {
			for(int j=i+1; j<len; j++) {
				if(ch[i]<ch[j]) {
					char temp = ch[i];
					ch[i] = ch[j];
					ch[j] = temp;
				}
			}
		}
		return String.copyValueOf(ch);


	}

}
