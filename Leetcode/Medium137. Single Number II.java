class Solution {
    public int singleNumber(int[] nums) {
        Map<Integer, Integer> map = new HashMap<>();
        for(int i=0; i<nums.length; i++){
            map.put(nums[i], map.getOrDefault(nums[i], 0)+1);
        }

        for(Map.Entry m: map.entrySet()){
            if((int) m.getValue()==1){
                return (int)m.getKey();
            }
        }

        return -1;
    }
}
