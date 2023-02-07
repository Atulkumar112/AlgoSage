
class Solution{
    /* Function to return the length of the
       longest subarray with ppositive product */
       
       
    int maxLength(int arr[], int n) { 
        // below is a navie approach O(n^2)
        // int ans=0;
        // for(int i=0; i<n; i++){
        //     int prod=1;
        //     if(arr[i]==0) continue;
        //     for(int j=i; j<n; j++){
        //         prod*=arr[j];   // if prod become 0 at once then it will not change 
        //         // from 0 to any number until the loop will finished 
        //         if(prod>0){    
        //             ans = Math.max(ans, j-i+1);
        //         }
        //     }
        // }
        
        // return ans;
        
        //-------------------------------
        int ans=0;
        
        int cp=0; int cn=0;    //count postive (cp) and count negative (cn) 
        
        for(int i=0; i<n; i++){
            if(arr[i]==0){
                cn=cp=0;
                
               
            }
            else if(arr[i]>0){
                cp++;
                if(cn!=0){
                    cn+=1;
                }
                ans = Math.max(ans, cp);
            }
            else {    //if(arr[i]<0)
                int t=cp;
                cp=cn;
                cn=t;
                cn++;
                if(cp!=0){
                    cp++;
                }
                ans=Math.max(ans, cp);
            }
        }
        
        return ans;
    }
   
}
