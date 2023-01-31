//User function Template for Java
// TC:- O(b*a)  because of while loop is going A become B;
// SC:- O(b)  because i am using String which will contains only B characters.
class Solution {
    static int minRepeats(String a, String b) {
        int ans=1;
        String rep = a;   // SC:- O(b)
        if(a.contains(b)){
            return ans;
        }
        while(rep.length()<b.length()){  // TC:- O(b*a)
            rep+=a;
            ans++;
            
        }
        
        if(rep.contains(b)){
                return ans;
        }
        
        rep+=a;
        if(rep.contains(b)){
            return ans+1;
        }
        
        return -1;
    }
};
