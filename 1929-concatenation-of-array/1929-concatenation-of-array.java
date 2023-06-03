class Solution {
    public int[] getConcatenation(int[] nums) {
        int []ans = new int[nums.length*2];
        int n=nums.length;
        int p=0;
        for(int i=0;i<n;i++)
        {
            ans[p]=nums[i];
            p++;
        }
        for(int i=0;i<n;i++)
        {
            ans[p]=nums[i];
            p++;
        }
        return ans;
    }
}