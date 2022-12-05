
class Solution {
    static int shotestPath(int[][] mat, int n, int m, int k) {
        int steps=0;
        int[][] dir = new int[][] {{0,1},{1,0},{0,-1},{-1,0}};
        boolean[][][] v = new boolean[n][m][k+1];
        Queue<int[]> q = new LinkedList<>();
        q.add(new int[] {0, 0, k});
        
        while(!q.isEmpty()){
            int s = q.size();
            while(s-->0){
                int[] curr = q.poll();
                if(curr[0]==n-1 && curr[1]==m-1) return steps;
                
                for(int[] d: dir){
                    int i=curr[0]+d[0];
                    int j=curr[1]+d[1];
                    int obs = curr[2];
                    
                    if(i>=0 && i<n && j>=0 && j<m){
                        if(mat[i][j]==0 && !v[i][j][obs]){
                            q.add(new int[] {i, j, obs});
                            v[i][j][obs]=true;
                        }
                        else if(mat[i][j]==1 && obs>0 && !v[i][j][obs-1]){
                            q.add(new int[] {i, j, obs-1});
                            v[i][j][obs-1]=true;
                        }
                    }
                }
            }
            ++steps;
        }
        return -1;
    }
};
