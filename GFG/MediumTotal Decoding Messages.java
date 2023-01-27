
//User function Template for Java

// class Solution
// {
//     int[] dp = new int[10001];
//     // int mod = 1000000007; or we can write like 1e9+7
//     int mod= (int)1e9+7;
//     public int CountWays(String str)
//     {
//         if(str.charAt(0)=='0'){
//             return 0;
//         }
//         Arrays.fill(dp, -1);
//         int n = str.length();
        
//         return dfs(str, n);
//     }
    
//     int dfs(String s, int n){
//         if(n==0 || n==1){
//             return 1;
//         }
        
//         if(dp[n]!=-1){
//             return dp[n];
//         }
        
//         int count=0;
        
//         if(s.charAt(n-1)>'0'){
//             count=dfs(s, n-1);
//         }
        
//         if(s.charAt(n-2)=='1' || s.charAt(n-2)=='2' && s.charAt(n-1)<'7'){
//             count = (count+dfs(s, n-2)%mod)%mod;
//         }
        
//         return dp[n]=count;
        
//     }
// }

//---------------------------------------------
class Solution{

    Integer[]dp;
    int mod= (int)1e9+7;
    public int CountWays(String s)
    {
        dp= new Integer[s.length()+1];
        return helper(s,0)%mod;
    }

    public int helper(String s,int idx){

        if(idx>=s.length()) return 1;

        if(s.charAt(idx)=='0') return 0;

        if(dp[idx]!=null) return dp[idx];

        int oneTake= helper(s,idx+1);
        int twoTake=0;
        if(idx+1<s.length()){
           if(Integer.parseInt(s.substring(idx,idx+2))<=26){
               twoTake= helper(s,idx+2);
           }
        }
        return dp[idx]= (oneTake+twoTake)%mod;
    }
}
