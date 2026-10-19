class Solution {
    public boolean hasDuplicate(int[] nums) {
        int n=nums.length,count=0;
        HashMap<Integer,Integer> map= new HashMap<>();
        for(int i=0;i<n;i++)
        {
            if(map.containsKey(nums[i]))
            return true;
            else
            map.put(nums[i],1);
        }
        return false;
    }
}