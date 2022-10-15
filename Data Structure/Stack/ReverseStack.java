package com.cg.java;
import java.util.*;
public class Practice {
	//---------------------------------------------------with the help of Recursion-------------------------------------
	public static void pushAtBottom(int data, Stack<Integer> st) {
		if(st.isEmpty()) {
			st.push(data);
			return;
		}
		int temp=st.pop();
		pushAtBottom(data, st);
		st.push(temp);
	}
	
	public static void reverse(Stack<Integer> st) {
		if(st.isEmpty()) {
			return;
		}
		int temp=st.pop();
		reverse(st);
		pushAtBottom(temp, st);
	}
	
	//----------------------------------------------with the help of 2 stack mean explicit stack------------------------- 
	public static void reverse(Stack<Integer> st, Stack<Integer> revSt) {
		while(!st.isEmpty()) {
			revSt.push(st.pop());
		}
	}
	
	public static void main(String args[]) {
		Stack<Integer> st= new Stack<>();
		Stack<Integer> revSt= new Stack<>();
		st.push(1);
		st.push(2);
		st.push(3);
		st.push(4);
		
		//--------------------------------------------------------for Explicit stack stuff-------------- 
//		reverse(st, revSt);
//		while(!revSt.isEmpty()) {
//			System.out.println(revSt.peek());
//			revSt.pop();
//		}
		//---------------------------------------------------------for Implicit stack stuff
		reverse(st);
		
		while(!st.isEmpty()) {
			System.out.println(st.peek());
			st.pop();
		}
		
	}
}

