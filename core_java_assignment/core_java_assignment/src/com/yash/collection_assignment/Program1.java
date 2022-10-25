package com.yash.collection_assignment;

import java.util.ArrayList;
import java.util.Collections;

public class Program1 {
	
public static void main(String[] args) {
	
		
        // Create a list of strings
//		Software Engineer in Yash Technology
        ArrayList<String> al = new ArrayList<String>();
        al.add("Software");
        al.add("Engineer");
        al.add("In");
        al.add("yash");
        al.add("technology");
        
        Collections.sort(al);
        
        System.out.println("Collection Ascending order"+al);





	}

}
