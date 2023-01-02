
class Solution {
    ArrayList<Integer> maximumValue(Node root) {
        // code is correct but it's showing the time limit exceeded
       Queue<Node> q = new LinkedList<>();
		ArrayList<Integer> list = new ArrayList<>();
		
		q.add(root);
		
		
		while(!q.isEmpty()) {
			int currLevelNodeNum = q.size();
			int max = 0;
		    while(currLevelNodeNum-->0){
		        Node d = q.remove();
		        max = Math.max(max, d.data);
		        if(d.left != null) q.add(d.left);
		        if(d.right != null) q.add(d.right);
		    }
		    list.add(max);
		}
		return list;
    }
}
