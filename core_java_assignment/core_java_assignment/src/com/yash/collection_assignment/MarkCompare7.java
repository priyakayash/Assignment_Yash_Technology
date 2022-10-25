package com.yash.collection_assignment;

import java.util.Comparator;

public class MarkCompare7 implements Comparator<Student7> {
	public int compare(Student7 s1, Student7 s2) {
        if (s1.totalmarks == s2.totalmarks)
            return 0;
        else if (s1.totalmarks > s2.totalmarks)
            return 1;
        else
            return -1;



   }

}
