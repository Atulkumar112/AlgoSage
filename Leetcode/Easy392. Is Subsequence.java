class Solution {
    public boolean isSubsequence(String s, String t) {
        if(s.length() > t.length()) return false;
        int len = s.length();
        if(len ==0){
            return true;
        }
        char charOfS = s.charAt(0);
        
        int init = 0;
        for(int i=0; i<t.length(); i++){
            if(charOfS == t.charAt(i)){
                init++;
                if(init == len){
                    return true;
                }
                charOfS = s.charAt(init);
            }
        }
        return false;
    }
}
