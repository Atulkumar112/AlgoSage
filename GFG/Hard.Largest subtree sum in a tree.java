// Really it is very easy question
class Solution {
    static int ans;
    public static int findLargestSubtreeSum(Node root) {
        ans=Integer.MIN_VALUE;
        postOrder(root);
        
        return ans;
        
    }
    
    public static int postOrder(Node root){
        if(root == null){
            return 0;
        }
        
        int l = postOrder(root.left);
        int r = postOrder(root.right);
        
        ans = Math.max(ans, root.data+l+r);
        
        return root.data+l+r;
    }
}
        
