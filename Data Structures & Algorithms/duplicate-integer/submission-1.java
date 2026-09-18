class Solution {
    public boolean hasDuplicate(int[] nums) {
        int n=nums.length,count=0;
        for(int i=0;i<n;i++)
        {
            for(int j=i+1;j<n;j++)
            {
                if(nums[i]==nums[j])
                count++;
            
            }
        }
         if(count>0)
         return true;
         else
         return false;
    }
}