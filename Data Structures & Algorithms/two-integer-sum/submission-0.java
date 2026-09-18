class Solution {
    public int[] twoSum(int[] a, int target) {
        int n=a.length;
        HashMap<Integer,Integer> map= new HashMap<>();
        for(int i=0;i<n;i++)
        {
         int diff = target- a[i];
            if(map.containsKey(diff))
            {
                return new int[]{map.get(diff),i};
            }
            map.put(a[i],i);
        }
        return new int[]{-1,-1};
    }
}