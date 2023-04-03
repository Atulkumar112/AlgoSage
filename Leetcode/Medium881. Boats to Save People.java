// it's also working with 17ms time , TC- NlogN
class Solution {
    public int numRescueBoats(int[] plp, int limit) {
        Arrays.sort(plp);
        int n = plp.length;
        int boats =0;

        int l = 0, r=n-1;
        while(l<=r){
            if(plp[l]+plp[r]<=limit){
                l++;
                r--;
            }
            else{
                r--;
            }
            boats++;
        }
        return boats;
    }
}

// 38/78 not a good approach
// class Solution {
//     public int numRescueBoats(int[] plp, int limit) {
//         Arrays.sort(plp);
//         int n = plp.length;
//         int boats =1;
        
//         int curr_wt = plp[0];
//         for(int i=1; i<n; i++){
//             if(curr_wt + plp[i] > limit){
//                 curr_wt = plp[i];
//                 boats++;
//             }
//             else{
//                 curr_wt += plp[i];
//             }
//         }
//         return boats;
//     }
// }
