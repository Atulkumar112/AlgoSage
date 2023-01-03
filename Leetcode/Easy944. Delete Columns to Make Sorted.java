class Solution {
    public int minDeletionSize(String[] strs) {
        int ans=0;
        if(strs.length == 0) return ans;
        // it's very complex to understand this belwo 3 lines ):
        for(int j=0; j<strs[0].length(); j++){
            for(int i=1; i<strs.length; i++){
                if(strs[i-1].charAt(j) > strs[i].charAt(j)){
                    ans++;
                    break;
                }
            }
        }
        return ans;
    }
}
