package com.cg.java;
import java.util.*;
public class Practice {
  
	//------------------------------------------------------------with the help of Explicit stack means extra stack---------------------------------------------------
//	public static void add(int data, Stack st, Stack temp) {
//		if(st.isEmpty()) {
//			st.push(data);
//			return;
//		}
//		while(!st.isEmpty()) {
//			temp.push(st.pop());
//		}
//		if(st.isEmpty()) {
//			st.push(data);
//		}
//		while(!temp.isEmpty()) {
//			st.push(temp.pop());
//		}
//	}
	
	//---------------------------------------------------------------with the help of Implicit stack means with the help of Recursion (Recursion Stack)--------------
	public static void add(int data, Stack<Integer> st) {
		if(st.isEmpty()) {
			st.push(data);
			return;
		}
		int temp=st.pop();
		add(data, st);
		st.push(temp);
	}
	
	public static void main(String args[]) {
		Stack<Integer> st= new Stack<>();
		//--------------------------------------------------------------
		//for first method stuff
//		Stack<Integer> temp= new Stack<>();
//		add(1, st, temp);
//		add(2, st, temp);
//		add(3, st, temp);
//		add(4, st, temp);
		//-------------------------------------------------------------
		st.push(1);
		st.push(2);
		st.push(3);
		add(4, st);
		while(!st.isEmpty()) {
			System.out.println(st.peek());
			st.pop();
		}
		
	}
}
