class Solution
{
    //Function to find maximum of each subarray of size k.
    static ArrayList <Integer> max_of_subarrays(int arr[], int n, int k)
    {
        // Your code here
        ArrayList<Integer> ans = new ArrayList<>();

        PriorityQueue<Integer> pq = new PriorityQueue<>(Collections.reverseOrder());

        

        for(int i = 0 ; i < n ; i++){

            if(i < k){

                pq.add(arr[i]);

            }else{

                int max = pq.peek();

                ans.add(max);

                pq.remove(arr[i - k]);

                pq.add(arr[i]);

                

            }

        }

        

        ans.add(pq.peek());

        return ans;
    }
}
