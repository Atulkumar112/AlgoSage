
class Solution {
    long wineSelling(int arr[],int n){
        long ans =0;
		 int neg=0, pos=0;
		 while(true) {
			 
			 while(arr[pos]<=0 && pos<n) {
				 pos++;
				 if(pos==n) return ans;
			 }
			 
			 while(arr[neg]>=0 && neg<n) {
				 neg++;
				 if(neg==n) return ans;
			 }
			 
			 if(pos==n || neg == n) {
				  break;
			 }
			 		 
			 
			 int min = Math.min(arr[pos], -arr[neg]);
			 
			 arr[pos]-=min;
			 arr[neg]+=min;
			 
			 ans += min*Math.abs(pos-neg);
			 
		 }
		 
		 return ans;

    }
}
