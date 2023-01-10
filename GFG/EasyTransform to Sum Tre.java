
/*Complete the Given Function

Node is as follows:
class Node{
    int data;
    Node left,right;
    Node(int d){
    	data=d;
    	left=null;
    	right=null;
    }
}*/

class Solution{
    public void toSumTree(Node root){
         dfs(root);
    }
    
    int dfs(Node root){
         if(root==null){
             return 0;
         }
         int val = root.data;
         int leftSubTree = dfs(root.left);
         int rightSubTree = dfs(root.right);
         root.data = leftSubTree+rightSubTree;
         return val+leftSubTree+rightSubTree;
    }
}
