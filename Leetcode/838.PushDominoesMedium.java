// this below code is passing 34 test case out of 43 in java and then errror occure time limite exceed but this code is 
//working fine in c++ with 95ms running time
class Solution {
    public String pushDominoes(String d) {
        int n = d.length();
        int[] rightArr = new int[n];
        int[] leftArr = new int[n];
        
        // for left to right --->
        char prev = '.';
        int count = 0;
        for(int i=0; i<n; i++){
            
             if(d.charAt(i) == 'R'){
                prev = 'R';
                count = 1;
                continue;
            }
            else if(d.charAt(i) == 'L'){
                prev = 'L';
            }
            
            if(prev == 'R' && d.charAt(i) == '.'){
                rightArr[i] = count;
                count++;
            }
        }
        
        //for right to left <---
        prev = '.';
        count = 0;
        for(int i=n-1; i>=0; i--){
            
            if(d.charAt(i) == 'L'){
                prev = 'L';
                count = 1;
                continue;
            }
            else if(d.charAt(i) == 'R'){
                prev = 'R';
            }
            
            if(prev == 'L' && d.charAt(i) == '.'){
                leftArr[i] = count;
                count++;
            }
        }
        
      String res = "";
      for(int i=0; i<n; i++){
          if(leftArr[i]==0 && rightArr[i]==0){
              res += d.charAt(i);
          }
          else if(leftArr[i]==0 && rightArr[i]>0){
              res+="R";
          }
          else if(rightArr[i]==0 && leftArr[i]>0){
              res += "L";
          }
          else if(leftArr[i]>rightArr[i]){
              res += "R";
          }
          else if(rightArr[i]>leftArr[i]){
              res += "L";
          }
          else if(rightArr[i] == leftArr[i]){
               res += ".";
          }
      }
        
        return res;
    }
}
