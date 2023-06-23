class Solution {
    public String reversePrefix(String word, char ch) {
        int toreverse= -1;
        for(int i=0;i<word.length();i++)
        {
            if(word.charAt(i)==ch)
            {
                toreverse=i;
                break;
            }
        }
        String secondans="";
        if(toreverse!=word.length()-1)
        {
           for(int i=toreverse+1;i<word.length();i++)
        {
            secondans+=word.charAt(i);
        } 
        }
        
        String first= reverse(word,0,toreverse);
        String finalans = first+secondans;
        return finalans;
        
    }
    public String reverse(String s,int start,int end)
    {
        String str = "";
        for(int i=end;i>=start;i--)
        {
            str = str + s.charAt(i);
        }
        return str;
    }
}