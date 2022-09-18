class Solution {
    public int trap(int[] height) {
        int n = height.length;
        int[] left = new int[n];
        int[] right = new int[n];
        
        left[0] = height[0];
        right[n-1] = height[n-1];
        
        for(int i=1; i<n; i++){
            if(left[i-1] < height[i]){
                left[i] = height[i];
            }
            else{
                left[i]=left[i-1];
            }
        }
        System.out.println(Arrays.toString(left));        
        for(int i=n-2; i>=0; i--){
            if(right[i+1]<height[i]){
                right[i] = height[i];
            }
            else{
                right[i]=right[i+1];
            }
        }
        System.out.println(Arrays.toString(right));        
        int sum =0;
        for(int i=0; i<n; i++){
            sum += (Math.min(left[i], right[i])-height[i]);
        }
        
        return sum;
    }
}
