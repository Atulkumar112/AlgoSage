class Solution
{
    int x = 0, y=0;
    long mod = 1000000007;
    long dp[][];
    long numberOfPaths(int m, int n)
    {
        // code here
        dp = new long[101][101];
        x=m;
        y=n;
        return dfs(0, 0);
    }
    long dfs(int i, int j){
        if(i==x-1 || j==y-1) return 1;
        if(dp[i][j]!=0) return dp[i][j];
        long right = dfs(i, j+1);
        long down = dfs(i+1, j);
        return dp[i][j]=(right+down)%mod;
    }
}
