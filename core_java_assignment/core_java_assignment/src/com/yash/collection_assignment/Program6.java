package com.yash.collection_assignment;

import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;

public class Program6 {
	
	static  HashMap<String, Integer> m = new HashMap<>();
        
        public static void sortMapByKey()
        {

            ArrayList<Integer> sortKeys
            = new ArrayList<Integer>();

        Collections.sort(sortKeys);
 

        }
        
        public static void main(String[] args) {
        
        m.put("Puna", 6987000);
        m.put("banglore", 3209000);
        m.put("Indore", 13193035);
        
//        sortMapByKey();
        
        
        
        System.out.println(m);


	
		
	}

}
