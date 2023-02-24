public class Solution {
    public int hammingWeight(int n) {
        int count=0;
        while(n!=0)
        {
            int rmsb = n & -n;
            n=n-rmsb;
            count++;
        }
        return count;
    }
}