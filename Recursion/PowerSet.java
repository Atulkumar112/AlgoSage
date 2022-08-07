import java.util.*;
public class Solution {
    public static void makingSet(ArrayList<Integer> arr, ArrayList<ArrayList<Integer>> ans, ArrayList<Integer> runningArr, int i){    
        if(i == arr.size()){
            ans.add(new ArrayList(runningArr));
            return ;
        }
        runningArr.add(arr.get(i));
        makingSet(arr, ans, runningArr, i+1);
        
        
        runningArr.remove(runningArr.size()-1);
        makingSet(arr, ans, runningArr, i+1);
        
    }
    
	public static ArrayList<ArrayList<Integer>> pwset(ArrayList<Integer> arr) {
        ArrayList<ArrayList<Integer>> ans = new ArrayList<ArrayList<Integer>>();
		makingSet(arr, ans, new ArrayList<Integer>(), 0);
        return ans;
	}
}

/*
    time complexity : O(2^n)
    space complexity : O(n)
*/
