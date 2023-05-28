class Solution {
    public int subtractProductAndSum(int n) {
        int sum =0;
        int prod =1;
        while(n!=0)
        {
            int ans = n%10;
            prod = prod*ans;
            sum = sum + ans;
            n=n/10;
        }
        return prod-sum;
    }
}