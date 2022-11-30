class Solution {
    public boolean uniqueOccurrences(int[] arr) {
        // this code is written by me and i know like it's not a goog approach
//         Arrays.sort(arr);
//         if(arr.length==2) return false;  // this is a tukka line :)
//         List<Integer> l1 = new ArrayList<>();
//         int j=0;
//         int count=0;
//         for(int i=0; i<arr.length-1; i++){
//             j=i+1;
//             if(arr[i]!=arr[j]){
//                 l1.add(count);
//                 count=0;
                
//             }
//             else{
//                 count+=1;    
//             }
//         }
        
//         List<Integer> l2 = new ArrayList<>();
//         for(int i=0; i<l1.size(); i++){
//             if(!l2.contains(l1.get(i))){
//                 l2.add(l1.get(i));
//             }
//         }
        
//         return l1.size() == l2.size() ? true:false;
        
        //Let me this question with the help of hashmap
      // this solution is also made by me :) and this is the best solution
        HashMap<Integer, Integer> hm = new HashMap<>();
		 for(int i=0; i<arr.length; i++) {
			 hm.put(arr[i], hm.getOrDefault(arr[i], 0)+1);
		 }
        
		 HashSet<Integer> set = new HashSet<>();
		 for(Map.Entry m: hm.entrySet()) {
			 set.add((int) m.getValue());
		 }
		 
		 
		 return set.size()==hm.size()?true:false;
    }
}
