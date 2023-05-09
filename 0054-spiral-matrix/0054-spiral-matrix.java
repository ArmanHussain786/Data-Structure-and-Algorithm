class Solution {
    public List<Integer> spiralOrder(int[][] matrix) {
         ArrayList<Integer> res=new ArrayList<>();
      int row=matrix.length;
      int col=matrix[0].length;
      int startingRow=0;
      int startingCol=0;
      int endingRow=row-1;
      int endingCol=col-1;
      
      int count=0;
      int total=row*col;
      while(count<total)
      {
          //for first row
          for(int i=startingCol; count<total && i<=endingCol;i++)
          {
              res.add(matrix[startingRow][i]);
              count++;
          }
          startingRow++;
          
          //last column
          for(int i=startingRow; count<total && i<=endingRow;i++)
          {
              res.add(matrix[i][endingCol]);
              count++;
          }
          endingCol--;
          
          //last row
          for(int i=endingCol; count<total  &&  i>=startingCol;i--)
          {
              res.add(matrix[endingRow][i]);
              count++;
          }
          endingRow--;
          
          //starting column
          for(int i=endingRow;count<total && i>=startingRow;i--)
          {
              res.add(matrix[i][startingCol]);
              count++;
          }
          
          startingCol++;
      }
      return res;
    }
}