class Solution {
    public int[] dailyTemperatures(int[] arr) {
        int n=arr.length;
        int [] res = new int[n];
        Stack<Integer> st =new Stack<>();
        st.push(n-1);
        res[n-1]=0;
        for(int i=n-2;i>=0;i--)
        {
            while(st.size()>0 && arr[i]>=arr[st.peek()])
            {
                st.pop();
            }
            if(st.size()==0)
            {
                res[i]=0;
            }
            else
            {
                res[i]=st.peek()-i;
            }
            st.push(i);
        }
        return res;
    }
}