class Solution {
    public int minimumAverageDifference(int[] nums) {
        
        int n = nums.length;
        int ans=-1;
        int minDiff = Integer.MAX_VALUE;
        long totalSum = 0;
        long preSum=0;
            
        for(int num: nums){
            totalSum += num;
        }
        
        for(int i=0; i<n; i++){
            preSum+=nums[i];
            
            long leftAvg=preSum/(i+1);
            long rightAvg=(totalSum-preSum);
            if(i!=n-1){
                rightAvg /= (n-i-1);
            }
            
            int curDiff = (int) Math.abs(leftAvg-rightAvg);
            if(curDiff < minDiff){
                ans=i;
                minDiff=curDiff;
            }
        }
        return ans;
        
    }
}
