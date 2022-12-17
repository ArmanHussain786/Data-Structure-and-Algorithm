class Solution {
    public int[] finalPrices(int[] prices) {
        int n = prices.length;
        int[]ans = new int[n];
        Stack<Integer> st = new Stack<>();
        st.push(prices[n-1]);
        ans[n-1]=prices[n-1];
        for(int i=n-2;i>=0;i--)
        {
            while(st.size()>0 && prices[i]<st.peek())
            {
                st.pop();
            }
            if(st.size()==0)
            {
                ans[i]=prices[i];
            }
            else
            {
                ans[i]=prices[i]-st.peek();
            }
            st.push(prices[i]);
        }
        return ans;
    }
}