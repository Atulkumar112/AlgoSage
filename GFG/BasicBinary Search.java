
class Solution {
    int binarysearch(int arr[], int n, int k) {
        int left = 0;
        int right = n-1;
         int mid = (left+right)/2;
        while(left <= right){
           
            if(arr[mid] == k){
                return mid;
            }
            if(arr[mid]<k){
                left = mid+1;
            }
            else {
                right = right-1;
            }
            mid = (left+right)/2;
        }
        return -1;
        
    }
}

