class Solution {
    public int minCost(String c, int[] cost) {
        // int ans = 0;
        // for(int i=0; i<colors.length()-1; i++){
        //     if(colors.charAt(i)==colors.charAt(i+1)){
        //         System.out.print(colors.charAt(i)+"-->"+colors.charAt(i+1));
        //         ans += Math.min(neededTime[i], neededTime[i+1]);
        //         System.out.print(Math.min(neededTime[i], neededTime[i+1])+" ");
        //     }
        // }
        //return ans;
        //----------------------
        int n = c.length(), gsum=0, gmax=0, ans=0;
        for(int i=0; i<n; i++){
            if(i>0 && c.charAt(i)!=c.charAt(i-1)){
                ans += gsum-gmax;
                gsum = 0;
                gmax = 0;
            }
         
                gsum += cost[i];
                gmax = Math.max(gmax, cost[i]);
         
        }
        ans += gsum-gmax;
        return ans;
    }
    
}
