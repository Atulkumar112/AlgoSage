// User function Template for Java

class Solution {
    int isItPossible(String S, String T, int M, int N) {
        if(M!=N) return 0;
        
        int a=0;
        int b=0;
        for(int i=0; i<M; i++){
            if(S.charAt(i)=='A'){
                a++;
            }
            if(S.charAt(i)=='B'){
                b++;
            }
            
            if(T.charAt(i)=='A'){
                a--;
            }
            if(T.charAt(i)=='B'){
                b--;
            }
        }
        
        if(a!=b) return 0;
        
        int i=0;
        int j=0;
        while(i<N && j<N){
            while(i<N && S.charAt(i)=='#') i++;
            while(j<N && T.charAt(j)=='#') j++;
            if(i==N || j==N)break;
            if(S.charAt(i)=='A'){
                if(T.charAt(j)=='A'){
                    if(j>i) return 0;
                    else{
                        i++;
                        j++;
                    }
                }
                else{
                    return 0;
                }
            }
            else{
                if(T.charAt(j)=='B'){
                    if(j<i) return 0;
                    else{
                        i++;
                        j++;
                    }
                }
                else{
                    return 0;
                }
            }
        }
        return 1;
    }
};
