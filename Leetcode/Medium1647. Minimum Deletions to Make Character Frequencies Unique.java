class Solution {
    public int minDeletions(String s) {
        Map<Character, Integer> count = new HashMap<>();
        int deletion = 0;
        Set<Integer> freq = new HashSet<>();

        for(char c: s.toCharArray()){
            count.put(c, count.getOrDefault(c, 0)+1);
        }

        for(int i: count.values()){
            while(i>0 && freq.contains(i)){
                i--;
                deletion++;
            }
            freq.add(i);
        }

        return deletion;
    }
}
