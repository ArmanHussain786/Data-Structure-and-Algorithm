class Solution {
    public int findJudge(int n, int[][] trust) {
        int counts[]=new int[n+1];
        int judge = -1;
        for(int []t : trust)
        {
            counts[t[0]]=-1;
            
            counts[t[1]]++;
        }
        for(int i=1;i<n+1;i++)
        {
            if(counts[i]==n-1)
            {
                judge = i;
            }
        }
        return judge;
    }
}