// this question comes in a easy category but it is littel bit hard to build the logic
class Solution
{
    public long NoOfChicks(int n)
    {
        long chick = 1;
        long[] chickarr = new long[n];
        chickarr[0]=1;
        
        for(int day=1; day<n; day++){
            if(day>=6){
                chick -= chickarr[day-6];
            }
            chickarr[day]=chick*2;
            chick+=chickarr[day];
        }
        
        return chick;
    }
}
