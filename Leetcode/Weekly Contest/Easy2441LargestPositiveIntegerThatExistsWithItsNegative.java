class Solution {
    //nums = [-1,2,-3,3]
    public int findMaxK(int[] nums) {
        Set<Integer> set = new HashSet<>();
        for(int i: nums){
            set.add(i);
        }
        int ans=-1;
        for(int j: set){
            if(set.contains(-j) && j>0){
                ans=Math.max(ans, j);
            }
        }
        return ans;
    }
}
