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
    int maxSum = Integer.MIN_VALUE;
    public int maxPathSum(TreeNode root) {
        dfs(root);
        return maxSum;
    }
    public int dfs(TreeNode root){
        if(root == null){
            return 0;
        }
        int l = Math.max(dfs(root.left), 0);
        int r = Math.max(dfs(root.right), 0);
        int newSum = root.val+l+r;
        maxSum = Math.max(newSum, maxSum);
        return root.val+Math.max(l,r);


    }
}
