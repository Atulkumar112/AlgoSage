import java.util.*;

public class Practice {
    Node head;
	  
	  private int size;
	  
	  Practice(){
	    this.size = size;
	  }
	  
	  class Node{
	    int data;
	    Node next;
	    
	    Node(int data){
	      this.data = data;
	      this.next = null;
	      size++;
	    }
	  }
  
  //for adding the element at last postion 
	  public void addLast(int data){
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
	  
  // Reverse a linked list 
	  public void reverseIterative(){
	   
	   if(head == null || head.next == null){
	     return;
	   }
	   
	   Node prevNode = head;
	   Node currNode = head.next;
	   while(currNode != null){
	     Node nextNode = currNode.next;
	     currNode.next = prevNode;
	     
	     //update
	     prevNode = currNode;
	     currNode = nextNode;
	   }
	   head.next = null;
	   head = prevNode;
	   
	  }
  public static void main(String[] args) {
    Practice list = new Practice();
    list.addLast(1);
    list.addLast(2);
    list.addLast(3);
    list.addLast(4);
    list.addLast(5);
    
    list.printList();
    
    list.reverseIterative();
    System.out.println("Reverse Linked list is:- ");
    list.printList();
  }
}
