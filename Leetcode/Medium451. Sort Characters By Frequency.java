class Solution {
    public String frequencySort(String s) {
        // really it is very easy question
        //below solution usting hashmap and arr gettig the TC O(n)
        // you can also use the priority queue but the TC become O(nlogn)
        StringBuilder sb = new StringBuilder();
		HashMap<Character, Integer> hm = new HashMap<>();
		
		for(int i=0; i<s.length(); i++) {
			hm.put(s.charAt(i), hm.getOrDefault(s.charAt(i), 0)+1);
		}
		
		List<Character>[] arr = new List[s.length()+1];
		for(Character key: hm.keySet()) {
			if(arr[hm.get(key)]==null) {
				arr[hm.get(key)] = new ArrayList<>();
			}
			arr[hm.get(key)].add(key);
		}
		
		for(int i= arr.length-1; i>=0; i--) {
			if(arr[i]!= null) {
				for(char ch: arr[i]) {
					for(int j=0; j<hm.get(ch); j++) {
						sb.append(ch);
					}
				}
			}
		}
		
		return sb.toString();
    }
}
