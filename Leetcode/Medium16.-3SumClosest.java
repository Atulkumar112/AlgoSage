class Solution {
    public int threeSumClosest(int[] nums, int target) {
      //this below code is 2 pointer approach and TC is O(n^2)
        Arrays.sort(nums);
        int len = nums.length;
        int closest = nums[0]+nums[1]+nums[len-1];
        
        for(int i=0; i<len; i++){
            int start = i+1, end=len-1;
            while(start<end){
                int currSum=nums[i]+nums[start]+nums[end];
                if(currSum<target){
                    start++;
                }
                else{
                    end--;    
                }
                if((Math.abs(currSum-target))<(Math.abs(closest-target))){
                        closest = currSum;
                }
                
            }
        
        }
        return closest;   
    }
}        
      
//below code is have time complexity is O(N^3) and after passing 112 test cases out off 160 it is showing time limite exceed.
//         int len = nums.length;
//         int closest = nums[0]+nums[1]+nums[2];
        
//         for(int i=1; i<len-2; i++){
//             for(int j=i+1; j<len-1; j++){
//                 for(int k=j+1; k<len; k++){
//                     int currSum = nums[i]+nums[j]+nums[k];
//                     if((Math.abs(currSum-target))<(Math.abs(closest-target))){
//                         closest = currSum;
//                     }
//                 }
//             }
//         }
//         return closest;
