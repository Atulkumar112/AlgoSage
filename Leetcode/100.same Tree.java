/**
 * Definition for a binary tree node.
 * public class TreeNode {
 *     int val;
 *     TreeNode left;
 *     TreeNode right;
 *     TreeNode() {}
 *     TreeNode(int val) { this.val = val; }
 *     TreeNode(int val, TreeNode left, TreeNode right) {
 *         this.val = val;
 *         this.left = left;
 *         this.right = right;
 *     }
 * }
 */
class Solution {
    public boolean isSameTree(TreeNode p, TreeNode q) {
        if(p==null && q==null) return true;
        
        if(p!=null && q==null || p==null && q!=null) return false;
        if(p.val != q.val) return false;
        
        boolean leftTree = isSameTree(p.left, q.left);
        boolean rightTree = isSameTree(p.right, q.right);

        return leftTree && rightTree;
    }

    // below code is written by me and running the 47/60 test cases
    //  public boolean isSameTree(TreeNode p, TreeNode q) {
    //     if(p==null || q==null) {
    //         return true;
    //     }

    //     if(p != q) return false;
        // isSameTree(p.left, q);
        // isSameTree(p.right, q);
        // isSameTree(p, q.left);
        // isSameTree(p, q.right);

    //     return true;
    // }
}
