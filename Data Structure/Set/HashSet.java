package com.cg.java;

import java.util.*;
import java.util.Map.Entry;

import javax.print.attribute.standard.NumberOfDocuments;

//HashSet doesn't have key/value pairs. And it's not contains the duplicates element. The difference between the hashset and treeset is that hashset implemented by map
//interface whereas treeset implemented by Set interface and treeset have sorted value and hashset have random value. Otherwise both of them contains only unique element.
public class GroupDis {	
	public static void main(String[] args) {	
		
		HashSet<Integer> hs = new HashSet<>();
		hs.add(4);
		hs.add(2);
		hs.add(3);
		hs.add(2);
		hs.add(100);
		hs.add(56);
		hs.add(34);
		hs.add(5);
		
		System.out.println("size of set:- " + hs.size());
		
		Iterator<Integer> itr = hs.iterator();
		while(itr.hasNext()) {
			System.out.println(itr.next());
		}
		
	}	
}



