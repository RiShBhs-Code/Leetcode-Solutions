
        System.out.println(Arrays.toString(arr));

        int min = Integer.MAX_VALUE;
        int ans = Integer.MAX_VALUE;

        for(int j = n - 1 ; j >= 0 ; j--){
            min = Math.min(min , nums[j]);
            int temp = arr[j] - min ;
            if(temp <= ans){
                ans = temp;
            }
        }
        return ans;   
