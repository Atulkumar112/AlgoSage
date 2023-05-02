
class Solution{
	int maxSweetness(int [] sweetness, int N, int k) {
	    int sum=0;
	    int min=Integer.MAX_VALUE;
	    int ans=0;
	    for(int i=0; i<N; i++){
	        sum+=sweetness[i];
	        min = Math.min(sweetness[i], min);
	    }
	    
	    int l=min, h=sum;
	    while(l<=h){
	        int mid = (l+h)/2;
	        if(helper(sweetness, mid, k)){
	            ans = mid;
	            l = mid+1;
	        }
	        else{
	            h = mid-1;
	        }
	    }
	    
	    return ans;
	}
	
	boolean helper(int[] arr, int mid, int k){
	    int sum=0, count=0;
	    for(int i=0; i<arr.length; i++){
	        sum+=arr[i];
	        if(sum>=mid){
	            sum=0;
	            count++;
	        }
	    }
	    
	    return count>=k+1;
	}
}
