class Solution {

    public int maxProfit(int[] prices) {
    int len=prices.length;
        if(len==0)return 0;
        int sell=0, buy=-prices[0], cool=0, min_buy=buy, tmp=sell;
        for(int i=1;i<len;i++){
            sell=min_buy+prices[i];// sell
            buy=cool-prices[i];// buy
            cool=Math.max(cool,tmp);
            tmp=sell;
            min_buy=Math.max(min_buy, buy);
        }
        return Math.max(sell,cool);
    }
    // this below code run the 208/210 time limit exceeded
    // public int maxProfit(int[] prices) {
    //     return dfs(0, 0, prices);
    // }

    // public int dfs(int i, int buySell, int[] prices){
    //     if(i>=prices.length) return 0;

    //     int ans=0;

    //     if(buySell==0){
    //         int  buy = dfs(i+1, 1, prices) - prices[i];
    //         int noBuy = dfs(i+1, 0, prices);
    //         ans = Math.max(buy, noBuy);
    //     }
    //     else{
    //         int sell = dfs(i+2, 0, prices) + prices[i];
    //         int noSell = dfs(i+1, 1, prices);
    //         ans = Math.max(sell, noSell); 
    //     }

    //     return ans;
    // }
}
