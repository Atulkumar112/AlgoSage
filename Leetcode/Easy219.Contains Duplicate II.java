class Solution {
    public boolean containsNearbyDuplicate(int[] nums, int k) {
        Map<Integer, Integer> hm = new HashMap<Integer, Integer>();
        
        for(int i=0; i<nums.length; i++){
            int curr=nums[i];
            if(hm.containsKey(nums[i]) && i-hm.get(curr)<=k){
                return true;
            }
            else{
                hm.put(curr, i);
            }
        }
        
        return false;
    }
}
