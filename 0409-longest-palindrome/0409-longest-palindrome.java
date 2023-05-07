class Solution {
    public int longestPalindrome(String s) {
        int []chari = new int[256];
        for(int i=0;i<s.length();i++)
        {
            chari[s.charAt(i)]++;
        }
        int count=0;
        for(int i=0;i<256;i++)
        {
            if(chari[i]%2!=0)
            {
                count++;
            }
        }
        
        return count==0?s.length():s.length()-count+1;
    }
}