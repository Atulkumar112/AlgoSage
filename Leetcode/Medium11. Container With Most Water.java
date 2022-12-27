class Solution {
    public int maxArea(int[] height) {
      
      // below code getting the time limit exceeded 
//         int ans= 0;
//       int n = height.length;
//       for(int i=0; i<n-1; i++){
//         for(int j=i+1; j<n; j++){
//           int area = 0;
//           int minLen = Math.min(height[i], height[j]);
//           // System.out.println("min len: "+minLen);
//           int wid =  (j+1) - (i+1);
//           // System.out.println("wid: "+wid);
//           area = minLen * wid;
          
//           if(area>ans){
//             ans = area;
//             // System.out.println(ans);
//           }
//         }
//       }
//       return ans;
        
        /////////////////////////////////////////////////////////////////
        int left = 0;
      int right = height.length-1;
      int ans = 0;
      while(left<right){
        int area = 0;
         int minLen = Math.min(height[left], height[right]);
         int wid = (right+1)-(left+1);
         area = minLen * wid;
         if(area>ans){
           ans = area;
         }
         if(height[left]>height[right])right--;
         else left++;
      }
      return ans;
    }
}
