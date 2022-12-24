class Solution {
    static int mod;
    public int numTilings(int n) {
        mod = 1000000007; 
        if(n==1) return 1;
        else if(n==2) return 2;
       
       int[] dp = new int[n+1];
       dp[1]=1;
       dp[2]=2;
       dp[3]=5;
       for(int i=4; i<=n; i++){
           dp[i] = (2*dp[i-1]%mod + dp[i-3]%mod)%mod;
       }
       return dp[n];

    // return rec(n);
    }
// if i use recursion then 14/39 test cases passed and time limit exceeded.
// otherwise the code is right 
    // public int rec(int n){
    //     if(n==1) return 1;
    //     if(n==2) return 2;
    //     if(n==3) return 5;

    //     return (2 * rec(n-1)%mod + rec(n-3)%mod)%mod;
    // }
}
