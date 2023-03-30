
// class Solution {
//     public static int minimumInteger(int n, int[] arr) {
//         int sum=0;
//         for(int i=0; i<n; i++){
//             sum+=arr[i];
//         }
        
//         // Arrays.sort(arr); //for nlong approch
//         // int ans=0; //for nlong approch
//         int ans=Integer.MAX_VALUE;
//         for(int i=0; i<n; i++){
//             if(sum<=arr[i]*n){
//                 ans=Math.min(ans, arr[i]);
//                 //break; //for nlong approch
//             }
//         }
//         return ans;
//     }
// }
        
        
//
class Solution{
    public static int minimumInteger(int n, int[] arr) {
        long sum=0;
        for(int i=0; i<n; i++){
            sum+=arr[i];
        }
        long min = Integer.MAX_VALUE;
        for(int i=0; i<n; i++){
            if(Math.log(sum)<=Math.log(arr[i])+Math.log(n)){
                min=Math.min(min, arr[i]);
            }
        }
        return (int)min;
    }
}

