class Solution {
    public List<List<String>> groupAnagrams(String[] strs) {
        HashMap<String,List<String>> map= new HashMap<>();

        for(int i=0;i<strs.length;i++)
        {

        char arr [] = strs[i].toCharArray();
        Arrays.sort(arr);

        String key= new String(arr);
        // String key= new String(strs[i]); you did this earlier,undertsand that map ki Key mein sirf sorted word rhega

        if(!map.containsKey(key))
        {
            map.put(key, new ArrayList<String>());
        }

        map.get(key).add(strs[i]);

        }

        return new ArrayList<>(map.values());
    }
}
