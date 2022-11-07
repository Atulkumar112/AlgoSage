class Solution {
    public int maximum69Number (int nums) {
        //code done by  my self
        String temp = Integer.toString(nums);
		int max = nums;
		int[] arr = new int[temp.length()];
		for(int i=0; i<temp.length(); i++) {
			arr[i] = temp.charAt(i)-'0';
		}
		
		//[9, 6, 6, 9]
		for(int i=0; i<arr.length; i++) {
			if(arr[i]==6) {
				arr[i] = 9;
				int res = 0;
				for(int j=0; j<arr.length; j++) {
					res = res*10+arr[j];
				}
				max = Math.max(max, res);
				break;
			}
		}
		
		return max;
    }
}
