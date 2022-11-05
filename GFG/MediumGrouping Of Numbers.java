class Solution {
    static int maxGroupSize(int[] a, int N, int k) {
        int[] dp = new int[k];
        for(int i: a){
            dp[i%k]++;
        }
        
        int maxSum = 0;
        int i=1;
        int j =k-1;
        
        while(i<j){
            maxSum += Math.max(dp[i], dp[j]);
            i++;
            j--;
        }
        
        if(dp[0]>0){
            maxSum++;
        }
        if(i==j && dp[i]>0){
            maxSum++;
        }
        
        return maxSum;
    }
};
