class Solution {
    public int removeDuplicates(int[] nums) {
        // this is best code 
        if(nums.length==0)return 0;
        
        int i = 0;
            for(int j = i+1;j<nums.length;j++){
                if(nums[i]!=nums[j]){i++;
                nums[i]=nums[j];
         } 
            }
        return i+1;
        
        
        
        
        // below code is written by my self in POTD times but it's taken 37 ms time and above code taken only 1-2 ms 
        //this code is created by my mind
//         ArrayList<Integer> list = new ArrayList<>();
//         for(int i=0; i<nums.length; i++){
//             if(!list.contains(nums[i])){
//                 list.add(nums[i]);
//             }
//         }
//         Arrays.fill(nums, 0);
//         for(int i=0; i<list.size(); i++){
//             nums[i] = list.get(i);
//         }
        
//         return list.size();
    }
}
