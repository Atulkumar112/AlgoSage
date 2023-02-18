
class Solution{
    public static int appleSequence(int n, int m, String s){
        int start=0, end=0, maxLen=0, count=0;
        
        while(end<n){
            if(s.charAt(end)=='O') count++;
            
            while(start<n && count>m){
                if(s.charAt(start)=='O') count--;
                start++;
            }
            maxLen=Math.max(maxLen, end-start+1);
            end++;
        }
        
        return maxLen;
    }
}
