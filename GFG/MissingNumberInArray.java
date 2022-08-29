class Solution {
    int MissingNumber(int array[], int n) {
        
        // Your Code Here
        Arrays.sort(array);
        for(int i=n-2; i>=0; i--){
            if(array[i] != n){
                return n;
            }
            n = n-1;
        }
        return 1;
    }
}
