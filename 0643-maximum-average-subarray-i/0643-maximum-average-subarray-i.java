class Solution {
    public double findMaxAverage(int[] nums, int k) {
        int i=0;
        int j=0;
        int sum=0;
        int maxi=Integer.MIN_VALUE;
        int n= nums.length;
        while(j<n)
        {
            //calculations
            sum+=nums[j];
            if(j-i+1<k)
            {
                j++;
            }
         else   if(j-i+1==k)
            {
                maxi=Math.max(maxi,sum);
                sum-=nums[i];
                i++;
                j++;
            }
        }
        return maxi/(double)k;
    }
}