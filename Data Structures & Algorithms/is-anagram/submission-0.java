class Solution {
    public boolean isAnagram(String s, String t) {
        HashMap<Character,Integer> map1= new HashMap<>();
        HashMap<Character,Integer> map2= new HashMap<>();
        int n=s.length(),m=t.length();

        if(n!=m)
        return false;

        for(int i=0;i<n;i++)
        {
            if(map1.containsKey(s.charAt(i)))
            {
                map1.put(s.charAt(i),map1.get(s.charAt(i))+1);
            }
            else
            {
                map1.put(s.charAt(i),1);
            }
        }

        for(int i=0;i<m;i++)
        {
            if(map2.containsKey(t.charAt(i)))
            {
                map2.put(t.charAt(i),map2.get(t.charAt(i))+1);
            }
            else
            {
                map2.put(t.charAt(i),1);
            }
        }
        return map1.equals(map2);
    }
}
