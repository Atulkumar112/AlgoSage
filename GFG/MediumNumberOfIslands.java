class Solution {
    
    public List<Integer> numOfIslands(int n, int m, int[][] op) {
        int[][] arr = new int[n][m];
        int k=1;
        List<Integer> list = new ArrayList<>();
        for(int i=0; i<op.length; i++){
            int count=0;
            arr[op[i][0]][op[i][1]]=k;
            for(int p=0; p<n; p++){
                for(int q=0; q<m; q++){
                    if(arr[p][q]==k){
                        dfs(arr, p, q, n, m, k);   
                        count++;
                    }
                }
            }
            
            list.add(count);
            k++;
        }
        return list;
    }
    
    //for checking k values with dfs approach 
    public void dfs(int[][] arr, int i, int j, int n, int m, int k){
        if(i>=0 && j>=0 && i<n && j<m && arr[i][j]==k){
            arr[i][j]+=1;
            
            dfs(arr, i, j+1, n, m, k);
            dfs(arr, i+1, j, n, m, k);
            dfs(arr, i-1, j, n, m, k);
            dfs(arr, i, j-1, n, m, k);
        }
    }
    
}
