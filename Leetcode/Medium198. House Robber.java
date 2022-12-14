class Solution {
    public int rob(int[] nums) {
        int prev=0, last=0;
        for (int curr : nums)
            last = Math.max(prev+curr, prev=last);
        return last;
    }

// time limit exceeded 55/68 test cases passed
    // public int rob(int[] nums) {
    //     return rec(nums, 0);
    // }
    // public int rec(int[] nums, int i){
    //     if(i>=nums.length){
    //         return 0;
    //     }
    //     int stealing = nums[i]+rec(nums, i+2);
    //     int skipping = rec(nums, i+1);

    //     return Math.max(stealing, skipping);
    // }
}
