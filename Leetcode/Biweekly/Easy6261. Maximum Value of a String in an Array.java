class Solution {
    public int maximumValue(String[] strs) {
        int max=0;
        int n=strs.length;
        for(int i=0; i<n; i++){
        	if(strs[i].matches("^[0-9]*$")) {
        		max = Math.max(max, Integer.parseInt(strs[i]));
        	}
        	else {
        		max = Math.max(max, strs[i].length());
        	}
        }
        
        
        return max;
    }
}
