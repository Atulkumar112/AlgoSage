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
    List<Integer> list;
    public int getMinimumDifference(TreeNode root) {
        list = new ArrayList<>();
        dfs(root);
        int minDiff=Integer.MAX_VALUE;
        int j=0;
        int n = list.size();
        for(int i=1; i<n; i++){
            int diff = Math.abs(list.get(j)-list.get(i));
            minDiff = Math.min(minDiff, diff);
            j++;
        }
        return minDiff;
    }

    private void dfs(TreeNode root){
        if(root==null){
            return;
        }

        dfs(root.left);
        list.add(root.val);
        dfs(root.right);
    }
}
