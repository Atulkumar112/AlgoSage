class Solution {
    public String mergeAlternately(String word1, String word2) {
        String ans = "";
        int n = word1.length();
        int m = word2.length();
        int min = Math.min(n, m);
        for(int i=0; i<min; i++){
            ans+=word1.charAt(i);
            ans+=word2.charAt(i);
        }       

        // int len = ans.length();
        if(m>n){
            for(int i=n; i<m; i++){
                ans+=word2.charAt(i);
            }
        }
        else{
            for(int i=m; i<n; i++){
                ans+=word1.charAt(i);
            }
        }

        return ans;

    }
}
