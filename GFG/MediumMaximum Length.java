//User function Template for Java

class Solution {
    int solve(int a, int b, int c) {
        int min = Math.min(a, Math.min(b, c));
        int max = Math.max(a, Math.max(b, c));
        int mid = a+b+c-min-max;
        
        // if(a!=min && a!=max){
        //     mid=a;
        // }
        // else if(b!=min && b!=max){
        //     mid=b;
        // }
        // else if(c!=min && c!=max){
        //     mid=c;
        // }
        
        if(max > (min+mid+1)*2){
            return -1;
        }
        
        return a+b+c;
    }
};
