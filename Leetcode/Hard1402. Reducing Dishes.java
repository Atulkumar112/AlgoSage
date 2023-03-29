class Solution {
    public int maxSatisfaction(int[] satisfaction) {
        int n = satisfaction.length;
        Arrays.sort(satisfaction);
        int total=0;
        int start=n-1;
        for(int i=n-1; i>=0; i--){
            total+=satisfaction[i];
            if(total<0){
                break;
            }
            start--;
        }

        start++;
        int k=1;
        total=0;
        for(int i=start; i<n; i++){
            total+=(k++)*(satisfaction[i]);
        }

        return total;
    }
}
