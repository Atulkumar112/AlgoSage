class Solution {
    public String orderlyQueue(String s, int k) {
        char[] ch = s.toCharArray();
       if(k>1){
            Arrays.sort(ch);
           return new String(ch);
       }
        String ans = s;
        for(int i=0; i<s.length(); i++){
            rotateArray(ch);
            int diff = ans.compareTo(new String(ch));
            if(diff>0){
                ans = new String(ch);
            }
        }
        return ans;
    }
    
    // for shifting the element from 0th potions to last postion and then shift all char to left site at once
    public void rotateArray(char[] arr){
        char temp = arr[0];
        for(int i=0; i<arr.length-1; i++){
            arr[i] = arr[i+1];
        }
        arr[arr.length-1] = temp;
    }
}
