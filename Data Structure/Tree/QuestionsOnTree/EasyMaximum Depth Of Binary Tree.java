
/*
// A Binary Tree node
class Node
{
    int data;
    Node left, right;

    Node(int item)
    {
        data = item;
        left = right = null;
    }
}
*/
class Solution {
    
  public static int maxDepth(Node root) {
    // code here
    if(root==null){
        return 0;
    }
    
    return 1+Math.max(maxDepth(root.left), maxDepth(root.right));
    
    
  }
}
