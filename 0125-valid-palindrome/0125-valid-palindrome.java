class Solution {
    public boolean isPalindrome(String s) {
        if(s.length()==1)
            return true;
        String res =convert(s);
        System.out.println(convert(s));
        int start=0;
        int end =res.length()-1;
        
        while(start<=end)
        {
            if(res.charAt(start)!=res.charAt(end))
                return false;
            
            start++;
            end--;
        }
        return true;
    }
    public String convert(String s)
    {
        String ans = "";
        for(int i=0;i<s.length();i++)
        {
            if(s.charAt(i)>='A' && s.charAt(i)<='Z')
                ans = ans + (char)(s.charAt(i)+32);
             if(s.charAt(i)>='a' && s.charAt(i)<='z')
                ans = ans + s.charAt(i);
             if(s.charAt(i)>='0' && s.charAt(i)<='9')
                ans = ans + s.charAt(i);
            else
                continue;
        }
        return ans;
    }
}