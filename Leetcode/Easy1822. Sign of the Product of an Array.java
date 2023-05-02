// This question can be possible using the given hint :)
class Solution {
    public int arraySign(int[] nums) {
        int product=1;
        for(int i=0; i<nums.length; i++){
            if(nums[i]==0) return 0;
            if(nums[i]<0) nums[i]=-1;
            else if(nums[i]>0) nums[i]=1;

            product*=nums[i];
        }

        return product<0 ? -1 : 1;
    }
}
