class Solution {
    public List<List<Integer>> threeSum(int[] nums) {
        int n = nums.length;
        HashSet<List<Integer>> set = new HashSet<>();

        for(int i = 0; i < n; i++) {
            HashMap<Integer, Integer> map = new HashMap<>();

            for(int j = i + 1; j < n; j++) {
                int reqd = -nums[i] - nums[j];

                if(map.containsKey(reqd)) {
                    List<Integer> temp = new ArrayList<>();

                    temp.add(nums[i]);
                    temp.add(nums[j]);
                    temp.add(reqd);

                    Collections.sort(temp);

                    set.add(temp);
                }

                map.put(nums[j], 1);
            }
        }
         return new ArrayList<>(set);
    }
}