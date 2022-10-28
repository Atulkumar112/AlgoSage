class Solution {
    public List<List<String>> groupAnagrams(String[] strs) {
        Map<String, List<String>> hm = new HashMap<>();
        
        for(int i=0; i<strs.length; i++){
            char[] ch = strs[i].toCharArray();
            Arrays.sort(ch);
            String key = new String(ch);
          
          //this is for adding the same key with multiple values 
            hm.computeIfAbsent(key, k -> new ArrayList()).add(strs[i]);
          
        }
        
        return new ArrayList(hm.values());
    }
}
