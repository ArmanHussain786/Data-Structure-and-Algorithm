class Solution {
    public int findGCD(int[] nums) {
         int min = nums[0];
        int max = nums[0];

        for (int i = 1; i < nums.length; i++) {
            min = Math.min(nums[i], min);
            max = Math.max(nums[i], max);
        }

        return findGCD(max, min);
    }

    public int findGCD(int n1, int n2) {
        return n1 == 0 ? n2 : findGCD(n2 % n1, n1);
    }
}