class Solution
{
    public void reverse(int[] a)
    {
        int s=0;int e=a.length-1;
        while(s<e)
        {
            int temp=a[s];
            a[s]=a[e];
            a[e]=temp;
            s++;
            e--;
        }
    }
    public void rotate(int[][] matrix)
    {
      int n=matrix.length;
      int m=matrix[0].length;
      for(int i=0;i<=n-2;i++)
      {
        for(int j=i+1;j<=m-1;j++)
        {
           int temp=matrix[i][j];
           matrix[i][j]=matrix[j][i];
           matrix[j][i]=temp;
        }
      }  
      for(int i=0;i<=n-1;i++)
      {
        reverse(matrix[i]);
      }
    }
}