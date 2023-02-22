
//User function Template for Java

/*
class Node{
    int data;
    Node left;
    Node right;
    Node nextRight;
    Node(int data){
        this.data = data;
        left=null;
        right=null;
        nextRight = null;
    }
} */
class Solution {
    //TC:- O(N) & SC:- O(N)
    public void connect(Node root) {
        Queue<Node> q = new LinkedList<>();
        q.add(root);
        q.add(null);
        
        while(!q.isEmpty()){
            Node temp = q.poll();
            if(temp==null){
                if(!q.isEmpty()){
                    q.add(null);
                }
                else{
                    break;
                }
            }
            else{
                temp.nextRight=q.peek();
                if(temp.left!=null) q.add(temp.left);
                if(temp.right!=null) q.add(temp.right);
            }
        }
        
    }
}
