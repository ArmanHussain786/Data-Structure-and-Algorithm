class Solution {
    public int maxConsecutiveAnswers(String answerKey, int k) {
        return Math.max(solve(answerKey,k,'T'),solve(answerKey,k,'F'));
        
    }
    public int solve(String s, int k, char ch)
    {
        int i=0;
        int j=0;
        int res=0;
        while(j<s.length())
        {
            char curr = s.charAt(j);
            if(curr!=ch)
            {
                k--;
            }
            while(k<0)
            {
                if(s.charAt(i)==ch)
                {
                    i++;
                }
                else
                {
                    k++;
                    i++;
                }
            }
            res = Math.max(res,j-i+1);
            j++;
        }
        return res;
    }
}