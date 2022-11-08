package com.cg.java;

import java.util.Collections;
import java.util.PriorityQueue;

public class GroupDis{
	public static void main(String[] args) {
    //--------------------------------------------------------------------Min Heap----------------------------------------------------
		//this is for min heap
//		PriorityQueue<Integer> pq = new PriorityQueue<>();   // priority queue is always sorted form like ascending order it is min heap
		
		pq.add(5);
		pq.add(3);
		pq.add(10);
		pq.add(7);
		pq.add(6);
		
		while(!pq.isEmpty()) {
			System.out.println(pq.poll());
		}
		

	}
}
/*
ouptput is :----
3
5
6
7
10
*/

//------------------------------------------------------------------------- Max Heap------------------------------------------
package com.cg.java;

import java.util.Collections;
import java.util.PriorityQueue;

public class GroupDis{
	public static void main(String[] args) {
		//this is for max heap

		PriorityQueue<Integer> pq = new PriorityQueue<>(Collections.reverseOrder());  //this is a max heap and contains the descending order
		pq.add(5);
		pq.add(3);
		pq.add(10);
		pq.add(7);
		pq.add(6);
		
		while(!pq.isEmpty()) {
			System.out.println(pq.poll());
		}
	}
}

/*
ouptput is :----

10
7
6
5
3
*/


