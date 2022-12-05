class Solution {
    public int findDuplicate(int[] nums) {
        // below code is written by me within 1 minutes :)
        Arrays.sort(nums);
        for(int i=0; i<nums.length; i++){
            if(nums[i]==nums[i+1]){
                return nums[i];
            }
        }
        
        return -1;
      
      /*
      int low = 1, high = nums.size() - 1;
    while (low <= high) {
        int mid = (int) (low + (high - low) * 0.5);
        int cnt = 0;
        for (int a : nums) {
            if (a <= mid) ++cnt;
        }
        if (cnt <= mid) low = mid + 1;
        else high = mid - 1;
    }
    return low;
    
    */
    }
}
