class Solution {
    public int subarraysDivByK(int[] nums, int k) {
        // just using the prifix sum
        HashMap<Integer, Integer> hm = new HashMap<>();
        hm.put(0, 1);
        int runningSum=0;
        int count=0;

        for(int i=0; i<nums.length; i++){
            runningSum+=nums[i];
            int reminder = runningSum%k;
            if(reminder<0){
                reminder+=k;
            }
            if(hm.containsKey(reminder)){
                count+=hm.get(reminder);
            }
            hm.put(reminder, hm.getOrDefault(reminder, 0)+1);
        }
        return count;
    }
}
