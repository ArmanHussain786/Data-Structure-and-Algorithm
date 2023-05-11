class Solution {
    public int numIdenticalPairs(int[] nums) {
        HashMap<Integer, Integer> mp = new HashMap<>();
        int res=0;
        for(int i=0;i<nums.length;i++)
        {
            mp.put(nums[i],mp.getOrDefault(nums[i],0)+1);
            if(mp.containsKey(nums[i]))
            {
                res+=mp.get(nums[i])-1;
            }
        }
        return res;
    }
}