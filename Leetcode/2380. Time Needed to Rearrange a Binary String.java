class Solution {
    /////////////////////////////////////////----------------------------
//     public String swap(String s, int i, int j){
//         char temp;
//         char[] arr = s.toCharArray();
//         temp = arr[i];
//         arr[i] = arr[j];
//         arr[j] = temp;
        
//         return new String(arr);
//     }
    
//     public String transform(String s){
//         for(int i=0; i+1<s.length(); i++){
//             if(s.charAt(i) == '0' && s.charAt(i+1) == '1'){
//                 s = swap(s, i, i+1);

//                 i++;
//             }
//         }
//         return s;
//     }
//     public int secondsToRemoveOccurrences(String s){
//         int sec = 0;
//         while(true){
//             String t = transform(s);
//             if(s == t) break;
//             sec++;
//             s=t;
//         }
//         return sec;
    // }
    //////////////////////////------------------------------------------------
    
    
    // best solution ever :)
   public int secondsToRemoveOccurrences(String s){
       int ans = 0;
       while(s.contains("01")){
           s = s.replace("01", "10");
           ans += 1;
       }
       return ans;
    }
}
