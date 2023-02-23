class Solution {
    public int similarPairs(String[] words) {
         int m=0;
        for(int i=0;i<words.length-1;i++)
        {
            for(int j=i+1;j<words.length;j++)
            {
                int a[]=new int[26];
                int b[]=new int[26];
                for(char c:words[i].toCharArray())
                {
                    a[c-'a']++;
                }
                for(char c:words[j].toCharArray())
                {
                    b[c-'a']++;
                }
                int k;
                for(k=0;k<26;k++)
                {
                    if((a[k]==0 && b[k]!=0) || (a[k]!=0 && b[k]==0))
                    {
                        break;
                    }
                }
                if(k==26)
                {
                    m++;
                }
            }
        }
        return m;
    }
}