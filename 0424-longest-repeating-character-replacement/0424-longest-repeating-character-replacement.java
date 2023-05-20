class Solution {
    public int characterReplacement(String s, int k) {
        int max = 0;
      for(int i=0;i<26;i++)
      {
          char ch = (char)('A'+i);
          max = Math.max(max,solution(s,k,ch));
      }
        return max;
    }
    public int solution(String s , int k,char ch)
    {
        int i=0;
        int j=0;
        int n = s.length();
        int ans=0;
        int countA=0;
        while(j<n)
        {
            if(s.charAt(j)!=ch)
            {
                countA++;
            }
            
            while(countA>k)
            {
                if(s.charAt(i)!=ch)
                countA--;
                i++;
            }
            ans = Math.max(ans,j-i+1);
          
            j++;
        }
        return ans;
    }
}