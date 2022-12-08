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
    public boolean leafSimilar(TreeNode root1, TreeNode root2) {
        List<Integer> l1 = new ArrayList<>();
        List<Integer> l2 = new ArrayList<>();
        dfs(root1, l1); // this is for first tree
        dfs(root2, l2);  // this is for second tree
        int s1 = l1.size();
        int s2 = l2.size();
        // System.out.println(l1);
        // System.out.println(l2);
        if(s1 != s2){
            return false;
        }

        for(int i=0; i<s1; i++){
            if(l1.get(i)!=l2.get(i)){
                return false;
            }
        }
        
        return true;
    }

// this below method is using for both trees
    public void dfs(TreeNode root, List<Integer> l){
        if(root == null){
            return;
        }
        if(root.left == null && root.right==null){
            l.add(root.val);
            return;
        }
        dfs(root.left, l);
        dfs(root.right, l);
    }

}
