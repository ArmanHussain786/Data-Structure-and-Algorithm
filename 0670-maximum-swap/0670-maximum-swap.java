class Solution {
    public int maximumSwap(int num) {
        char []digits = String.valueOf(num).toCharArray();
        int n = digits.length;
        int []maxsofar = new int[n];
        int max = n-1;
        maxsofar[max]=max;
        
        for(int i=n-2;i>=0;i--)
        {
            if(digits[i]>digits[max])
            {
                max=i;
               
            }
             maxsofar[i]=max;
                
        }
        for(int i=0;i<n;i++)
        {
            if(digits[i]!=digits[maxsofar[i]])
            {
                char temp = digits[i];
                digits[i]=digits[maxsofar[i]];
                digits[maxsofar[i]]=temp;
                break;
            }
        }
        
        return Integer.parseInt(new String (digits));
    }
}