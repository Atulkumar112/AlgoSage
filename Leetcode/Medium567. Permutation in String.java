class Solution {

    // below is my code but only 97/107 test cases passed reamins given error..
    // public boolean checkInclusion(String s1, String s2) {
    //     int st = 0;
    //     int end = s1.length();
    //     int[] arr = new int[26];

    //     if(s1.length()>s2.length()) return false;
        
    //     for(int i=0; i<end; i++){
    //         arr[s1.charAt(i)-'a']++;
    //     }
    //     int n= s2.length();
    //     while(end<n){
    //         String str = s2.substring(st, end);
    //         for(int i=st; i<end; i++){
    //             arr[s2.charAt(i)-'a']--;
    //         }
    //         if(checkZero(arr)){
    //             return true;
    //         }
    //         else{
    //             for(int i=st; i<end; i++){
    //                 arr[s2.charAt(i)-'a']++;
    //             }
    //         }
    //         st++;
    //         end++;
    //     }

    //     return false;
    // }



    public boolean checkInclusion(String s1, String s2) {
        int l1 = s1.length(), l2=s2.length();
        if(l1>l2) return false;
        int[] arr = new int[26];
        
        for(int i=0; i<l1; i++){
            arr[s1.charAt(i)-'a']++;
        }

        for(int i=0; i<l2; i++){
            arr[s2.charAt(i)-'a']--;
            if(i-l1>=0){
                arr[s2.charAt(i-l1)-'a']++;
            }
            if(checkZero(arr)) return true;
        }
        return false;
    }

    public boolean checkZero(int[] arr){
        for(int i=0; i<26; i++){
            if(arr[i]!=0){
                return false;
            }
            
        }
        return true;
    }
}



