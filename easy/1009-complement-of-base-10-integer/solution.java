class Solution {
    public int bitwiseComplement(int n) {

        int ans = 0 ;
        int deg = 0 ;

        if(n == 0 )
            return 1 ;

        while(n > 0) {
            int rem = n % 2 ;
            if(rem == 0){
                ans += Math.pow(2 , deg);
            }
            n /= 2 ;
            deg++;
        }

        return ans;
        
    }
}