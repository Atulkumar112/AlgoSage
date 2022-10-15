/*we have 3 types to implement the stack which are array, arrayList and linked list. but ArrayList and Linked list is prefered. don't use array because we have to
assign the length of array and when it will be fill then we have to extend it but arrayList and linked list is a variable type and it have a java long space */

//--------------------------------------------------------------stack implemention with ArrayList---------------------------------------------------------------
import java.util.ArrayList;

public class Practice {
	static class Stack{
		static ArrayList<Integer> list = new ArrayList<>();
		//check for the stack is empty or not
		public static boolean isEmpty() {
			return list.size()==0;
		}
		//for push the element in stack
		public static void push(int data) {
			list.add(data);
		}
		
		//for deleting the element from stack
		public static int pop() {
			if(isEmpty()) {
				//if stack is empty
				return -1;
			}
			int popVal = list.get(list.size()-1);
			list.remove(list.size()-1);
			return popVal;
		}
		
		// for peek function for getting the top element of stack
		public static int peek() {
			if(isEmpty()) {
				//if stack is empty then return -1
				return -1;
			}
			return list.get(list.size()-1);
			
		}
		
	}
	public static void main(String args[]) {
		Stack st = new Stack();
		st.push(1);
		st.push(2);
		st.push(3);
		st.push(4);
		
		if(st.isEmpty()) {
			System.out.println("the stack is empty");
		}
		while(!st.isEmpty()) {
			System.out.println(st.peek());
			st.pop();
		}
		
//		System.out.println(st.peek());
//		st.push(5);
//		System.out.println(st.peek());
		
	}
}

//---------------------------------------------------------------Stack implementaion with LinkedList------------------------------------
public class Practice {
	//create a linked list
	static class Node{
		int data;
		Node node;
		public Node next;
		public Node(int data){
			this.data=data;
			this.node=null;
		}
	}
	
	static class Stack{
		static Node head;
		//check for stack is empty or not 
		public static boolean isEmpty() {
			return head==null;
		}
    //method for push the element in stack 
		public static void push(int data) {
			Node newNode = new Node(data);
			if(isEmpty()) {
				head=newNode;
				return;
			}
			newNode.next=head;
			head=newNode;
		}
		//method for delete the element from stack 
		public static int pop() {
			if(isEmpty()) {
				return -1;
			}
			int val=head.data;
			head = head.next;
			return val;
		}
		//mehtod for see the top element of stack 
		public static int peek() {
			if(isEmpty()) {
				return -1;
			}
			return head.data;
		}
	}
	public static void main(String args[]) {
		Stack st = new Stack();
		st.push(1);
		st.push(2);
		st.push(3);
		st.push(4);
		
		if(st.isEmpty()) {
			System.out.println("the stack is empty");
		}
		while(!st.isEmpty()) {
			System.out.println(st.peek());
			st.pop();
		}
	}
}

//------------------------------------------------------------stack implemention with util package---------------
import java.util.*;
public class Practice {
	
	public static void main(String args[]) {
		Stack<Integer> st = new Stack();
		st.push(1);
		st.push(2);
		st.push(3);
		st.push(4);
		
		if(st.isEmpty()) {
			System.out.println("the stack is empty");
		}
		while(!st.isEmpty()) {
			System.out.println(st.peek());
			st.pop();
		}
	}
}

//------------------------------------------------------------------------major method of stack--------------------
push()
pop()
peek()
isEmpty()
//stack have two type
Implicit Stack:- this type stack use the recursion. when we do recursion then java build it own stack which is called impicity stack
Explicit:- The all above code written in explicity stack.
