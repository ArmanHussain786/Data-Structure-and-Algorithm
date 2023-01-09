class Solution {
    public int firstMissingPositive(int[] nums) {
        HashMap<Integer,Integer> mp = new HashMap<>();
        for(int i=0;i<nums.length;i++)
        {
            mp.put(nums[i],mp.getOrDefault(nums[i],0)+1);
        }
        for(int i=1;i<=nums.length+1;i++)
        {
            if(!mp.containsKey(i))
            {
                return i;
            }
        }
        return -1;
    }
}