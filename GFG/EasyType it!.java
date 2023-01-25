// User function Template for Java
class Solution {

    int minOperation(String s) {

      if(s.length()==1)return 1;

      int max=Integer.MIN_VALUE;

      String temp=s.charAt(0)+"";

      for(int i=1;i<s.length();i++){

         int k=i;

         int index=i;

         for(int j=0;j<temp.length();j++){

             if(k<s.length() && temp.charAt(j)==s.charAt(k)){

                k++;

                continue;

             }

             else{

                break;

             }

         }

         max=Math.max(max,k-i);

          if(k-i==temp.length()){

             temp+=s.substring(i,k);

             i=k-1;

         }

         else{

             temp+=s.charAt(i);

          }

     }

      return s.length()-max+1;

    }

}
