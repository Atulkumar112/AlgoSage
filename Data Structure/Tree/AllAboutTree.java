import java.util.*;

public class BinaryTree {
      
  //Defining a tree node
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
        Queue<Integer> q = new LinkedList<>();
        
      }
      
      
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
      // System.out.println(root.data);
      System.out.println("Preorder");
      preorder(root);
      System.out.println(" ");
      System.out.println("Inorder");
      inorder(root);
      System.out.println(" ");
      System.out.println("Postorder"); 
      postorder(root);
      
  }
}






