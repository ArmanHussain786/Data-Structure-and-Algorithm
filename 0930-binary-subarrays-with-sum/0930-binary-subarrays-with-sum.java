class Solution {
    public int numSubarraysWithSum(int[] nums, int goal) {
        int n=nums.length;
        int count=0;
        
        int sum=0;
        HashMap<Integer,Integer> mp = new HashMap<>();
        for(int i=0;i<n;i++)
        {
            mp.put(sum,mp.getOrDefault(sum,0)+1);
            sum=sum+nums[i];
            
            if(mp.containsKey(sum-goal))
            {
                count=count+mp.get(sum-goal);
            }
            
            
        }
        
        return count;
    }
}