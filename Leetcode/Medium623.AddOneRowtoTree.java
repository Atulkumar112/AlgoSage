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
    public TreeNode addOneRow(TreeNode root, int v, int d) {
        if(d == 1){
            TreeNode node = new TreeNode(v);
            node.left = root;
            return node;
        }
        insert(root, v, d, 1);
        return root;
    }
    public void insert(TreeNode node, int v, int d, int currNode){
        if(node == null) return;
        if(currNode == d-1){
            //for left
            TreeNode temp = node.left;
            node.left = new TreeNode(v);
            node.left.left = temp;
            //for right 
            temp = node.right;
            node.right = new TreeNode(v);
            node.right.right = temp;
        }
        else{
            insert(node.left, v, d, currNode+1);
            insert(node.right, v, d, currNode+1);
        }
    }
}
