
class Solution {
    static int[] dp;
    public static int goodStones(int n, int[] arr) {
        dp = new int[n];
        
        for(int i=0; i<n; i++){
            if(dp[i]==0){
                dp[i]=helper(arr, n, i);
            }
        }
        
        int ans=0;
        for(int i: dp) if(i==2) ans++;
        
        return ans;
        
        //11026/11030 test case passed
        // boolean[] dp = new boolean[n];
        // boolean[] b = new boolean[n];
        // int ans=0;
        // for(int i=0; i<n; i++){
        //     Arrays.fill(b, false);
        //     int curr=i;
        //     while(!b[curr]){
                
        //         dp[curr]=true;
        //         b[curr]=true;
        //         curr+=arr[curr];
        //         if(curr<0 || curr>=arr.length){
        //             ans++;
        //             break;
        //         }
        //         if(dp[curr]==true){
        //             break;
        //         }
        //     }
        // }
        
        // return ans;
    }
    
    static int helper(int[] arr, int n, int i_n){
        
        //good stone
        if(i_n<0 || i_n>=n){
            return 2;
        }
        
        if(dp[i_n]==1 || dp[i_n]==2){
            return dp[i_n];
        }
        dp[i_n]=1;
        return dp[i_n]=helper(arr, n, i_n+arr[i_n]);
    }
}
        
