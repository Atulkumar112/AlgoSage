/*
stack: Increasing stack, store the index
dp[i + 1]: Sum of minimum of subarrays which end with A[i]
dp[i + 1] = dp[prev + 1] + (i - prev) * A[i], where prev is the last number which is less than A[i], since we maintain a monotonous increasing stack, prev = stack.peek()

eg. [3, 1, 2, 4, 3], when i = 4, all subarrays end with A[4]:
[3]
[4, 3]
[2, 4, 3]
[1, 2, 4, 3]
[3, 1, 2, 4, 3]
In this case, stack.peek() = 2, A[2] = 2.
For the first 2 subarrays [3] and [4, 3], sum of minimum = (i - stack.peek()) * A[i] = 6.
For the last 3 subarrays [2, 4, 3], [1, 2, 4, 3] and [3, 1, 2, 4, 3], since they all contain a 2 which is less than 3, sum of minimum = dp[stack.peek() + 1] = 4.
Then, dp[i + 1] = 4 + 6 = 10
*/

class Solution {
    public int sumSubarrayMins(int[] A) {
        Stack<Integer> stack = new Stack<>();
        int[] dp = new int[A.length + 1];
        stack.push(-1);
        int result = 0, M = (int)1e9 + 7;
        for (int i = 0; i < A.length; i++) {
            while (stack.peek() != -1 && A[i] <= A[stack.peek()]) {
                stack.pop();
            }
            dp[i + 1] = (dp[stack.peek() + 1] + (i - stack.peek()) * A[i]) % M;
            stack.push(i);
            result += dp[i + 1];
            result %= M;
        }
        return result;
        
       // int sum=0;
       //  int n=arr.length;
       //  for(int i=0; i<n; i++){
       //      int min=arr[i];
       //      for(int j=i; j<n; j++){
       //          if(min>arr[j]){
       //              min=arr[j];
       //              sum+=min;
       //          }
       //      }
       //  }
       //  return sum;
    }
}


