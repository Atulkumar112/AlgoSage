class Solution {
    public int maximumBags(int[] capacity, int[] rocks, int additionalRocks) {
        // no needed for below base cases.. :)
        // int capSum=0;
        // int rockSum=0,  n=rocks.length;

        // for(int i=0; i<n; i++){
        //     capSum+=capacity[i];
        //     rockSum+=rocks[i];
        // }

        // int diff = capSum-rockSum;
        // if(diff == 0 || additionalRocks >= diff){
        //     return n;
        // }

        int n = capacity.length;
        int[] remain = new int[n];

        for(int i=0; i<n; i++){
            remain[i]=capacity[i]-rocks[i];
        }
        Arrays.sort(remain);

        int ans=0;
        while(additionalRocks>0 && ans<capacity.length){
            additionalRocks-=remain[ans];
            ans++;
        }

        return additionalRocks<0 ? ans-1 : ans;
    }
}
