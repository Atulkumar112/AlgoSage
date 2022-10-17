class Solution {
    public boolean checkIfPangram(String sen) {
        int[] arr = new int[26];
        
        for(int i=0; i<sen.length(); i++){
            arr[sen.charAt(i)-'a']++;
        }
        
        // return Arrays.asList(arr).contains(0) ? false : true;   //this one line if condition is not working. i don't know why.  
      for(int j=0; j<26; j++){                                  // that's why i written this loop for checking arr contains 0 or not.
          if(arr[j] == 0) return false;
      }
        return true;
    }
}
