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
//method 1- runtime 0ms better solution then ever
class Solution {
    public List<Integer> inorderTraversal(TreeNode root) {
        List<Integer> ans = new ArrayList<Integer>();
        inorder(root, ans);
        return ans;
    }
    void inorder(TreeNode root, List<Integer> ans){
        if(root == null) return;
        
        inorder(root.left, ans);
        ans.add(root.val);
        inorder(root.right, ans);
    }
}


//Method- 2 via Stack runtime = 1ms
// class Solution {
//     public List<Integer> inorderTraversal(TreeNode root) {
//         Stack<TreeNode> stack = new Stack<>();
//          List<Integer> ans = new ArrayList<Integer>();
//         TreeNode curr = root;
//         while(curr != null || !stack.isEmpty()){
//             while(curr != null){
//                 stack.push(curr);
//                 curr = curr.left;
//             }
            
//             curr = stack.pop();
//             ans.add(curr.val);
//             curr = curr.right;
//         }
        
//         return ans;
//     }
// }
    
    
    
    
    
    
    
    
    
    
