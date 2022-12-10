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
    private long totalSum=0;
    private long maxPro=0;
    public int maxProduct(TreeNode root) {
        total_sum(root);
        subTree(root);
        return (int)(maxPro % ((int)Math.pow(10,9)+7));
    }
    public void total_sum(TreeNode root){
        if(root == null) return ;
        total_sum(root.left);
        total_sum(root.right);
        totalSum+=(long)root.val;
    }

    public long subTree(TreeNode root){
        if(root == null) return 0;
        long l=subTree(root.left);
        long r=subTree(root.right);
        long subTreeSum=l+r+root.val;
        maxPro = Math.max(maxPro, (subTreeSum * (totalSum - subTreeSum)));
        return subTreeSum;
    }
}
