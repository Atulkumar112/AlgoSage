class Solution {
    // TC:- O(n) SP:_ O(1)
    static long solve(int n, int k, ArrayList<Long> geekNum) {
        long ele=0;
        for(int i=0; i<k; i++){
            ele+=geekNum.get(i);
        }
        
        for(int i=0; i<n; i++){
            geekNum.add(ele);
            ele+=ele;
            ele-=geekNum.get(i);
        }
        
        return geekNum.get(n-1);
        
    }
    
    
    // below is a my code
    //time complexity is O(n^2) and SP is O(1) of below code and this code passed all test cases
    // but challenge is we have to do this code with O(n) TC AND O(n) Space complexity
    /*
    static long solve(int n, int k, ArrayList<Long> geekNum) {
        for(int i=0; i<n; i++){
            long sum=0;
            int j=0;
            while(j<k){
                sum+=geekNum.get(i+j);
                j++;
            }
            geekNum.add(sum);
            if(geekNum.size()>=n){
                break;
            }
        }
        return geekNum.get(n-1);
    }
    */
    
    
    
    // below is akshay anil code
    // static long solve(int n, int k, ArrayList<Long> geekNum) {
    //     for(int i=k; i<n; i++){
    //         long sum=0;
    //         for(int j=i-k; j<i; j++){
    //             sum+=geekNum.get(j);        
    //         }   
    //         geekNum.add(sum);
    //     }
    //     return geekNum.get(n-1);
    // }
}
