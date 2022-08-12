import java.util.*;

class Solution {
    public List<List<Integer>> permute(int[] nums) {
        List<List<Integer>> ans = new ArrayList<>();
        getPermutations(nums, ans, 0, nums.length);
        return ans;
    }
    
    public void getPermutations(int[] nums, List<List<Integer>> ans, int start, int n){
        if(start >= n){
            // List<Integer> permu = convetArrToList(nums);
            // ans.add(new ArrayList(permu));
            
            //---------------or we can also do like this-----------
            List<Integer> per = new ArrayList<>(convetArrToList(nums));
            ans.add(per);
            return ;
        }
        
        for(int i=start; i<n; i++){
            swap(nums, i, start);
            getPermutations(nums, ans, start+1, n); 
            swap(nums, i, start);   //backtraking 
        }
        
    }
    // method for swapping 
    public void swap(int[] arr, int i, int j){
        int temp = arr[i];
        arr[i] = arr[j];
        arr[j] = temp;
    }
    
  // method for converting the array into a list/arraylist
    public List<Integer> convetArrToList(int[] arr){
        List<Integer> convert = new ArrayList<>();
        for(int ele: arr){
            convert.add(ele);    
        }
        
        return convert;
    }
        
}
