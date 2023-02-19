
/*
    class Node {
        int data;
        Node left;
        Node right;
        Node(int data) {
            this.data = data;
            left = null;
            right = null;
        }
    }
*/

class Solution {
    Node first=null; Node second = null;
    Node prev = null;
    public Node correctBST(Node root) {
        fixBst(root);
        int temp = first.data;
        first.data = second.data;
        second.data = temp;
        
        return root;
    }
    
    public void fixBst(Node root){
        if(root==null) return;
        
        fixBst(root.left);
        if(prev!=null && root.data<prev.data){
            if(first==null) first=prev;
            second=root;
        }
        prev=root;
        
        fixBst(root.right);
    }
}
