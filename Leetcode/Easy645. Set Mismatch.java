class Solution {
    public int[] findErrorNums(int[] nums) {
        Set<Integer> hs = new HashSet<Integer>();
		int dup = 0;
		for(int i=0; i<nums.length; i++) {
			if(hs.contains(nums[i])) {
				dup = nums[i];
			}
			hs.add(nums[i]);
		}
		int mis = 0;
		for(int i=1; i<=nums.length; i++) {
			if(!hs.contains(i)) {
				 mis = i;
			}
		}
		
		return new int[] {dup, mis}; 
    }
}
