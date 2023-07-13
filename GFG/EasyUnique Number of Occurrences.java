class Solution {
    public static boolean isFrequencyUnique(int n, int[] arr) {
        // code here
        Map<Integer, Integer> hm = new HashMap<>();
        for(int i=0; i<n; i++){
            hm.put(arr[i], hm.getOrDefault(arr[i], 0)+1);
        }
        
        List<Integer> list = new ArrayList<>();
        Set<Integer> set = new HashSet<>();
        
        for(Map.Entry v: hm.entrySet()){
            list.add((int)v.getValue());
            set.add((int)v.getValue());
        }
        
        return list.size() == set.size() ? true : false;
    }
}
