class Solution {
    public double average(int[] salary) {
        // i don't know why it is not working 
        // Arrays.sort(salary);
        // int n = salary.length;
        // int sum=0;
        // for(int i=0; i<n; i++){
        //     sum+=salary[i];
        // }

        // sum = sum - salary[0] - salary[n-1];

        // return sum/n-2;

        //-----------------------------------
        double sum = 0;
        int min = Integer.MAX_VALUE, max = Integer.MIN_VALUE, n = salary.length;
        for (int num : salary) {
            sum += num;
            min = Math.min(min, num);
            max = Math.max(max, num);
        }
        return (sum - min - max) / (n - 2);
    }
}
