class Solution {
    public boolean isCircularSentence(String s) {
        int n = s.length();
        if(!s.contains(" ")){
                if(s.charAt(0)==s.charAt(n-1)){
            return true;
            }    
        }
    
        
        for(int i=0; i<n; i++){
            if(s.charAt(i)==' '){
                int prev = i-1;
                int next=i+1;
                
                if(s.charAt(prev)!=s.charAt(next)){
                    return false;
                }
            }
        }
        
        if(s.charAt(0)!=s.charAt(n-1)){
            return false;
        }
        
        
        return true;
    }
}
