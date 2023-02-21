class Solution {

    //TC is O(logn) and SC is O(1)
    public int singleNonDuplicate(int[] A) {
        int start = 0, end = A.length-1, n = A.length;
        while(start <= end) {
            int mid = (start+end)>>1;
            if(mid+1 < n && A[mid] == A[mid+1])
            {
                // go to that portion of the array which has odd length
                if((end-mid+1) % 2 == 0) end = mid-1;
                else if((mid-start) % 2 == 0) start = mid+2;
            }
            else if(mid-1>=0 && A[mid] == A[mid-1]) {
                // go to that porition of the array which has odd length
                if((end-mid) % 2 == 0)end = mid-2;
                else if((mid-1-start) % 2 == 0) start = mid+1;
            }
            else
                return A[mid];
        }
        return -1;
    }

    //solved by myself but TC & SC is O(n) and we need to write the code which have 
    // tc is O(logn) and sc is O(1)
    // public int singleNonDuplicate(int[] nums) {
    //     Map<Integer, Integer> hm = new HashMap<>();
        
    //     for(int i=0; i<nums.length; i++){
    //         hm.put(nums[i], hm.getOrDefault(nums[i], 0)+1);
    //     }

    //     for(Map.Entry e: hm.entrySet()){
    //         if((int)e.getValue()==1){
    //             return (int) e.getKey();
    //         }
    //     }
    //     return -1;

    // }
}
