//Belwo code is writen by me but it given me TLE and i am not able to use DP
// array to optimize my code 

class Solution {
    public int minPathSum(int[][] grid) {
        if(grid==null || grid.length==0){
            return 0;
        }

        HashMap<String, Integer> hm = new HashMap<>();
        return memo(0, 0, grid, hm);
    }
    
    int memo(int i, int j, int[][] grid, HashMap<String, Integer> hm){
        if(i==grid.length-1 && j==grid[0].length-1){
            return grid[i][j];
        }

        if(i>grid.length-1 || j>grid[0].length-1){
            return Integer.MAX_VALUE;
        }

        String key = i+"#"+j;
        if(hm.containsKey(key)){
            return hm.get(key);
        }

        int op1 = memo(i+1, j, grid, hm);
        int op2 = memo(i, j+1, grid, hm);

        hm.put(key, grid[i][j] + Math.min(op1, op2));
        return grid[i][j]+Math.min(op1, op2);
    }
}


// class Solution {
//     int sum;
//     int[][] dp;
//     public int minPathSum(int[][] grid) {
//         sum=Integer.MAX_VALUE;
//         // dp = new int[grid.length+1][grid[0].length+1];
//         dfs(grid, 0, 0, 0);
//         return sum;
//     }

//     void dfs(int[][] grid, int i, int j, int curr){
//         if(i<0 || i>=grid.length || j<0 || j>=grid[0].length){
//             return;
//         }
//         // if(dp[i][j]!=0){
//         //     curr+= dp[i][j];
//         //     return;
//         // } 
//         if(i==grid.length-1 && j==grid[0].length-1){
//             curr+=grid[i][j];
//             sum = Math.min(sum, curr);
//             return;
//         }
//         curr += grid[i][j];
        
//         dfs(grid, i+1, j, curr);
//         dfs(grid, i, j+1, curr);  
//     }
// }
