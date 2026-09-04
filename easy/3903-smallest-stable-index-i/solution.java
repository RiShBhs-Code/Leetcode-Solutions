class Solution {
    public int firstStableIndex(int[] nums, int k) {

        int n = nums.length;
        int[] arr = new int[n];
        arr[0] = nums[0];

        for(int i = 1 ; i < n ; i++){
            if(nums[i] >= arr[i-1]){
                arr[i] = nums[i];
            } else {
                arr[i] = arr[i-1];
            }
        }

        int min = Integer.MAX_VALUE;
        int x = Integer.MAX_VALUE;
        int ans = -1;

        for(int j = n - 1 ; j >= 0 ; j--){
            min = Math.min(min , nums[j]);
            int temp = arr[j] - min ;
            if(temp <= k){
                x = temp;
                ans = j;
            }
        }
        return ans;   
    }
}