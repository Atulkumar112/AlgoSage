class Solution {
    public int addDigits(int num) {
        //O(n) solution done by me within 4 min
        // String s = Integer.toString(num);
        // while(s.length() > 1){
        //     int sum = 0;
        //     for(int i=0; i<s.length(); i++){
        //         sum+=s.charAt(i)-'0';
        //     }
        //     s = Integer.toString(sum);
        // }
        // return Integer.parseInt(s);

        //O(1) solution
        if ( num == 0 ) return 0;
	    return num%9 == 0 ? 9 : num%9 ;
    }
}

