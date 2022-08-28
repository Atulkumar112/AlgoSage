class Solution {
    public int[][] diagonalSort(int[][] mat) {
        int m = mat.length;
        int n = mat[0].length;
        
        //it's for row = 0 
        for(int col=0; col<n; col++){
            sort(mat, 0, col, m, n);
        }
        
        //it's for col = 0
        for(int row=1; row<m; row++){
            sort(mat, row, 0, m, n);
        }
        
        return mat;
    }
   
    
    //runtime 10 ms
//     void sort(int[][] mat, int row, int col, int m, int n){
//         ArrayList<Integer> value = new ArrayList<Integer>();
//         int r = row;
//         int c = col;
//         while(r<m && c<n){
//             value.add(mat[r][c]);
//             r++;
//             c++;
//         }
        
//         Collections.sort(value);
        
//         r = row;
//         c = col;
//         int idx = 0;
//         while(r<m && c<n){
//             mat[r][c] = value.get(idx++);
//             r++;
//             c++;
//         }
//     }
    
    //.-------------------OR (BEST SOLUTION)------------------------
    //runtime 1 ms
     void sort(int[][] mat, int row, int col, int m, int n){
        int[] value = new int[101];
        int r = row;
        int c = col;
        while(r<m && c<n){
            value[mat[r][c]]++;
            r++;
            c++;
        }
        
        
        r = row;
        c = col;
        for(int i=1; i<101; i++){
            if(value[i]>0){
                int count = value[i];
                while(count-->0){
                    mat[r][c] = i;
                    r++;
                    c++;
                }
            }
        }
     
    }
}
