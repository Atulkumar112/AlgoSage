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


