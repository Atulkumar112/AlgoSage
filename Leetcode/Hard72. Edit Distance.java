class Solution {
    public int minDistance(String word1, String word2) {
        int m = word1.length(); int n = word2.length();
        int[][] dp = new int[m+1][n+1];
        for(int i=0; i<dp.length; i++) {
			Arrays.fill(dp[i], -1);
		}
        return findMinWay(word1, word2, m, n, dp);
    }

    public int findMinWay(String w1, String w2, int i, int j, int[][] dp){
        if(dp[i][j]!=-1){
            return dp[i][j];
        }
        if(i==0){
            dp[i][j] = j;
            return j;
        }
        if(j==0){
            dp[i][j]=i;
            return i;
        }

        if(w1.charAt(i-1)==w2.charAt(j-1)){
            dp[i][j] = findMinWay(w1, w2, i-1, j-1, dp);
        }
        else{
            int insertOp = findMinWay(w1, w2, i, j-1, dp);
            int deleteOp = findMinWay(w1, w2, i-1, j, dp);
            int replaceOp = findMinWay(w1, w2, i-1, j-1, dp);
            dp[i][j] = 1 + Math.min(replaceOp,(Math.min(insertOp, deleteOp)));
        }

        return dp[i][j];

    }
}
