class Solution {
    public int earliestFullBloom(int[] plantTime, int[] growTime) {
        int a[]=new int[100001];
        int n=plantTime.length;
        for(int i=0;i<n;i++)
            a[growTime[i]]+=plantTime[i];
        
        int time=0;
        int ans=0;
        for(int i=100000;i>=1;i--)
        {
            if(a[i]!=0)
            {
                time+=a[i];
                ans=Math.max(ans,time+i);
            }   
        }
        return ans;   
    }
}
