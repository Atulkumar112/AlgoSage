class Solution {
    public boolean closeStrings(String w1, String w2) {
        //below code is written by me :)
        int l1=w1.length();
        int l2=w2.length();
        if(l1!=l2) return false;
        
        for(int i=0; i<l1; i++){
           if(!w1.contains(Character.toString(w2.charAt(i)))){
                return false;
           }
        }
               
        int[] arr1=new int[26];
        int[] arr2=new int[26];
        
        for(int i=0; i<l1; i++){
            arr1[w1.charAt(i)-'a']++;
            arr2[w2.charAt(i)-'a']++;    
        }
        
        Arrays.sort(arr1);
        Arrays.sort(arr2);
        
        for(int i=0; i<26; i++){
            if(arr1[i]!=arr2[i]){
                return false;
            }
        }
        return true;
    }
}
