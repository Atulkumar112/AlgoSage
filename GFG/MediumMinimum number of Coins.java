class Solution{
    static List<Integer> minPartition(int n)
    {
        // code here
        //below code writen by me, within 8 minutes :) 
        List<Integer> list = new ArrayList<>();
		int[] coin = {2000, 500, 200, 100, 50, 20, 10, 5, 2, 1};
		int i =0;
		while(n>0) {
			if(n>=coin[i]) {
				list.add(coin[i]);
				n -= coin[i];
			}
			else {
				i++;
			}
			
		}
		return list;
        
    }
}
