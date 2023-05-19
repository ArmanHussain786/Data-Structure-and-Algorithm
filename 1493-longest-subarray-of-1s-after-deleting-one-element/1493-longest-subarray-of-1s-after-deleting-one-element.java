class Solution {
    public int longestSubarray(int[] nums) {
     int maxSize = 0;
        int left = 0;
        int right = 0;
        int countOnes = 0;
        int numZeros = 0;

        while (right < nums.length) {
            if (nums[right] == 0) {
                numZeros++;
            }

            while (numZeros > 1) {
                if (nums[left] == 0) {
                    numZeros--;
                }
                left++;
            }

            countOnes = right - left + 1;
            maxSize = Math.max(maxSize, countOnes);

            right++;
        }

        return maxSize > 0 ? maxSize - 1 : 0;
    }
}
// In this implementation, we maintain a sliding window represented by the left and right indices. We count the number of zeros (numZeros) encountered in the window and continuously adjust the window to have at most one zero. The variable countOnes keeps track of the size of the subarray containing only 1's within the window. We update maxSize whenever we find a longer subarray. Finally, we return maxSize - 1 as we are allowed to delete only one element.

// Please note that this solution assumes the input nums contains at least one 1.






