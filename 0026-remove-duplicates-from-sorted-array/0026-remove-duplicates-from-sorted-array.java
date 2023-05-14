class Solution {
    public int removeDuplicates(int[] nums) {
        int k=0;
        for(int i=1;i<nums.length;i++)
        {
         if(nums[i]==nums[k])
         {
             continue;
         }
            k++;
            nums[k]=nums[i];
        }
       return k+1;
    }
}

//  int i=0;
//         int l = nums.length;
//         for(int a=0;a<l;a++){
//             if(nums[a]==val){
//                 continue;
//             }
//             nums[i] = nums[a];
//             i++;
//         }

//         return i;