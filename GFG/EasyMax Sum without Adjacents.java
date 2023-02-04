
class Solution {
    int findMaxSum(int arr[], int n) {
        int inc = 0;
        int exc = 0;
        for(int i = 0 ; i < arr.length ; i++){
            int newInc = inc + arr[i];
            int newExc = exc;
            exc = Math.max(newInc , newExc);
            inc = newExc;
        }
        return Math.max(inc , exc);
    }
}

