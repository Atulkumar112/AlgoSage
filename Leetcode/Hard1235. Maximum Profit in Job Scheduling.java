class Solution {
    public int jobScheduling(int[] startTime, int[] endTime, int[] profit) {
        int n=startTime.length;
        int[][] jobs = new int[n][3];
        for(int i=0; i<n; i++){
            jobs[i] = new int[] {startTime[i], endTime[i], profit[i]};
        }
        
        Arrays.sort(jobs, (a,b) -> a[1]-b[1]);   // this is a comparator 
        
        TreeMap<Integer, Integer> dp = new TreeMap<>();    // using a treemap cause it will sorted a key automatically 
        dp.put(0, 0);
        
        for(int[] job: jobs){
            int val = job[2] + dp.floorEntry(job[0]).getValue();
            if(val>dp.lastEntry().getValue()){
                dp.put(job[1], val);
            }
        }

        return dp.lastEntry().getValue();       // returning the last value (means max key)
    }
}
