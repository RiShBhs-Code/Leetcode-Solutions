class Solution {
    public int totalNumbers(int[] digits) {

        int even = 0 ;
        int zero = 0 ;

        for(int num : digits) {
            if(num == 0 ){
                zero++;
            }
            if(num % 2  == 0 ) {
                even++;
            }  
