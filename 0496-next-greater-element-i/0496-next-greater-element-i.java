class Solution {
    public int[] nextgreater(int [] nums)
    {
        Stack<Integer> st = new Stack<>();
        int []nge=new int[nums.length];
        st.push(nums[nums.length-1]);
        nge[nums.length-1]=-1;
        int n=nums.length;
        for(int i=n-2;i>=0;i--)
        {
            while(st.size()>0 && nums[i]>=st.peek())
            {
                st.pop();
            }
            if(st.size()==0)
            {
                nge[i]=-1;
            }
            else
            {
                nge[i]=st.peek();
            }
            st.push(nums[i]);
        }
        return nge;
    }
    public int[] nextGreaterElement(int[] nums1, int[] nums2) {
        int []ngr=nextgreater(nums2);
        
        HashMap<Integer,Integer> mp = new HashMap<>();
        for(int i=0;i<nums2.length;i++)
        {
            mp.put(nums2[i],ngr[i]);
        }
        
        int []ans=new int[nums1.length];
        for(int i=0;i<nums1.length;i++)
        {
            ans[i]=mp.get(nums1[i]);
        }
        return ans;
    }
}