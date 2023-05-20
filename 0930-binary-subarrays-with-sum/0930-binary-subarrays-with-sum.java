class Solution {
    public int numSubarraysWithSum(int[] nums, int goal) {
        //this is the part of the fixed sized sliding window problem
        // here we do what first intialise i and j 
        return (find(nums,goal)-find(nums,goal-1));
       
    }
    public int find(int []nums,int goal)
    {
         int i=0;
        int j=0;
        int sum=0;
        int ans =0;
        if(goal<0)
        {
            return 0;
        }
        while(j<nums.length)
        {
            sum = sum+nums[j];
           
            while(sum>goal)
            {
                sum=sum-nums[i];
                i++;
            }
            ans = ans+ j-i+1;
            j++;
        }
        return ans;
    }
}