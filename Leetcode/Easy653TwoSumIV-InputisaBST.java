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

//belwo code is written by me and it is working. this is my first code in tree which is run totally by me:)
class Solution {
    public boolean findTarget(TreeNode root, int k) {
        if(root==null) return false;
        List<Integer> list = new ArrayList<>();
        get(root, list);
        int left=0, right=list.size()-1;
        Collections.sort(list);
        while(left<right){
            if(list.get(left)+list.get(right) == k){
                return true;
            }
            else if(list.get(left)+list.get(right)<k){
                left++;
            }
            else{
                right--;
            }
        }
        return false;
    }
    
    public void get(TreeNode root, List<Integer> list){
        if(root ==null) return;
        list.add(root.val);
        get(root.left, list);
        get(root.right, list);
    }
}


//using HashSet
// class Solution {
//     Set<Integer> set = new HashSet<>();
//     public boolean findTarget(TreeNode root, int k) {
//         if(root == null) return false;
//         if(set.contains(root.val)) return true;

//         set.add(k - root.val);

//         return findTarget(root.left, k) || findTarget(root.right, k);
//     }
// }
