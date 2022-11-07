//printing the all node form root node to leaf node 

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
	
	
	//for printing the all node from root node to leaf node 
	public static void rootToLeaf(Node root, List<Integer> path) {
		if(root == null) {
			return ;
		}
		
		path.add(root.data);
		
		if(root.left == null && root.right == null) {
			printPath(path);
		}
		else {
			rootToLeaf(root.left, path);
			rootToLeaf(root.right, path);
		}
		
		path.remove(path.size()-1);
		
	}
	
	//for printing the path
	public static void printPath(List<Integer> list) {
		for(int i=0; i<list.size(); i++) {
			System.out.print(list.get(i)+" ");
		}
		System.out.println();
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
	
		rootToLeaf(root, new ArrayList<>());
  }
}


//output:---
/*
1 3 4 5 6 8 10 11 14 
8 5 3 1 
8 5 3 4 
8 5 6 
8 10 11 14 

*/
