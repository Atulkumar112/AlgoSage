class Solution {
    public void sortColors(int[] nums) {
        // belwo code is written by me and 100% runtime and this approch given by me:)
        int c0=0, c1=0, c2=0;
        
        for(int i=0; i<nums.length; i++){
            if(nums[i]==0){
                c0++;
            }
            else if(nums[i]==1){
                c1++;
            }
            else{
                c2++;
            }
        }
        
        for(int i=0; i<c0; i++){ //here is the main logic :)
            nums[i]=0;
        }
        
        for(int i=c0; i<c0+c1; i++){  //here is the main logic :)
            nums[i]=1;
        }
        
        for(int i=c0+c1; i<c0+c1+c2; i++){  //here is the main logic :)
            nums[i]=2;
        }
        
        // below code is not a good solution and not a good way Run time 1ms
        // Arrays.sort(nums);
    }
}
