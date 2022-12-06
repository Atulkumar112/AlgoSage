 Solution
{
    //Function to find distance of nearest 1 in the grid for each cell.
    public int[][] nearest(int[][] grid)
    {
        // Code here
        // when you see the minimum distance in graph and matrix question then just use BFS\
        int n=grid.length, m=grid[0].length;
        Queue<int[]> q = new LinkedList<>();
        boolean[][] v = new boolean[n][m];
        
        for(int i=0; i<n; i++){
            for(int j=0; j<m; j++){
                if(grid[i][j]==1){
                    q.add(new int[] {i, j});
                    v[i][j]=true;
                }
            }
        }
        
        int[][] ans = new int[n][m];
        int[][] dir = {{1,0},{0,1},{-1,0},{0,-1}};
        int dis=0;
        while(!q.isEmpty()){
            int size = q.size();
            while(size-->0){
                int[] idx = q.poll();
                int x=idx[0];
                int y=idx[1];
                ans[x][y]=dis;
                for(int[] d: dir){
                    int i=x+d[0];
                    int j=y+d[1];
                    if(i>=0 && i<n && j>=0 && j<m && !v[i][j]){
                        q.add(new int[] {i, j});
                        v[i][j]=true;
                    }
                }
            }
            dis++;
        }
        
        return ans;
    }
}
