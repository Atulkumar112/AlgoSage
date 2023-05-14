
class Solution {
    //without memoization passsed only 10 cases out of 1115
    // public static long findMaxSubsetSum(int N, int[] A) {
    //     return help(A, 0, 0);
    // }
    
    // public static long help(int[] arr, int notTaken, int i){
    //     if(i==arr.length) return 0;
        
    //     if(notTaken==1){
    //         return help(arr, 0, i+1) + arr[i];
    //     }
        
    //     return Math.max(help(arr, 1, i+1), help(arr, 0, i+1)+ arr[i]);
    // }
    
    
    //use memoization
    public static long findMaxSubsetSum(int N, int[] A) {
        long[][] dp = new long[N+1][2];
        for(int i=0; i<=N; i++){
            Arrays.fill(dp[i], -1);
        }
        
        return help(A, 0, 0, dp);
    }
    
    public static long help(int[] arr, int notTaken, int i, long[][] dp){
        if(i==arr.length) return 0;
        
        if(dp[i][notTaken]!=-1){
            return dp[i][notTaken];
        }
        
        
        if(notTaken==1){
            return dp[i][notTaken]=help(arr, 0, i+1, dp) + arr[i];
        }
        
        return dp[i][notTaken]=Math.max(help(arr, 1, i+1, dp), help(arr, 0, i+1, dp)+ arr[i]);
    }
}
        
