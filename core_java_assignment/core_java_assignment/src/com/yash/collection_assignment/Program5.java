package com.yash.collection_assignment;

import java.util.Collections;
import java.util.Vector;

public class Program5 {

	public static void main(String[] args) {

		Vector<String> vector = new Vector<String>();
		vector.add("D");
		vector.add("B");
		vector.add("C");
		vector.add("P");

		System.out.println("Vector elements before sorting: " + vector);

		Collections.sort(vector);

		System.out.println("Vector elements after sorting: :" + vector);

	}
}
