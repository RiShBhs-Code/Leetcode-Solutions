        int odd = 0 ;
        for(int num : nums1) {
            if(num % 2 == 0)
                even++;
        }
            else 
                odd++;

        if ( even > odd)
            return false;
        int even = 0 ;
        
        return true;
