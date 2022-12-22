
class Solution{
    //Function to count subarrays with sum equal to 0.
    public static long findSubarray(long[] arr ,int n) 
    {
        Map<Long, Long> hm = new HashMap<>();
        long ans=0;
        long sum=0;
        hm.put(0L, 1L);
        
        for(long i: arr){
            sum+=i;
            if(hm.containsKey(sum)){
                ans+=hm.get(sum);
            }
            
            hm.put(sum, hm.getOrDefault(sum,0L)+1);
        }
        
        return ans;
        
        
        // Second solution but i am not able to remove the error from the my bellow written code 
    //     public static long findSubArray(long[] arr ,int n) 
	   // {
	   //     long prefixSum = 0;
	   //     Map<Long, Long> hm = new HashMap<>();
	   //     for(int i=0; i<n; i++){
	   //         prefixSum += arr[i];
	   //         hm.put(prefixSum, hm.getOrDefault(prefixSum, 0L)+1);
	   //     }
	   //     long[] val = new long[n];
	   //     int j=0;
	   //     long q = 2;
	   //     for(Map.Entry h: hm.entrySet()){
	   //         val[j]=nCr((long) h.getValue(), q);
	   //     }
	        
	        
	   //     long ans=0;
	   //     for(int i=0; i<n; i++){
	   //         ans += val[i];
	   //     }
	        
	        
	        
	   //     return ans;
	   // }
	    
	   // public static long nCr(long a, long b){
	   //     long cofi = fact(a)/(fact(b)*fact(a-b));
	   //     return cofi;
	   // }
	    
	   // public static long fact(long f){
	   //     long res=0;
	   //     if(f==0){
	   //         return 1;
	   //     }
	        
	   //     for(long i=f; i>0; i--){
	   //         res *= i;
	   //     }
	   //     return res;
	   // }
    }
}
