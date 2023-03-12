
class Solution {
    public int[] findMaxRow(int mat[][], int n) {
        // TC of this code is O(n).
        
        int row=0;
        int max=0;
        
        for(int i=0; i<n; i++){
            int count=0;
            for(int j=n-1; j>=0; j--){
                if(mat[i][j]==1){
                    count++;
                }
                else{
                    break;
                }
            }
            if(count>max){
                max=count;
                row=i;
            }
        }
        
        int[] ans = new int[2];
        ans[0]=row;
        ans[1]=max;
        return ans;
        
        //----------------------------------------------------------------
        // Time colpexity is :- O(NlogN)
        // USED binary search
        // int row=0;
        // int max=0;
        
        // for(int i=0; i<n; i++){
        //     int count=0;
        //     int low = 0, high=n-1;
            
        //     while(low<=high){
        //         int mid = low+(high-low)/2;
        //         if(mat[i][mid]==1){
        //             high = mid-1;
        //         }
        //         else{
        //             low = mid+1;
        //         }
        //     }
        //     count = n-low;
        //     if(count>max){
        //         max=count;
        //         row=i;
        //     }
            
        // }
        
        // int[] ans = new int[2];
        // ans[0]=row;
        // ans[1]=max;
        // return ans;
        
        
        //----------------------TC of the code is: O(n^2)-------------------
        // int row=0;
        // int max=0;
        
        // for(int i=0; i<n; i++){
        //     int count=0;
        //     for(int j=0; j<n; j++){
        //         if(mat[i][j]==1){
        //             count++;
        //         }
                
        //     }
        //     if(count>max){
        //         max=count;
        //         row=i;
        //     }
        // }
        
        // int[] ans = new int[2];
        // ans[0]=row;
        // ans[1]=max;
        // return ans;
    }
};
