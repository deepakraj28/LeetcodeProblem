class Solution
{
    public int[][] matrixReshape(int[][] mat, int r, int c)
    {
        int[][] reshape=new int[r][c];
        int x=0;
        int y=0;
        int n=mat.length;
        int m=mat[0].length;
        if(n*m==r*c)
        {
            for(int i=0;i<n;i++)
            {
                for(int j=0;j<m;j++)
                {
                    if(y==c)
                    {
                        x++;
                        y=0;
                    }
                    reshape[x][y]=mat[i][j];
                    y++;
                }
            }
            return reshape;
        }
        return mat;
    }
}