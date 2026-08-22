class Solution {
    public boolean checkDivisibility(int n) {

        int val = value(n);

        if(n % val == 0) 
            return true;
        
        return false;
        
    }

    private static int value(int n){
        int sum = 0 , mulfac = 1;
        while(n>0){
            int digit = n % 10;
            sum += digit;
            mulfac *= digit;
            n /= 10;
        }

        return sum+mulfac;
    }
}