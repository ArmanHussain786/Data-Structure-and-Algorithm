class Solution {
    public int minimumRecolors(String blocks, int k) {
        int i=0;
        int j=0;
        int count=0;
        int max = Integer.MAX_VALUE;
        while(j<blocks.length())
        {
            if(blocks.charAt(j)=='W')
            {
                count++;
                
            }
            
            if(j-i+1==k)
            {
                max = Math.min(count,max);
                if(blocks.charAt(i)=='W')
                {
                    count--;
                }
                i++;
            }
            j++;
        }
        return max;
       
    }
}


