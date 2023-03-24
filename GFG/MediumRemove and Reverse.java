//using two pointer approach
class Solution { 
    String removeReverse(String s){ 
        int[] arr = new int[26];
        int n = s.length();
        for(int i=0; i<n; i++){
            arr[s.charAt(i)-'a']++;
        }
        
        StringBuffer sb = new StringBuffer(s);
        int flag=0;
        int st=0; int end=sb.length()-1;
        while(st<=end){
            if(flag==0){
                if(arr[sb.charAt(st)-'a']<=1){
                    st++;
                }
                else{
                    arr[sb.charAt(st)-'a']--;
                    sb.replace(st, st+1, "#");
                    st++;
                    flag=1;
                }
            }
            else{
                if(arr[sb.charAt(end)-'a']<=1){
                    end--;
                }
                else{
                    arr[sb.charAt(end)-'a']--;
                    sb.replace(end, end+1, "#");
                    end--;
                    flag=0;
                }
            }
        }
        if(flag==1){
            sb.reverse();
        }
        
        String ans = "";
        for(int i=0; i<sb.length(); i++){
            if(sb.charAt(i)!='#'){
                ans+=sb.charAt(i);
            }
        }
        return ans;
        
    }
}

//--------------------------------------------------------------------------------
// 1110/1115 test cases passed then TLE occure becuse my soluiton is n^2 and constrians
// are 10^5 + 10^5 = 10^10 > 10^8 
// class Solution { 
//     String removeReverse(String s){ 
//         int[] arr = new int[26];
//         int n = s.length();
//         for(int i=0; i<n; i++){
//             arr[s.charAt(i)-'a']++;
//         }
        
//         StringBuffer sb = new StringBuffer(s);
//         int flag=1;
//         while(flag==1){
//             int k=0;
//             for(k=0; k<26; k++){
//                 if(arr[k]>1)
//                 break;
//             }
//             if(k==26) flag=0;
            
//             int idx=-1;
//             for(int i=0; i<sb.length(); i++){
//                 if(sb.charAt(i)!='#' && arr[sb.charAt(i)-'a']>1){
//                     idx=i;
//                     arr[sb.charAt(i)-'a']--;
//                     break;
//                 }
//             }
//             if(idx==-1)
//             break;
            
//             sb.replace(idx, idx+1, "#");
//             sb.reverse();
            
//         }

//         String ans = "";
//         for(int i=0; i<sb.length(); i++){
//             if(sb.charAt(i)!='#'){
//                 ans+=sb.charAt(i);
//             }
//         }
//         return ans;
//     }
    
// }

//below code is written by me. IDK where is the mistake in my code.
//----------------------------------- only 10 test case passed --------
// class Solution { 
//     String removeReverse(String s){ 
//         int[] arr = new int[26];
//         int n = s.length();
//         for(int i=0; i<n; i++){
//             arr[s.charAt(i)-'a']++;
//         }
//         StringBuilder sb = new StringBuilder(s);
//         for(int i=0; i<sb.length(); i++){
//             if(arr[sb.charAt(i)-'a']>1){
//               arr[sb.charAt(i)-'a']--;
//               sb.deleteCharAt(i);
//               sb.reverse();
//               i--;
//             }
//         }
//         return sb.toString();
//     }
// } 
