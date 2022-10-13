class Solution
{ 
    public static int findSum(int A[],int N) 
    {
        Arrays.sort(A);
        return A[0]+A[N-1];
    }
}
