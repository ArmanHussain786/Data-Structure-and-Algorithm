class Solution {
    public int maxValue(int n, int index, int maxSum) {
        long lo = 1;
        long hi = maxSum;
        long result = 0;

        while (lo <= hi) {
            long mid = lo + (hi - lo) / 2;

            long left = Sum(Math.min(index, mid - 1), mid);
            left += Math.max(0, index - mid + 1);

            long right = Sum(Math.min(n - index - 1, mid - 1), mid);
            right += Math.max(0, n - index - mid);

            if (left + right + mid <= maxSum) {
                result = mid;
                lo = mid + 1;
            } else {
                hi = mid - 1;
            }
        }

        return (int) result;
    }

    private long Sum(long noOfElement, long x) {
        return x * noOfElement - ((noOfElement * (noOfElement + 1)) / 2);
    }
}