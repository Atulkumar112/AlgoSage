class Solution {
    
    // below code is the memoization based because here i used the set
    public List<List<Integer>> permuteUnique(int[] nums) {
        List<List<Integer>> ans = new ArrayList<>();
        uniquePermutations(nums, ans, 0, nums.length);
        return ans;
    }
    
    public void uniquePermutations(int[] nums, List<List<Integer>> ans, int start, int end){
        if(start >= end){
             List<Integer> list = permu(nums);
            ans.add(new ArrayList(list));
        }
        
        Set<Integer> set = new HashSet<>();
        for(int i=start; i<end; i++){
            if(set.contains(nums[i])) continue;
            
            set.add(nums[i]);
            swap(nums, i, start);
            uniquePermutations(nums, ans, start+1, end);
            swap(nums, i, start);
        }
    }
    
    
    
    //without memoization
//     public List<List<Integer>> permuteUnique(int[] nums) {
//         Set<List<Integer>> ans = new HashSet<>();
//         uniquePermutations(nums, ans, 0, nums.length);
//         return new ArrayList<>(ans);
//     }
    
//     public void uniquePermutations(int[] nums, Set<List<Integer>> ans, int start, int end){
//         if(start >= end){
//             List<Integer> list = permu(nums);
//             ans.add(new ArrayList<>(list));
//         }    
//         for(int i=start; i<end; i++){
//             swap(nums, i, start);
//             uniquePermutations(nums, ans, start+1, end);
//             swap(nums, i, start);
//         }
//     }
    
    public void swap(int[] arr, int i, int j){
        int temp = arr[i];
        arr[i] = arr[j];
        arr[j] = temp;
    }
    
    public List<Integer> permu(int[] nums){
        List<Integer> newList = new ArrayList<>();
        for(int ele: nums){
            newList.add(ele);
        }
        return newList;
    }
}
