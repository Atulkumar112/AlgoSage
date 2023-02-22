class Solution {
    //TC:- O(NlogN) & SC:- O(1)
    // below code is written by me just see the approach from ayushi sharma
    public int shipWithinDays(int[] wt, int days) {
        int low=0; int high=0;
        for(int w: wt){
            low = Math.max(low, w);
            high+=w;
        }

        int result=0;
        
        while(low<=high){
            int mid = low+(high-low)/2;
            if(isPosible(mid, days, wt)){
                result=mid;
                high=mid-1;
            }
            else{
                low=mid+1;
            }
        }

        return result;
    }

    public boolean isPosible(int mid, int days, int[] wt){
        int c=1;
        int sum=0;
        for(int i=0; i<wt.length; i++){
            sum+=wt[i];
            if(sum>mid){
                c++;
                sum=wt[i];
            }
        }

        if(c<=days){
            return true;
        }
        return false;
    }


    //-----we can write it like that but both have same TC & SC
    //  public int shipWithinDays(int[] weights, int D) {
    //     int left = 0, right = 0;
    //     for (int w: weights) {
    //         left = Math.max(left, w);
    //         right+=w;
    //     }
    //     while (left < right) {
    //         int mid = (left + right) / 2, need = 1, cur = 0;
    //         for (int w: weights) {
    //             if (cur + w > mid) {
    //                 need += 1;
    //                 cur = 0;
    //             }
    //             cur += w;
    //         }
    //         if (need > D) left = mid + 1;
    //         else right = mid;
    //     }
    //     return left;
    // }
}
