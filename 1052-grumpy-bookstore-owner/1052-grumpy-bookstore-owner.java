class Solution {
    public int maxSatisfied(int[] customers, int[] grumpy, int x) {
        int sum=0;
        for(int i=0;i<customers.length;i++)
        {
            if(grumpy[i]==0)
            {
                sum+=customers[i];
            }
        }
        int max=sum;
        for(int i=0;i<customers.length;i++)
        {
            if(grumpy[i]==1)
            {
                sum+=customers[i];
            }
            if(i<x-1)
            {
                continue;
            }
            else
            if(i==x-1)
            {
                max=Math.max(sum,max);
            }
            else
            {
                if(grumpy[i-x]==1)
                {
                    sum=sum-customers[i-x];
                }
                max=Math.max(sum,max);
            }
        }
        return max;
    }
}