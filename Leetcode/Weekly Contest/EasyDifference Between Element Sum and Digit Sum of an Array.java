class Solution {
    public int differenceOfSum(int[] nums) {
        int x=0, y=0;
        int n=nums.length;
        for(int i=0; i<n; i++){
            x+=nums[i];
        }
        String[] arr = new String[n];
        for(int i=0; i<n; i++){
            arr[i]= String.valueOf(nums[i]);
        }
        
        for(int i=0; i<n; i++){
            for(int j=0; j<arr[i].length(); j++){
                y+=(arr[i].charAt(j))-'0';
            }
        }
        
        return Math.abs(x-y);
    }
}
