//you have given 2 number and root node and you have to print the all node which are comes in the range nodes (inclusive).
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
		}
	} 
	
	//inserting a data in a BST
	public static Node insert(int val, Node root) {

		if(root == null) {
			root = new Node(val);
			return root;
		}
		if(val>root.data) {
			root.right = insert(val, root.right);
		}
		else {
			root.left = insert(val, root.left);
		}
		return root;
	}
	
  //For printing a Range 
	public static void range(Node root, int startVal, int endVal) {
		if(root == null) {
			return;
		}
		range(root.left, startVal, endVal);
		if(root.data >= startVal && root.data <= endVal) {
			System.out.print(root.data+" ");
		}
		range(root.right, startVal, endVal);
		
	}
	
	
	// inorder traversal or we can say like we are printing out binary search tree\
	public static void inorder(Node root) {
		if(root == null) {
			return;
		}
		inorder(root.left);
		System.out.print(root.data+" ");
		inorder(root.right);
	}
	public static void main(String[] args) {
//		int[] arr = {5, 1, 3, 4, 2, 7, 9};
		/*
		 *           5
		 *          / \
		 *         1   7
		 *          \   \
		 *           3   9
		 *          /  \
		 *          2   4         
		 */
		
		//inserting
		int[] arr = {8, 5, 3, 1, 4, 6, 10, 11, 14};
		Node root = null;
		for(int i=0; i<arr.length; i++) {
			root = insert(arr[i], root);
		}
		
		//printing
		inorder(root);		
		
		System.out.println();
		range(root, 3, 12);
  }
}
