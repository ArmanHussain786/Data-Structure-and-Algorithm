class Solution {
    public char repeatedCharacter(String s) {
        HashMap<Character,Integer> mp = new HashMap<>();
        int idx=-1;
        for(int i=0;i<s.length();i++)
        {
            char ch = s.charAt(i);
            if(mp.containsKey(ch))
            {
                idx=i;
                break;
            }
            mp.put(s.charAt(i),mp.getOrDefault(s.charAt(i),0)+1);
        }
        return s.charAt(idx);
    }
}