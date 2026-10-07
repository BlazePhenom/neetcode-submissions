class Solution {
    public int longestConsecutive(int[] nums) {
        int n=nums.length;
        HashSet<Integer> set = new HashSet<>();

        for(int i=0;i<n;i++)
        {
            set.add(nums[i]);
        }

            int maxlength=0;
        
        for(int i=0;i<n;i++)
        {
            int curr=nums[i];

            if(!set.contains(curr-1))
            {
                int length=1;
                
                while(set.contains(curr+1))
                {
                    length++;
                    curr++;
                }
            maxlength=Math.max(length,maxlength);
            }
        }
         return maxlength;
    }
}
