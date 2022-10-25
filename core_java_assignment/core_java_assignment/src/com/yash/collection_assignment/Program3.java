package com.yash.collection_assignment;

import java.util.ArrayList;
import java.util.Collections;
import java.util.LinkedHashSet;
import java.util.List;

public class Program3 {
	public static void main(String[] args) {
        ArrayList<Integer> list = new ArrayList<>();
        list.add(3);
        list.add(2);
        list.add(4);
        list.add(1);
        list.add(4);
        list.add(2);
        ArrayList<Integer> list1 = new ArrayList<>();
        ArrayList<Integer> duplicateElements = new ArrayList<>();
        for(Integer i : list) {
        	if(list1.contains(i)) {
        		duplicateElements.add(i);
        	}else {
        		list1.add(i);
        	}
        }
        Collections.sort(duplicateElements);
        System.out.println(duplicateElements.toString());
	}


}

