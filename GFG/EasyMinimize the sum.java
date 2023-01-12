
class Solution {
    long minimizeSum(int n, int arr[]) {
        long ans=0;
        PriorityQueue<Integer> pq = new PriorityQueue<>();
        for(int i: arr){
            pq.add(i);
        }
        
        while(!pq.isEmpty() && pq.size()>=2){
            int a=pq.remove();
            int b=pq.remove();
            int c=a+b;
            ans += c;
            pq.add(c);
        }
        return ans;
    }
}
