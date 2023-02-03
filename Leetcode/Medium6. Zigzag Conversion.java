//best solution 3ms runtime
class Solution {
    public String convert(String s, int numRows) {
        if (numRows == 1) return s;

        StringBuilder ret = new StringBuilder();
        int n = s.length();
        int cycleLen = 2 * numRows - 2;

        for (int i = 0; i < numRows; i++) {
            for (int j = 0; j + i < n; j += cycleLen) {
                ret.append(s.charAt(j + i));
                if (i != 0 && i != numRows - 1 && j + cycleLen - i < n)
                    ret.append(s.charAt(j + cycleLen - i));
            }
        }
        return ret.toString();
    }
}


// not good solution 19 runtime 
/*
class Solution {
    public String convert(String s, int numRows) {
        if(numRows==1) return s;
        
        String ans="";
        int n=s.length();
        int charsInSection = 2*(numRows-1); // formula for finding the element b/w gap
        for(int currRow=0; currRow<numRows; ++currRow){
            int index=currRow;
            while(index<n){
                ans+=s.charAt(index);
                if(currRow!=0 && currRow!=numRows-1){
                    int charsInBetween=charsInSection-2*currRow;
                    int secondIndex = index+charsInBetween;

                    if(secondIndex<n){
                        ans+=s.charAt(secondIndex);
                    }
                }
                index+=charsInSection;
            }            
        }
        return ans;

    }
}

*/
