// i did this question within 1 min in O(n*m)
// but i need to do this question in O(log(n*m)) so whenever you have time do this same question in this TC :)
class Solution {
    public boolean searchMatrix(int[][] matrix, int target) {
        int m = matrix.length;
        int n = matrix[0].length;
        for(int i=0; i<m; i++){
            for(int j=0; j<n; j++){
                if(matrix[i][j]==target){
                    return true;
                }
            }
        }  
        return false;
    }
}
