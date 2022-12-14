class Solution {
    
    public int binarysearch(int nums[],int start,int end,int target)
    {
        int s=start;
        int e=end;
        while(s<=e)
        {
            int mid=s+(e-s)/2;
            if(nums[mid]==target)
            {
                return mid;
            }
            else if(nums[mid]>target)
            {
                e=mid-1;
            }
            else
            {
                s=mid+1;
            }
        }
        return -1;
    }
    
    
    public int peak(int nums[],int n)
    {
        int s=0;
        int e=n-1;
        while(s<e)
        {
            int mid=s+(e-s)/2;
            if(nums[mid]>=nums[0])
            {
                s=mid+1;
            }
            else
            {
                e=mid;
            }
        }
        return s;
    }
    
    
    public int search(int[] nums, int target) {
        int n=nums.length;
        int peakest=peak(nums,n);
        if(target>=nums[peakest] && target<=nums[n-1])
        {
            return binarysearch(nums,peakest,n-1,target);
        }
        else
        {
            return binarysearch(nums,0,peakest-1,target);
        }
    }
}