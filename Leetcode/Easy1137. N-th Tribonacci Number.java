// The tribonacci Series is :- 0 1 1 2 4 7 13 24 

// taken only 10 minutes in this below iterative code 
class Solution {
    public int tribonacci(int n) {
        int ans = 0;
        int t1 = 0, t2=1, t3=1;

        if(n==0){
            return t1;
        }
        else if(n==1 || n==2){
            return 1;
        }
        
        for(int i=3; i<=n; i++){
            ans = t1+t2+t3;
            t1=t2;
            t2=t3;
            t3=ans;
        }

        return ans;
    }
    

// taken only 5 mints in this below recursion code 
    // time limit exceeded 37/39 test cases passed 
    // public int tribonacci(int n) {
    //     return tribo(n);
    // }
 
    // public int tribo(int n){
    //     if(n==0){
    //         return 0;
    //     }
    //     if(n==1 || n==2){
    //         return 1;
    //     }
    //     if(n==3){
    //         return 2;
    //     }
    //     // n-1 = 3 n-2=3 n-3 = 1
    //     return tribo(n-1)+tribo(n-2)+tribo(n-3);
    // }
}
