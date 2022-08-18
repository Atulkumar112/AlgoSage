class Solution {
    public int minSetSize(int[] arr) {
        ArrayList<Integer> count = new ArrayList<>();
        Arrays.sort(arr);
        int c = 1;
        for(int i=1; i<arr.length; i++){
            if(arr[i] == arr[i-1]){
                c++;
            }
            else{
                count.add(c);
                c=1;
            }
        }
        count.add(c);
        Collections.sort(count);
        int n = arr.length/2, ans = 0;
        for(int i=count.size()-1; n>0&&i>=0; i--){
            ans++;
            n-=count.get(i);
        }
        return ans;
    }
}
