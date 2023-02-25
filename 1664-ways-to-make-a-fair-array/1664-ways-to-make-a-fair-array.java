class Solution {
    public int waysToMakeFair(int[] nums) {
        int sumOdd=0, sumEven=0;
        for(int i=0;i<nums.length;i++) {
            if(i%2==0) sumEven+=nums[i];
            else sumOdd+=nums[i];
        }
        int curEven=0, curOdd=0, res=0;
        for(int i=0;i<nums.length;i++) {
            if(i%2==0) {
                if(curEven+sumOdd-curOdd==curOdd+sumEven-curEven-nums[i]) res++;
                curEven+=nums[i];
            }
            else {
                if(curEven+sumOdd-curOdd-nums[i]==curOdd+sumEven-curEven) res++;
                curOdd+=nums[i];
            }
        }
        return res;
    }
}