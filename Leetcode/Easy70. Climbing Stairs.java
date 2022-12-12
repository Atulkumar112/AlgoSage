class Solution {
    public int climbStairs(int n) {
        int[] memo = new int[n+1];
        memo[0]=1;
        memo[1]=1;
        for(int i=2; i<=n; i++){
            memo[i]=memo[i-1]+memo[i-2];
        }
        return memo[n];
    }
}


// time taken 15 ms --------------------------------------------------------------
// class Solution {
//     public int climbStairs(int n) {
//         int[] memo = new int[n+1];
//         int ans = rec(n, memo);
//         return ans;
//     }
//     public int rec(int n, int[] memo){
//         if(n<=1) return 1;
//         if(memo[n]>0) return memo[n];
//         int f1 = rec(n-1, memo);
//         int f2 = rec(n-2, memo);
//         memo[n] = f1+f2;
//         System.out.println(Arrays.toString(memo));  // for better understanding you can see in the output
//         return f1+f2;
//     }
// }

// Time limit exceed (35/41 test cases passed), use the memoization  ------------------
// class Solution {
//     public int climbStairs(int n) {
//         int ans = rec(n);
//         return ans;
//     }
//     public int rec(int n){
//         if(n<=1) return 1;
//         return rec(n-1)+rec(n-2);
//     }
// }
