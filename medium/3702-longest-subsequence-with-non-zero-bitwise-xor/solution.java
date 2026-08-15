class Solution {
    public int longestSubsequence(int[] nums) {

        int total = 0 ;
        boolean nonZero = false;


        for(int x : nums) {
            nonZero |= x > 0 ;
            total ^= x;
        }

        if(!nonZero) return 0;
        return total == 0 ? nums.length-1 : nums.length ;
        
    }
}