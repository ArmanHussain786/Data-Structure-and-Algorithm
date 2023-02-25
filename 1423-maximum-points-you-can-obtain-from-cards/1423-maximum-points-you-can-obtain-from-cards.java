class Solution {
    public int maxScore(int[] arr, int k) {
        int sum=0;
        int maxSum=0;
        int start=0;
        
        for(int i=0;i<k;i++)
        {
            sum=sum+arr[i];
        }
        maxSum=sum;
        int end=arr.length-1;
        for(int i=k-1;i>=0;i--)
        {
            sum=sum+arr[end]-arr[i];
            maxSum=Math.max(sum,maxSum);
            end--;
        }
        return maxSum;
    }
}