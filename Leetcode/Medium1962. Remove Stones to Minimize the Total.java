// class Solution {
//     public int minStoneSum(int[] piles, int k) {
        // below code is written by me but in line number 11, i did mistake.. 
//         PriorityQueue<Integer> pq = new PriorityQueue<>(Collections.reverseOrder());
//         for(int i : piles){
//             pq.add(i);
//         }
        
//         while(k > 0 && !pq.isEmpty()){
//             int temp = pq.poll();
//             temp -= (int)Math.floor(temp/2);   //in this line
//             pq.add(temp);
//             k--;
//         }
        
//         int sum = 0;
//         while(!pq.isEmpty())sum += pq.poll();
        
//         return sum;
//     }
// }

//Leetcode Official solution 
class Solution {
    public int minStoneSum(int[] piles, int k) {
        PriorityQueue<Integer> heap = new PriorityQueue<>((a, b) -> b - a);
        for (int num: piles) {
            heap.add(num);
        }
        
        for (int i = 0; i < k; i++) {
            int curr = heap.remove();
            int remove = curr / 2;
            heap.add(curr - remove);
        }
        
        int ans = 0;
        for (int num: heap) {
            ans += num;
        }
        
        return ans;
    }
}
