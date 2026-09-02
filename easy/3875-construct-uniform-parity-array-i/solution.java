class Solution {
    public boolean uniformArray(int[] nums1) {
        int even = 0 ;
        int odd = 0 ;
        for(int num : nums1) {
            if(num % 2 == 0)
                even++;
            else 
                odd++;
        }

        if ( even > odd && even > 0 && odd > 0)
            return false;
        
        return true;
    }
}