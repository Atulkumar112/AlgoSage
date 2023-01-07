class Solution {
    public int canCompleteCircuit(int[] gas, int[] cost) {
        int curr=0, start=0;
        int totalCost = 0, totalGas=0;
        for(int i=0; i<gas.length; i++){
            totalCost+=cost[i];
            totalGas+=gas[i];
        }

        if(totalGas<totalCost){
            return -1;
        }

        for(int i=0; i<gas.length; i++){
            curr += gas[i]-cost[i];
            if(curr < 0){
                curr=0;
                start = i+1;
            }
        }
        return start;
    }
}
