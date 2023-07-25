class Solution {
    public int peakIndexInMountainArray(int[] arr) {
        int index = -1;
        int val = Integer.MIN_VALUE;
        int n = arr.length;
        for(int i=0; i<n; i++){
            if(arr[i]> val){
                val=arr[i];
                index = i;
            }
        }
        return index;
    }
}
