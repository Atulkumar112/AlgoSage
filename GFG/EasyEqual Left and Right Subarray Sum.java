//TC:- O(N)
class Solution{
	int equalSum(int [] arr, int N) {
	    int postfix=0;
		for(int i=0; i<N; i++){
	        postfix+=arr[i];
	    }
	    
	    int prefix=0;
	    for(int i=0; i<N; i++){
	        postfix-=arr[i];
	        if(postfix==prefix) return i+1;
	        else prefix+=arr[i];
	    }
	
	    return -1;
	}
}



// Brute Force Approach. TC:- O(N^2)
// class Solution{
// 	int equalSum(int [] arr, int N) {
// 		if(N==1) return 1;
// 		for(int i=1; i<N; i++){
// 		    int leftSum=0, rightSum=0;
// 		    for(int j=0; j<i; j++){
// 		        leftSum+=arr[j];
// 		    }
// 		    for(int k=i+1; k<N; k++){
// 		        rightSum+=arr[k];
// 		    }
// 		    if(leftSum==rightSum){
// 		        return i+1;
// 		    }
// 		}
		
// 		return -1;
// 	}
// }
