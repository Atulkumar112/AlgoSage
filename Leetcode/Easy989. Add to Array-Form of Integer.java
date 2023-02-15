class Solution {
    public List<Integer> addToArrayForm(int[] A, int K) {
        List<Integer> res = new LinkedList<>();
        for (int i = A.length - 1; i >= 0; --i) {
            res.add(0, (A[i] + K) % 10);
            K = (A[i] + K) / 10;
        }
        while (K > 0) {
            res.add(0, K % 10);
            K /= 10;
        }
        return res;
    }

    // 99/150 test case passed  form my code 
    // public List<Integer> addToArrayForm(int[] num, int k) {
    //     String s = "";
        
    //     for(int i=0; i<num.length; i++){
    //         s+=num[i];
    //     }
        
    //     // long a = Integer.parseInt(s);
    //     long a = Long.parseLong(s);
    //     long add = a+k;
    //     String finalStr = Long.toString(add);

    //     List<Integer> list = new ArrayList<>();
    //     for(int i=0; i<finalStr.length(); i++){
    //         list.add(finalStr.charAt(i)-'0');
    //     }

    //     return list;

    // }
}
