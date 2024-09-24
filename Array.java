/* Arrays are the collections of similar data types in a contiguous memory location */

// Leetcode Question - Build array for permutation : https://leetcode.com/problems/build-array-from-permutation/description/

class Solution {
    public int[] buildArray(int[] nums) {
        int ans[] = new int [nums.length];
        for(int i = 0; i<nums.length; i++)
        {
            ans[i] = nums[nums[i]];
        }
    return ans;}
}

// Concatenation of array : https://leetcode.com/problems/concatenation-of-array/description/

class Solution {
    public int[] getConcatenation(int[] nums) {
       int n = nums.length;
       int[] ans = new int[2*n];  
       for(int i = 0; i<n; i++)
       {
         ans[i] = nums[i];
         ans[i + n] = nums[i];
       } 
    return ans;}
}

// Running Sum of 1D array : https://leetcode.com/problems/running-sum-of-1d-array/description/

class Solution {
    public int[] runningSum(int[] nums) {
        int[] sum = new int [nums.length]; int sums = 0;
        for(int i = 0; i < nums.length; i++){
        sums = sums + nums[i];
        sum[i] = sums;
        
        }
    return sum;}
}

// Richest customer wealth : https://leetcode.com/problems/richest-customer-wealth/description/

class Solution {
    public int maximumWealth(int[][] accounts) {int max = 0;
        for(int i = 0; i < accounts.length; i++)
        { int sum = 0; 
            for(int j = 0; j < accounts[0].length; j++)
            {
             sum +=  accounts[i][j];
            }
            if(max < sum){max = sum;}
        }
    return max;}
}

