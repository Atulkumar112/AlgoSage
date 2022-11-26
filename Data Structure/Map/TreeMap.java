/*
--> treeMap is also same as hash map but like hash map stored the values as randomly but treemap stored the values as sorted form (Ascending order). 
-->Treemap is slow as compare to hashmap because it takes the time O(logn) to add, remove delete while hashmap taken the time O(1) to all these steps.
-->if you want to store the all key as a desending order so you have to use collection framwork
ex:- TreeMap<Integer, String> tm = new TreeMap<>();   // for Ascending order by default
		TreeMap<Integer, String> tmDesending = new TreeMap<>(Collections.reverseOrder());   // use collection to become it desending order
-->tree map is a tree based data structure while hashmap is a table based data structure


*/
//-------------------------------------------------------------------------------Question-----------------------------------------------------
//Question Sort the Employee name as their salary
package com.cg.java;

import java.util.Collections;
import java.util.HashMap;
import java.util.Map;
import java.util.TreeMap;

public class GroupDis {

	public static void main(String[] args) {
		int[] salry = {50, 30, 100, 40, 10};
		String[] name = {"ujj", "deepak", "atul", "nitesh", "utsav"};
		HashMap<Integer, String> hm = new HashMap<>();
		TreeMap<Integer, String> tm = new TreeMap<>();
		TreeMap<Integer, String> tmDesending = new TreeMap<>(Collections.reverseOrder());
		
		
		
		for(int i=0; i<name.length; i++) {
			hm.put(salry[i], name[i]);
			tm.put(salry[i], name[i]);
			tmDesending.put(salry[i], name[i]);
			
		}
		
		
		System.out.println("this is random order cause or hash map");
		for(Map.Entry m: hm.entrySet()) {
			System.out.println(m.getKey()+" --> "+ m.getValue());
		}
		
		System.out.println("below is sorted ascending order..............");
		for(Map.Entry t: tm.entrySet()) {
			System.out.println(t.getKey()+" --> "+ t.getValue());
		}
		
		//
		
		System.out.println("below is sorted decending order..............");
		for(Map.Entry des: tmDesending.entrySet()) {
			System.out.println(des.getKey()+" --> "+ des.getValue());
    }
	}
}

//------------------------------------------------output--------------------
/*
this is random order cause or hash map
50 --> ujj
100 --> atul
40 --> nitesh
10 --> utsav
30 --> deepak
below is sorted ascending order..............
10 --> utsav
30 --> deepak
40 --> nitesh
50 --> ujj
100 --> atul
below is sorted decending order..............
100 --> atul
50 --> ujj
40 --> nitesh
30 --> deepak
10 --> utsav
*/

/*
--> tm.floorEntry() method :- TreeMap. floorEntry() method is used to return a key-value mapping associated with the greatest key 
less than or equal to the given key, or null if there is no such key.
--> tm.lastEntry() Method:- TreeMap. lastEntry() method is used to returns the key-value mapping associated with the greatest key 
in this map, or null if the map is empty.
*/
