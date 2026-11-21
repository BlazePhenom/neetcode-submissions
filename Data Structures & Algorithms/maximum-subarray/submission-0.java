class Solution {
    public int maxSubArray(int[] nums) {
        int n=nums.length;
        int endinghere=nums[0];
        int maxsum=nums[0];

        for(int i=1;i<n;i++)
        {
            endinghere=Math.max(endinghere+nums[i],nums[i]);
            maxsum=Math.max(maxsum,endinghere);
        }
        return maxsum;
    }
}
