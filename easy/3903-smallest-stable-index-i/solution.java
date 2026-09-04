        for(int j = n - 1 ; j >= 0 ; j--){
            min = Math.min(min , nums[j]);
            int temp = arr[j] - min ;
            if(temp < x){
                x = temp;
            }
        }

        int x = Integer.MAX_VALUE;
        int min = Integer.MAX_VALUE;
        int ans = -1;
                ans = j;

        System.out.println(Arrays.toString(arr));
