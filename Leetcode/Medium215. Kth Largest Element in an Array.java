class Solution {
    //TC is long(n) only but according to the question we have to do this question 
    // without sorting 
    // public int findKthLargest(int[] nums, int k) {
    //     int n = nums.length;
    //     Arrays.sort(nums);
    //     return nums[n-k];
    // }

    //Time Complexity: O(Nlog⁡N)
    public int findKthLargest(int[] nums, int k) {
        PriorityQueue<Integer> minHeap = new PriorityQueue<>();

        for(int i=0; i<k; i++){
            minHeap.add(nums[i]);
        }

        for(int i=k; i<nums.length; i++){
            if(minHeap.peek() < nums[i]){
                minHeap.poll();
                minHeap.add(nums[i]);
            }

        }
        return minHeap.peek();

    }
}
