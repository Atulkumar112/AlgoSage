
class Solution{
    public static long distinctColoring(int n, int[]r, int[]g, int[]b){
        long[][] dp = new long[n][3];
        dp[0][0]=r[0];
        dp[0][1]=g[0];
        dp[0][2]=b[0];
        
        for(int i=1; i<n; i++){
            dp[i][0] = r[i]+Math.min(dp[i-1][1], dp[i-1][2]);
            dp[i][1] = g[i]+Math.min(dp[i-1][0], dp[i-1][2]);
            dp[i][2] = b[i]+Math.min(dp[i-1][0], dp[i-1][1]);
        }
        
        return Math.min(Math.min(dp[n-1][0], dp[n-1][1]), dp[n-1][2]);
        
    }

    // TRYIED but not able to run the code :(
    // public static long distinctColoring(int N, int[]r, int[]g, int[]b){
    //     PriorityQueue<Integer> red = new PriorityQueue<>();
    //     PriorityQueue<Integer> gre = new PriorityQueue<>();
    //     PriorityQueue<Integer> blu = new PriorityQueue<>();
        
    //     for(int i=0; i<r.length; i++){
    //         red.add(r[i]);
    //         gre.add(g[i]);
    //         blu.add(b[i]);
    //     }
        
    //     /*
    //     N = 3
    //     r[] = {1, 1, 1}
    //     g[] = {2, 2, 2}
    //     b[] = {3, 3, 3}
    //     */
        
    //     String[] arr = new String[1];
    //     arr[0]="black";
    //     String[] clr = {"red", "green", "blue"};
        
    //     int res = 0;
        
    //     while(n-->0){
    //         int min = Integer.MAX_VALUE; 
    //         int curr = Math.min(red.peek(), min);
    //         if(arr[0]!=clr[0] && curr<min ){
    //             min = red.poll();
    //             arr[0]=clr[0];
    //         }
    //         curr = Math.min(gre.peek(), min);
    //         else if(arr[0]!=clr[1] && curr<min){
    //             red.add(min);
    //             min = gre.poll();
    //             arr[0]=clr[1];
    //         }
    //         curr = Math.min(blu.peek(), min);
    //         else if(arr[0]!=clr[2] && curr<min){
    //             gre.add(min);
    //             min = blu.peek();
    //             arr[0]=clr[2];
    //         }
            
    //         res+=min;
    //     }
     
    //     return ;
    // }
}
