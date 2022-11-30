package com.cg.java;

import java.util.*;
import java.util.Map.Entry;

import javax.print.attribute.standard.NumberOfDocuments;

//TreeSet is implemented with the help of Set interface and it contains only the unique elements and it's now a key value pair.
public class GroupDis {	
	public static void main(String[] args) {	
		TreeSet<Integer> ts = new TreeSet<>();
		ts.add(0);
		ts.add(1);
		ts.add(1);
		ts.add(2);
		Iterator<Integer> itr =ts.iterator();
		while(itr.hasNext()) {
			System.out.println(itr.next());
		}
	}	
}



