
/*Complete the finction below
Node is as follows
class Node{
    int data;
    Node left,right;
    Node(int d){
        data=d;
        left=right=null;
    }
}*/

class Solution {
    public int maxLevelSum(Node root) {
        Queue<Node> q = new LinkedList<>();
        q.add(root);
        q.add(null);
        int ans=Integer.MIN_VALUE;
        
        int currSum=0;
        while(!q.isEmpty()){
            Node curr = q.poll();
            
            if(curr == null){
                // System.out.println();
                if(q.isEmpty()){
                    // if(currSum > ans){
                    //     return currSum;
                    // }
                    // return ans;
                    break;
                }
                else{
                    q.add(null);
                    if(currSum > ans){
                        ans = currSum;
                    }
                    currSum=0;
                }
            }
            else{
                currSum+=curr.data;
                if(curr.left !=null){
                    q.add(curr.left);
                }
                if(curr.right != null){
                    q.add(curr.right);
                }
            }
        }
    
        
        return Math.max(ans, currSum);
        
    }
}


