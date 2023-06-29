class Solution {
    int finddigisum(int n)
    {
        int sum=0;
        while(n>0)
        {
            int k=n%10;
            n=n/10;
            sum=sum+k*k;
            
        }
       return sum;
    }
    public boolean isHappy(int n) {
       
        int slow=n,fast=finddigisum(n);
        while(slow!=fast)
        {
            slow=finddigisum(slow);
            fast=finddigisum(finddigisum(fast));
        }
        if(slow==1)
        {
            return true;
        }
        else
        {
            return false;
        }
     
    }
}