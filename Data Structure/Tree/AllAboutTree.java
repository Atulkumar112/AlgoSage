package com.cg.java;

import java.util.*;

public class Practice {
      
  //Defining a tree node with created a nested class
      static class Node{
          int data;
          Node left;
          Node right;
          
          Node(int data){
            this.data = data;
            this.left = null;
            this.right = null;
          }
      }
      
      
      static int i=-1;
      //for building a tree
      public static Node buildTree(int[] arr){
        
        i++;
        if(arr[i] == -1) return null;
        Node newNode = new Node(arr[i]);
        newNode.left = buildTree(arr);
        newNode.right = buildTree(arr);
        
        return newNode;
      }
    
      //preorder traversal
      public static void preorder(Node root){
        if(root == null){
          return;
        }
        System.out.print(root.data+" ");
        preorder(root.left);
        preorder(root.right);
      }
      
      //inorder traversal
      public static void inorder(Node root){
        if(root == null) return;
        inorder(root.left);
        System.out.print(root.data+" ");
        inorder(root.right);
      }
      
      //post inorder
      public static void postorder(Node root){
        if(root == null) return;
        postorder(root.left);
        postorder(root.right);
        System.out.print(root.data+" ");
      }
      
      //level order traversal
      public static void levelOrder(Node root){
		  if(root == null) return;
		  Queue<Node> q = new LinkedList<>();
	  	q.add(root);
	  	q.add(null);
	  	while(!q.isEmpty()) {
	  		Node currNode = q.remove();
	  		if(currNode == null) {
	  			System.out.println();
	  			if(q.isEmpty()) {
	  				break;
	  			}
	  			else {
	  				
	  				q.add(null);
	  			}
	  			
	  		}
	  		else {
	  			System.out.print(currNode.data+" ");
	  			if(currNode.left != null) {
	  				q.add(currNode.left);
	  			}
	  			if(currNode.right != null) {
	  				q.add(currNode.right);
	  			}
	  		}
	  	}
      }
	/* 
	//--...........................You can also traverse level vise like this.. below is the gfg problem name is "Maximum Value" so here i need to find the 
	// maximum value from the level in a tree 
	class Solution {
    ArrayList<Integer> maximumValue(Node root) {
        // code is correct but it's showing the time limit exceeded
       Queue<Node> q = new LinkedList<>();
		ArrayList<Integer> list = new ArrayList<>();
		
		q.add(root);
		
		
		while(!q.isEmpty()) {
			int currLevelNodeNum = q.size();
			int max = 0;
		    while(currLevelNodeNum-->0){
		        Node d = q.remove();
		        max = Math.max(max, d.data);
		        if(d.left != null) q.add(d.left);
		        if(d.right != null) q.add(d.right);
		    }
		    list.add(max);
		}
		return list;
    }
}
	*/
      
      // main method
      public static void main(String[] args) {
        /*
              1 
            /   \
          2      3
        /  \      \
      4     5      6
        
        */
      int[] arr = {1,2,4,-1,-1,5,-1,-1,3,-1,6,-1,-1};
      Node root = buildTree(arr);
       System.out.println("Root of the tree is:- "+root.data);
      System.out.println("Preorder");
      preorder(root);
      System.out.println(" ");
      System.out.println("Inorder");
      inorder(root);
      
      System.out.println("");
      System.out.println("Postorder"); 
      postorder(root);
      
      System.out.println("");
      System.out.println("Printing the tree as a level vise.....");
      levelOrder(root);
      
      
  }
}

//------------------------------------------------------------Outputs-------------------------------------------------------------
Root of the tree is: 1
Preorder
1 2 4 5 3 6  
Inorder
4 2 5 1 3 6 
Postorder
4 5 2 6 3 1 
Printing the tree as a level vise.....
1 
2 3 
4 5 6 
