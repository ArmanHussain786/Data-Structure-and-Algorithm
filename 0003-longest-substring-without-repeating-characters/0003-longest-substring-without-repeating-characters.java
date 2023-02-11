class Solution {
    public int lengthOfLongestSubstring(String s) {
        int i=0;
        int j=0;
        int maxi =0;
        HashSet<Character> mp = new HashSet<>();
        while(j<s.length())
        {
            if(!mp.contains(s.charAt(j)))
            {
                mp.add(s.charAt(j++));
                maxi = Math.max(maxi,mp.size());
            }
            else
            {
                mp.remove(s.charAt(i++));
            }
        }
        return maxi;
    }
}