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
    boolean res = true;
    public boolean isBalanced(TreeNode root) {
        bst(root);    
        return res;
    }

    int bst(TreeNode root){
        if(!res) return 0;   // add this line to work the recursion function fast
        // if we not add the above condition then it will be run 
        if(root ==null){
            return 0;
        }

        int left = bst(root.left);
        int right = bst(root.right);

        if(Math.abs(right-left)>1){
            res=false;
        }

        return Math.max(right, left)+1;
    }
}
