class Solution {
    public int percentageLetter(String s, char letter) {
        int [] count = new int[26];
        for(int i=0;i<s.length();i++)
        {
            count[s.charAt(i)-'a']++;
        }
        int ans = letter-'a';
        System.out.println(ans);
        int finalans = count[ans];
        System.out.println(finalans);
        int last = finalans*100;
        return last/s.length();
        
    }
}