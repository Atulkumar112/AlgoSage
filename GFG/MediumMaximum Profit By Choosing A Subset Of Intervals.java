// it is very easy question if you make it a rec tree first
class Solution {
    // the TC of this is exponential means 2^n^2 and SC is n
    public static int maximum_profit(int n, int[][] arr) {
        // we used the lamda expression for sorting the 2d array accoring starting time 
        Arrays.sort(arr, (a,b)->{
            if(a[0]!=b[0]) return a[0]-b[0];
            return a[1]-b[1];
        });
        int[] dp = new int[n];  // this is for dynamic problem because of memoization
        return rec(0, arr, n, dp);
    }
    
    static int rec(int index, int[][] arr, int n, int[] dp){
        if(index>=n){
            return 0;
        }
        
        if(dp[index] != 0) return dp[index];  // here is the memoization 
        
        int not_select = rec(index+1, arr, n, dp);   // here we created a rec tree and
        // checking like it select the value or forword the i.
        int nextIndex = findNext(index+1, arr[index][1], arr, n);
        int select = arr[index][2] + rec(nextIndex, arr, n, dp);
        
        return dp[index]=Math.max(select, not_select);
        
    }
    
    static int findNext(int i, int preEnd, int[][] arr, int n){
        while(i<n){
            if(arr[i][0]>= preEnd){
                break;
            }
            else{
                i++;
            }
        }
        
        return i;
    }
}
