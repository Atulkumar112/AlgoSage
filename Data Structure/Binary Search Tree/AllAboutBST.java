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
	
	//For searching a element 
	public static boolean search(Node root, int key) {
		if(root == null) {
			return false;
		}
		if(root.data == key) {
			return true;
		}
		
		if(key > root.data) {
			return search(root.right, key);
		}
		else {
			return search(root.left, key);
		}
	
	}
	
	//for deleting a node from tree........... most important 
	public static Node delete(Node root, int val) {
		if(val>root.data) {
			root.right = delete(root.right, val);
		}
		else if(val < root.data) {
			root.left =  delete(root.left, val);
		}
		else {              //val == root.data
			//case 1
			if(root.left == null && root.right == null) {     //ex:- 2, 4, 9 in a tree both have null child
				return null;
			}
			
			//case 2
			if(root.left == null) {    // ex:- 7 in a tree, left side is null
				return root.right;
			}
			else if(root.right == null){
				return root.left;
			}
			
			//case 3     // this is very and most important and  critical case
			Node IS = inorderSuccessor(root.right);
			root.data = IS.data;
			root.right = delete(root.right, IS.data);
		}
		
		return root;
	}
	
	public static Node inorderSuccessor(Node root) {
		while(root.left != null) {
			root = root.left;
		}
		return root;
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
		
		int[] arr = {8, 5, 3, 1, 4, 6, 10, 11, 14};
		Node root = null;
		for(int i=0; i<arr.length; i++) {
			root = insert(arr[i], root);
		}
		
		inorder(root);
		
//		System.out.println();
//		if(search(root, 7)) {
//			System.out.println("found");
//		}
//		else {
//			System.out.println("not found");
//		}
		
		System.out.println();
		
//		delete(root, 4);  // for first case
//		delete(root, 10);  // for first case
//		delete(root, 5);  // for first case
//		inorder(root);
  }
}

//--> Deleting a Node from a tree is most important it asked most of the times in maang interviews...
/* so it have 3 cases to deleting a node, you can see the code from  52 - 87 line. i mentioned all these 3 cases so now let me explan it better.
-->Case first(Easy case):- when we need to deleting a node which have both children are null then we just return null value.
-->Case Second:- when we need to deleting a node which have right child is null or we have right child is null, means one is a null child then we just return to another 
child.. let example if root.left = null then return root.right or vise varsa.
-->Case Third(Most important case):- when we have to delete that node which have both children then just go to it right side at once and then move it to left side till
we got null value then return the last left node before the null. 
*/





