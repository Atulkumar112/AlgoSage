
// Below is a code for DP Memoization
class Solution {
    static int[][] dp;
    static int mod = 1000000007;
    static int uniquePaths(int n, int m, int[][] grid) {
        dp=new int[n][m];
        for(int[] x: dp){
            Arrays.fill(x, -1);
        }
        return dfs(0, 0, n, m, grid)%mod;
    }
    
    public static int dfs(int i, int j, int n, int m, int[][] grid){
        if(i<0 || j<0 || i>=n || j>=m || grid[i][j]==0){
            return 0;
        }
        
        if(i==n-1 && j==m-1){
            return 1;
        }
        
        if(dp[i][j]!=-1){
            return dp[i][j];
        }
    
        
        return dp[i][j] = (dfs(i, j+1, n, m, grid)%mod + dfs(i+1, j, n, m, grid)%mod)%mod;
    }
};



// Below is a code for Tabulation
// class Solution {
//     static int[][] dp;
//     static int mod = 1000000007;
//     static int uniquePaths(int n, int m, int[][] grid) {
//         dp=new int[n][m]; //all 0
        
//         dp[0][0]= grid[0][0]==1 ? 1 : 0;
        
//         // for Col
//         for(int i=1; i<n; i++){
//             if(grid[i][0]==1){
//                 dp[i][0] = dp[i-1][0];
//             }
//         }
        
//         //for row
//         for(int i=1; i<m; i++){
//             if(grid[0][i]==1){
//                 dp[0][i] = dp[0][i-1];
//             }
//         }
        
//         //rest
//         for(int i=1; i<n; i++){
//             for(int j=1; j<m; j++){
//                 if(grid[i][j]==1){
//                     dp[i][j]= (dp[i-1][j] %mod + dp[i][j-1]%mod)%mod;
//                 }
//             }
//         }
        
//         return dp[n-1][m-1];
//     }
    
    
// };
