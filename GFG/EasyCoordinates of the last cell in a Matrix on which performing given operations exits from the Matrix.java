
class Solution{
    static int [] endPoints(int [][]arr, int m, int n){
        //S1 initializing veriable 
        int i=0, j=0, curr_dir=1, curr_i=0, curr_j=0;
        
        //s2 cordinates x and y
        int dx[] = {-1, 0, 1, 0};  // up=0, rt=1, down=2, left=3
        int dy[] = {0, 1, 0, -1};
        
        //s3 trversing until and unless we reached out of the bound 
        while(i>=0 && i<m && j>=0 && j<n){
            curr_i=i; curr_j=j;
            
            //two sub case
            if(arr[i][j]==0){
                i+=dx[curr_dir];
                j+=dy[curr_dir];
            }
            else{
                curr_dir = (curr_dir+1)%4;
                arr[i][j]=0;
                i+=dx[curr_dir];
                j+=dy[curr_dir];
            }
            
        }
        
        return new int[] {curr_i, curr_j};
    }
}
