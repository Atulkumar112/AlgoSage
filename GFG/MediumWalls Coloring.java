
class Solution{
    // TC is O(n)   really it's very easy question....:)
	int minCost(int [][] c, int n){
	    
        int[][] dp = new int[n][3];
        
        dp[0][0]=c[0][0]; dp[0][1]=c[0][1]; dp[0][2]=c[0][2];
        
        for(int i=1; i<n; i++){
            dp[i][0] = c[i][0] + Math.min(dp[i-1][1], dp[i-1][2]); 
            dp[i][1] = c[i][1] + Math.min(dp[i-1][0], dp[i-1][2]);
            dp[i][2] = c[i][2] + Math.min(dp[i-1][0], dp[i-1][1]);
        }
          
        return Math.min(dp[n-1][0], Math.min(dp[n-1][1], dp[n-1][2]));
    }
}
