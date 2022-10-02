class Solution {
    public static int minChar(String str) {
       //Write your code here
       int i=0, j=str.length()-1, trim = j, res=0;
       
       while(i<j){
           if(str.charAt(i)==str.charAt(j)){
               i++;
               j--;
           }
           else{
               res++;
               i=0;
               j=--trim;
           }
       }
       return res;
    }
}
