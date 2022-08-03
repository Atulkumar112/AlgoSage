package com.cg.LinkedList;

// below code is for creating a linked list and  adding at fist and last element and delete the element at fist and last element and adding the element in a linked list 
// and we can also check the size of the linked list 
// anyway we can all this things with the help of collection package 
public class LinkedListDemo {

	Node head;
	  
	  private int size;
	  
	  LinkedListDemo(){
	    this.size = size;
	  }
	  
	  class Node{
	    String data;
	    Node next;
	    
	    Node(String data){
	      this.data = data;
	      this.next = null;
	      size++;
	    }
	  }
	  
	  //for adding the element at first 
	  public void addFirst(String data){
	    Node newNode = new Node(data);
	    if(head == null){
	      head = newNode;
	      return;
	    }
	    
	    newNode.next = head;
	    head = newNode;
	  }
	  
	  //for adding the element at last postion 
	  public void addLast(String data){
	    Node newNode = new Node(data);
	    if(head == null){
	      head = newNode;
	      return;
	    }
	    
	    Node currNode = head;
	    while(currNode.next != null){
	      currNode = currNode.next;
	      
	    }
	    
	    currNode.next = newNode;
	    
	  }
	  
	  //deleteing the element at first postion 
	  public void deleteFirst(){
	    //cprner case
	    size--;
	    if(head == null){
	      System.out.println("List is empty");
	    }
	    head = head.next;
	  
	  }
	  
	  // deleting the last element 
	  public void deleteLast(){
	    //cprner case
	    if(head == null){
	      System.out.println("List is empty");
	    }
	    
	    size--;
	    if(head.next == null){
	      head = null;
	      return;
	    }
	    
	    Node secondCurrNode = head;
	    Node lastNode = head.next;
	    while(lastNode.next != null){
	      secondCurrNode = secondCurrNode.next;
	      lastNode = lastNode.next;
	    }
	    
	    secondCurrNode.next = null;
	  }
	  
	  //print the linked list 
	  public void printList(){
	    
	    if(head == null){
	      System.out.println("Linked List is empty!");
	      return;
	    }
	    
	    Node currNode = head;
	    while(currNode != null){
	      System.out.print(currNode.data +" -> ");
	      currNode = currNode.next;
	    }
	    System.out.println("null");
	  }
	  
	  
	  // printint the size
	  public int printSize(){
	    return size;
	  }
	public static void main(String[] args) {
		LinkedListDemo list = new LinkedListDemo();
		list.addFirst("a");
	    list.addFirst("is");
	    
	    //just printing 
	    list.printList();
	    
	    // add last 
	    list.addLast("Linked List");
	    list.printList();
	    
	    list.addFirst("This");
	    list.printList();
	    
	    list.deleteFirst();
	    list.printList();
	    
	    list.deleteLast();
	    list.printList();
	    
	    System.out.println(list.printSize());
	}

}

