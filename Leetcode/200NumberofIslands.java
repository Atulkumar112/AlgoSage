class Solution {
    public int numIslands(char[][] grid) {
        int count = 0;
        for(int i=0; i<grid.length; i++){
            for(int j=0; j<grid[0].length; j++){
                if(grid[i][j] == '1'){
                    dfsIsFill(grid, i, j);
                    count += 1;
                }
            }
        }
        return count;
    }
    
    void dfsIsFill(char[][] grid, int i, int j){
        if(i>=0 && j>=0 && i<grid.length && j<grid[0].length && grid[i][j]=='1'){
            grid[i][j]='0';
            dfsIsFill(grid, i+1, j);
            dfsIsFill(grid, i, j+1);
            dfsIsFill(grid, i-1, j);
            dfsIsFill(grid, i, j-1);
        }
            
    }
}
