class Solution {
    public int firstMissingPositive(int[] nums) {
        int n=nums.length;
        // if(n==1)
        // {
        //     if(nums[0]==1)
        //     {
        //         return 2;
        //     }
        //     if(nums[0]<=0)
        //     {
        //         return 1;
        //     }
        // }
        HashMap<Integer,Integer> mp = new HashMap<>();
        for(int i=0;i<n;i++)
        {
            mp.put(nums[i],mp.getOrDefault(nums[i],0)+1);
        }
        for(int i=1;i<=n+1;i++)
        {
            if(!mp.containsKey(i))
            {
                return i;
            }
        }
        return -1;
    }
}