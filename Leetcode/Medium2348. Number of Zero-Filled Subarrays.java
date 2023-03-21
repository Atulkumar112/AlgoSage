class Solution{
    public long zeroFilledSubarray(int[] nums) {
        int n=nums.length;
        long count=0;
        long ans=0;
        for(int i=0; i<n; i++){
            if(nums[i]==0){
                count++;
            }
            else{
                ans+=(count*(count+1)/2);
                count=0;
            }
        }
        if(count!=0){
            ans+=(count*(count+1)/2);
        }
        return ans;
    }
}

//34/48 TC passed and occure TLE
// class Solution {
//     public long zeroFilledSubarray(int[] nums) {
//         int n=nums.length;
//         int count=0;
        
//         for(int i=0; i<n; i++){
//             if(nums[i]==0){
//                 for(int j=i; j<n && nums[j]==0; j++){
//                     count++;
//                 }
//             }
//         }

//         return count;
//     }
// }
