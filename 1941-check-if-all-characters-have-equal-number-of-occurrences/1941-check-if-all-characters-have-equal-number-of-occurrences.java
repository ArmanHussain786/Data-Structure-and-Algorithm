class Solution {
    public boolean areOccurrencesEqual(String s) {
        int []arr = new int[26];
        for(int i=0;i<s.length();i++)
        {
            arr[s.charAt(i)-'a']++;
        }
        int ans=0;
        for(int i=0;i<26;i++)
        {
            if(arr[i]!=0)
            {
                ans = arr[i];
                break;
            }
        }
        for(int i=0;i<26;i++)
        {
            if(arr[i]!=0 && arr[i]!=ans)
            {
                return false;
            }
        }
        return true;
    }
}