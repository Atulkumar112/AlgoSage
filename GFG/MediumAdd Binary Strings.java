class Solution {
    String addBinary(String s1, String s2) {
        
        
        // below solution is good but can be usefull because it contain 64bit only
        // int a = Integer.parseInt(s1, 2);
        // int b = Integer.parseInt(s2, 2); // converting from binary String to integer with
        // // the help of base 2
        // int c = a+b;
        // return Integer.toBinaryString(c);   // converting from integer to binary string
        
        //---------------------TRUST ME THIS IS VERY EASY SOLUTION JUST READ AT ONCE
        int i=s1.length()-1;
        int j=s2.length()-1;
        int carry=0;
        StringBuilder sb = new StringBuilder();
        while(i>=0 || j>=0){
            int a = i>=0?s1.charAt(i)-'0':0;
            int b = j>=0?s2.charAt(j)-'0':0;
            int total=a+b+carry;
            //case first
            if(total==0){
                carry=0;
                sb.append('0');
            }
            //case second 
            else if(total==1){
                carry=0;
                sb.append('1');
            }
            //case third
            else if(total==2){
                carry=1;
                sb.append('0');
            }
            //case fourth if(total==3)
            else {
                carry=1;
                sb.append('1');
            }
            i--;
            j--;
        }
        
        if(carry==1){
            sb.append('1');
        }
        
        while(sb.charAt(sb.length()-1)=='0'){   // this loop is for removing the zero which is 
        // apper at the string like 000111 so remove first 3 zeros to make the answer
            sb.setLength(sb.length()-1);
        }
     
        return sb.reverse().toString();
    }
}
