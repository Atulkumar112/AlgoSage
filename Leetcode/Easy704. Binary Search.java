class Solution {
    public int search(int[] nums, int target) {
        int low=0; int high=nums.length-1;
        while(low<=high){
            int mid = low+(high-low)/2;
//             long mid1 = (low+high)/2;
//             int mid = (int)mid1;
         
            if(nums[mid]==target){
                return mid;
            }
            else if(nums[mid]>target){
                high=mid-1;
            }
            else{
                low=mid+1;
            }
        }
        return -1;

    }
}

//below code is working but not a otimal solution. it's TC:- O(N)
// class Solution {
//     public int search(int[] nums, int target) {
//         for(int i=0; i<nums.length; i++){
//             if(nums[i]==target){
//                 return i;
//             }
//         }
//         return -1;
//     }
// }
