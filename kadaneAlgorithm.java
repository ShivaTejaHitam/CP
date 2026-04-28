class Solution {
    public int maxSubArray(int[] nums) {
        int length = nums.length;
        if(length == 1) return nums[0];

        int localMax = 0;
        int globalMax = Integer.MIN_VALUE;

        for(int i = 0 ; i < length ; i++){
            localMax = Math.max(localMax+nums[i],nums[i]);
            globalMax = Math.max(localMax,globalMax);
        }

        return globalMax;
    }
}
