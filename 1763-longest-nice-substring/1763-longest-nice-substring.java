class Solution {
    public String longestNiceSubstring(String s) {
        HashSet<Character> mp = new HashSet<>();
        for(int i=0;i<s.length();i++)
        {
            mp.add(s.charAt(i));
        }
        for(int i=0;i<s.length();i++)
        {
            if(mp.contains(Character.toUpperCase(s.charAt(i))) &&                 mp.contains(Character.toLowerCase(s.charAt(i))))
                continue;
            
            
            String s1 = longestNiceSubstring(s.substring(0,i));
            String s2 = longestNiceSubstring(s.substring(i+1));
            
            return s1.length()>=s2.length()?s1:s2;
        }
        return s;
    }
}