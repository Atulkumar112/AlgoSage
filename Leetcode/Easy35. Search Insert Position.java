class Solution {

    public int searchInsert(int[] nums, int target) {
        int low = 0; int high=nums.length-1;
         while(low<=high){
            int mid = (low+high)/2;
            if(nums[mid] == target) return mid;
            else if(nums[mid] > target) high = mid-1;
            else low = mid+1;
        }
        return low;
    }


    // below is my code written in 2 min and TC is O(n) but we need to write it in TC O(logn)
    // public int searchInsert(int[] nums, int target) {
    //     for(int i=0; i<nums.length; i++){
    //         if(nums[i]>=target){
    //             return i;
    //         }
    //     }

    //     return nums.length;
    // }
}
