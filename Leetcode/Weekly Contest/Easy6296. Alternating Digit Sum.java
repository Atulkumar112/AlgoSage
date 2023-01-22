
class Solution {
    public int alternateDigitSum(int n) {
        char[] ch = Integer.toString(n).toCharArray();
        int ans=0;
        for(int i=0; i<ch.length; i++){
            if(i%2==0){
                ans+=ch[i]-'0';
            }
            else{
                ans-= ch[i]-'0';
            }
        }
        
        return ans;
    }
}
