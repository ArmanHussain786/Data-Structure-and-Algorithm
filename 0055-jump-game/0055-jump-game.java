class Solution {
    public boolean canJump(int[] nums) {
        
        if(nums.length<=1)
        {
            return true;
        }
        int stepsAbhiBachaHai = nums[0];
        int index = 1;
        while(stepsAbhiBachaHai>0)
        {
            if(index == nums.length-1)
            {
                return true;
            }
            stepsAbhiBachaHai = Math.max(stepsAbhiBachaHai-1,nums[index]);
            index++;
        }
        
        return false;
    }
}