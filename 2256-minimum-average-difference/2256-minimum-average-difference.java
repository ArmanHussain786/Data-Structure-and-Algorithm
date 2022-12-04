class Solution {
    public int minimumAverageDifference(int[] nums) {
        int l = nums.length;  
        int index = 0;
        long min = Integer.MAX_VALUE, sum = 0, leftsum = 0, rightsum = 0;
        for (int j = 0; j < l; j++) {
            sum = sum + nums[j];
        }
        for (int i = 0; i < l; i++) {
            leftsum += nums[i];
            rightsum = sum - leftsum;
            long diff = 0;
                 if(l-i==1)
                      diff = Math.abs(leftsum/(i + 1) - 0 ); 
                 else
                      diff = Math.abs(leftsum /(i + 1) - (rightsum / (l - i - 1))); 
            if (diff < min) {
                min = diff;
                index = i;
            }
        }
        return index;
    }
}