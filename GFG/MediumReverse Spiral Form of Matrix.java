class Solution
{
    public int[] reverseSpiral(int R, int C, int[][] a)
    {
        // code here
        int[] ans = new int[R*C];
        List<Integer> list = new ArrayList<>();
        
        int SRow=0,SCol=0,ECol=C-1,ERow=R-1;
        // int itr=0;
        while(SRow<=ERow &&SCol<=ECol)
        {
            // part 1 starting row
            for(int i=SCol;i<=ECol;i++)
            {
                list.add(a[SRow][i]);
                // ans[itr]=a[SRow][i];
            }
            SRow++;
            // itr++;
            
            // part 2 ending col
            for(int i=SRow;i<=ERow;i++)
            {
                list.add(a[i][ECol]);
                // ans[itr]=a[i][ECol];
            }
            ECol--;
            // itr++;
            
            // part 3 ending row
            if(SRow<=ERow)
            {
                for(int i=ECol;i>=SCol;i--)
               {
                list.add(a[ERow][i]);
                // ans[itr]=a[ERow][i];
               }
            }
            ERow--;
            // itr++;
            
            // part 4 starting col
            if(SCol<=ECol)
            {
                for(int i=ERow;i>=SRow;i--)
              {
                list.add(a[i][SCol]);
                // ans[itr]=a[i][SCol];
              }
            }
            
            SCol++;
            // itr++;
        }
        Collections.reverse(list);
        for(int j=0; j<list.size(); j++){
            ans[j]=list.get(j);
        }
        return ans;
    }
}
