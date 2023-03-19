
class Solution {
    //TC is O(n)
  // SC is O(2n) --> O(n), becuse we are using 2 hashmap so that's why SC is 2n whihc will be n
    public static ArrayList<Integer> getDistinctDifference(int n, int[] arr) {
        Map<Integer, Integer> x = new HashMap<>();  //x for left
        Map<Integer, Integer> y = new HashMap<>();  //y for right
        
        for(int i=0; i<n; i++){
            y.put(arr[i], y.getOrDefault(arr[i], 0)+1);
        }
        
        ArrayList<Integer> ans = new ArrayList<>();
        
        for(int i=0; i<n; i++){
            y.put(arr[i], y.getOrDefault(arr[i], 0)-1);
            if(y.get(arr[i])==0) y.remove(arr[i]);
            
            int currAns = x.size()-y.size();
            ans.add(currAns);
            x.put(arr[i], x.getOrDefault(arr[i], 0)+1);
        }
        return ans;
    }
    
    //below code i written by me and TLE has occure, 1110/1115 test case passed.
    //TC is (N root n)
    // public static ArrayList<Integer> getDistinctDifference(int n, int[] arr) {
    //     ArrayList<Integer> ans = new ArrayList<>();
    //     for(int i=0; i<n; i++){
    //         Set<Integer> left = new HashSet<>();
    //         Set<Integer> right = new HashSet<>();
            
    //         for(int j=i-1; j>=0; j--){
    //             left.add(arr[j]);
    //         }
            
    //         for(int j=i+1; j<n; j++){
    //             right.add(arr[j]);
    //         }
            
    //         int leftN = left.size();
    //         int rightN = right.size();
            
    //         ans.add(leftN- rightN);
            
    //     }
    //     return ans;
    // }
}
        
