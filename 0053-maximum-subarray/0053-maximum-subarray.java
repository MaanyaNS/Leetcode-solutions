class Solution {
    public int maxSubArray(int[] nums) {
       int cur_sums=nums[0],max_sums=nums[0] ;
       for(int i=1;i<nums.length;i++){
        cur_sums=Math.max(nums[i],nums[i]+cur_sums);
        max_sums=Math.max(cur_sums,max_sums);
       }
       return max_sums;
    }
}