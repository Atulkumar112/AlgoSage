class Solution {
    public boolean isMonotonic(int[] arr) {
        int n = arr.length;
        if(n==1) return true;
        boolean b=false;
        for(int i=0; i<n-1; i++){
            if(arr[i] != arr[i+1]){
                if(arr[i]<arr[i+1]){
                    b=true;
                }
                else{
                    b=false;
                }
                break;
            }
        }
        boolean ans=false;
        if(b){
            for(int i=0; i<n-1; i++){
                if(arr[i]>arr[i+1]){
                    return false;
                }
            }
        }
        else{
            for(int i=0; i<n-1; i++){
                if(arr[i]<arr[i+1]){
                    return false;
                }

            }
        }

        return true;
        
    }
}
