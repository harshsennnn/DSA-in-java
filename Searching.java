/* 704. Binary Search : https://leetcode.com/problems/binary-search/description/*/

class Solution {
    public int search(int[] nums, int target) {
    int s = 0; int e = nums.length -1;
    while(s<=e)
    {
        int mid = s+(e-s);
        if(nums[mid]>target){e = mid - 1;}
        else if(nums[mid]<target){s=mid+1;}
        else{return mid;}
    }    
    return -1;}
}