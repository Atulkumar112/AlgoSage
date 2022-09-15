class Solution { 

    int minSubset(int[] a,int N) { 

        long sum=0;

        for(int i=0;i<N;i++){

            sum+=a[i];

        }

        Arrays.sort(a);

        long t=0;

        int ans=0;

        for(int i=N-1;i>=0;i--){

            t+=a[i];

            sum-=a[i];

            ans+=1;

            if(sum<t) return ans; 

        }

        return ans;

    }

}
