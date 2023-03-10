
class Solution {
    //complete done this code by me
    Long maxTripletProduct(Long arr[], int n)
    {
        //Time complexity of this code is O(logn)
        Arrays.sort(arr);
        
        long first = arr[n-1]*arr[n-2]*arr[n-3];
        long sec = arr[n-1]*arr[0]*arr[1];
        
        return Math.max(first, sec);
    }
}
