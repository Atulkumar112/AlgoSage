class Solution {
    // i used string builder insted of normal string couse to reduce of runing time of code 
    StringBuilder ans = new StringBuilder();
    void construct(TreeNode root){
        if(root == null) return;
        ans.append(root.val);
        if(root.left == null && root.right == null) return;
        
        
        ans.append("(");
        construct(root.left);
        ans.append(")");
        
        if(root.right != null){
            ans.append("(");
        construct(root.right);
        ans.append(")");
        }
    }
    public String tree2str(TreeNode root) {
        // ans = "";
        construct(root);
        return ans.toString();
    }
}
