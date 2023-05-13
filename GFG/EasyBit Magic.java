
class Solution {
    public static int bitMagic(int n, int[] arr) {
        int count=0;
        for(int i=0; i<n/2; i++){
            if(arr[i]!=arr[n-1-i]){
                count++;
            }
        }
        
        return (count%2==0) ? count/2 : count/2+1;
    }
}
