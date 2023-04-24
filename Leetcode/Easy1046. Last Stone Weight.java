class Solution {
    public int lastStoneWeight(int[] stones) {
        PriorityQueue<Integer> pq = new PriorityQueue<>(Collections.reverseOrder());
        int n = stones.length;
        for(int i=0; i<n; i++){
            pq.add(stones[i]);
        }

        while(pq.size() > 1){
            int y = pq.remove();
            int x = pq.remove();

            if((y-x)==0){
                continue;
            }
            else{
                pq.add(y-x);
            }
        }
        int ans= 0;
        if(!pq.isEmpty()){
            ans = pq.remove();
        }

        return ans;
    }
}
