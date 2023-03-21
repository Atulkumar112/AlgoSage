
class Solution {
    public static int minimumTime(int n, int curr, int[] pos, int[] time) {
        int minTime = Integer.MAX_VALUE;
        for(int i=0; i<pos.length; i++){
            minTime = Math.min(minTime, (Math.abs(curr-pos[i]))*time[i]);
        }
        return minTime;
    }
}
