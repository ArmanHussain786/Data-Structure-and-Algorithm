class Solution {
    public int[] leftRightDifference(int[] nums) {
        int ans =0;
        int prefix[]= new int[nums.length];
        for(int i=0;i<nums.length;i++)
        {
            prefix[i]=ans;
            ans = ans+nums[i];
           
        }
        int []suffix = new int[nums.length];
        int res =0;
        for(int i=nums.length-1;i>=0;i--)
        {
            suffix[i]=res;
            res = res+nums[i];
        }
        int result []=new int[nums.length];
        for(int i=0;i<nums.length;i++)
        {
            result[i]=Math.abs(prefix[i]-suffix[i]);
        }
        return result;
    }
}