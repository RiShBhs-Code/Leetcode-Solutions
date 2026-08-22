# Check Divisibility by Digit Sum and Product

![Difficulty](https://img.shields.io/badge/Difficulty-Easy-green)

## Problem

You are given a positive integer n. Determine whether n is divisible by the sum of the following two values:


	
	The digit sum of n (the sum of its digits).
	
	
	The digit product of n (the product of its digits).
	


Return true if n is divisible by this sum; otherwise, return false.

 
Example 1:


Input: n = 99

Output: true

Explanation:

Since 99 is divisible by the sum (9 + 9 = 18) plus product (9 * 9 = 81) of its digits (total 99), the output is true.


Example 2:


Input: n = 23

Output: false

Explanation:

Since 23 is not divisible by the sum (2 + 3 = 5) plus product (2 * 3 = 6) of its digits (total 11), the output is false.


 
Constraints:


	1 <= n <= 106

## Solution

**Language:** Java  
**Runtime:** 1 ms (beats 25.54%)  
**Memory:** 42.7 MB (beats 9.96%)  
**Submitted:** 2026-08-22T12:40:36.390Z  

```java
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
```

---

[View on LeetCode](https://leetcode.com/problems/check-divisibility-by-digit-sum-and-product/)