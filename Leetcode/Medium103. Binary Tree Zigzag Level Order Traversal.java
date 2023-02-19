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
    // this question is done by me :)
    public List<List<Integer>> zigzagLevelOrder(TreeNode root) {
        
        if(root==null) return new ArrayList<>();
    	
    	Queue<TreeNode> q = new LinkedList<>();
    	q.add(root);
    	q.add(null);
    	List<List<Integer>> list = new ArrayList<>();
    	Queue<Integer> currQ = new LinkedList<>();
    	
    	
    	while(!q.isEmpty()) {
    		TreeNode currNode = q.remove();
    		if(currNode==null) {
    			List<Integer> currList = new ArrayList<>();
    			while(!currQ.isEmpty()) {
    				currList.add(currQ.remove());
    			}
    			
    			list.add(currList);
    		
    			if(!q.isEmpty()) {
    				q.add(null);
    			}
    			else {
    				break;
    			}
    		}
    		else {
    			
    			currQ.add(currNode.val);
    			
    			if(currNode.left!=null) {
    				q.add(currNode.left);
    			}
    			if(currNode.right!=null) {
    				q.add(currNode.right);
    			}
    			
    		}
    		
    	}
    	
    	for(int i=1; i<list.size(); i=i+2) {
    		
    		Collections.reverse(list.get(i));
    	}
    	
    	return list;
    }
}
