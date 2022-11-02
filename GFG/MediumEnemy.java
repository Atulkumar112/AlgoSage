  

class Solution {
    public static int largestArea(int n,int m,int k,int[][] en) {
       List<Integer> row = new ArrayList<>();
        List<Integer> col = new ArrayList<>();
        
        row.add(-1);
         for(int[] i: en){
             row.add(i[0]-1);
         }
         row.add(n);
         Collections.sort(row);
         
         int maxRow =0;
         for(int i=1; i<row.size(); i++){
             int prev = row.get(i-1);
             int curr = row.get(i);
             maxRow = Math.max(maxRow, curr-prev-1);
         }
         
         col.add(-1);
         for(int[] i: en){
             col.add(i[1]-1);
         }
         col.add(m);
         Collections.sort(col);
         
         int maxcol =0;
         for(int i=1; i<col.size(); i++){
             int prev = col.get(i-1);
             int curr = col.get(i);
             maxcol = Math.max(maxcol, curr-prev-1);
         }
         return maxRow * maxcol;
    }
}


