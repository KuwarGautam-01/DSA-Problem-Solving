class Solution {
    public int maxSubArray(int[] nums) {

        // Kadanes's Agorithm (But fails in case of ALL -ve Numbers)

        // int ms = Integer.MIN_VALUE;
        // int cs = 0;

        // for (int i = 0; i < nums.length; i++) {
        //     cs = cs + nums[i];
        //     if (cs < 0) {
        //         cs = 0;
        //     }
        //     ms = Math.max(cs, ms);
        // }

        // return ms;


        //Optimized Kadane's Algorithm :

        int cs = nums[0];  // current sum starts with first element
        int ms = nums[0];  // max sum starts with first element

        for (int i = 1; i < nums.length; i++) {
            cs = Math.max(nums[i], cs + nums[i]);  // either start new subarray or extend
            ms = Math.max(ms, cs);                 // update max sum
        }

        return ms;
    }
}
