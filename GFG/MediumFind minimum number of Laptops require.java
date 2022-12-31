
class Solution {
    public int minLaptops(int n, int[] start, int[] end) {
        int ans=0;
		
		TreeMap<Integer, Integer> hm = new TreeMap<>();
		
		for(int i=0; i<n; i++) {
			hm.put(start[i], hm.getOrDefault(start[i],0)+1);
			hm.put(end[i], hm.getOrDefault(end[i], 0)-1);
		}
		
		
		int sum=0;
		for(Map.Entry a: hm.entrySet()) {
			sum+= (int)a.getValue();
			ans=Math.max(ans, sum);
		}
		
		return ans;
    }
}
