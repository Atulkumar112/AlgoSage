
class Solution {
    public static long solve(int N, int[] A, int[] B) {
        long sum=0, ans=0;
        List<Integer> a = new ArrayList<>();
        List<Integer> b = new ArrayList<>();
        List<Integer> c = new ArrayList<>();
        List<Integer> d = new ArrayList<>();
        
        Arrays.sort(A);
        Arrays.sort(B);
        for(int i=0; i<N; i++){
            sum+=(A[i]-B[i]);
            if(A[i]%2 != 0){
                a.add(A[i]);
            }
            else{
                b.add(A[i]);
            }
            if(B[i]%2 != 0){
                c.add(B[i]);
            }
            else{
                d.add(B[i]);
            }
        }
        
        if(sum!=0 || a.size() != c.size())  return -1;
        
        for(int i=0; i<a.size(); i++){
            ans+=Math.abs((a.get(i)-c.get(i))/2);
        }
        
        for(int i=0; i<b.size(); i++){
            ans+=Math.abs((b.get(i)-d.get(i))/2);
        }
        
        return ans/2;
    }
}
        
