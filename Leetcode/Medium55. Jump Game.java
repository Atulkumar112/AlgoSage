class Solution {
    public boolean canJump(int[] nums) {
        int reach=0;
        for(int i=0; i<=reach; i++){
            reach= Math.max(reach, i+nums[i]);
            if(reach>=nums.length-1){
                return true;
            }
        }

        return false;

        // my below code is passing 157/170 test cases.
        // int n=nums.length;
        // int i=0;
        // int s =n;
        // while(s-->0){
        //     if(i>=n-1){
        //         return true;
        //     }
        //     i+=nums[i];
        // }
        // return false;
        
    }
}
