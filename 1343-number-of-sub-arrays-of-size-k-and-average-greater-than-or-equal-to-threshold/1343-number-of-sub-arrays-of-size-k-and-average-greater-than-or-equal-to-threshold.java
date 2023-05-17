class Solution {
    public int numOfSubarrays(int[] arr, int k, int threshold) {
        int i=0;
        int j=0;
        int n = arr.length;
        int sum=0;
        int count=0;
        while(j<n)
        {
            sum=sum+arr[j];
            if(j-i+1<k)
            {
                j++;
            }
            else if(j-i+1==k)
            {
               // System.out.println(sum);
                int ans = sum/k;
                if(ans>=threshold)
                {
                    count++;
                }
                sum = sum - arr[i];
                i++;
                j++;
            }
        }
        return count;
    }
}