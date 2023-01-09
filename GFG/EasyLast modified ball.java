// i done this code in 2min 20 sec

class Solution {
    int solve(int n, int[] arr) {
        int ans=0;
        for(int i=n-1; i>=0; i--){
            if(arr[i]!=9){
                ans=i;
                break;
            }
        }
        return ans+1;
    }
};
