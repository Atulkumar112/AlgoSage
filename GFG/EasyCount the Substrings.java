//User function Template for Java
class Solution 
{ 
    int countSubstring(String s) 
    { 
        int ans=0;
        int n = s.length();
        for(int i=0; i<n; i++){
            int count=0; 
            for(int j=i; j<n; j++){
                // if(Character.isUpperCase(s.charAt(j))){
                if(s.charAt(j)>='a'  && s.charAt(i)<='z'){
                    count--;
                }
                else {
                    count++;
                }
                
                if(count==0){
                    ans++;
                }
            }
        }
        return ans;
    }
} 
