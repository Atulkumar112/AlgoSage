
class Solution {
    
    // time limit exceed because time complexity is nlogn
    // public static ArrayList<Integer> duplicates(int arr[], int n) {
    //     // code here
    //     Set<Integer> set = new HashSet<>();
    //     ArrayList<Integer> list = new ArrayList<>();
        
    //     for(int i=0; i<n; i++){
    //         if(set.add(arr[i])){
    //             set.add(arr[i]);
    //         }
    //         else{
    //             if(!list.contains(arr[i])){
    //                 list.add(arr[i]);    
    //             }
                
    //         }
    //     }
        
    //     if(list.size() == 0){
    //         list.add(-1);
    //     }
        
    //     Collections.sort(list);
    //     return list;
    // }

    //tc: o(n) sc: o(n)
    public static ArrayList<Integer> duplicates(int arr[], int n) {
        // code here
        TreeMap<Integer, Integer> map = new TreeMap<>();
        ArrayList<Integer> list = new ArrayList<>();
        
        for(int i: arr){
            map.put(i, map.getOrDefault(i, 0)+1);
        }
        
        for(Map.Entry<Integer, Integer> m: map.entrySet()){
            if(m.getValue() > 1){
                list.add(m.getKey());
            }
        }
        
        if(list.size() == 0){
            list.add(-1);
        }
        
        return list;
    }
}
