class Solution {
    public int minimumDeviation(int[] nums) {
        TreeSet<Integer> set = new TreeSet<>();
        for(int i: nums){
            if(i%2==1){
                set.add(i*2);
            }
            else{
                set.add(i);
            }
        }

        int deviation = Integer.MAX_VALUE;
        while(true){
            int max = set.last();
            int min = set.first();
            deviation = Math.min(deviation, max-min);
            
            if(max%2==1){
                break;
            }
            else{
                set.remove(max);
                set.add(max/2);    
            }
        }

        return deviation;
    }
}
