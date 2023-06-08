class Solution {
    public int countNegatives(int[][] grid) {
        int finalcount=0;
        for(int i=0;i<grid.length;i++)
        {
            int count=0;
            for(int j=0;j<grid[0].length;j++)
            {
                if(grid[i][j]<0)
                    count++;
            }
            finalcount+=count;
        }
        return finalcount;
    }
}