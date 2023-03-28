class Solution {
    int[] dp;
    public int mincostTickets(int[] days, int[] costs) {
        dp = new int[days.length];
        return dfs(days, costs, 0);
    }

    int dfs(int[] days, int[] costs, int i){
        if(i>=days.length) return 0;
        if(dp[i]>0) return dp[i];

        int opt1 = costs[0]+dfs(days, costs, i+1);

        int k=i;
        for(; k<days.length; k++){
            if(days[k]>=days[i]+7){
                break;
            }
        }
        int opt2 = costs[1] + dfs(days, costs, k);

        for(; k<days.length; k++){
            if(days[k] >= days[i]+30){
                break;
            }
        }   
        int opt3 = costs[2] + dfs(days, costs, k);

        dp[i]=Math.min(opt1, Math.min(opt2, opt3));
        return Math.min(opt1, Math.min(opt2, opt3));
    }
}
