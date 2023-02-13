class Solution {
    public boolean isSubsequence(String s, String t) {
        int start =0;
        int st =0;
        int count=0;
        if(s.length()==0)
            return true;
        while( st < t.length())
        {
            if(s.charAt(start)==t.charAt(st))
            {
                start++;
               if(start==s.length())
                   return true;
            }
              st++;  
        }
        
         return false;
    }
}