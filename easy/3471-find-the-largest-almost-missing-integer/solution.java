class Solution {
    public int largestInteger(int[] nums, int k) {

        int[] arr = new int[51];

        int maxx = Integer.MIN_VALUE;
        if(k == nums.length ) {
            for(int num : nums) {
                maxx = Math.max(maxx , num);
            }
            return maxx;
            
        }

        for(int a : nums) {
            arr[a]++;
        }

        if(arr[nums[0]] > 1 && arr[nums[nums.length -1]] > 1){
            return -1;
        } else if (arr[nums[0]] == 1 && arr[nums[nums.length -1]] == 1) {
            int max = Math.max(nums[0] , nums[nums.length -1 ]);
            return max;
        } else {
            if(arr[nums[0]] == 1) {
                return nums[0];
            } else {
                return nums[nums.length -1 ];
            }
        }
        
    }
}