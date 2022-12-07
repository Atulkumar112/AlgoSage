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
    
    // public int rangeSumBST(TreeNode root, int low, int high) {
        
    //     if(root == null){
    //         return 0;
    //     }
    //     int sum=0;
    //     rangeSumBST(root.left, low, high);
    //     if(root.val>=low && root.val<=high){
    //          sum+=root.val;
    //     }
        
    //      rangeSumBST(root.right, low, high);
		
	// 	// System.out.println("the sum:- "+sum);
	// 	return sum;

	// }
    // public static void rec(TreeNode root, int sum, int low, int high) {
	// 		if(root == null) {
	// 			return ;
	// 		}
		
	// 		rec(root.left, sum, low, high);
			
    //         if(root.val>=low && root.val<=high){
    //             System.out.println(root.val);
    //             sum+=root.val;
    //         }
            
	// 		rec(root.right, sum, low, high);
			
			
	// }

    //------------------
        public int rangeSumBST(TreeNode root, int L, int R) {
        if (root == null) return 0; // base case.
        if (root.val < L) return rangeSumBST(root.right, L, R); // left branch excluded.
        if (root.val > R) return rangeSumBST(root.left, L, R); // right branch excluded.
        return root.val + rangeSumBST(root.right, L, R) + rangeSumBST(root.left, L, R); // count in both children.
    }
	
}
