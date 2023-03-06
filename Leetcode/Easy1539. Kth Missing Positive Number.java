class Solution {
    // below code is written by me and TC:- O(N)
    // public int findKthPositive(int[] arr, int k) {
    //     List<Integer> arrList = new ArrayList<>();
    //     for(int i: arr){
    //         arrList.add(i);
    //     }
    //     List<Integer> misingEleList = new ArrayList<>();
    //     int lastEle = arr[arr.length-1];
    //     lastEle+=k+1;
    //     for(int i=1; i<=lastEle; i++){
    //         if(!arrList.contains(i)){
    //             misingEleList.add(i);
    //         }
    //     }
    //     System.out.println(misingEleList);
        
    //     return misingEleList.get(k-1);
    // }

    //--
    // TC:- O(logn)  solved using binary search
    public int findKthPositive(int[] A, int k) {
        int l = 0, r = A.length, m;
        while (l < r) {
            m = (l + r) / 2;
            if (A[m] - 1 - m < k)
                l = m + 1;
            else
                r = m;
        }
        return l + k;
    }
}
