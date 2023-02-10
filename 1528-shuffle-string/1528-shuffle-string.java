class Solution {
    public String restoreString(String s, int[] indices) {
        char [] charr = new char[indices.length];
        for(int i=0;i<s.length();i++)
        {
            charr[indices[i]]=s.charAt(i);
        }
        String ans ="";
        for(int i=0;i<charr.length;i++)
        {
            ans=ans+charr[i];
        }
        return ans;
    }
}