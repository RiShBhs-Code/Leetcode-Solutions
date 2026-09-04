        int x = Integer.MAX_VALUE;
        int ans = -1;

        for(int j = n - 1 ; j >= 0 ; j--){
            min = Math.min(min , nums[j]);
            int temp = arr[j] - min ;
            if(temp <= k){
                x = temp;
                ans = j;
            }
        }
        return ans;   
    }
}
