class Solution {
    public long minimumTime(int[] time, int totalTrips) {
        long left=0;
        long right = 100000000000000L;
        long ans=right;
        //
        while(left<right){
            long count=0;
            long mid = (left+right)/2;
            for(int i=0; i<time.length; i++){
                count+=(mid/time[i]);
            }

            if(count>=totalTrips){
                ans=Math.min(ans, mid);
                right=mid;
            }
            else{
                left=mid+1;
            }
        }

        return ans;
    }
}
