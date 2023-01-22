
class Solution {
    public int getCommon(int[] arr1, int[] arr2) {  
        List<Integer> ans = new ArrayList<>();
        
        HashMap<Integer, Integer> hashMap = new HashMap<>();
        for (int i = 0; i < arr1.length; i++) {
            if (hashMap.containsKey(arr1[i])) {
                hashMap.put(arr1[i],
                            hashMap.get(arr1[i]) + 1);
            }
            else {
                hashMap.put(arr1[i], 1);
            }
        }
 
        for (int i = 0; i < arr2.length; i++) {
            if (hashMap.containsKey(arr2[i])) {
               hashMap.remove(arr2[i]);
             
                ans.add(arr2[i]);
            }
        }
        
        if(ans.size()!=0){
            return ans.get(0);
        }
        
        return -1;
        
    }
}
