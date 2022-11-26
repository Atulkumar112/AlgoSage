class Solution {
    public int[] twoSum(int[] nums, int target) {
        //below code is completly made by me
        // List<Integer> list = new ArrayList<>();
        // int n=nums.length;
        // for(int i=0; i<n-1; i++){
        //     for(int j=i+1; j<n; j++){
        //         if(nums[i]+nums[j]==target){
        //             list.add(i);
        //             list.add(j);
        //         }
        //     }
        // }
        // int l=list.size();
        // int[] arr = new int[l];
        // for(int i=0; i<l; i++){
        //     arr[i]=list.get(i);
        // }
        // return arr;
        
        //-----------------------2nd method----------
         
        int n=nums.length;
        for(int i=0; i<n-1; i++){
            for(int j=i+1; j<n; j++){
                if(nums[i]+nums[j]==target){
                    return new int[] {i, j};
                }
            }
        }
        
        return new int[] {-1, -1};
    }
}
