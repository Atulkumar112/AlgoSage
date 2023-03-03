class Solution {
    // "mississippi"
    // "issip"
    // TC: O(hs.length x nd.length())
    public int strStr(String hs, String nd) {
        int j=0;
        int count=0;
        int ans=0;
        boolean b = true;

        for(int i=0; i<hs.length(); i++){
            if(hs.charAt(i)==nd.charAt(j)){
                if(b){
                    b=false;
                    ans=i;
                }
                count++;
                j++;
                if(count==nd.length()){
                    return ans;
                }
            }
            else{
                i=ans;
                ans=i+1;
                j=0;
                count=0;
            }
        }
        return -1;
    }

    
}
