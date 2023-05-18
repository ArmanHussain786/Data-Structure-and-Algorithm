class Solution {
    public int longestOnes(int[] nums, int k) {
        int i=0;
        int j=0;
        int countZero=0;
        int n = nums.length;
        int max=0;
        while(j<n)
        {
            if(nums[j]==0)
            {
                countZero++;
            }
            if(countZero<k)
            {
                j++;
            }
           else if(countZero==k)
            {
                max = Math.max(max,j-i+1);
                j++;
            }
            else if(countZero>k)
            {
                while(countZero>k)
                {
                    if(nums[i]==0)
                    {
                        countZero--;
                    }
                    i++;
                }
                 j++;
            }    
            
        }
       if(countZero!=k)
       {
           return  nums.length;
       }
      else
        return max;
    }
}

