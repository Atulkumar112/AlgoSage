import java.util.*;

public class LC {
	static class Node{
		
		int val;
		Node left;
		Node right;
		Node(int val){
			this.val=val;
			this.left=null;
			this.right=null;
		}
	}
	
	static int i=-1;
  // for building a tree
	public static Node buildTree(int[] arr) {
		i++;
        if(arr[i] == -1) return null;
        Node newNode = new Node(arr[i]);
        newNode.left = buildTree(arr);
        newNode.right = buildTree(arr);
        
        return newNode;	
	}
	
  // preorder using recursion
	public static void preorder(Node root) {
		if(root == null){
	          return;
	        }
	        System.out.print(root.val+" ");
	        preorder(root.left);
	        preorder(root.right);
	}
	
  // preorder using iterative approach
	public static void preorderusingitr(Node root) {
		if(root==null) return;
		
		Stack<Node> st = new Stack();
		st.push(root);
		while(!st.isEmpty()) {
			Node temp = st.pop();
			System.out.print(temp.val+" ");
			if(temp.right != null) {
				st.push(temp.right);
			}
			if(temp.left!=null) {
				st.push(temp.left);
			}
		}
	}
	
	
	
	public static void main(String[] args) {
		int[] arr = new int[] {1,-1,2,3,-1,-1,-1};

		  
		Node root = buildTree(arr);
		System.out.println(root.val); 
		
		System.out.println("preorder traversal using recursion:- ");
		preorder(root);
		System.out.println();
		System.out.println("preorder traversal using iterative approach:- ");
		preorderusingitr(root);
		
	}
			
	
}
