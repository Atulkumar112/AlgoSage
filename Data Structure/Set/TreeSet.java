package com.cg.java;

import java.util.*;
import java.util.Map.Entry;

import javax.print.attribute.standard.NumberOfDocuments;

//TreeSet is implemented with the help of Set interface and it contains only the unique elements and it's now a key value pair.
//-->The difference between the hashset and treeset is that hashset implemented by map interface whereas treeset implemented by Set interface and 
//treeset have sorted value and hashset have random value. Otherwise both of them contains only unique element.
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



