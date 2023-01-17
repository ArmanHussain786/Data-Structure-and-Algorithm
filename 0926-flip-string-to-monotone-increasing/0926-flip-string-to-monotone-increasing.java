class Solution {
    public int minFlipsMonoIncr(String s) {
        int n=s.length();
        int onecount=0;
        int countflip=0;
        for(int i=0;i<n;i++)
        {
            if(s.charAt(i)=='1')
            {
                onecount++;
            }
            if(s.charAt(i)=='0')
            {
                if(onecount>0)
                {
                    countflip++;
                }
            }
            if(countflip>onecount)
                countflip=onecount;
            
        }
        return countflip;
    }
}