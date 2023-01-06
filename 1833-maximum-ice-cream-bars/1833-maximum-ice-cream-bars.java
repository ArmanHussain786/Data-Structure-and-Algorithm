class Solution {
    public int maxIceCream(int[] costs, int k) {
        Arrays.sort(costs);
        int count=0;
        for(int i=0;i<costs.length;i++)
        {
            if(costs[i]<=k)
            {
                k=k-costs[i];
                count++;
            }
        }
        return count;
    }
}