class Solution {
    public int numberOfSubarrays(int[] nums, int k) {
        int i=0;
        int j=0;
        int countOdd =0;
        int count =0;
        int n = nums.length;
        int res =0;
        while(j<n)
        {
            if(nums[j]%2!=0)
            {
                countOdd++;
                count=0;
            }
            if(countOdd<k)
            {
                j++;
            }
            // else if(countOdd==k)
            // {
            //     count++;
            //     j++;
            // }
            else if(countOdd>=k)
            {
                while(countOdd>=k)
                {
                    if(nums[i]%2!=0)
                    {
                        countOdd--;
                       
                    }
                     i++;
                    count++;
                    
                    
                }
                j++;
            }
            res +=count;
            
        }
        return res;
    }
}



 // int oddcount=0;
 //        int res=0;
 //        int i=0;
 //        int count=0;
 //        for(int j=0;j<nums.length;j++){
 //            if(nums[j]%2==1){
 //                oddcount++;
 //                count=0;
 //            }
 //            while(oddcount==k){
 //                if(nums[i++]%2==1) oddcount--;
 //                count++;
 //            }
 //            res+=count;
 //        }
 //        return res;