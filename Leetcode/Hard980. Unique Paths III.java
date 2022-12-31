// trust me it's really very question 
class Solution {
    int ans=0;
    public int uniquePathsIII(int[][] grid) {
        int x=-1,y=-1,c=0;
        for(int i=0;i<grid.length;i++){
            for(int j=0;j<grid[0].length;j++){
                if(grid[i][j]==1){
                    x=i;
                    y=j;
                }
                if(grid[i][j]==0){
                    c++;
                }
            }
        }
        dfs(grid,x,y,c+1);
        return ans;
    }

    public void dfs(int[][] grid, int i, int j, int c){
         if(i<0 || j<0 || i>=grid.length || j>=grid[0].length){
            return;
        }
        if(grid[i][j]==-1 || grid[i][j]==3){
            return;
        }
        if(grid[i][j]==2 && c==0){
            ans++;
            return;
        }
        if(grid[i][j]==2){
            return;
        }
        grid[i][j]=3;
        dfs(grid,i,j+1,c-1);
        dfs(grid,i+1,j,c-1);
        dfs(grid,i-1,j,c-1);
        dfs(grid,i,j-1,c-1);
        grid[i][j]=0;   // this single line is called the back tracking 
    }
}
