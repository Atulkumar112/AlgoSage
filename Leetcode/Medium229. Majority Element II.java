class Solution {
    public List<Integer> majorityElement(int[] nums) {
        Map<Integer, Integer> map = new HashMap<>();
        List<Integer> list = new ArrayList<>();

        for(int i=0; i<nums.length; i++){
            map.put(nums[i], map.getOrDefault(nums[i], 0)+1);
        }

        double val = Math.floor(nums.length/3);

        for(Map.Entry<Integer, Integer> m: map.entrySet()){
            if((int)m.getValue() > val){
                list.add((int)m.getKey());
            }
        }

        return list;
    }
}
