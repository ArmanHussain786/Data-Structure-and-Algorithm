class Solution {
    public int[] buildArray(int[] nums) {
        //int ans[] = new int[nums.length];
        int n = nums.length;
        for(int i=0;i<nums.length;i++)
        {
            nums[i]= nums[i]+ n*(nums[nums[i]]%n);
            
         
        }
        for(int i=0;i<n;i++)
        {
            nums[i]=nums[i]/n;
        }
        return nums;
    }
}