class Solution 
{ 
    boolean wifiRange(int n, String s, int x) 
    { 
        int zero=0; int one=0;
        for(int i=0; i<n; i++){
            if(s.charAt(i)=='1'){
                if(zero!=0){
                    if(one==0 && zero>x) return false;
                    else if(zero>x*2) return false;
                }
                one=1;
                zero=0;
            }
            else zero++;
        }
        if(zero>0){
            if(one==0 || (zero>x)) return false;
        }
        return true;
    }
} 
