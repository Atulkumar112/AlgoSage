
class Solution{
    int carpetBox(int A, int B, int C, int D) { 
        // just see the hint and you will understand automatically this below code
        int a=A;
        int b=B;
        int ans=0;
        int count=0;
        
        while(a>C || b>D){
            if(a>C){
                count++;
                a=a/2;
            }
            if(b>D){
                count++;
                b=b/2;
            }
        }
        
        ans = count;
        count=0;
        
        a=B;
        b=A;
        
        while(a>C || b>D){
            if(a>C){
                count++;
                a=a/2;
            }
            if(b>D){
                count++;
                b=b/2;
            }
        }
        
        return Math.min(ans, count);
    }
   
}
