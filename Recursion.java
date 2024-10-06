/* Steps to solve a recursion problem :
   - Find a recursive formula 
   - Make a tree 
   - Use debugger to understand the flow of program */

   /* NOTE: Try to break the problem into smaller chunks  */

   // 1342. Number of Steps to Reduce a Number to Zero : https://leetcode.com/problems/number-of-steps-to-reduce-a-number-to-zero/description/

   class Solution {
    public int numberOfSteps(int num) {
      return helper(num, 0);  
    }
private int helper(int num, int steps){
    if(num == 0){return steps;}
    if(num % 2 == 0){return helper(num/2, ++steps);}
    return helper(num - 1, ++steps);
}
}
