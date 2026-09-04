
        int min = Integer.MAX_VALUE;
        int ans = -1;

        for(int j = n - 1 ; j >= 0 ; j--){
            min = Math.min(min , nums[j]);
            int temp = arr[j] - min ;

        System.out.println(arr);
            if(temp <= ans){
                ans = temp;
            }
        }
        return ans;   
