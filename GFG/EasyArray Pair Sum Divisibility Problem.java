
class Solution {
    public boolean canPair(int[] nums, int k) {
       int n=nums.length;
        if (n % 2 == 1){
          return false;   
        }
        
        int[] freq = new int[k];
        for(int i: nums){
            int y=i%k;
            if(freq[(k-y)%k]!=0){
                freq[(k-y)%k]--;
            }
            else{
                freq[y]++;
            }
        }
        
        for(int i:freq){
            if(i!=0) return false;
        }
          
          return true;
        
        //----------------------------------------------------------------------------------
       // below code have time limit exceed  which is passed 160 cases out of 165
       // TC is O(N^2) so we need to use O(n)
    // int n=nums.length;
    // if (n % 2 == 1)
    //   return false;
 
    // // Initialize count = 0
    // int count = 0;
 
    // int vis[] = new int[n];
    // Arrays.fill(vis,-1);
 
    // for (int i = 0; i < n-1; i++) {
    //   for (int j = i + 1; j < n; j++) {
    //     if ((nums[i] + nums[j]) % k == 0 && vis[i] == -1 && vis[j] == -1) {
 
    //       // if pair is divisible increment
    //       // the count and mark elements
    //       // as visited
    //       count++;
    //       vis[i] = 1;
    //       vis[j] = 1;
    //     }
    //   }
    // }
 
    // if (count == n / 2)
    //   return true;
 
    // return false;
    }
}
