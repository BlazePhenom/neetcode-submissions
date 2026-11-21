class Solution {
    public int longestConsecutive(int[] nums) {
        int n = nums.length;
        HashSet<Integer> set= new HashSet<>();
        for(int i=0;i<n;i++)
        {
            set.add(nums[i]);//adding elem in set to remove duplicate elem
        }

        int length=0,maxlength=0;

        for(int i=0;i<n;i++)//we're iterating till n(length of input array) and not hashset as we need to compare between both to get our answer
        {
            int curr= nums[i];

            if(!set.contains(curr-1))
            {
                length=1;

                while(set.contains(curr+1))
                {
                    length++;
                    curr++;
                }
            }
            maxlength=Math.max(length,maxlength);

        }
        return maxlength;
    }
}
