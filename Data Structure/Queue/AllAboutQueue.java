/*
Queue have five types for see full information just watch below gfg article 
https://www.geeksforgeeks.org/different-types-of-queues-and-its-applications/

*/

//----------------------------------------------------------------- Simple Queue implementation with the help of array-------------------------------------

import java.util.*;
public class Practice {
  //nested class for Queue
	static class Queue{
		static int[] arr;
		static int size;
		static int rear=-1;
    //constructor 
		Queue(int n){
			this.size=n;
			arr = new int[n];
		}
		
		//isEmpty() method 
		public static boolean isEmpty() {
			return rear==-1;
		}
		
		//Enqueue means (adding the element in queue)
		public static void add(int data) {
			if(rear==size-1) {
        System.out.println("queue is full");
				return;
			}
			rear++;
			arr[rear]=data;
			
		}
		
		//Dequeue means delete the element 
		
		public static int remove() {
			if(rear==-1) {
				System.out.println("queue is empty");
				return -1;
			}
			int front=arr[0];
      // for shifting arr
			for(int i=0; i<rear; i++) {
				arr[i]=arr[i+1];
				
			}
			rear--;
			return front;
			
		}
		
		//Peek method
		public static int peek() {
			if(rear==-1) {
				System.out.println("queue is empty");
				return -1;
			}
			return arr[0];
		}
	}
	
	public static void main(String args[]) {
		Queue q = new Queue(5);
		q.add(1);
		q.add(2);
		q.add(3);
		
		while(!q.isEmpty()) {
			System.out.println(q.peek());
			q.remove();
		}
	}
}

//--------------------------------------------------------------------------------//queue using Linked List----------------------------
public class QueueB {
   static class Node {
       int data;
       Node next;
       Node(int data) {
           this.data = data;
           next = null;
       }
   }
 
   static class Queue {
       static Node head = null;
       static Node tail = null;
 
       public static boolean isEmpty() {
           return head == null && tail == null;
       }
 
       public static void add(int data) {
           Node newNode = new Node(data);
           if(isEmpty()) {
               tail = head = newNode;
           } else {
               tail.next = newNode;
               tail = newNode;
           }
       }
 
       public static int remove() {
           if(isEmpty()) {
               System.out.println("empty queue");
               return -1;
           }
           int front = head.data;
           //single node
           if(head == tail) {
               tail = null;
           }
           head = head.next;
           return front;
       }
 
       public static int peek() {
           if(isEmpty()) {
               System.out.println("empty queue");
               return -1;
           }
          
           return head.data;
       }
   }
   public static void main(String args[]) {
       Queue q = new Queue();
       q.add(1);
       q.add(2);
       q.add(3);
       q.add(4);
       q.add(5);
 
       while(!q.isEmpty()) {
           System.out.println(q.peek());
           q.remove();
       }
   }
}


//------------------------------------------------------------------Queue implementation with the help of util package and below code represent the LinkedList and Dequeue
// Actually we written LinkedList or ArrayQueue as a class in line num 153 and 154. because Queue is a interface in java so that's why we can't make object of it and
// can't call it as class that's why we Write LinkedList and ArrayQueue below.----------------------------------------------------------------------------------

import java.util.*;
public class Practice {
	public static void main(String args[]) {
		Queue<Integer> q = new LinkedList<Integer>();
//		Queue<Integer> q = new ArrayDeque<Integer>();
		//Both linked List and arrayDeque are same we can choose anyone of them for code.
		//but deque is Double ended queue we can add the element from front as well as rear 
		q.add(1);
		q.add(2);
		q.add(3);
		q.add(4);
		
		while(!q.isEmpty()) {
//			System.out.println(q.peek());
//			q.remove();
			// OR 
			// this poll() method does peek work and remove work as well means 1 teer se 2 nishane
			System.out.println(q.poll());
		}
	}
}

//---------------------------------------//Circular queue using array -------------------------------------------

package com.cg.java;
import java.util.*;
public class Practice {
	static class Queue {
		static int arr[];
		static int front=-1;
		static int rear=-1;
		static int size;
		
		Queue(int n){
			this.size=n;
			arr = new int[n];
		}
		
		//isEmpty()
		public static boolean isEmpty() {
			return rear==-1 && front==-1;
		}
		
		//isFull()
		public static boolean isFull() {
			return (rear+1)%size==front;
		}
		
		
		//for adding Enque O(n)
		public static void add(int data) {
			if(isFull()) {
				System.out.println("Queue is full");
				return;
			}
			
			//for first element 
			if(front==-1) {
				front=0;
			}
			
			rear = (rear+1)%size;
			arr[rear]=data;
		}
		
		//Deque O(n)
		public static int remove() {
			if(isEmpty()) {
				System.out.println("The queue is empty");
				return -1;
			}
			
			int result = arr[front];
			//for first element
			if(rear==front) {
				rear=front=-1;
			}
			else {
				front = (front+1)%size;
			}
			return result;
		}
		
		
//		//peek()
		public static int peek() {
			if(isEmpty()) {
				System.out.println("The queue is empty");
				return -1;
			}
			
			return arr[front];
		}
		

	}
	
	public static void main(String args[]) {
		Queue q = new Queue(5);
		q.add(1);
		q.add(2);
		q.add(3);
		q.add(4);
		q.add(5);
		System.out.println(q.remove());
		q.add(6);
		System.out.println(q.remove());
		q.add(7);
		
		
		while(!q.isEmpty()) {
			System.out.println(q.peek());
			q.remove();

		}
	}
}


