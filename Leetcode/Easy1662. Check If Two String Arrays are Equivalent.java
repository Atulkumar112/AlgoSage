class Solution {
    public boolean arrayStringsAreEqual(String[] word1, String[] word2) {
        
//         if(w1.length != w2.length) return false;
//         String s1 = "";
//         String s2 = "";
//         // System.out.println(Arrays.toString(w1));
//         // System.out.println(Arrays.toString(w2));
//         for(int i=0; i<w1.length; i++){
//            s1 += w1[i];
//            s2 += w2[i];
                
//         }
        
//         char[] arr1 = s1.toCharArray();
//         char[] arr2 = s2.toCharArray();
//         Arrays.sort(arr1);
//         Arrays.sort(arr2);
        
        
//         if(arr1 != arr2) {
//             return false;
//         }
//         return true;
      // 
        String str1 = String.join("", word1);
        String str2 = String.join("", word2);
        
        return str1.equals(str2);
        
    }
}
